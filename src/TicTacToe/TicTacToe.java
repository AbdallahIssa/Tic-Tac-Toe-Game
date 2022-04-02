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
 * @author ZVOOOOOOOOOOOOO
 */
public class TicTacToe extends javax.swing.JFrame {
   
    
    private String startgame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean check ;
    public TicTacToe() {
        setTitle("TicTacToe");
        initComponents();
    }
    private JFrame frame;
    
    private void gameScore()
    {
        jlabel_playerX.setText(String.valueOf(xCount));
        jlabel_playerO.setText(String.valueOf(oCount));
    }
    
    private void choosePlayer()
    {
        if(startgame.equalsIgnoreCase("X"))
        {
            startgame = "O";
        }
        else
        {
            startgame = "X";
        }
    }
    
    private void winningGame()
    {
        String b1 = jbtn_Tic1.getText();
        String b2 = jbtn_Tic2.getText();
        String b3 = jbtn_Tic3.getText();
        String b4 = jbtn_Tic4.getText();
        String b5 = jbtn_Tic5.getText();
        String b6 = jbtn_Tic6.getText();
        String b7 = jbtn_Tic7.getText();
        String b8 = jbtn_Tic8.getText();
        String b9 = jbtn_Tic9.getText();
        
        //Horizontal matches
        if(b1.equals("X") && b2.equals("X") && b3.equals("X"))
        {
            jbtn_Tic1.setBackground(Color.ORANGE);
            jbtn_Tic2.setBackground(Color.ORANGE);
            jbtn_Tic3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b4.equals("X") && b5.equals("X") && b6.equals("X"))
        {
            jbtn_Tic4.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b7.equals("X") && b8.equals("X") && b9.equals("X"))
        {
            jbtn_Tic7.setBackground(Color.ORANGE);
            jbtn_Tic8.setBackground(Color.ORANGE);
            jbtn_Tic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        //Vertical matches
        if(b1.equals("X") && b4.equals("X") && b7.equals("X"))
        {
            jbtn_Tic1.setBackground(Color.ORANGE);
            jbtn_Tic4.setBackground(Color.ORANGE);
            jbtn_Tic7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b2.equals("X") && b5.equals("X") && b8.equals("X"))
        {
            jbtn_Tic2.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic8.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b3.equals("X") && b6.equals("X") && b9.equals("X"))
        {
            jbtn_Tic3.setBackground(Color.ORANGE);
            jbtn_Tic6.setBackground(Color.ORANGE);
            jbtn_Tic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        //Diagonal matches
        if(b1.equals("X") && b5.equals("X") && b9.equals("X"))
        {
            jbtn_Tic1.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b3.equals("X") && b5.equals("X") && b7.equals("X"))
        {
            jbtn_Tic3.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player X wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        
        //Horizontal matches
        if(b1.equals("O") && b2.equals("O") && b3.equals("O"))
        {
            jbtn_Tic1.setBackground(Color.ORANGE);
            jbtn_Tic2.setBackground(Color.ORANGE);
            jbtn_Tic3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetBoard();
        }
        if(b4.equals("O") && b5.equals("O") && b6.equals("O"))
        {
            jbtn_Tic4.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetBoard();
        }
        if(b7.equals("O") && b8.equals("O") && b9.equals("O"))
        {
            jbtn_Tic7.setBackground(Color.ORANGE);
            jbtn_Tic8.setBackground(Color.ORANGE);
            jbtn_Tic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++; 
            gameScore();
            resetBoard();
        }
        //Vertical matches
        if(b1.equals("O") && b4.equals("O") && b7.equals("O"))
        {
            jbtn_Tic1.setBackground(Color.ORANGE);
            jbtn_Tic4.setBackground(Color.ORANGE);
            jbtn_Tic7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b2.equals("O") && b5.equals("O") && b8.equals("O"))
        {
            jbtn_Tic2.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic8.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        if(b3.equals("O") && b6.equals("O") && b9.equals("O"))
        {
            jbtn_Tic3.setBackground(Color.ORANGE);
            jbtn_Tic6.setBackground(Color.ORANGE);
            jbtn_Tic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            resetBoard();
        }
        //Diagonal matches
        if(b1.equals("O") && b5.equals("O") && b9.equals("O"))
        {
            jbtn_Tic1.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            resetBoard();
        }
        if(b3.equals("O") && b5.equals("O") && b7.equals("O"))
        {
            jbtn_Tic3.setBackground(Color.ORANGE);
            jbtn_Tic5.setBackground(Color.ORANGE);
            jbtn_Tic7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this, "congrats, Player O wins!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore(); 
            resetBoard();
        }
        else if((b1.length()==1) && (b2.length()==1) && (b3.length()==1) && (b4.length()==1) && (b5.length()==1) && (b6.length()==1) && (b7.length()==1) && (b8.length()==1) && (b9.length()==1) )
        {
            JOptionPane.showMessageDialog(this, "It’s a draw !!","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            gameScore();
            resetBoard();
        }
        
    }
    
    private void resetBoard()
    {
        gameScore();
        
        jbtn_Tic1.setEnabled(true);
        jbtn_Tic2.setEnabled(true);
        jbtn_Tic3.setEnabled(true);
        jbtn_Tic4.setEnabled(true);
        jbtn_Tic5.setEnabled(true);
        jbtn_Tic6.setEnabled(true);
        jbtn_Tic7.setEnabled(true);
        jbtn_Tic8.setEnabled(true);
        jbtn_Tic9.setEnabled(true);
        
        
        
        jbtn_Tic1.setText("");
        jbtn_Tic2.setText("");
        jbtn_Tic3.setText("");
        jbtn_Tic4.setText("");
        jbtn_Tic5.setText("");
        jbtn_Tic6.setText("");
        jbtn_Tic7.setText("");
        jbtn_Tic8.setText("");
        jbtn_Tic9.setText("");
        
        jbtn_Tic1.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic2.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic3.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic4.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic5.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic6.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic7.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic8.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic9.setBackground(Color.LIGHT_GRAY);
        
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
        jbtn_Tic2 = new javax.swing.JButton();
        jbtn_Tic3 = new javax.swing.JButton();
        jbtn_Tic1 = new javax.swing.JButton();
        jbtn_Tic6 = new javax.swing.JButton();
        jbtn_Tic5 = new javax.swing.JButton();
        jbtn_Tic4 = new javax.swing.JButton();
        jbtn_Tic9 = new javax.swing.JButton();
        jbtn_Tic8 = new javax.swing.JButton();
        jbtn_Tic7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlabel_playerO = new javax.swing.JLabel();
        jlabel_playerX = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbtn_Reset = new javax.swing.JButton();
        jbtn_NewGame = new javax.swing.JButton();
        jbtn_Exit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setMaximumSize(new java.awt.Dimension(1252, 721));
        jPanel1.setMinimumSize(new java.awt.Dimension(1252, 721));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_Tic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 180, 180));

        jbtn_Tic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 180, 180));

        jbtn_Tic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 180));

        jbtn_Tic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 180, 170));

        jbtn_Tic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, 170));

        jbtn_Tic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 180, 170));

        jbtn_Tic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 180, 170));

        jbtn_Tic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 180, 170));

        jbtn_Tic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Tic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Tic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Tic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_Tic7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_Tic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 180, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 650, 600));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel1.setText("Player O:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 120));

        jlabel_playerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlabel_playerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_playerO.setText("0");
        jlabel_playerO.setOpaque(true);
        jPanel4.add(jlabel_playerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 280, 130));

        jlabel_playerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlabel_playerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel_playerX.setText("0");
        jlabel_playerX.setOpaque(true);
        jPanel4.add(jlabel_playerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 280, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setText("Player X:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 120));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 290));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_Reset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Reset.setText("Reset");
        jbtn_Reset.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Reset.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Reset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ResetActionPerformed(evt);
            }
        });
        jPanel5.add(jbtn_Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 110));

        jbtn_NewGame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_NewGame.setText("New Game");
        jbtn_NewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_NewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_NewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_NewGameActionPerformed(evt);
            }
        });
        jPanel5.add(jbtn_NewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 620, 120));

        jbtn_Exit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtn_Exit.setText("Exit");
        jbtn_Exit.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtn_Exit.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtn_Exit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_ExitActionPerformed(evt);
            }
        });
        jPanel5.add(jbtn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 300, 110));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 640, 260));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 660, 600));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tic Tac Toe Game");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 650, 80));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1320, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jbtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ExitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Do you want to exit the game?", "Tic Tac Toe",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtn_ExitActionPerformed

    private void jbtn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_ResetActionPerformed
        resetBoard();
    }//GEN-LAST:event_jbtn_ResetActionPerformed

    
    private void jbtn_Tic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic1ActionPerformed
        jbtn_Tic1.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic1ActionPerformed

    private void jbtn_Tic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic2ActionPerformed
        jbtn_Tic2.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic2ActionPerformed

    private void jbtn_Tic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic3ActionPerformed
        jbtn_Tic3.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic3ActionPerformed

    private void jbtn_Tic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic4ActionPerformed
        jbtn_Tic4.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic4ActionPerformed

    private void jbtn_Tic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic5ActionPerformed
        jbtn_Tic5.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic5ActionPerformed

    private void jbtn_Tic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic6ActionPerformed
        jbtn_Tic6.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic6ActionPerformed

    private void jbtn_Tic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic7ActionPerformed
        jbtn_Tic7.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic7ActionPerformed

    private void jbtn_Tic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic8ActionPerformed
        jbtn_Tic8.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic8ActionPerformed

    private void jbtn_Tic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_Tic9ActionPerformed
        jbtn_Tic9.setText(startgame);
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_jbtn_Tic9ActionPerformed

    private void jbtn_NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_NewGameActionPerformed
        
        jbtn_Tic1.setEnabled(true);
        jbtn_Tic2.setEnabled(true);
        jbtn_Tic3.setEnabled(true);
        jbtn_Tic4.setEnabled(true);
        jbtn_Tic5.setEnabled(true);
        jbtn_Tic6.setEnabled(true);
        jbtn_Tic7.setEnabled(true);
        jbtn_Tic8.setEnabled(true);
        jbtn_Tic9.setEnabled(true);
        
        xCount = 0;
        oCount = 0;
        
        jlabel_playerX.setText("0");
        jlabel_playerO.setText("0");
        
        jbtn_Tic1.setText("");
        jbtn_Tic2.setText("");
        jbtn_Tic3.setText("");
        jbtn_Tic4.setText("");
        jbtn_Tic5.setText("");
        jbtn_Tic6.setText("");
        jbtn_Tic7.setText("");
        jbtn_Tic8.setText("");
        jbtn_Tic9.setText("");
        
        jbtn_Tic1.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic2.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic3.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic4.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic5.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic6.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic7.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic8.setBackground(Color.LIGHT_GRAY);
        jbtn_Tic9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jbtn_NewGameActionPerformed

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
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtn_Exit;
    private javax.swing.JButton jbtn_NewGame;
    private javax.swing.JButton jbtn_Reset;
    private javax.swing.JButton jbtn_Tic1;
    private javax.swing.JButton jbtn_Tic2;
    private javax.swing.JButton jbtn_Tic3;
    private javax.swing.JButton jbtn_Tic4;
    private javax.swing.JButton jbtn_Tic5;
    private javax.swing.JButton jbtn_Tic6;
    private javax.swing.JButton jbtn_Tic7;
    private javax.swing.JButton jbtn_Tic8;
    private javax.swing.JButton jbtn_Tic9;
    private javax.swing.JLabel jlabel_playerO;
    private javax.swing.JLabel jlabel_playerX;
    // End of variables declaration//GEN-END:variables
}
