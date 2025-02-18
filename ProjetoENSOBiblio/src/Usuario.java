import java.util.*;
public class Usuario{
    private String IDUsuario, email, senha, telefone, nome, CPF;
    Scanner lerUsuario = new Scanner(System.in);
   
    public Usuario(){
        System.out.println("Informe seu nome: ");
        nome = lerUsuario.next();
       
        System.out.println("Informe seu ID de usuário: ");
        IDUsuario = lerUsuario.next();
       
        System.out.println("Informe seu e-mail: ");
        email = lerUsuario.next();
       
        System.out.println("Informe seu telefone: ");
        telefone = lerUsuario.next();
       
        System.out.println("Informe seu CPF: ");
        CPF = lerUsuario.next();
       
        System.out.println("Insira uma senha: ");
        senha = lerUsuario.next();
    }

    public Usuario(String IDUsuario, String email, String senha, String telefone, String nome, String CPF) {
        this.IDUsuario = IDUsuario;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getIDUsuario() {
        return IDUsuario;
    }
}