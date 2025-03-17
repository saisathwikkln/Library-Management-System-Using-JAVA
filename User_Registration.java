package Settings;

import Coding.conn;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Hadi
 */
public class User_Registration extends javax.swing.JFrame {

    public String Online = "NO";
    
    File file = new File("Icon.png");
    String absolutePath = file.getAbsolutePath().replace("Icon.png", "/src/Images/Icon.png");
    ImageIcon FrameIcon = new ImageIcon(absolutePath);
    
    public User_Registration() {
        initComponents();
        this.setIconImage(FrameIcon.getImage());
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextUserName = new javax.swing.JTextField();
        jTextAnswer = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextRePass = new javax.swing.JPasswordField();
        jTextPass = new javax.swing.JPasswordField();
        jComboBoxQuestion = new javax.swing.JComboBox<String>();
        jLabelLoginAs = new javax.swing.JLabel();
        jRadioOnline = new javax.swing.JRadioButton();
        jRadioOffline = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTextPIN = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(16, 18, 24));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("username :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Answer :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("confirm :");

        jTextUserName.setBackground(new java.awt.Color(35, 35, 35));
        jTextUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextUserName.setForeground(new java.awt.Color(254, 254, 254));
        jTextUserName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUserNameKeyTyped(evt);
            }
        });

        jTextAnswer.setBackground(new java.awt.Color(35, 35, 35));
        jTextAnswer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextAnswer.setForeground(new java.awt.Color(254, 254, 254));
        jTextAnswer.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextAnswer.setSelectedTextColor(new java.awt.Color(80, 80, 80));
        jTextAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAnswerActionPerformed(evt);
            }
        });
        jTextAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAnswerKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("password :");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register Account");

        jTextRePass.setBackground(new java.awt.Color(35, 35, 35));
        jTextRePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextRePass.setForeground(new java.awt.Color(254, 254, 254));
        jTextRePass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextRePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextRePassKeyTyped(evt);
            }
        });

        jTextPass.setBackground(new java.awt.Color(35, 35, 35));
        jTextPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPass.setForeground(new java.awt.Color(254, 254, 254));
        jTextPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPassKeyTyped(evt);
            }
        });

        jComboBoxQuestion.setBackground(new java.awt.Color(254, 254, 254));
        jComboBoxQuestion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxQuestion.setForeground(new java.awt.Color(1, 1, 1));
        jComboBoxQuestion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is you best Friend?", "Whom you love most?", "Your first teacher?", "You BirthDate?" }));
        jComboBoxQuestion.setBorder(null);
        jComboBoxQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jComboBoxQuestionKeyTyped(evt);
            }
        });

        jLabelLoginAs.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelLoginAs.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginAs.setText("Question :");

        buttonGroup1.add(jRadioOnline);
        jRadioOnline.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioOnline.setForeground(new java.awt.Color(255, 255, 255));
        jRadioOnline.setSelected(true);
        jRadioOnline.setText("Online");
        jRadioOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOnlineActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioOffline);
        jRadioOffline.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioOffline.setForeground(new java.awt.Color(255, 255, 255));
        jRadioOffline.setText("Offline");
        jRadioOffline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioOfflineActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("user mode :");

        jTextPIN.setBackground(new java.awt.Color(35, 35, 35));
        jTextPIN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPIN.setForeground(new java.awt.Color(254, 254, 254));
        jTextPIN.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextPIN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextPINFocusLost(evt);
            }
        });
        jTextPIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPINKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PIN :");

        jButtonRegister.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegister.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.setContentAreaFilled(false);
        jButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegister.setOpaque(true);
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseExited(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBack.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.setOpaque(true);
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonBackMouseExited(evt);
            }
        });
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reg.png"))); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mini.png"))); // NOI18N
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Green-check-mark-icon-on-transparent-background-PNG.png"))); // NOI18N
        jLabel8.setText("The PIN Should Be Greater Than 6 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelLoginAs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxQuestion, 0, 213, Short.MAX_VALUE)
                                    .addComponent(jTextAnswer)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPIN))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jRadioOffline, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jTextPass)
                                    .addComponent(jTextRePass))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioOffline)
                            .addComponent(jRadioOnline)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextRePass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLoginAs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAnswerActionPerformed

    private void jTextAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAnswerKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jButtonRegister.grabFocus();
    }//GEN-LAST:event_jTextAnswerKeyTyped

    private void jTextUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUserNameKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextUserName.transferFocus();
    }//GEN-LAST:event_jTextUserNameKeyTyped

    private void jTextPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPassKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextPass.transferFocus();
    }//GEN-LAST:event_jTextPassKeyTyped

    private void jTextRePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextRePassKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jTextRePass.transferFocus();
    }//GEN-LAST:event_jTextRePassKeyTyped

    private void jComboBoxQuestionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxQuestionKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
        jComboBoxQuestion.transferFocus();
    }//GEN-LAST:event_jComboBoxQuestionKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(jRadioOnline.isSelected()){
            Online = "YES";
        }
        else
            Online = "NO";
            
    }//GEN-LAST:event_formWindowOpened

    private void jTextPINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPINKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER 
                && jTextPIN.getText().length() < 6 ){
            JOptionPane.showMessageDialog(this, "Your Pin should be more than 6 digit");
            jTextPIN.setText("");
            jTextPIN.grabFocus();
        }
        else if(num == KeyEvent.VK_ENTER)
        jComboBoxQuestion.grabFocus();
        
        else if(!(Character.isDigit(num)
                ||(num == KeyEvent.VK_BACK_SPACE)
                ||(num == KeyEvent.VK_DELETE)))
            evt.consume();
    }//GEN-LAST:event_jTextPINKeyTyped

    private void jButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseEntered
        jButtonRegister.setBackground(new Color(0,102,153));
        jButtonRegister.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonRegisterMouseEntered

    private void jButtonRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseExited
        jButtonRegister.setForeground(Color.BLACK);
        jButtonRegister.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonRegisterMouseExited

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        if(Online.equals("YES"))
            RegisterAccount_Online();
        else
            RegisterAccount();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseEntered
        jButtonBack.setBackground(new Color(0,102,153));
        jButtonBack.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButtonBackMouseEntered

    private void jButtonBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseExited
        jButtonBack.setForeground(Color.BLACK);
        jButtonBack.setBackground(Color.WHITE);
    }//GEN-LAST:event_jButtonBackMouseExited

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.pack();
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setState(this.ICONIFIED);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextPINFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPINFocusLost
        if(jTextPIN.getText().equals("")){
            
        }
        else if(jTextPIN.getText().length() < 6){
            JOptionPane.showMessageDialog(this, "PIN should be more than 6 digit");
            jTextPIN.setText("");
            jTextPIN.grabFocus();
        }
    }//GEN-LAST:event_jTextPINFocusLost

    private void jRadioOfflineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOfflineActionPerformed
        Online = "NO";
    }//GEN-LAST:event_jRadioOfflineActionPerformed

    private void jRadioOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioOnlineActionPerformed
        Online = "YES";
    }//GEN-LAST:event_jRadioOnlineActionPerformed

  private void RegisterAccount(){
      String Pass = String.valueOf(jTextPass.getPassword());
      String repass = String.valueOf(jTextRePass.getPassword());
      
      if(!Pass.equals(repass) || jTextUserName.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Password Do not Math");
          jTextPass.grabFocus();
      }
      else  {
      
      conn con = new conn();
        String sql = "insert into account(username, password, pin,"
                + " sec_question, sec_answer) values(?, ?, ?, ?, ?)";
        try{
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, jTextUserName.getText());
                st.setString(2, String.valueOf(jTextPass.getPassword()));
		st.setString(3, String.valueOf(jTextPIN.getPassword()));
		st.setString(4, (String) jComboBoxQuestion.getSelectedItem());
		st.setString(5, jTextAnswer.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Account Created Succesfully");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error");
                    jTextUserName.setText("");
                    jTextPass.setText("");
                    jTextRePass.setText("");
                    jTextAnswer.setText("");
                }
                st.close();
                con.c.close();
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, "DataBase Error"+e.getMessage());
        } 
      }
  }
    
   private void RegisterAccount_Online(){
      String Pass = String.valueOf(jTextPass.getPassword());
      String repass = String.valueOf(jTextRePass.getPassword());
      
      if(!Pass.equals(repass) || jTextUserName.getText().equals("")){
          JOptionPane.showMessageDialog(this, "Password Does not Match");
          jTextPass.grabFocus();
      }
      else  {
      
      conn con = new conn("YES");
        String sql = "insert into account(username, password, pin,"
                + " sec_question, sec_answer) values(?, ?, ?, ?, ?)";
        try{
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, jTextUserName.getText());
                st.setString(2, String.valueOf(jTextPass.getPassword()));
		st.setString(3, String.valueOf(jTextPIN.getPassword()));
		st.setString(4, (String) jComboBoxQuestion.getSelectedItem());
		st.setString(5, jTextAnswer.getText());

		int i = st.executeUpdate();
		if (i > 0){
                    JOptionPane.showMessageDialog(null, "Account Created Succesfully");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Error");
                    jTextUserName.setText("");
                    jTextPass.setText("");
                    jTextRePass.setText("");
                    jTextAnswer.setText("");
                    jTextPIN.setText("");
                }
                st.close();
                con.c.close();
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(this, "DataBase Error"+e.getMessage());
        } 
      }
  }
  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User_Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBoxQuestion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelLoginAs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioOffline;
    private javax.swing.JRadioButton jRadioOnline;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextAnswer;
    private javax.swing.JPasswordField jTextPIN;
    private javax.swing.JPasswordField jTextPass;
    private javax.swing.JPasswordField jTextRePass;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration//GEN-END:variables
}
