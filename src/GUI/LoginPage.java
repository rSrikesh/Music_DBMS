package GUI;

import postgres.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
    private static JTextField userText;
    private static JPasswordField passText;
    private static JLabel success;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(640, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("C:\\Users\\sahit\\IdeaProjects\\Music_DBMS\\src\\images\\music.png");
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel();

        panel.setLayout(null);
        panel.setBounds(0, 0, 427, 360);
        panel.setBackground(Color.gray);
        frame.add(panel);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(60, 80, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(150, 80, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(60, 120, 80, 25);
        panel.add(passwordLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 120, 165, 25);
        panel.add(passText);

        JButton button = new JButton("Login");
        button.setBounds(191, 160, 80, 25);
        button.addActionListener(new LoginPage());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(60, 190, 300, 25);
        panel.add(success);

        frame.getRootPane().setDefaultButton(button);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent a) {
        String user = userText.getText();
        String pass = passText.getText();
        String id = login.main(user, pass);

        boolean login = !id.equals(null);

        if (login == true){
            success.setText("Welcome " + id + "!");
        }

        else {
            success.setText("Invalid login information");
        }
    }

}