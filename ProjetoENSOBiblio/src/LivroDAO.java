import java.sql.*;
import javax.swing.JOptionPane;
        
public class LivroDAO {
    Connection conexao;

    public LivroDAO(){
        conexao = new ConexaoSQL().getConexaoSQL();      
    }
    
    //Remover os dados de uma pessoa no MySQL
    public void removerLivro(String IDLivro){
        try{
            String sql = "delete from Livro where id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, IDLivro); 
           
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nLivro removido com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    //inserir os dados de uma pessoa no mysql
    public void inserirLivro(Livro novoLivro){
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Livro (IDLivro, titulo, autor, genero, sinopse, numExemplares, anoPubli) values ( ?, ?, ?, ?, ?, ?, ?)");
           
            ps.setString(1, novoLivro.getIDLivro()); 
            ps.setString(2, novoLivro.getTitulo());
            ps.setString(3, novoLivro.getAutor());
            ps.setString(4, novoLivro.getGenero());
            ps.setString(5, novoLivro.getSinopse());
            ps.setInt(6, novoLivro.getNumExemplares());
            ps.setInt(7, novoLivro.getAnoPubli());
            
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nLivro inserido com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from livro;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String IDLivroIdentificacao = rst.getString("IDLivro");
                String tituloIdentificacao = rst.getString("titulo");
                String autorIdentificacao = rst.getString("autor");
                String generoIdentificacao = rst.getString("genero");
                String sinopseIdentificacao = rst.getString("sinopse");
                int numExemplaresIdentificacao = rst.getInt("numExemplares");
                int anoPubliIdentificacao = rst.getInt("anoPubli");
                
                System.out.println("Dados do banco: "+IDLivroIdentificacao+" "+tituloIdentificacao+" "+autorIdentificacao+" "+generoIdentificacao+" "+sinopseIdentificacao+" "+numExemplaresIdentificacao+" "+anoPubliIdentificacao);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de livro: "+ex);
        }
    }
    
    public void ConsultarGenero(String generoConsulta){
        try{
            String sql="select * from livro where genero = ?";
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            sttmt.setString(1, generoConsulta);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String IDLivroIdentificacao = rst.getString("IDLivro");
                String tituloIdentificacao = rst.getString("titulo");
                String autorIdentificacao = rst.getString("autor");
                String generoIdentificacao = rst.getString("genero");
                String sinopseIdentificacao = rst.getString("sinopse");
                int numExemplaresIdentificacao = rst.getInt("numExemplares");
                int anoPubliIdentificacao = rst.getInt("anoPubli");
                
                JOptionPane.showMessageDialog(null, "Dados do banco: "+IDLivroIdentificacao+"\n"+tituloIdentificacao+"\n"+autorIdentificacao+"\n"+generoIdentificacao+"\n"+sinopseIdentificacao+"\n"+numExemplaresIdentificacao+"\n"+anoPubliIdentificacao);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de livro: "+ex);
        }
    }
}
