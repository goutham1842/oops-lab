import java.awt.*;
import java.awt.event.*;

public class packages1 {

packages1() {
        Frame frame = new Frame("Color Changer");

        Button redButton = new Button("Red");
        redButton.setBounds(50, 80, 60, 30);

        Button greenButton = new Button("Green");
        greenButton.setBounds(120, 80, 60, 30);

        Button blueButton = new Button("Blue");
        blueButton.setBounds(190, 80, 60, 30);

        // Action Listeners for buttons
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.RED);
            }
        });

        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.GREEN);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setBackground(Color.BLUE);
            }
        });

        frame.add(redButton);
        frame.add(greenButton);
        frame.add(blueButton);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new packages1();
    }
}
