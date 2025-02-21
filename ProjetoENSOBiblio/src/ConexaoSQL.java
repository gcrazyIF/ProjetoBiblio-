import java.sql.*;
import javax.swing.JOptionPane;
public class ConexaoSQL {
    static Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/bancorestaurante";
    String user = "root";
    String password = "ge81701081BCDD24";
    
    public ConexaoSQL(){
        try{
            connection = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados realizada com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static Connection getConexaoSQL(){
        return connection;
    }
}
