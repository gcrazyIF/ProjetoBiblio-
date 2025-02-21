import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MenuPrincipalPosLoginAdmin extends javax.swing.JFrame {

    ArrayList<Livro> livros;
    ArrayList<Exemplar> exemplares;
    ArrayList<Emprestimo> emprestimos;
    ArrayList<Usuario> usuarios;
    ArrayList<Avaliacao> avaliacoes;
    UsuarioDAO usuarioConsultar;
    LivroDAO livroConsultar;
    ExemplarDAO exemplarConsultar;
    String  livroPesquisaTitulo, livroPesquisaAutor, livroPesquisaGenero;
    /**
     * Creates new form MenuPrincipalPosLogin
     */
    public MenuPrincipalPosLoginAdmin(ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Emprestimo> emprestimos, ArrayList<Usuario> usuarios, ArrayList<Avaliacao> avaliacoes) {
        initComponents();
        this.livros = livros;
        this.exemplares = exemplares;
        this.emprestimos = emprestimos;
        this.usuarios = usuarios;
        this.avaliacoes = avaliacoes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloInterface = new javax.swing.JLabel();
        pesquisarTituloBotao = new javax.swing.JButton();
        pesquisarAutorBotao = new javax.swing.JButton();
        pesquisarGeneroBotao = new javax.swing.JButton();
        cadastrarLivroBotao = new javax.swing.JButton();
        cadastrarExemplarBotao = new javax.swing.JButton();
        consultarDadosBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloInterface.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        tituloInterface.setText("Biblio+");
        getContentPane().add(tituloInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(1643, 6, -1, -1));

        pesquisarTituloBotao.setContentAreaFilled(false);
        pesquisarTituloBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTituloBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarTituloBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 290, 50));

        pesquisarAutorBotao.setContentAreaFilled(false);
        pesquisarAutorBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAutorBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarAutorBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 290, 40));

        pesquisarGeneroBotao.setContentAreaFilled(false);
        pesquisarGeneroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarGeneroBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarGeneroBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 290, 40));

        cadastrarLivroBotao.setContentAreaFilled(false);
        cadastrarLivroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLivroBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarLivroBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 280, 40));

        cadastrarExemplarBotao.setContentAreaFilled(false);
        cadastrarExemplarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarExemplarBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarExemplarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 290, 50));

        consultarDadosBotao.setContentAreaFilled(false);
        consultarDadosBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarDadosBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(consultarDadosBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 273, 280, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuAdmin(1400 x 1200 px) (1400 x 1000 px) (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarTituloBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTituloBotaoActionPerformed
        livroPesquisaTitulo = JOptionPane.showInputDialog(null, "Insira o título que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaTitulo.equalsIgnoreCase(livros.get(i).getTitulo())) {
                JOptionPane.showMessageDialog(null, "Livro presente no acervo!");
                livros.get(i).exibirLivro();
            }
        }
    }//GEN-LAST:event_pesquisarTituloBotaoActionPerformed

    private void cadastrarExemplarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarExemplarBotaoActionPerformed
        cadastrarExemplarInterface cadExemplarInterface = new cadastrarExemplarInterface(livros, exemplares, emprestimos, usuarios);
        cadExemplarInterface.setVisible(true);
    }//GEN-LAST:event_cadastrarExemplarBotaoActionPerformed

    private void pesquisarAutorBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAutorBotaoActionPerformed
        livroPesquisaAutor = JOptionPane.showInputDialog(null, "Insira o autor que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaAutor.equalsIgnoreCase(livros.get(i).getAutor())) {
                System.out.println(livros.get(i).getTitulo());
                JOptionPane.showMessageDialog(null, "Autor presente no acervo!");
                livros.get(i).exibirLivro();
            }
        }
    }//GEN-LAST:event_pesquisarAutorBotaoActionPerformed

    private void cadastrarLivroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLivroBotaoActionPerformed
        cadastrarLivroInterface cadLivroInterface = new cadastrarLivroInterface(livros, exemplares, emprestimos, usuarios);
        cadLivroInterface.setVisible(true);
    }//GEN-LAST:event_cadastrarLivroBotaoActionPerformed

    private void pesquisarGeneroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarGeneroBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarGeneroBotaoActionPerformed

    private void consultarDadosBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarDadosBotaoActionPerformed
        consultarInterface consultaTabs = new consultarInterface(usuarioConsultar, livroConsultar, exemplarConsultar);
        JFrame consultaTabsFrame = new JFrame();
        consultaTabsFrame.setSize(700, 500);
        consultaTabsFrame.add(consultaTabs);
        consultaTabsFrame.setVisible(true);
    }//GEN-LAST:event_consultarDadosBotaoActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalPosLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalPosLogin().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarExemplarBotao;
    private javax.swing.JButton cadastrarLivroBotao;
    private javax.swing.JButton consultarDadosBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pesquisarAutorBotao;
    private javax.swing.JButton pesquisarGeneroBotao;
    private javax.swing.JButton pesquisarTituloBotao;
    private javax.swing.JLabel tituloInterface;
    // End of variables declaration//GEN-END:variables
}
