//this import allows us to use JFrame, JPanel, BorderFactory, JButton, JLabel
import javax.swing.*;

//this import allows us to use GridLayout, BorderLayout
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//we must add "implements ActionListener" to user our ActionListener
public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;

    //constructor
    public GUI() {

        //the JFrame makes a window for our project
        frame = new JFrame();

        //JButton adds buttons to our GUI
        JButton button = new JButton("Click me!");
        //addActionListener adds a way for our program to know when we click
        button.addActionListener(this);

        //
        label = new JLabel(("Number of clicks: 0"));

        //
        panel = new JPanel();
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

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
