import java.sql.*;
        
public class UsuarioDAO {
    Connection conexao;

    public UsuarioDAO(){
        conexao = new ConexaoSQL().getConexaoSQL();      
    }
    
    //Remover os dados de uma pessoa no MySQL
    public void removerUsuario(String IDUsuario){
        try{
            String sql = "delete from Usuario where id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, IDUsuario); 
           
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\n Usuário removido com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    //inserir os dados de uma pessoa no mysql
    public void inserirUsuario(Usuario novoUsuario){
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Usuario (IDUsuario, email, senha, telefone, nome, CPF) values ( ?, ?, ?, ?, ?, ?)");
           
            ps.setString(1, novoUsuario.getIDUsuario()); 
            ps.setString(2, novoUsuario.getEmail());
            ps.setString(3, novoUsuario.getSenha());
            ps.setString(4, novoUsuario.getTelefone());
            ps.setString(5, novoUsuario.getNome());
            ps.setString(6, novoUsuario.getCPF());
            
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nUsuário inserida com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from usuario;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                String IDUsuarioIdentificacao = rst.getString("IDUsuario");
                String emailIdentificacao = rst.getString("email");
                String senhaIdentificacao = rst.getString("senha");
                String telefoneIdentificacao = rst.getString("telefone");
                String nomeIdentificacao = rst.getString("nome");
                String CPFIdentificacao = rst.getString("CPF");
                
                System.out.println("Dados do banco: "+IDUsuarioIdentificacao+" "+emailIdentificacao+" "+senhaIdentificacao+" "+telefoneIdentificacao+" "+nomeIdentificacao+" "+CPFIdentificacao);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de usuário: "+ex);
        }
    }
}
