import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class JavaAwtEventKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        // This method is called when a key is typed
        // (pressed and released) but not consumed.
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        // This method is called when a key is pressed down.
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        // This method is called when a key is released.
        // You can put your custom logic here.
        System.out.println("Key released: " + keyEvent.getKeyChar());
    }

    public static void main(String[] args) {
        // Example of how to use the MyKeyListener
        JFrame frame = new JFrame("KeyListener Example");
        JavaAwtEventKeyListener keyListener = new JavaAwtEventKeyListener();
        frame.addKeyListener(keyListener);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

