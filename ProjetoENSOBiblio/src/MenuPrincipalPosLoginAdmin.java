import java.util.*;
import javax.swing.JOptionPane;
public class MenuPrincipalPosLoginAdmin extends javax.swing.JFrame {

    ArrayList<Livro> livros;
    ArrayList<Exemplar> exemplares;
    ArrayList<Usuario> usuarios;
    /**
     * Creates new form MenuPrincipalPosLogin
     */
    public MenuPrincipalPosLoginAdmin(ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Usuario> usuarios) {
        initComponents();
        this.livros = livros;
        this.exemplares = exemplares;
        this.usuarios = usuarios;
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
        pesqusiarAutorBotao = new javax.swing.JButton();
        pesquisarGeneroBotao = new javax.swing.JButton();
        cadastrarLivroBotao = new javax.swing.JButton();
        cadastrarExemplarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloInterface.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        tituloInterface.setText("Biblio+");

        pesquisarTituloBotao.setText("Pesquisar obra por título");
        pesquisarTituloBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTituloBotaoActionPerformed(evt);
            }
        });

        pesqusiarAutorBotao.setText("Pesquisar obra por autor");
        pesqusiarAutorBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesqusiarAutorBotaoActionPerformed(evt);
            }
        });

        pesquisarGeneroBotao.setText("Pesquisar obra por gênero");

        cadastrarLivroBotao.setText("Cadastrar novo livro");

        cadastrarExemplarBotao.setText("Cadastrar novo exemplar");
        cadastrarExemplarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarExemplarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(tituloInterface)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cadastrarExemplarBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadastrarLivroBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesquisarTituloBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesqusiarAutorBotao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pesquisarGeneroBotao, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloInterface)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarTituloBotao)
                    .addComponent(cadastrarLivroBotao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesqusiarAutorBotao)
                    .addComponent(cadastrarExemplarBotao))
                .addGap(18, 18, 18)
                .addComponent(pesquisarGeneroBotao)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarTituloBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTituloBotaoActionPerformed
        String livroPesquisaTitulo;
        livroPesquisaTitulo = JOptionPane.showInputDialog(null, "Insira o título que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaTitulo.equalsIgnoreCase(livros.get(i).getTitulo())) {
                JOptionPane.showMessageDialog(null, "Livro presente no acervo!");
                livros.get(i).exibirLivro();
            }
        }
    }//GEN-LAST:event_pesquisarTituloBotaoActionPerformed

    private void cadastrarExemplarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarExemplarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarExemplarBotaoActionPerformed

    private void pesqusiarAutorBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesqusiarAutorBotaoActionPerformed
        String livroPesquisaAutor;
        livroPesquisaAutor = JOptionPane.showInputDialog(null, "Insira o autor que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaAutor.equalsIgnoreCase(livros.get(i).getAutor())) {
                System.out.println(livros.get(i).getTitulo());
                JOptionPane.showMessageDialog(null, "Autor presente no acervo!");
                livros.get(i).exibirLivro();
            }
        }
    }//GEN-LAST:event_pesqusiarAutorBotaoActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalPosLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarExemplarBotao;
    private javax.swing.JButton cadastrarLivroBotao;
    private javax.swing.JButton pesquisarGeneroBotao;
    private javax.swing.JButton pesquisarTituloBotao;
    private javax.swing.JButton pesqusiarAutorBotao;
    private javax.swing.JLabel tituloInterface;
    // End of variables declaration//GEN-END:variables
}
