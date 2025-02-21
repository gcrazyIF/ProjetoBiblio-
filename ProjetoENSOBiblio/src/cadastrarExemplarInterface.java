import java.util.*;
import javax.swing.JOptionPane;
public class cadastrarExemplarInterface extends javax.swing.JFrame {

    ArrayList<Livro> livros;
    ArrayList<Exemplar> exemplares;
    ArrayList<Emprestimo> emprestimos;
    ArrayList<Usuario> usuarios;
    String IDLivroExemplar, IDExemplar;
    /**
     * Creates new form cadastrarExemplarInterface
     */
    public cadastrarExemplarInterface(ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Emprestimo> emprestimos, ArrayList<Usuario> usuarios) {
        initComponents();
        this.livros = livros;
        this.exemplares = exemplares;
        this.emprestimos = emprestimos;
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
        IDExemplarTexto = new javax.swing.JLabel();
        campoIDExemplar = new javax.swing.JTextField();
        IDLivrroExTexto = new javax.swing.JLabel();
        campoIDLivro = new javax.swing.JTextField();
        botaoCadastroExem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloInterface.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        tituloInterface.setText("Biblio+");

        IDExemplarTexto.setText("ID do exemplar: ");

        IDLivrroExTexto.setText("ID do livro do exemplar: ");

        botaoCadastroExem.setText("Cadastrar exemplar");
        botaoCadastroExem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastroExemActionPerformed(evt);
            }
        });

        jLabel1.setText("interfaceGUI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDLivrroExTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDExemplarTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIDExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(botaoCadastroExem)
                .addGap(265, 265, 265))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloInterface)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloInterface)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLivrroExTexto)
                    .addComponent(campoIDLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDExemplarTexto)
                    .addComponent(campoIDExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(botaoCadastroExem)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastroExemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastroExemActionPerformed
        IDLivroExemplar = campoIDLivro.getText();
        IDExemplar = campoIDExemplar.getText();
        for(int x = 0; x<livros.size(); x++){
            if(IDLivroExemplar.equalsIgnoreCase(livros.get(x).getIDLivro())){
                Exemplar novoExemplar = new Exemplar(IDExemplar, false, false);
                livros.get(x).getExemplares().add(novoExemplar);
                for(int m = 0; m<livros.get(x).getExemplares().size(); m++){
                    System.out.println("Exemplares existentes: "+livros.get(x).getExemplares().get(m).getIDExemplar());
                }
            }
            else{
                System.out.println("Livro não encontrado no acervo");
            }
        }
    }//GEN-LAST:event_botaoCadastroExemActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrarExemplarInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrarExemplarInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrarExemplarInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrarExemplarInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrarExemplarInterface().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDExemplarTexto;
    private javax.swing.JLabel IDLivrroExTexto;
    private javax.swing.JButton botaoCadastroExem;
    private javax.swing.JTextField campoIDExemplar;
    private javax.swing.JTextField campoIDLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tituloInterface;
    // End of variables declaration//GEN-END:variables
}
