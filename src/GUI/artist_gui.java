/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import postgres.*;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class artist_gui extends javax.swing.JFrame {

    public artist_gui(User user, String A_ID) {
        initComponents(user,A_ID);
    }

    private void initComponents(User user,String A_ID) {
        panelroot = new JPanel();
        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jPanel2 = new JPanel();
        jTabbedPane1 = new JTabbedPane();
        Home = new JPanel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel1 = new JLabel();
        jPanel3 = new JPanel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        Popular = new JPanel();
        jPanel4 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        Earnings = new JPanel();
        jScrollPane2 = new JScrollPane();
        jTable2 = new JTable();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        Profile = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jTextField1 = new JTextField();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jTextField2 = new JTextField();
        jButton8 = new JButton();
        Variable = new javax.swing.JPanel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src\\images\\music.png").getImage());
        setResizable(false);
        panelroot.setLayout(new BorderLayout());
        jPanel1.setBackground(new Color(0, 0, 0));
        jPanel1.setForeground(new Color(255, 255, 255));
        jPanel1.setPreferredSize(new Dimension(200, 549));
        jPanel1.setLayout(new AbsoluteLayout());

        jButton1.setBackground(new Color(0, 0, 0));
        jButton1.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_home_50px_1.png"))); // NOI18N
        jButton1.setText("Home");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new AbsoluteConstraints(20, 120, 160, 40));

        jButton5.setBackground(new Color(0, 0, 0));
        jButton5.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new Color(255, 255, 255));
        jButton5.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_user_50px.png"))); // NOI18N
        jButton5.setText("Profile");
        jButton5.setFocusable(false);
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new AbsoluteConstraints(20, 360, 160, 40));

        jButton6.setBackground(new Color(0, 0, 0));
        jButton6.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setForeground(new Color(255, 255, 255));
        jButton6.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_money_50px.png"))); // NOI18N
        jButton6.setText("Earnings");
        jButton6.setFocusable(false);
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new AbsoluteConstraints(20, 280, 160, 40));

        jButton7.setBackground(new Color(0, 0, 0));
        jButton7.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setForeground(new Color(255, 255, 255));
        jButton7.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_music_50px_1.png"))); // NOI18N
        jButton7.setText("Popular");
        jButton7.setFocusable(false);
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new AbsoluteConstraints(20, 200, 160, 40));

        panelroot.add(jPanel1, BorderLayout.LINE_START);

        jPanel2.setBackground(new Color(51, 51, 51));

        String albums[] = artistIdToAlbums.main(A_ID);

        Home.setBackground(new Color(51, 51, 51));

        jLabel11.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/images/artists/"+A_ID+"/banner.jpg"))); // NOI18N
        jLabel11.setVerticalAlignment(SwingConstants.TOP);
        jLabel11.setAutoscrolls(true);
        jLabel11.setFocusable(false);
        jLabel11.setMaximumSize(new Dimension(300, 300));
        jLabel11.setMinimumSize(new Dimension(300, 300));

        jLabel12.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("Welcome " + user.name);
        jLabel12.setVerticalAlignment(SwingConstants.TOP);

        int count = CountAlbums.main(A_ID);

        jLabel1.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Albums");

        jPanel3.setBackground(new Color(51, 51, 51));

        jButton2.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[0]+".png"))); // NOI18N
        jButton2.setBackground(new Color(51, 51, 51));
        jButton2.setText("jButton2");
        jButton2.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(51, 51, 51));
        jButton3.setText("jButton3");
        jButton3.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });


        jButton4.setBackground(new Color(51, 51, 51));
        jButton4.setText("jButton4");
        jButton4.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        if (count == 1){
            jButton3.setVisible(false);
        }

        else if (count == 2){
            jButton3.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[1]+".png"))); // NOI18N
            jButton4.setVisible(false);
        }

        else if (count ==3){
            jButton3.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[1]+".png"))); // NOI18N
            jButton4.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[2]+".png"))); // NOI18N
        }
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        GroupLayout HomeLayout = new GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
                HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(HomeLayout.createSequentialGroup()
                                .addGroup(HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 965, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(HomeLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 965, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
                HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("", Home);

        Popular.setBackground(new Color(51, 51, 51));

        jPanel4.setBackground(new Color(51, 51, 51));

        jTable1.setBackground(new Color(51, 51, 51));
        jTable1.setForeground(new Color(255, 255, 255));
        jTable1.setModel(new DefaultTableModel(
                PopularSongs.main(A_ID),
                new String [] {
                        "", "", ""
                }
        ));
        jTable1.setRowHeight(40);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Most Viewed Songs");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(103, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+MostViewedSongAlbum.main(A_ID)+".png"))); // NOI18N
        jLabel3.setText("jLabel3");

        GroupLayout PopularLayout = new GroupLayout(Popular);
        Popular.setLayout(PopularLayout);
        PopularLayout.setHorizontalGroup(
                PopularLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(PopularLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(248, Short.MAX_VALUE))
        );
        PopularLayout.setVerticalGroup(
                PopularLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, PopularLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))
        );

        jTabbedPane1.addTab("", Popular);
        Earnings.setBackground(new Color(51, 51, 51));
        Earnings.setForeground(new Color(255, 255, 255));

        jTable2.setBackground(new Color(51, 51, 51));
        jTable2.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setForeground(new Color(255, 255, 255));

        Earning_Object data = postgres.Earnings.main(A_ID);

        jTable2.setModel(new DefaultTableModel(
                data.table,
                new String [] {
                        "", "", "", ""
                }
        ));
        jTable2.setRowHeight(40);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Top 10 Earning songs");

        jLabel5.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/icons/icons8_money_50px.png"))); // NOI18N
        jLabel5.setText("Total Earnings: $" + data.total);

        GroupLayout EarningsLayout = new GroupLayout(Earnings);
        Earnings.setLayout(EarningsLayout);
        EarningsLayout.setHorizontalGroup(
                EarningsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(EarningsLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(EarningsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 728, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(272, Short.MAX_VALUE))
        );
        EarningsLayout.setVerticalGroup(
                EarningsLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(EarningsLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("", Earnings);

        Profile.setBackground(new Color(51, 51, 51));
        Profile.setForeground(new Color(255, 255, 255));

        jLabel6.setBackground(new Color(51, 51, 51));
        jLabel6.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/images/artists/"+A_ID+"/profile.jpg"))); // NOI18N
        jLabel6.setText(user.name);
        jLabel6.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(SwingConstants.BOTTOM);

        jLabel7.setBackground(new Color(51, 51, 51));
        jLabel7.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("Change password");

        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
               jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new Color(51, 51, 51));
        jLabel8.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Enter Old password");

        jLabel9.setBackground(new Color(51, 51, 51));
        jLabel9.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("Enter new password");

        jTextField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                jTextField2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Submit");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt, A_ID);
            }
        });

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);        ProfileLayout.setHorizontalGroup(
                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(ProfileLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9))))
                                .addGap(170, 170, 170))
        );
        ProfileLayout.setVerticalGroup(
                ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ProfileLayout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", Profile);

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );

        GroupLayout jPanel5Layout = new GroupLayout(Variable);
        Variable.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 521, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", Variable);

        panelroot.add(jPanel2, BorderLayout.CENTER);
        getContentPane().add(panelroot, BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(0);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(3);

    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(2);
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(1);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt, String A_ID) {
        UIManager UI=new UIManager();
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        String old = jTextField1.getText();
        String new_ = jTextField2.getText();
        int count = ChangePassword.main(old,new_,A_ID );
        if(count==1)
        {
            JOptionPane.showMessageDialog(null,"Password Changed Successfully","",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Password Not Changed","",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(User user,String A_ID) {
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new artist_gui(user,A_ID).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Earnings;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Popular;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Variable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panelroot;
    // End of variables declaration
}
