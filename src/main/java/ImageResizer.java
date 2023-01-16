import javax.swing.*;

public class ImageResizer {
    public static void main(String[] args) {
        new ImageResizer();
    }

    public ImageResizer() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Image Resizer v1.0");
                frame.add(new MainWindow());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
