/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    
    
    public TicTacToe() {
        initComponents();
        setVisible(false);
    }
    
//    public void playerName(){
//        jlNameX.setText(Player.jtNameX.getText());
//        jlNameO.setText(Player.jtNameO.getText());
//    }
    
    private void gameScore(){
        jbPlayerX.setText(String.valueOf(xCount));
        jbPlayerO.setText(String.valueOf(oCount));
    }
    
    private void chooseAPlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        } else {
            startGame = "X";
        }
    }

    private void winningGame(){
        String b1 = jbTic1.getText();
        String b2 = jbTic2.getText();
        String b3 = jbTic3.getText();
        String b4 = jbTic4.getText();
        String b5 = jbTic5.getText();
        String b6 = jbTic6.getText();
        String b7 = jbTic7.getText();
        String b8 = jbTic8.getText();
        String b9 = jbTic9.getText();
        
        if( b1 == ("X") && b2 == ("X") && b3 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic1.setBackground(Color.ORANGE);
            jbTic2.setBackground(Color.ORANGE);
            jbTic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
        }
        
        if( b4 == ("X") && b5 == ("X") && b6 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic4.setBackground(Color.CYAN);
            jbTic5.setBackground(Color.CYAN);
            jbTic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        
        if( b7 == ("X") && b8 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic7.setBackground(Color.GREEN);
            jbTic8.setBackground(Color.GREEN);
            jbTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        
        if( b1 == ("X") && b4 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic1.setBackground(Color.MAGENTA);
            jbTic4.setBackground(Color.MAGENTA);
            jbTic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        
        if( b2 == ("X") && b5 == ("X") && b8 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic2.setBackground(Color.MAGENTA);
            jbTic5.setBackground(Color.MAGENTA);
            jbTic8.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        
        if( b3 == ("X") && b6 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic3.setBackground(Color.MAGENTA);
            jbTic6.setBackground(Color.MAGENTA);
            jbTic9.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        
        if( b1 == ("X") && b5 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic1.setBackground(Color.YELLOW);
            jbTic5.setBackground(Color.YELLOW);
            jbTic9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
        }
        
        if( b3 == ("X") && b5 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic3.setBackground(Color.YELLOW);
            jbTic5.setBackground(Color.YELLOW);
            jbTic7.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
        }
        
        if( b1 == ("O") && b5 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic1.setBackground(Color.DARK_GRAY);
            jbTic5.setBackground(Color.DARK_GRAY);
            jbTic9.setBackground(Color.DARK_GRAY);
            oCount++;
            gameScore();
        }
        
        if( b3 == ("O") && b5 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic3.setBackground(Color.DARK_GRAY);
            jbTic5.setBackground(Color.DARK_GRAY);
            jbTic7.setBackground(Color.DARK_GRAY);
            oCount++;
            gameScore();
        }
        
         if( b1 == ("O") && b2 == ("O") && b3 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic1.setBackground(Color.CYAN);
            jbTic2.setBackground(Color.CYAN);
            jbTic3.setBackground(Color.CYAN);
            oCount++;
            gameScore();
        }
         
          if( b4 == ("O") && b5 == ("O") && b6 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic4.setBackground(Color.CYAN);
            jbTic5.setBackground(Color.CYAN);
            jbTic6.setBackground(Color.CYAN);
            oCount++;
            gameScore();
        }
        
        if( b7 == ("O") && b8 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic7.setBackground(Color.GREEN);
            jbTic8.setBackground(Color.GREEN);
            jbTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        if( b1 == ("O") && b4 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic1.setBackground(Color.GREEN);
            jbTic4.setBackground(Color.GREEN);
            jbTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        if( b2 == ("O") && b5 == ("O") && b8 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic2.setBackground(Color.GREEN);
            jbTic5.setBackground(Color.GREEN);
            jbTic8.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        if( b3 == ("O") && b6 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O menang!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbTic3.setBackground(Color.GREEN);
            jbTic6.setBackground(Color.GREEN);
            jbTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
        }
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbTic3 = new javax.swing.JButton();
        jbTic1 = new javax.swing.JButton();
        jbTic2 = new javax.swing.JButton();
        jbTic6 = new javax.swing.JButton();
        jbTic5 = new javax.swing.JButton();
        jbTic4 = new javax.swing.JButton();
        jbTic8 = new javax.swing.JButton();
        jbTic7 = new javax.swing.JButton();
        jbTic9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jbPlayerX = new javax.swing.JLabel();
        jbPlayerO = new javax.swing.JLabel();
        jlNameO = new javax.swing.JLabel();
        jlNameX = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jbNewGame = new javax.swing.JButton();
        jbReset = new javax.swing.JButton();
        jbExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("Tic Tac Toe");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 850, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbTic3.setBackground(new java.awt.Color(255, 255, 255));
        jbTic3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic3.setToolTipText("");
        jbTic3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic3.setBorderPainted(false);
        jbTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic3ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 140, 130));

        jbTic1.setBackground(new java.awt.Color(255, 255, 255));
        jbTic1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic1.setToolTipText("");
        jbTic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic1.setBorderPainted(false);
        jbTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic1ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 130));

        jbTic2.setBackground(new java.awt.Color(255, 255, 255));
        jbTic2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic2.setToolTipText("");
        jbTic2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic2.setBorderPainted(false);
        jbTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic2ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 140, 130));

        jbTic6.setBackground(new java.awt.Color(255, 255, 255));
        jbTic6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic6.setToolTipText("");
        jbTic6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic6.setBorderPainted(false);
        jbTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic6ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 140, 130));

        jbTic5.setBackground(new java.awt.Color(255, 255, 255));
        jbTic5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic5.setToolTipText("");
        jbTic5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic5.setBorderPainted(false);
        jbTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic5ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, 130));

        jbTic4.setBackground(new java.awt.Color(255, 255, 255));
        jbTic4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic4.setToolTipText("");
        jbTic4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic4.setBorderPainted(false);
        jbTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic4ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, 130));

        jbTic8.setBackground(new java.awt.Color(255, 255, 255));
        jbTic8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic8.setToolTipText("");
        jbTic8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic8.setBorderPainted(false);
        jbTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic8ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 130));

        jbTic7.setBackground(new java.awt.Color(255, 255, 255));
        jbTic7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic7.setToolTipText("");
        jbTic7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic7.setBorderPainted(false);
        jbTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic7ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, 130));

        jbTic9.setBackground(new java.awt.Color(255, 255, 255));
        jbTic9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbTic9.setToolTipText("");
        jbTic9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbTic9.setBorderPainted(false);
        jbTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTic9ActionPerformed(evt);
            }
        });
        jPanel3.add(jbTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 140, 130));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 460, 430));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbPlayerX.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jbPlayerX.setForeground(new java.awt.Color(102, 0, 102));
        jbPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbPlayerX.setText("0");
        jbPlayerX.setOpaque(true);
        jPanel5.add(jbPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 90, 50));

        jbPlayerO.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jbPlayerO.setForeground(new java.awt.Color(255, 153, 0));
        jbPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbPlayerO.setText("0");
        jbPlayerO.setOpaque(true);
        jPanel5.add(jbPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 50));

        jlNameO.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jlNameO.setForeground(new java.awt.Color(255, 153, 0));
        jlNameO.setText("Player O");
        jPanel5.add(jlNameO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jlNameX.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jlNameX.setForeground(new java.awt.Color(102, 0, 102));
        jlNameX.setText("PlayerX");
        jPanel5.add(jlNameX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbNewGame.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbNewGame.setText("New Game");
        jbNewGame.setToolTipText("");
        jbNewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jbNewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jbNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewGameActionPerformed(evt);
            }
        });
        jPanel6.add(jbNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 80));

        jbReset.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jbReset.setText("Reset");
        jbReset.setToolTipText("");
        jbReset.setMaximumSize(new java.awt.Dimension(200, 158));
        jbReset.setMinimumSize(new java.awt.Dimension(200, 158));
        jbReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResetActionPerformed(evt);
            }
        });
        jPanel6.add(jbReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 160, 80));

        jbExit.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jbExit.setText("Exit");
        jbExit.setToolTipText("");
        jbExit.setMaximumSize(new java.awt.Dimension(200, 158));
        jbExit.setMinimumSize(new java.awt.Dimension(200, 158));
        jbExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExitActionPerformed(evt);
            }
        });
        jPanel6.add(jbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, 80));

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 340, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 360, 430));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private JFrame frame;
    private void jbExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Yakin mau keluar dari game ini?", "Tic Tac Toe",
                                         JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
                                         {
                                             System.exit(0);
                                         }
    }//GEN-LAST:event_jbExitActionPerformed

    private void jbResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResetActionPerformed
        // TODO add your handling code here:
        jbTic1.setEnabled(true);
        jbTic2.setEnabled(true);
        jbTic3.setEnabled(true);
        jbTic4.setEnabled(true);
        jbTic5.setEnabled(true);
        jbTic6.setEnabled(true);
        jbTic7.setEnabled(true);
        jbTic8.setEnabled(true);
        jbTic9.setEnabled(true);
        
        jbTic1.setText("");
        jbTic2.setText("");
        jbTic3.setText("");
        jbTic4.setText("");
        jbTic5.setText("");
        jbTic6.setText("");
        jbTic7.setText("");
        jbTic8.setText("");
        jbTic9.setText("");
        
        jbTic1.setBackground(Color.LIGHT_GRAY);
        jbTic2.setBackground(Color.LIGHT_GRAY);
        jbTic3.setBackground(Color.LIGHT_GRAY);
        jbTic4.setBackground(Color.LIGHT_GRAY);
        jbTic5.setBackground(Color.LIGHT_GRAY);
        jbTic6.setBackground(Color.LIGHT_GRAY);
        jbTic7.setBackground(Color.LIGHT_GRAY);
        jbTic8.setBackground(Color.LIGHT_GRAY);
        jbTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbResetActionPerformed

    private void jbNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewGameActionPerformed
        // TODO add your handling code here:
        jbTic1.setEnabled(true);
        jbTic2.setEnabled(true);
        jbTic3.setEnabled(true);
        jbTic4.setEnabled(true);
        jbTic5.setEnabled(true);
        jbTic6.setEnabled(true);
        jbTic7.setEnabled(true);
        jbTic8.setEnabled(true);
        jbTic9.setEnabled(true);
        
        jbPlayerX.setText("0");
        jbPlayerO.setText("0");
        
        jbTic1.setText("");
        jbTic2.setText("");
        jbTic3.setText("");
        jbTic4.setText("");
        jbTic5.setText("");
        jbTic6.setText("");
        jbTic7.setText("");
        jbTic8.setText("");
        jbTic9.setText("");
        
        jbTic1.setBackground(Color.LIGHT_GRAY);
        jbTic2.setBackground(Color.LIGHT_GRAY);
        jbTic3.setBackground(Color.LIGHT_GRAY);
        jbTic4.setBackground(Color.LIGHT_GRAY);
        jbTic5.setBackground(Color.LIGHT_GRAY);
        jbTic6.setBackground(Color.LIGHT_GRAY);
        jbTic7.setBackground(Color.LIGHT_GRAY);
        jbTic8.setBackground(Color.LIGHT_GRAY);
        jbTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbNewGameActionPerformed

    private void jbTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic1ActionPerformed
        // TODO add your handling code here:
        jbTic1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic1ActionPerformed

    private void jbTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic2ActionPerformed
        // TODO add your handling code here:
        jbTic2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic2ActionPerformed

    private void jbTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic3ActionPerformed
        // TODO add your handling code here:
        jbTic3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic3ActionPerformed

    private void jbTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic4ActionPerformed
        // TODO add your handling code here:
        jbTic4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic4ActionPerformed

    private void jbTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic5ActionPerformed
        // TODO add your handling code here:
        jbTic5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic5ActionPerformed

    private void jbTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic6ActionPerformed
        // TODO add your handling code here:
        jbTic6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic6ActionPerformed

    private void jbTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic7ActionPerformed
        // TODO add your handling code here:
        jbTic7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic7ActionPerformed

    private void jbTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic8ActionPerformed
        // TODO add your handling code here:
        jbTic8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic8ActionPerformed

    private void jbTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTic9ActionPerformed
        // TODO add your handling code here:
        jbTic9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        } else {
            checker = true;
        }
        
        chooseAPlayer();
        winningGame();
    }//GEN-LAST:event_jbTic9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(false);
                Player p = new Player();
                p.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbExit;
    private javax.swing.JButton jbNewGame;
    private javax.swing.JLabel jbPlayerO;
    private javax.swing.JLabel jbPlayerX;
    private javax.swing.JButton jbReset;
    private javax.swing.JButton jbTic1;
    private javax.swing.JButton jbTic2;
    private javax.swing.JButton jbTic3;
    private javax.swing.JButton jbTic4;
    private javax.swing.JButton jbTic5;
    private javax.swing.JButton jbTic6;
    private javax.swing.JButton jbTic7;
    private javax.swing.JButton jbTic8;
    private javax.swing.JButton jbTic9;
    public static javax.swing.JLabel jlNameO;
    public static javax.swing.JLabel jlNameX;
    // End of variables declaration//GEN-END:variables
}
