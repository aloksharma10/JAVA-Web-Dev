package swing_pkg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingElem {
    private JFrame frame;
    private JLabel nameLabel;
    private JTextField nameField;
    private JButton submitButton;
    private JCheckBox checkBox;
    private JComboBox<String> comboBox;

    public swingElem() {
        frame = new JFrame("Swing Controls Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        nameLabel = new JLabel("Name:");
        frame.add(nameLabel);

        nameField = new JTextField(15);
        frame.add(nameField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });
        frame.add(submitButton);

        checkBox = new JCheckBox("Agree to terms");
        frame.add(checkBox);

        String[] options = { "Option 1", "Option 2", "Option 3" };
        comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        swingElem demo = new swingElem();
    }
}
