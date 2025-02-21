import java.sql.*;
        
public class ExemplarDAO {
    Connection conexao;

    public ExemplarDAO(){
        conexao = new ConexaoSQL().getConexaoSQL();      
    }
    
    //Remover os dados de uma pessoa no MySQL
    public void removerPessoa(String IDExemplar){
        try{
            String sql = "delete from Avaliacao where id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, IDExemplar); 
           
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nExemplar removido com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    //inserir os dados de uma pessoa no mysql
    public void inserirExemplar(Exemplar novoExemplar){
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Exemplar (IDExemplar, emprestado, reservado) values ( ?, ?, ?)");
           
            ps.setString(1, novoExemplar.getIDExemplar()); 
            ps.setBoolean(2, novoExemplar.getEmprestado());
            ps.setBoolean(3, novoExemplar.getReservado());
            
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nExemplar inserido com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from exemplar;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String IDExemplarIdentificacao = rst.getString("IDExemplar");
                boolean emprestadoIdentificacao = rst.getBoolean("emprestado");
                boolean reservadoIdentificacao = rst.getBoolean("reservado");
                
                System.out.println("Dados do banco: "+IDExemplarIdentificacao+" "+emprestadoIdentificacao+" "+reservadoIdentificacao);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de exemplar: "+ex);
        }
    }
}
