import java.util.*;
public class Sistema {
    Scanner lerMain = new Scanner(System.in);
    String emailVerifica, senhaVerifica;
    private float estrelasAva;
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
    
    public void inicializar(){
        Livro livroVBSA = new Livro("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações "
                + "internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019);
        livros.add(livroVBSA);
        Livro livroUltimaParada = new Livro("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem "
                + "adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021);
        livros.add(livroUltimaParada);
        Livro livroHeartStopper = new Livro("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem "
                + "as nuâncias da sexualidade, do amor e do afeto.", 5, 2019);
        livros.add(livroHeartStopper);
 
        int opcaoMenu;
        Scanner lerSistema = new Scanner(System.in);
        
        System.out.println("Seja bem-vindo!");
        System.out.println("Escolha uma ação\n[1] CATALOGAR NOVO LIVRO\n[2] CADASTRAR USUÁRIO\n[3] EFETUAR LOGIN");
        opcaoMenu = lerSistema.nextInt();
        switch(opcaoMenu){
            case 1:
                cadastrarLivro();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                efetuarLogin();
                break;
            default:
                System.out.println("Escolha uma opção válida!");
                System.exit(0);
                break;
        }
    }
    
    public void cadastrarLivro(){
        int escolhaContinuar;
        do{
            Livro livroNovo = new Livro();
            livros.add(livroNovo);
            System.out.println("Deseja adicionar mais um livro?\n[1] SIM\n[2] NÃO");
            escolhaContinuar = lerMain.nextInt();
        }
        while(escolhaContinuar==1);
    }
    
    public void cadastrarUsuario(){
        Usuario novoUsuario = new Usuario();
        usuarios.add(novoUsuario);
    }
    
    public void efetuarLogin(){
        String livroEmprestimo, livroReserva;
        int opcaoAcaoLogin;
        
        System.out.println("Insira seu e-mail: ");
        emailVerifica = lerMain.next();
        
        System.out.println("Insira sua senha: ");
        senhaVerifica = lerMain.next();
        
        for(int i=0; i<usuarios.size(); i++){
            if(emailVerifica.equalsIgnoreCase(usuarios.get(i).getEmail()) && senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())){
                System.out.println("Login efetuado com sucesso!");
                System.out.println("Escolha uma ação para realizar\n[1] REALIZAR EMPRÉSTIMO\n[2] RENOVAR "
                        + "EMPRÉSTIMO\n[3] RESERVAR EXEMPLARES\n[4] AVALIAR LIVROS\n[5] PESQUISAR LIVROS");
                opcaoAcaoLogin = lerMain.nextInt();
                switch(opcaoAcaoLogin){
                    case 1:
                        System.out.println("Insira a sua senha para realizar o empréstimo: ");
                        senhaVerifica = lerMain.next();
                        if(senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())){
                            System.out.println("Insira o ID do livro que deseja realizar o empréstimo: ");
                            livroEmprestimo = lerMain.next();
                            for(int j=0; j<livros.size(); j++){
                                emprestimo(senhaVerifica, livroEmprestimo);
                            }
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("Insira a sua senha para realizar a reserva: ");
                        senhaVerifica = lerMain.next();
                        if(senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())){
                            System.out.println("Insira o ID do livro que deseja realizar a reserva: ");
                            livroReserva = lerMain.next();
                            for(int j=0; j<livros.size(); j++){
                                reserva(senhaVerifica, livroReserva);
                            }
                        }
                        break;
                    case 4:
                        avaUsuario();
                }
            }
            else{
                System.out.println("Senha ou email incorretos.");
            }
        }
    }
    
    public void emprestimo(String senhaVerifica, String livroEmprestimo){
        for(int i=0; i<livros.size(); i++){
            if(livroEmprestimo.equalsIgnoreCase(livros.get(i).getIDLivro())){
                for(int j=0; j<usuarios.size(); j++){
                    if(senhaVerifica.equalsIgnoreCase(usuarios.get(j).getSenha())){
                        for(int y=0; y<livros.get(i).getExemplares().size(); y++){
                            if(livros.get(i).getExemplares().get(y).getEmprestado() == false){
                                System.out.println("Empréstimo realizado.");
                                livros.get(i).getExemplares().get(y).setEmprestado(true);
                            }
                            else{
                                System.out.println("Todos os exemplares estão atualmente emprestados!");
                            }
                        }
                    }
                    else{
                    System.out.println("Senha incorreta. Tente novamente.");
                    }
                }
            }
            else{
                System.out.println("Livro não encontrado no acervo!");
            }
        }
    }
    
    public void reserva(String senhaVerifica, String livroReserva){
        for(int i=0; i<livros.size(); i++){
            if(livroReserva.equalsIgnoreCase(livros.get(i).getIDLivro())){
                for(int j=0; j<usuarios.size(); j++){
                    if(senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())){
                        for(int y=0; y<livros.get(i).getExemplares().size(); y++){
                            if(livros.get(i).getExemplares().get(y).getReservado() == false){
                                System.out.println("Reserva realizada.");
                                livros.get(i).getExemplares().get(y).setReservado(true);
                            }
                            else{
                                System.out.println("Todos os exemplares estão atualmente reservados!");
                            }
                        }
                    }
                    else{
                    System.out.println("Senha incorreta. Tente novamente.");
                    }
                }
            }
            else{
                System.out.println("Livro não encontrado no acervo!");
            }
        }
    }
    
    public float avaUsuario(){
        System.out.println("Quantas estrelas você dá para este livro?");
        estrelasAva = lerMain.nextFloat();
        return estrelasAva;
    }
    
    public void pesquisarLivroTitulo(String livroPesquisaTitulo){
        for(int i = 0; i<livros.size(); i++){
            if(livroPesquisaTitulo.equalsIgnoreCase(livros.get(i).getTitulo())){
                System.out.println("Livro presente no acervo!");
            }
        }
    }
    
    public void pesquisarLivroAutor(String livroPesquisaAutor){
        for(int i = 0; i<livros.size(); i++){
            if(livroPesquisaAutor.equalsIgnoreCase(livros.get(i).getAutor())){
                System.out.println(livros.get(i).getTitulo());
            }
        }
    }
    
    public void pesquisarLivroGenero(String livroPesquisaGenero){
        for(int i = 0; i<livros.size(); i++){
            if(livroPesquisaGenero.equalsIgnoreCase(livros.get(i).getGenero())){
                System.out.println(livros.get(i).getTitulo());
            }
        }
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}