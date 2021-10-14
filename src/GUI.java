//this import allows us to use JFrame, JPanel, BorderFactory, JButton, JLabel
import javax.swing.*;

//this import allows us to use GridLayout, BorderLayout
import java.awt.*;

public class GUI {

    //constructor
    public GUI() {

        //the JFrame makes a window for our project
        JFrame frame = new JFrame();

        //JButton adds buttons to our GUI
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel(("Number of clicks: 0"));

        //
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        //adds our button to our window
        panel.add(button);

        //adds our label to our window
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new GUI();
    }
}
