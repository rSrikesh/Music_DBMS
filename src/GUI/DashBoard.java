package GUI;

import javax.swing.*;
import java.awt.*;

    class ArtistDashBoard {
    ArtistDashBoard(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(740, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        panel.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu brand = new JMenu("Sony Records");
        brand.setForeground(Color.RED);
        brand.setFont(new Font("Serif", Font.ITALIC, 24));
        menuBar.add(brand);

        JLabel label1 = new JLabel("Welcome Post Malone!!");
        label1.setFont(new Font("Times New Roman",Font.BOLD,22));
        label1.setBounds(10, 20, 300, 25);
        panel.add(label1);

        ImageIcon img = new ImageIcon("src/images/postmalone.jpg");
        JLabel label2 = new JLabel(img);
        label2.setBounds(500,20,200,300);
        panel.add(label2);

        JButton button1 = new JButton("View Albums");
        button1.setBounds(10,90,200,25);
        panel.add(button1);

        JButton button2 = new JButton("View Songs");
        button2.setBounds(10,170,200,25);
        panel.add(button2);

        JButton button3 = new JButton("View Popular releases");
        button3.setBounds(10,250,200,25);
        panel.add(button3);

        JButton button4 = new JButton("View Earnings");
        button4.setBounds(10,330,200,25);
        panel.add(button4);

        JButton button5 = new JButton("Profile");
        button5.setBounds(500,330,200,25);
        panel.add(button5);

        frame.setVisible(true);
    }
}

public class DashBoard{
    public static void main(String type){
        if (type.equals("Artists")) {
            new ArtistDashBoard();
        }
    }
}