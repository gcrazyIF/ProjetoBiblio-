import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
        
public class EmprestimoDAO {
    Connection conexao;

    public EmprestimoDAO(){
        conexao = new ConexaoSQL().getConexaoSQL();      
    }
    
    //Remover os dados de uma pessoa no MySQL
    public void removerPessoa(String IDEmprestimo){
        try{
            String sql = "delete from Avaliacao where id = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, IDEmprestimo); 
           
            ps.executeUpdate();    //mandando para o banco
            
                System.out.println("\nEmpréstimo removida com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    //inserir os dados de uma pessoa no mysql
    public void inserirAvaliacao(Emprestimo novoEmprestimo){
        try{
            PreparedStatement ps = conexao.prepareStatement("insert into Emprestimo (IDEmprestimo, dataVencimento, dataNovaVencimento, emprestado, reservado, IDUsuarioEmpr) values ( ?, ?, ?, ?, ?, ?)");
            DateFormat dateFormatYMD = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String dataVencimentoConvert = dateFormatYMD.format(novoEmprestimo.getDataNovaVencimento());
            java.sql.Date date = new java.sql.Date(0000-00-00);
            
            DateFormat dateFormatYMD2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            String dataNovaVencimentoConvert = dateFormatYMD2.format(novoEmprestimo.getDataNovaVencimento());
            java.sql.Date date2 = new java.sql.Date(0000-00-00);
            //java.util.Date dataVencimento =  Date.from(novoEmprestimo.getDataVencimento().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
            ps.setString(1, novoEmprestimo.getIDEmprestimo()); 
            ps.setDate(2, date.valueOf(dataVencimentoConvert));
            ps.setDate(3, date2.valueOf(dataNovaVencimentoConvert));
            ps.setBoolean(4, novoEmprestimo.isEmprestado());
            ps.setBoolean(5, novoEmprestimo.isReservado());
            ps.setString(6, novoEmprestimo.getIDUsuarioEmpr());
            
            ps.executeUpdate();    //mandando para o banco
            
            System.out.println("\nEmpréstimo inserido com sucesso");
                           
        }catch(Exception e){
          System.out.println("Erro: "+e);

        }
    }
    
    public void consultarTudo(){
        String sql="select * from emprestimo;";
        try {
            PreparedStatement sttmt=conexao.prepareStatement(sql);
            ResultSet rst=sttmt.executeQuery();
            while(rst.next()){
                
                String IDEmprestimoIdentificacao = rst.getString("IDEmprestimo");
                Date dataVencimentoIdentificacao = rst.getDate("dataVencimento");
                Date dataNovaVencimentoIdentificacao = rst.getDate("dataNovaVencimento");
                boolean emprestadoIdentificacao = rst.getBoolean("emprestado");
                boolean reservadoIdentificacao = rst.getBoolean("reservado");
                String IDUsuarioEmprIdentificacao = rst.getString("IDUsuarioEmpr");
                
                System.out.println("Dados do banco: "+IDEmprestimoIdentificacao+" "+dataVencimentoIdentificacao+" "+dataNovaVencimentoIdentificacao+" "+emprestadoIdentificacao+" "+reservadoIdentificacao+" "+IDUsuarioEmprIdentificacao);
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de pessoa: "+ex);
        }
    }
}
