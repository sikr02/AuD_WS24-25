package T7Rekursion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public abstract class KochSnowFlakeAbstract extends JFrame implements KeyListener {

    private static final long serialVersionUID = -3088085457878787186L;
    protected int depth = 0;
    protected Graphics2D g;

    public KochSnowFlakeAbstract() {
        super();

        setSize(729, 729);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        addKeyListener(this);
        setFocusable(true);
        setTitle("Sierpinski Triangle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.g = (Graphics2D) g;
        this.g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawSnowFlake();
    }

    protected void drawSnowFlake() {
        drawLineRec(100,
                getHeight()/3 * 2,
                getWidth() - 100,
                getHeight()/3 * 2,
                depth);
        drawLineRec(getWidth() - 100,
                getHeight()/3 * 2,
                getWidth()/2,
                getHeight()/3 * 2 - 458,
                depth);
        drawLineRec(getWidth()/2,
                getHeight()/3 * 2 - 458,
                100,
                getHeight()/3 * 2,
                depth);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        handleInput(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // do nothing
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // do nothing
    }

    protected abstract void drawLineRec(int ax, int ay, int bx, int by, int depth);

    protected abstract void handleInput(int keyCode);
}

