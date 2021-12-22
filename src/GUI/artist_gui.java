
package GUI;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import postgres.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class artist_gui extends JFrame {

    public artist_gui(User user) {
        initComponents(user);
    }

    private void initComponents(User user) {
        panelroot = new JPanel();
        leftPanel = new JPanel();
        HomeButton = new JButton();
        ProfileButton = new JButton();
        EarningsButton = new JButton();
        PopularButton = new JButton();
        rightPanel = new JPanel();
        jTabbedPane = new JTabbedPane();
        Home = new JPanel();
        bannerLabel = new JLabel();
        WelcomeLabel = new JLabel();
        AlbumIntroLabel = new JLabel();
        AlbumButtonsPanel = new JPanel();
        albumButton1 = new JButton();
        albumButton2 = new JButton();
        albumButton3 = new JButton();
        Popular = new JPanel();
        jPanel4 = new JPanel();
        jScrollPane1 = new JScrollPane();
        PopularTable = new JTable();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        Earnings = new JPanel();
        jScrollPane2 = new JScrollPane();
        EarningsTable = new JTable();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        Profile = new JPanel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        oldpasswordfield = new JPasswordField();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        newpasswordfield = new JPasswordField();
        jButton8 = new JButton();
        Variable = new JPanel();
        jLabel10 = new JLabel();
        jLabel13 = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel14 = new JLabel();
        AlbumScrollPane = new JScrollPane();
        albumTable = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("src\\images\\music.png").getImage());
        setResizable(false);
        panelroot.setLayout(new BorderLayout());
        leftPanel.setBackground(new Color(0, 0, 0));
        leftPanel.setForeground(new Color(255, 255, 255));
        leftPanel.setPreferredSize(new Dimension(200, 549));
        leftPanel.setLayout(new AbsoluteLayout());

        HomeButton.setBackground(new Color(0, 0, 0));
        HomeButton.setFont(new Font("Tahoma", 0, 14));
        HomeButton.setForeground(new Color(255, 255, 255));
        HomeButton.setIcon(new ImageIcon(getClass().getResource("/images/icons/icons8_home_50px_1.png")));
        HomeButton.setText("Home");
        HomeButton.setFocusable(false);
        HomeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        leftPanel.add(HomeButton, new AbsoluteConstraints(20, 120, 160, 40));

        PopularButton.setBackground(new Color(0, 0, 0));
        PopularButton.setFont(new Font("Tahoma", 0, 14));
        PopularButton.setForeground(new Color(255, 255, 255));
        PopularButton.setIcon(new ImageIcon(getClass().getResource("/images/icons/icons8_music_50px_1.png"))); // NOI18N
        PopularButton.setText("Popular");
        PopularButton.setFocusable(false);
        PopularButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                PopularButtonActionPerformed(evt);
            }
        });
        leftPanel.add(PopularButton, new AbsoluteConstraints(20, 200, 160, 40));

        EarningsButton.setBackground(new Color(0, 0, 0));
        EarningsButton.setFont(new Font("Tahoma", 0, 14));
        EarningsButton.setForeground(new Color(255, 255, 255));
        EarningsButton.setIcon(new ImageIcon(getClass().getResource("/images/icons/icons8_money_50px.png")));
        EarningsButton.setText("Earnings");
        EarningsButton.setFocusable(false);
        EarningsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                EarningsButtonActionPerformed(evt);
            }
        });
        leftPanel.add(EarningsButton, new AbsoluteConstraints(20, 280, 160, 40));

        ProfileButton.setBackground(new Color(0, 0, 0));
        ProfileButton.setFont(new Font("Tahoma", 0, 14));
        ProfileButton.setForeground(new Color(255, 255, 255));
        ProfileButton.setIcon(new ImageIcon(getClass().getResource("/images/icons/icons8_user_50px.png")));
        ProfileButton.setText("Profile");
        ProfileButton.setFocusable(false);
        ProfileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });
        leftPanel.add(ProfileButton, new AbsoluteConstraints(20, 360, 160, 40));

        panelroot.add(leftPanel, BorderLayout.LINE_START);


        rightPanel.setBackground(new Color(0, 0, 0));

        String albums[] = artistIdToAlbums.main(user.userid);

        Home.setBackground(new Color(51, 51, 51));

        bannerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bannerLabel.setIcon(new ImageIcon(getClass().getResource("/images/artists/"+user.userid+"/banner.jpg")));
        bannerLabel.setVerticalAlignment(SwingConstants.TOP);
        bannerLabel.setFocusable(false);

        WelcomeLabel.setFont(new Font("Tahoma", 1, 24));
        WelcomeLabel.setForeground(new Color(255, 255, 255));
        WelcomeLabel.setText("Welcome " + user.name);

        int count = CountAlbums.main(user.userid);

        AlbumIntroLabel.setFont(new Font("Tahoma", 0, 18));
        AlbumIntroLabel.setForeground(new Color(255, 255, 255));
        AlbumIntroLabel.setText("Albums");

        AlbumButtonsPanel.setBackground(new Color(51, 51, 51));

        albumButton1.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[0]+".png")));
        albumButton1.setBackground(new Color(51, 51, 51));
        albumButton1.setFocusable(false);
        albumButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt, albums[0], user.name);
            }
        });

        albumButton2.setBackground(new Color(51, 51, 51));
        albumButton2.setFocusable(false);
        albumButton2.setVisible(false);
        albumButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt, albums[1], user.name);
            }
        });


        albumButton3.setBackground(new Color(51, 51, 51));
        albumButton3.setVisible(false);
        albumButton3.setFocusable(false);
        albumButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt, albums[2], user.name);
            }
        });

        if (count == 2){
            albumButton2.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[1]+".png")));
            albumButton2.setVisible(true);
        }

        else if (count ==3){
            albumButton2.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[1]+".png")));
            albumButton3.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+albums[2]+".png")));
            albumButton2.setVisible(true);
            albumButton3.setVisible(true);
        }

        GroupLayout albumPanelLayout = new GroupLayout(AlbumButtonsPanel);
        AlbumButtonsPanel.setLayout(albumPanelLayout);
        albumPanelLayout.setHorizontalGroup(
                albumPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(albumPanelLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(albumButton1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(albumButton2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(albumButton3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(315, Short.MAX_VALUE))
        );
        albumPanelLayout.setVerticalGroup(
                albumPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, albumPanelLayout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(albumPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(albumButton1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(albumButton2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(albumButton3, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        GroupLayout HomeLayout = new GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
                HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(HomeLayout.createSequentialGroup()
                                .addGroup(HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(bannerLabel, GroupLayout.PREFERRED_SIZE, 965, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(HomeLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(WelcomeLabel, GroupLayout.PREFERRED_SIZE, 965, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AlbumIntroLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AlbumButtonsPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
                HomeLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(HomeLayout.createSequentialGroup()
                                .addComponent(bannerLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WelcomeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(AlbumIntroLabel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AlbumButtonsPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane.addTab("", Home);

        Popular.setBackground(new Color(51, 51, 51));

        jPanel4.setBackground(new Color(51, 51, 51));

        PopularTable.setBackground(new Color(51, 51, 51));
        PopularTable.setForeground(new Color(255, 255, 255));
        PopularTable.setFont(new Font("Tahoma", 0, 18));
        PopularTable.setFocusable(false);
        PopularTable.setRowHeight(40);
        PopularTable.setRowSelectionAllowed(false);
        PopularTable.setShowVerticalLines(false);
        PopularTable.getTableHeader().setReorderingAllowed(false);
        PopularTable.getTableHeader().setResizingAllowed(false);

        PopularTable.setModel(new javax.swing.table.DefaultTableModel(
                PopularSongs.main(user.userid),
                new String [] {
                        "", "", ""
                }
        )
        {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(PopularTable);

        jLabel2.setFont(new Font("Tahoma", 0, 36));
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

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+MostViewedSongAlbum.main(user.userid)+".png")));
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

        jTabbedPane.addTab("", Popular);
        Earnings.setBackground(new Color(51, 51, 51));
        Earnings.setForeground(new Color(255, 255, 255));

        EarningsTable.setBackground(new Color(51, 51, 51));
        EarningsTable.setFont(new Font("Tahoma", 0, 18));
        EarningsTable.setForeground(new Color(255, 255, 255));

        EarningsTable.setFocusable(false);
        EarningsTable.setRequestFocusEnabled(false);

        EarningsTable.setRowSelectionAllowed(false);

        EarningsTable.setShowVerticalLines(false);
        EarningsTable.getTableHeader().setReorderingAllowed(false);
        EarningsTable.setUpdateSelectionOnSort(false);
        EarningsTable.setVerifyInputWhenFocusTarget(false);
        EarningsTable.getTableHeader().setResizingAllowed(false);
        Earning_Object data = postgres.Earnings.main(user.userid);

        EarningsTable.setModel(new javax.swing.table.DefaultTableModel(
                data.table,
                new String [] {
                        "", "", "", ""
                }
        )
        {
            boolean[] canEdit = new boolean [] {
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EarningsTable.setFocusable(false);
        EarningsTable.setRowHeight(40);
        EarningsTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(EarningsTable);

        jLabel4.setFont(new Font("Tahoma", 0, 24));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Top 10 Earning songs");

        jLabel5.setFont(new Font("Tahoma", 0, 18));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setIcon(new ImageIcon(getClass().getResource("/images/icons/icons8_money_50px.png")));
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

        jTabbedPane.addTab("", Earnings);

        Profile.setBackground(new Color(51, 51, 51));
        Profile.setForeground(new Color(255, 255, 255));

        jLabel6.setBackground(new Color(51, 51, 51));
        jLabel6.setFont(new Font("Tahoma", 0, 18));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/images/artists/"+user.userid+"/profile.jpg")));
        jLabel6.setText(user.name);
        jLabel6.setHorizontalTextPosition(SwingConstants.CENTER);
        jLabel6.setVerticalTextPosition(SwingConstants.BOTTOM);

        jLabel7.setBackground(new Color(51, 51, 51));
        jLabel7.setFont(new Font("Tahoma", 0, 24));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("Change password");

        oldpasswordfield.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
        //        old ---> jTextField1ActionPerformed(evt);
        HomeButtonActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new Color(51, 51, 51));
        jLabel8.setFont(new Font("Tahoma", 0, 18));
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Enter Old password");

        jLabel9.setBackground(new Color(51, 51, 51));
        jLabel9.setFont(new Font("Tahoma", 0, 18));
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("Enter new password");

        newpasswordfield.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
//                jTextField2ActionPerformed(evt);
            }
        });

        jButton8.setFont(new Font("Tahoma", 1, 14));
        jButton8.setText("Submit");
        jButton8.setFocusable(false);
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt, user.userid);
            }
        });

        GroupLayout ProfileLayout = new GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);        ProfileLayout.setHorizontalGroup(
                ProfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(ProfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(ProfileLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(ProfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(newpasswordfield, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(oldpasswordfield, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9))))
                                .addGap(170, 170, 170))
        );
        ProfileLayout.setVerticalGroup(
                ProfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(ProfileLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(ProfileLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ProfileLayout.createSequentialGroup()
                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(oldpasswordfield, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(newpasswordfield, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("", Profile);

        GroupLayout jPanel2Layout = new GroupLayout(rightPanel);
        rightPanel.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane)
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane)
                                .addContainerGap())
        );


        panelroot.add(rightPanel, BorderLayout.CENTER);
        getContentPane().add(panelroot, BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane.setSelectedIndex(0);
    }

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane.setSelectedIndex(3);

    }

    private void EarningsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane.setSelectedIndex(2);
    }

    private void PopularButtonActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane.setSelectedIndex(1);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt, String album_id, String name) {
        repaintAlbumPanel(AlbumClick.main(album_id), name);
    }


    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt, String A_ID) {
        UIManager UI=new UIManager();
        UIManager.put("OptionPane.background", Color.BLACK);
        UIManager.put("Panel.background", Color.BLACK);
        UIManager.put("OptionPane.messageForeground", Color.WHITE);
        String old = oldpasswordfield.getText();
        String new_ = newpasswordfield.getText();
        int count = ChangePassword.main(old,new_,A_ID );
        if(count==1)
        {
            JOptionPane.showMessageDialog(null,"Password Changed Successfully","",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Old Password incorrect","",JOptionPane.INFORMATION_MESSAGE);
        }

        oldpasswordfield.setText("");
        newpasswordfield.setText("");
    }


    private void repaintAlbumPanel(Album a, String name){
        Variable.setBackground(new Color(51, 51, 51));
        Variable.setLayout(new AbsoluteLayout());

        jLabel10.setIcon(new ImageIcon(getClass().getResource("/images/albums/"+a.id+".png")));
        jLabel13.setFont(new Font("Tahoma", 0, 48));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText(a.name);

        jLabel14.setFont(new Font("Tahoma", 0, 18));
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText(name + " - "+ a.number_of_songs + " songs - " + a.format );

        albumTable.setModel(new javax.swing.table.DefaultTableModel(
                a.songs,
                new String [] {
                        "S.no", "Album name", "views"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        albumTable.setBackground(new Color(51, 51, 51));
        albumTable.setForeground(new Color(255, 255, 255));
        albumTable.setFont(new Font("Tahoma", 0, 18));
        albumTable.setFocusable(false);
        albumTable.setRowHeight(40);
        albumTable.setRowSelectionAllowed(false);
        albumTable.setSelectionBackground(new Color(255, 255, 255));
        albumTable.setShowVerticalLines(false);
        albumTable.getTableHeader().setReorderingAllowed(false);

        AlbumScrollPane.setViewportView(albumTable);
        if (albumTable.getColumnModel().getColumnCount() > 0) {
            albumTable.getColumnModel().getColumn(0).setResizable(false);
            albumTable.getColumnModel().getColumn(1).setResizable(false);
            albumTable.getColumnModel().getColumn(2).setResizable(false);
        }

        GroupLayout jPanel5Layout = new GroupLayout(Variable);
        Variable.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 992, GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(AlbumScrollPane, GroupLayout.PREFERRED_SIZE, 984, GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel13, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGap(89, 89, 89)
                                                                .addComponent(jLabel14, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(34, 34, 34)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AlbumScrollPane, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                .addContainerGap())
        );

        try{
            jTabbedPane.remove(4);
        }
        catch(Exception e){

        }

        jTabbedPane.addTab("", Variable);
        jTabbedPane.setSelectedIndex(4);
    }

    public static void main(User user) {
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new artist_gui(user).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify
    private javax.swing.JPanel Earnings;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Popular;
    private javax.swing.JPanel Profile;
    private javax.swing.JButton HomeButton;
    private javax.swing.JButton albumButton1;
    private javax.swing.JButton albumButton2;
    private javax.swing.JButton albumButton3;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JButton EarningsButton;
    private javax.swing.JButton PopularButton;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel AlbumIntroLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel bannerLabel;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel AlbumButtonsPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel Variable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane AlbumScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable PopularTable;
    private javax.swing.JTable EarningsTable;
    private javax.swing.JTable albumTable;
    private javax.swing.JPasswordField oldpasswordfield;
    private javax.swing.JPasswordField newpasswordfield;
    private javax.swing.JPanel panelroot;
    // End of variables declaration
}
