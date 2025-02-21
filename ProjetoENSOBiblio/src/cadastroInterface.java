import java.util.*;
import javax.swing.JOptionPane;

public class cadastroInterface extends javax.swing.JPanel {

    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
    /**
     * Creates new form cadastroInterface
     */
    public cadastroInterface(ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Emprestimo> emprestimos, ArrayList<Usuario> usuarios, ArrayList<Avaliacao> avaliacoes) {
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

        cadastrarBotao = new javax.swing.JButton();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoCPF = new javax.swing.JFormattedTextField();
        campoNumero = new javax.swing.JFormattedTextField();
        campoIDUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastrarBotao.setContentAreaFilled(false);
        cadastrarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoActionPerformed(evt);
            }
        });
        add(cadastrarBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 120, 40));

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 230, 30));

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });
        add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 230, 30));

        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCPF.setToolTipText("");
        add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 220, 30));

        try {
            campoNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        add(campoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 230, 40));
        add(campoIDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 240, 30));
        add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 322, 230, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cadastro.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoActionPerformed
        String IDUsuario = campoIDUsuario.getText();
        String nome = campoNome.getText();
        String email = campoEmail.getText();
        String telefone = campoNumero.getText();
        String CPF = campoCPF.getText();
        String senha = new String(campoSenha.getPassword());
        Usuario novoUsuario = new Usuario(IDUsuario, email, senha, telefone, nome, CPF);
        usuarios.add(novoUsuario);
        JOptionPane.showMessageDialog(null, "Cadastro realizado!");
    }//GEN-LAST:event_cadastrarBotaoActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBotao;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoIDUsuario;
    private javax.swing.JTextField campoNome;
    private javax.swing.JFormattedTextField campoNumero;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
