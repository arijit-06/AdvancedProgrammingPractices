import javax.swing.*;
import java.awt.*;

public class QuizForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Quiz");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel question = new JLabel("Which language runs in a web browser?");

        JRadioButton opt1 = new JRadioButton("Python");
        JRadioButton opt2 = new JRadioButton("C++");
        JRadioButton opt3 = new JRadioButton("JavaScript");
        JRadioButton opt4 = new JRadioButton("Java");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(opt1);
        group.add(opt2);
        group.add(opt3);
        group.add(opt4);

        JButton submitButton = new JButton("Submit");

        frame.add(question);
        frame.add(opt1);
        frame.add(opt2);
        frame.add(opt3);
        frame.add(opt4);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}