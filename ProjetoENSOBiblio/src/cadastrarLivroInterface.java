import java.util.*;
import javax.swing.JOptionPane;
public class cadastrarLivroInterface extends javax.swing.JFrame {

    ArrayList<Livro> livros;
    ArrayList<Exemplar> exemplares;
    ArrayList<Usuario> usuarios;
    String IDLivro, titulo, autor, genero, sinopse;
    int numExemplares, anoPubli;
    /**
     * Creates new form cadastrarLivroInterface
     */
    public cadastrarLivroInterface(ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Usuario> usuarios) {
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
        IDLivroTexto = new javax.swing.JLabel();
        campoIDLivro = new javax.swing.JTextField();
        tituloLivroTexto = new javax.swing.JLabel();
        autorLivroTexto = new javax.swing.JLabel();
        generoLivroTexto = new javax.swing.JLabel();
        sipnoseLivroTexto = new javax.swing.JLabel();
        campoTituloLivro = new javax.swing.JTextField();
        campoAutorLivro = new javax.swing.JTextField();
        campoGeneroLivro = new javax.swing.JTextField();
        campoSinopse = new javax.swing.JTextField();
        cadastrarLivroBotaoInterface = new javax.swing.JButton();
        anoPubliTexto = new javax.swing.JLabel();
        numExemplarTexto = new javax.swing.JLabel();
        campoAnoPubli = new javax.swing.JTextField();
        campoNumExem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloInterface.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        tituloInterface.setText("Biblio+");

        IDLivroTexto.setText("ID do livro:");

        campoIDLivro.setToolTipText("");
        campoIDLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDLivroActionPerformed(evt);
            }
        });

        tituloLivroTexto.setText("Título do livro: ");

        autorLivroTexto.setText("Autor do livro:");

        generoLivroTexto.setText("Gênero do livro: ");

        sipnoseLivroTexto.setText("Sinopse do livro:");

        campoTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloLivroActionPerformed(evt);
            }
        });

        campoGeneroLivro.setToolTipText("");

        cadastrarLivroBotaoInterface.setText("Cadastrar livro");
        cadastrarLivroBotaoInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLivroBotaoInterfaceActionPerformed(evt);
            }
        });

        anoPubliTexto.setText("Ano de publicação:");

        numExemplarTexto.setText("Número de exemplares no acervo:");

        campoAnoPubli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnoPubliActionPerformed(evt);
            }
        });

        campoNumExem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumExemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(tituloInterface))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sipnoseLivroTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDLivroTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(generoLivroTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoGeneroLivro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tituloLivroTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(autorLivroTexto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(campoAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cadastrarLivroBotaoInterface)
                                        .addGap(89, 89, 89))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(anoPubliTexto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campoAnoPubli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(numExemplarTexto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoNumExem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloInterface)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDLivroTexto)
                            .addComponent(campoIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cadastrarLivroBotaoInterface)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLivroTexto)
                    .addComponent(campoTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorLivroTexto)
                    .addComponent(campoAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoPubliTexto)
                    .addComponent(campoAnoPubli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoLivroTexto)
                    .addComponent(campoGeneroLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numExemplarTexto)
                    .addComponent(campoNumExem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sipnoseLivroTexto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campoSinopse, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoIDLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDLivroActionPerformed

    private void campoTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTituloLivroActionPerformed

    private void cadastrarLivroBotaoInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLivroBotaoInterfaceActionPerformed
        IDLivro = campoIDLivro.getText();
        titulo = campoTituloLivro.getText();
        autor = campoAutorLivro.getText();
        genero = campoGeneroLivro.getText();
        sinopse = campoSinopse.getText();
        numExemplares = Integer.parseInt(campoNumExem.getText());
        anoPubli = Integer.parseInt(campoAnoPubli.getText());
        
        Livro livroNovo = new Livro(IDLivro, titulo, autor, genero, sinopse, numExemplares, anoPubli);
        for(int l = 0; l<numExemplares; l++){
            Exemplar novoExemplar = new Exemplar();
        }
    }//GEN-LAST:event_cadastrarLivroBotaoInterfaceActionPerformed

    private void campoAnoPubliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnoPubliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAnoPubliActionPerformed

    private void campoNumExemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumExemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumExemActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrarLivroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarLivroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarLivroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarLivroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarLivroInterface().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLivroTexto;
    private javax.swing.JLabel anoPubliTexto;
    private javax.swing.JLabel autorLivroTexto;
    private javax.swing.JButton cadastrarLivroBotaoInterface;
    private javax.swing.JTextField campoAnoPubli;
    private javax.swing.JTextField campoAutorLivro;
    private javax.swing.JTextField campoGeneroLivro;
    private javax.swing.JTextField campoIDLivro;
    private javax.swing.JTextField campoNumExem;
    private javax.swing.JTextField campoSinopse;
    private javax.swing.JTextField campoTituloLivro;
    private javax.swing.JLabel generoLivroTexto;
    private javax.swing.JLabel numExemplarTexto;
    private javax.swing.JLabel sipnoseLivroTexto;
    private javax.swing.JLabel tituloInterface;
    private javax.swing.JLabel tituloLivroTexto;
    // End of variables declaration//GEN-END:variables
}
