package T7Rekursion;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KochSnowFlake extends KochSnowFlakeAbstract {

    @Override
    protected void drawLineRec(int ax, int ay, int bx, int by, int depth) {
        g.setColor(Color.BLACK);
        int x = bx - ax; // Vektor AB
        int y = by - ay;
        double laenge = Math.sqrt(x * x + y * y);
        if ((depth == 0) || (laenge < 3)) {
            int h = getHeight();
            g.drawLine(ax, h - ay, bx, h - by);
        } else {
            // Winkel zwischen der Strecke [AB] und der x-Achse
            double alpha = Math.atan2(y, x);
            alpha += Math.PI / 3; // + 60 Grad
            // Koordinaten der fehlenden 3 Punkte berechnen
            int cx = ax + x / 3; int cy = ay + y / 3;
            int dx = ax + x * 2 / 3; int dy = ay + y * 2 / 3;
            int ex = (int) Math.round(cx + Math.cos(alpha) * laenge / 3);
            int ey = (int) Math.round(cy + Math.sin(alpha) * laenge / 3);

            drawLineRec(ax, ay, cx, cy, depth - 1);
            drawLineRec(cx, cy, ex, ey, depth - 1);
            drawLineRec(ex, ey, dx, dy, depth - 1);
            drawLineRec(dx, dy, bx, by, depth - 1);
        }
    }

    @Override
    protected void handleInput(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_DOWN:
                depth = Math.max(depth - 1, 0);
                break;
            case KeyEvent.VK_UP:
                depth = Math.min(depth + 1, 7);
                break;
        }
        paint(getGraphics());
    }

    public static void main(String[] args) {
        new KochSnowFlake();

        Object o = new Object();
    }
}
