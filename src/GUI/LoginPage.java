package GUI;

import postgres.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
    private static JTextField userText;
    private static JPasswordField passText;
    private static JLabel result;
    private static JFrame frame;

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(640, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("src\\images\\music.png");
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 380, 360);
        frame.add(panel);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(60, 100, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(150, 100, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(60, 140, 80, 25);
        panel.add(passwordLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 140, 165, 25);
        panel.add(passText);

        JButton button = new JButton("Login");
        button.setBounds(191, 180, 80, 25);
        button.addActionListener(new LoginPage());
        panel.add(button);

        result = new JLabel("");
        result.setBounds(60, 210, 300, 25);
        panel.add(result);

        LoginImage bg = new LoginImage();
        frame.add(bg);

        frame.getRootPane().setDefaultButton(button);
        frame.setResizable(false);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent a) {
        String username = userText.getText();
        String password = passText.getText();
//        String[] userdetails = login.main(user, pass);

        User user = new User(username, password);


        boolean login = !user.name.equals("");

        if (login == true){
            result.setText("Welcome " + user.name + "!");

            if (user.userType.equals("Artists")){
                String id = user.userid;
                frame.setVisible(false);
                gui.main(user,id);
                
            }
        }

        else {
            result.setText("Invalid login information");
        }
    }

}
