import java.sql.*;
        
public class AvaliacaoDAO {
    Connection conexao;

    public AvaliacaoDAO(){
        conexao = new ConexaoSQL().getConexaoSQL();      
    }
    
    //Remover os dados de uma pessoa no MySQL
    public void removerPessoa(int IDAvaliacao){
        try{
            String sql = "delete from Avaliacao where id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, IDAvaliacao); 
           
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\n Avaliação removida com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    //inserir os dados de uma pessoa no mysql
    public void inserirAvaliacao(Avaliacao novaAvaliacao){
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Avaliacao (IDAvaliacao, estrelas, mediaEstrelas, comentario, IDLivroAva) values ( ?, ?, ?, ?, ?)");
           
            ps.setFloat(1, novaAvaliacao.getIDAvaliacao()); 
            ps.setFloat(2, novaAvaliacao.getEstrelas());
            ps.setFloat(3, novaAvaliacao.getMediaEstrelas());
            ps.setString(4, novaAvaliacao.getComentario());
            ps.setString(5, novaAvaliacao.getIDLivroAva());
            
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nAvaliação inserida com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from avaliacao;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                int IDAvaliacaoIdentificacao = rst.getInt("IDAvaliacao");
                float estrelasIdentificacao = rst.getFloat("estrelas");
                float mediaEstrelasIdentificacao = rst.getFloat("mediaEstrelas");
                String comentarioIdentificacao = rst.getString("comentario");
                int IDLivroAva = rst.getInt("IDLivroAva");
                
                System.out.println("Dados do banco: "+IDAvaliacaoIdentificacao+" "+estrelasIdentificacao+" "+mediaEstrelasIdentificacao+" "+comentarioIdentificacao+" "+IDLivroAva);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de avaliação: "+ex);
        }
    }
}
