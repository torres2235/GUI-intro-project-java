//this import allows us to use JFrame
import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.BorderFactory;
import java.awt.*;

public class GUI {

    public GUI() {

        //the JFrame makes a window for our project
        JFrame frame = new JFrame();

        //
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {


    }
}
