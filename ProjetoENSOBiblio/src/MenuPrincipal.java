import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class MenuPrincipal extends javax.swing.JFrame {
    
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    ArrayList<Exemplar> exemplares = new ArrayList<Exemplar>();
    ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
    Usuario admin = new Usuario("0", "admin@gmail.com", "admin123", "(82)94002-8922", "ge", "980.567.323-12");
    String livroPesquisaTitulo, livroPesquisaAutor, livroPesquisaGenero;
    
    /**
     * Creates new form Interfac
     */
    // ArrayList<Livro> livros, ArrayList<Exemplar> exemplares, ArrayList<Emprestimo> emprestimos, ArrayList<Usuario> usuarios, ArrayList<Avaliacao> avaliacoes
    /* this.livros = livros;
        this.exemplares = exemplares;
        this.emprestimos = emprestimos;
        this.usuarios = usuarios;
        this.avaliacoes = avaliacoes;
    */
    public MenuPrincipal() {
        initComponents();
        
        Livro livroVBSA = new Livro("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance",
                "Relações "
                        + "internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.",
                10, 2019);

        Livro livroUltimaParada = new Livro("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem "
                + "adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5,
                2021);

        Livro livroHeartStopper = new Livro("HRSTP", "Heartstopper", "Romance", "Alice Oseman",
                "Dois garotos apaixonados descobrem "
                        + "as nuâncias da sexualidade, do amor e do afeto.",
                5, 2019);
        livros.add(livroVBSA);
        livros.add(livroUltimaParada);
        livros.add(livroHeartStopper);
        
        Exemplar exeVBSA1 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 3, 2019, "VBSA1", false, true);
        Exemplar exeVBSA2 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 3, 2019, "VBSA2", true, false);
        Emprestimo emprVBSA1 = new Emprestimo(true);
        Exemplar exeVBSA3 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 3, 2019, "VBSA3", false, false);
        Exemplar exeULTPARAD1 = new Exemplar("ULTPARAD", "Última Parada", "Casey MCQuinston", "Romance", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 2, 2021, "ULTPARAD1", true, true);
        Emprestimo emprULTPARAD1 = new Emprestimo(true);
        Exemplar exeULTPARAD2 = new Exemplar("ULTPARAD", "Última Parada", "Casey MCQuinston", "Romance", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 2, 2021, "ULTPARAD2", false, false);
        Exemplar exeHRSTP1 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 3, 2019, "HRSTP1", false, false);
        Exemplar exeHRSTP2 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 3, 2019, "HRSTP2", true, true);
        Emprestimo emprHRSTP1 = new Emprestimo(true);
        Exemplar exeHRSTP3 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 3, 2019, "HRSTP3", false, false);

        livros.get(0).getExemplares().add(exeVBSA1);
        livros.get(0).getExemplares().add(exeVBSA2);
        livros.get(0).getExemplares().add(exeVBSA3);
        livros.get(1).getExemplares().add(exeULTPARAD1);
        livros.get(1).getExemplares().add(exeULTPARAD2);
        livros.get(2).getExemplares().add(exeHRSTP1);
        livros.get(2).getExemplares().add(exeHRSTP2);
        livros.get(2).getExemplares().add(exeHRSTP3);
        emprestimos.add(emprVBSA1);
        emprestimos.add(emprULTPARAD1);
        emprestimos.add(emprHRSTP1);
        
        usuarios.add(admin);
        
        /*sistema.getLivros();
        livros.add(sistema.getLivros().get(0));
        livros.add(sistema.getLivros().get(1));
        livros.add(sistema.getLivros().get(2));
        sistema.getEmprestimos();
        sistema.getUsuarios();
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisarTituloBotao = new javax.swing.JButton();
        pesquisarAutorBotao = new javax.swing.JButton();
        cadastrarBotaoPInterface = new javax.swing.JButton();
        logarBotaoPInterface = new javax.swing.JButton();
        pesquisarGeneroBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pesquisarTituloBotao.setContentAreaFilled(false);
        pesquisarTituloBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarTituloBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarTituloBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, 50));

        pesquisarAutorBotao.setContentAreaFilled(false);
        pesquisarAutorBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarAutorBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarAutorBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 150, 50));

        cadastrarBotaoPInterface.setContentAreaFilled(false);
        cadastrarBotaoPInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBotaoPInterfaceActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarBotaoPInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 200, 50));

        logarBotaoPInterface.setContentAreaFilled(false);
        logarBotaoPInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarBotaoPInterfaceActionPerformed(evt);
            }
        });
        getContentPane().add(logarBotaoPInterface, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 200, 60));

        pesquisarGeneroBotao.setContentAreaFilled(false);
        pesquisarGeneroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarGeneroBotaoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarGeneroBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MenuPrincipalAlternativo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarTituloBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarTituloBotaoActionPerformed
        livroPesquisaTitulo = JOptionPane.showInputDialog(null, "Insira o título que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i)!=null){
                if (livroPesquisaTitulo.equalsIgnoreCase(livros.get(i).getTitulo())) {
                    JOptionPane.showMessageDialog(null, "Livro presente no acervo!");
                    JOptionPane.showMessageDialog(null, "Título da obra: "+livros.get(i).getTitulo()+"\n"
                            + "Autor da obra: "+livros.get(i).getAutor()+"\nGênero: "+livros.get(i).getGenero()+"\nAno de publicação: "+livros.get(i).getAnoPubli()+"\nSinopse: "+livros.get(i).getSinopse()+"\nNúmero de exemplares no acervo: "+livros.get(i).getNumExemplares());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Livro não encontrado no acervo!");
                }
            }
        }
    }//GEN-LAST:event_pesquisarTituloBotaoActionPerformed

    private void logarBotaoPInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarBotaoPInterfaceActionPerformed
        loginInterface logar = new loginInterface(livros, exemplares, emprestimos, usuarios, avaliacoes);
        JFrame logarFrame = new JFrame();
        logarFrame.setSize(700, 500);
        logarFrame.add(logar);
        logarFrame.setVisible(true);
    }//GEN-LAST:event_logarBotaoPInterfaceActionPerformed

    private void cadastrarBotaoPInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBotaoPInterfaceActionPerformed
        cadastroInterface cadastrar = new cadastroInterface(livros, exemplares, emprestimos, usuarios, avaliacoes);
        cadastrar.setVisible(true);
        JFrame cadastrarFrame = new JFrame();
        cadastrarFrame.setSize(700, 500);
        cadastrarFrame.add(cadastrar);
        cadastrarFrame.setVisible(true);
    }//GEN-LAST:event_cadastrarBotaoPInterfaceActionPerformed
    
    private void pesquisarAutorBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarAutorBotaoActionPerformed
        livroPesquisaAutor = JOptionPane.showInputDialog(null, "Insira o autor que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i)!=null){
                if (livroPesquisaAutor.equalsIgnoreCase(livros.get(i).getAutor())) {
                    JOptionPane.showMessageDialog(null, "Autor presente no acervo!");
                    JOptionPane.showMessageDialog(null, "Título da obra: "+livros.get(i).getTitulo()+"\n"
                                + "Autor da obra: "+livros.get(i).getAutor()+"\nGênero: "+livros.get(i).getGenero()+"\nAno de publicação: "+livros.get(i).getAnoPubli()+"\nSinopse: "+livros.get(i).getSinopse()+"\nNúmero de exemplares no acervo: "+livros.get(i).getNumExemplares());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Gênero literário não encontrado no acervo!");
                }
            }
        }
    }//GEN-LAST:event_pesquisarAutorBotaoActionPerformed

    private void pesquisarGeneroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarGeneroBotaoActionPerformed
        livroPesquisaGenero = JOptionPane.showInputDialog(null, "Insira o gênero literário que deseja pesquisar.");
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i)!=null){
                if (livroPesquisaGenero.equalsIgnoreCase(livros.get(i).getGenero())) {
                    JOptionPane.showMessageDialog(null, "Gênero literário presente no acervo!");
                    JOptionPane.showMessageDialog(null, "Título da obra: "+livros.get(i).getTitulo()+"\n"
                                + "Autor da obra: "+livros.get(i).getAutor()+"\nGênero: "+livros.get(i).getGenero()+"\nAno de publicação: "+livros.get(i).getAnoPubli()+"\nSinopse: "+livros.get(i).getSinopse()+"\nNúmero de exemplares no acervo: "+livros.get(i).getNumExemplares());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Gênero literário não encontrado no acervo!");
                }
            }
        }
    }//GEN-LAST:event_pesquisarGeneroBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarBotaoPInterface;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logarBotaoPInterface;
    private javax.swing.JButton pesquisarAutorBotao;
    private javax.swing.JButton pesquisarGeneroBotao;
    private javax.swing.JButton pesquisarTituloBotao;
    // End of variables declaration//GEN-END:variables
}
