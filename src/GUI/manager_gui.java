package GUI;

import postgres.*;

import javax.swing.*;
import java.io.File;
import java.util.Objects;

public class manager_gui extends javax.swing.JFrame {
    public manager_gui(User user) {
        initComponents(user);
    }
    private void initComponents(User user) {
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Earnings = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        addAlbum = new javax.swing.JButton();
        editDetails = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        albumButton1 = new javax.swing.JButton();
        albumButton2 = new javax.swing.JButton();
        albumButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        Earnings.setBackground(new java.awt.Color(0, 0, 0));
        Earnings.setForeground(new java.awt.Color(255, 255, 255));
        Earnings.setText("Earnings");
        Earnings.setFocusable(false);
        Earnings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EarningsActionPerformed(evt);
            }
        });

        Home.setBackground(new java.awt.Color(0, 0, 0));
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setFocusable(false);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        addAlbum.setBackground(new java.awt.Color(0, 0, 0));
        addAlbum.setForeground(new java.awt.Color(255, 255, 255));
        addAlbum.setText("Add Album");
        addAlbum.setFocusable(false);
        addAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlbumActionPerformed(evt);
            }
        });

        editDetails.setBackground(new java.awt.Color(0, 0, 0));
        editDetails.setForeground(new java.awt.Color(255, 255, 255));
        editDetails.setText("Edit details");
        editDetails.setFocusable(false);
        editDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDetailsActionPerformed(evt);
            }
        });
        editDetails.setVisible(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(editDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Earnings, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(Earnings, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(addAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(editDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome " + user.name);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        String a_id = ManagerIdtoArtistId.main(user.userid);

        String a_name = idToName.main(a_id)[0];
        jLabel2.setText(a_name + "'s albums");

        int count = CountAlbums.main(a_id);

        String[] a_albums = artistIdToAlbums.main(a_id);

        albumButton1.setBackground(new java.awt.Color(51, 51, 51));
        albumButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        albumButton1.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/albums/"+a_albums[0]+".png"))));
        albumButton1.setText("");
        albumButton1.setForeground(new java.awt.Color(255, 255, 255));
        albumButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        albumButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        albumButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        albumButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumButton1ActionPerformed(evt);
            }
        });


        albumButton2.setBackground(new java.awt.Color(51, 51, 51));
        albumButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        albumButton2.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/albums/" + a_albums[1] + ".png")))); // NOI18N
        albumButton2.setText("");
        albumButton2.setForeground(new java.awt.Color(255, 255, 255));
        albumButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        albumButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        albumButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        albumButton2.setVisible(false);
        albumButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumButton2ActionPerformed(evt);
            }
        });

        albumButton3.setBackground(new java.awt.Color(51, 51, 51));
        albumButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        albumButton3.setText("");
        albumButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        albumButton3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        albumButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        albumButton3.setForeground(new java.awt.Color(255, 255, 255));
        albumButton3.setVisible(false);

        if (count>1){
            albumButton2.setVisible(true);
            if (count > 2){
                albumButton3.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/albums/"+a_albums[2]+".png"))));
                albumButton3.setVisible(true);
            }
        }

            albumButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                albumButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(albumButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55)
                                                .addComponent(albumButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(albumButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(albumButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(albumButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(albumButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(147, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel3);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(a_name + "'s earning per song");
        int songs = numberOfSongs.main(a_id, a_albums);
        Earning_Object data = AllSongEarnings.main(a_id, songs);

        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                data.table,
                new String [] {
                        "", "", ""
                }
        ));
        jTable1.setFocusable(false);
        jTable1.setRowSelectionAllowed(false);
        jTable1.setRowHeight(40);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setShowVerticalLines(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total Earnings: $"+ data.total);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("", jPanel6);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add an song:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Add an album:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("No. of songs");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("audio format");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("copyright date");
        String[] formats = {"mp3", "aac", "flac"};

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Album");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String a_name = jTextField12.getText();
                String number_of_songs = jTextField4.getText();
                String format = formats[jComboBox3.getSelectedIndex()];
                String date = jTextField6.getText();
                int i = 10;
                AlbumInsert.main("AL"+String.valueOf(10001+i), a_name, format, a_id, number_of_songs,date);

                jTextField11.setText("");
                jTextField13.setText("");
                jComboBox1.setSelectedIndex(0);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Song Name");


        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Album Name");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("views");

        String[] album_names = new String[a_albums.length];
        int a = 0;
        for (String i: a_albums){
            album_names[a] = AlbumIDtoName.main(i);
            a++;
        }

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(album_names));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Album Name");
        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Add song");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            String s_name = jTextField11.getText();
            String views = jTextField13.getText();
            String album_name = album_names[jComboBox1.getSelectedIndex()];
            jTextField11.setText("");
            jTextField13.setText("");
            jComboBox1.setSelectedIndex(0);

            int a = 2;
                SongInsert.main('S'+String.valueOf(900013+a), s_name, a_id, views);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(formats));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGap(108, 108, 108)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGap(106, 106, 106)
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(115, 115, 115)))))
                                .addGap(63, 63, 63))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(523, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(638, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(9, 9, 9)))
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(145, Short.MAX_VALUE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(456, Short.MAX_VALUE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(375, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("", jPanel7);

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/artists/A32123/profile.jpg"))); // NOI18N
        jLabel5.setText("Artist name");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edit Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Upload new profile photo (under 250 * 300 png):");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Upload");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField1)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(91, 91, 91)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(128, 128, 128)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(110, Short.MAX_VALUE))
        );

//        jTabbedPane1.addTab("", jPanel8);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void EarningsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }

    private void addAlbumActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);

    }

    private void editDetailsActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }

    private void albumButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void albumButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void albumButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.showOpenDialog(null);
        File f = fileChooser.getSelectedFile();
        String fileName = f.getAbsolutePath();
        System.out.println(fileName);



    }


    public static void main(User user, String id) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager_gui(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton Earnings;
    private javax.swing.JButton Home;
    private javax.swing.JButton addAlbum;
    private javax.swing.JButton albumButton1;
    private javax.swing.JButton albumButton2;
    private javax.swing.JButton albumButton3;
    private javax.swing.JButton editDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration
}
