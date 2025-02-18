import java.util.*;
import javax.swing.JOptionPane;

public class loginInterface extends javax.swing.JPanel {

    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
    /**
     * Creates new form loginInterface
     */
    public loginInterface(ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Emprestimo> emprestimos, ArrayList<Usuario> usuarios, ArrayList<Avaliacao> avaliacoes) {
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

        campoEmail = new javax.swing.JTextField();
        emailTexto = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        senhaTexto = new javax.swing.JLabel();
        logarBotao = new javax.swing.JButton();

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        emailTexto.setText("E-mail:");

        senhaTexto.setText("Senha:");

        logarBotao.setText("Logar");
        logarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(senhaTexto)
                                .addGap(18, 18, 18)
                                .addComponent(campoSenha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailTexto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(184, 184, 184))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logarBotao)
                        .addGap(234, 234, 234))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTexto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaTexto)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logarBotao)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed

    private void logarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarBotaoActionPerformed
        String emailVerifica = campoEmail.getText();
        String senhaVerifica = new String(campoSenha.getPassword());
        for(int i = 0; i<usuarios.size(); i++){
            if (emailVerifica.equalsIgnoreCase(usuarios.get(i).getEmail()) && senhaVerifica.equals(usuarios.get(i).getSenha())) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                MenuPrincipalPosLogin menuPosLogin = new MenuPrincipalPosLogin(livros, exemplares, emprestimos, usuarios, avaliacoes);
                menuPosLogin.setVisible(true);
            }
            else if(emailVerifica.equals("admin@gmail.com") && senhaVerifica.equals("admin123")){
                JOptionPane.showMessageDialog(null, "Login do administrador realizado com sucesso!");
                MenuPrincipalPosLoginAdmin menuAdmin = new MenuPrincipalPosLoginAdmin(livros, exemplares, emprestimos, usuarios, avaliacoes);
                menuAdmin.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos!");
            }
        }
    }//GEN-LAST:event_logarBotaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel emailTexto;
    private javax.swing.JButton logarBotao;
    private javax.swing.JLabel senhaTexto;
    // End of variables declaration//GEN-END:variables
}
