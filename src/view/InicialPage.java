/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author pedrobertolini
 */
public class InicialPage extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
   
    
    public InicialPage() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/image/ms-icon.png")).getImage());
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new JLabel();
        txtConectadoComo = new JLabel();
        jLabel1 = new JLabel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/image/bg_4.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new JMenuBar();
        cadastrarLoja = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem10 = new JMenuItem();
        jMenuItem11 = new JMenuItem();
        jMenuItem12 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem4 = new JMenuItem();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenu7 = new JMenu();
        jMenuItem13 = new JMenuItem();
        jMenuItem14 = new JMenuItem();
        jMenu5 = new JMenu();
        jMenuItem16 = new JMenuItem();
        jMenuItem17 = new JMenuItem();
        jMenuItem18 = new JMenuItem();
        jMenuItem19 = new JMenuItem();
        jMenuItem20 = new JMenuItem();
        jMenuItem21 = new JMenuItem();
        jMenu6 = new JMenu();
        jMenu8 = new JMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MetaShape - Administrative");
        setBackground(new Color(24, 24, 24));
        setResizable(false);
        getContentPane().setLayout(new AbsoluteLayout());

        jLabel9.setIcon(new ImageIcon(getClass().getResource("/image/ms-icon.png"))); // NOI18N
        getContentPane().add(jLabel9, new AbsoluteConstraints(0, 330, 310, 320));

        txtConectadoComo.setBackground(new Color(255, 255, 255));
        txtConectadoComo.setForeground(new Color(255, 255, 255));
        txtConectadoComo.setText("Conectado como: ");
        getContentPane().add(txtConectadoComo, new AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/image/bg_4.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new AbsoluteConstraints(0, 0, 1050, 650));
        getContentPane().add(jDesktopPane1, new AbsoluteConstraints(1, 1, 1050, 650));

        cadastrarLoja.setIcon(new ImageIcon(getClass().getResource("/image/StoreIcon.png"))); // NOI18N
        cadastrarLoja.setText("Lojas");
        cadastrarLoja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cadastrarLojaActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new ImageIcon(getClass().getResource("/image/createIcon.png"))); // NOI18N
        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        cadastrarLoja.add(jMenuItem1);

        jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new ImageIcon(getClass().getResource("/image/searchIcon.png"))); // NOI18N
        jMenuItem2.setText("Buscar");
        jMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        cadastrarLoja.add(jMenuItem2);

        jMenuItem3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        jMenuItem3.setIcon(new ImageIcon(getClass().getResource("/image/editIcon.png"))); // NOI18N
        jMenuItem3.setText("Editar");
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        cadastrarLoja.add(jMenuItem3);

        jMenuBar1.add(cadastrarLoja);

        jMenu4.setIcon(new ImageIcon(getClass().getResource("/image/ProductIcon.png"))); // NOI18N
        jMenu4.setText("Produtos");

        jMenuItem10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem10.setIcon(new ImageIcon(getClass().getResource("/image/createIcon.png"))); // NOI18N
        jMenuItem10.setText("Cadastrar");
        jMenuItem10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        jMenuItem11.setIcon(new ImageIcon(getClass().getResource("/image/searchIcon.png"))); // NOI18N
        jMenuItem11.setText("Buscar");
        jMenuItem11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        jMenuItem12.setIcon(new ImageIcon(getClass().getResource("/image/editIcon.png"))); // NOI18N
        jMenuItem12.setText("Editar");
        jMenuItem12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new ImageIcon(getClass().getResource("/image/ProfissionalIcon.png"))); // NOI18N
        jMenu2.setText("Treinadores / Nutricionistas");

        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new ImageIcon(getClass().getResource("/image/createIcon.png"))); // NOI18N
        jMenuItem4.setText("Cadastrar");
        jMenuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        jMenuItem5.setIcon(new ImageIcon(getClass().getResource("/image/searchIcon.png"))); // NOI18N
        jMenuItem5.setText("Buscar");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        jMenuItem6.setIcon(new ImageIcon(getClass().getResource("/image/editIcon.png"))); // NOI18N
        jMenuItem6.setText("Editar");
        jMenuItem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu7.setIcon(new ImageIcon(getClass().getResource("/image/CuponIcon.png"))); // NOI18N
        jMenu7.setText("Cupons");

        jMenuItem13.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem13.setIcon(new ImageIcon(getClass().getResource("/image/createIcon.png"))); // NOI18N
        jMenuItem13.setText("Cadastrar");
        jMenuItem13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        jMenuItem14.setIcon(new ImageIcon(getClass().getResource("/image/searchIcon.png"))); // NOI18N
        jMenuItem14.setText("Buscar");
        jMenu7.add(jMenuItem14);

        jMenuBar1.add(jMenu7);

        jMenu5.setIcon(new ImageIcon(getClass().getResource("/image/FinancialIcon.png"))); // NOI18N
        jMenu5.setText("Financeiro");

        jMenuItem16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
        jMenuItem16.setIcon(new ImageIcon(getClass().getResource("/image/HealthIcon.png"))); // NOI18N
        jMenuItem16.setText("Geral");
        jMenu5.add(jMenuItem16);

        jMenuItem17.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
        jMenuItem17.setIcon(new ImageIcon(getClass().getResource("/image/AtiveFinanceIcon.png"))); // NOI18N
        jMenuItem17.setText("Ativos");
        jMenuItem17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuItem18.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        jMenuItem18.setIcon(new ImageIcon(getClass().getResource("/image/PassiveFinanceIcon.png"))); // NOI18N
        jMenuItem18.setText("Passivos");
        jMenu5.add(jMenuItem18);

        jMenuItem19.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
        jMenuItem19.setIcon(new ImageIcon(getClass().getResource("/image/SubstoreIcon.png"))); // NOI18N
        jMenuItem19.setText("Estoque");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.CTRL_MASK));
        jMenuItem20.setIcon(new ImageIcon(getClass().getResource("/image/MovimentationIcon.png"))); // NOI18N
        jMenuItem20.setText("Movimentação");
        jMenuItem20.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
        jMenuItem21.setIcon(new ImageIcon(getClass().getResource("/image/BalanceIcon.png"))); // NOI18N
        jMenuItem21.setText("Balanço");
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new ImageIcon(getClass().getResource("/image/AdministrativeIcon.png"))); // NOI18N
        jMenu6.setText("Administrativo");
        jMenuBar1.add(jMenu6);

        jMenu8.setIcon(new ImageIcon(getClass().getResource("/image/ExitIcon.png"))); // NOI18N
        jMenu8.setText("Sair");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem17ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem20ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void cadastrarLojaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cadastrarLojaActionPerformed
        // TODO add your handling code here:        
        CadastroLoja telaCadLoja = new CadastroLoja();
        jDesktopPane1.add(telaCadLoja);
        telaCadLoja.setVisible(true);

    }//GEN-LAST:event_cadastrarLojaActionPerformed

    private void jMenuItem1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        CadastroLoja telaCadLoja = new CadastroLoja();
        jDesktopPane1.add(telaCadLoja);
        telaCadLoja.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        EditarLoja telaEditLoja = new EditarLoja();
        jDesktopPane1.add(telaEditLoja);
        telaEditLoja.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem10ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        CadastroProduto telaCadProduto = new CadastroProduto();
        jDesktopPane1.add(telaCadProduto);
        telaCadProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        EditarProduto telaEditProduto = new EditarProduto();
        jDesktopPane1.add(telaEditProduto);
        telaEditProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        CadastroProfissional telaCadProfissional = new CadastroProfissional();
        jDesktopPane1.add(telaCadProfissional);
        telaCadProfissional.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        EditarProfissional telaEditProfissional = new EditarProfissional();
        jDesktopPane1.add(telaEditProfissional);
        telaEditProfissional.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem13ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        CadastroCupom telaCadCupom = new CadastroCupom();
        jDesktopPane1.add(telaCadCupom);
        telaCadCupom.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        BuscarProduto telaBuscarProduto = new BuscarProduto();
        jDesktopPane1.add(telaBuscarProduto);
        telaBuscarProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        BuscarProduto telaBuscarProduto = new BuscarProduto();
        jDesktopPane1.add(telaBuscarProduto);
        telaBuscarProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(InicialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicialPage().setVisible(true);
            }
        });
    }

    public void recebe(String nome){
        txtConectadoComo.setText("Conectado como: " + nome);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JMenu cadastrarLoja;
    private JDesktopPane jDesktopPane1;
    private JLabel jLabel1;
    private JLabel jLabel9;
    private JMenu jMenu2;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenu jMenu7;
    private JMenu jMenu8;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem10;
    private JMenuItem jMenuItem11;
    private JMenuItem jMenuItem12;
    private JMenuItem jMenuItem13;
    private JMenuItem jMenuItem14;
    private JMenuItem jMenuItem16;
    private JMenuItem jMenuItem17;
    private JMenuItem jMenuItem18;
    private JMenuItem jMenuItem19;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem20;
    private JMenuItem jMenuItem21;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JLabel txtConectadoComo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nome
     */
  
}
