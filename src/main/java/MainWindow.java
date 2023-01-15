import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JPanel {
    public MainWindow() {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.NORTH;

        add(new JLabel("<html><h1><strong><i>Image resize Tool</i></strong></h1><hr></html>"), gbc);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel buttons = new JPanel(new GridBagLayout());
        JButton simpleRunButton = new JButton("Simple resize");

        simpleRunButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    String srcFolder = "/Users/admin/space3";
                    String dstFolder = "/Users/admin/space3_out";
                    Resizable obj = new SimpleResizer();
                    obj.ResizeFolder(srcFolder, dstFolder);

                    int cores = Resizable.getPhysicalCoresNumber();
                    System.out.println("Cores number - " + cores);

            }
        });

        JButton advanceRunButton = new JButton("Advance resize");
        advanceRunButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        JButton exitBtn = new JButton("Exit");
        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttons.add(simpleRunButton, gbc);
        buttons.add(advanceRunButton, gbc);
        buttons.add(exitBtn, gbc);

        gbc.weighty = 1;
        add(buttons, gbc);
    }
}
