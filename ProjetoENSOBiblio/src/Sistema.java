import java.util.*;
public class Sistema {
    Scanner lerMain = new Scanner(System.in);
    String emailVerifica, senhaVerifica;
    private float estrelasAva;
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
    
    public void inicializar(){
        Livro livroVBSA = new Livro("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Relações "
                + "internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019);
        livros.add(livroVBSA);
        Livro livroUltimaParada = new Livro("ULTPARAD", "Última Parada", "Casey MCQuinston", "Jovem "
                + "adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021);
        livros.add(livroUltimaParada);
        Livro livroHeartStopper = new Livro("HRSTP", "Heartstopper", "Alice Oseman", "Dois garotos apaixonados descobrem "
                + "as nuâncias da sexualidade, do amor e do afeto.", 5, 2019);
        livros.add(livroHeartStopper);
        
        String novoLivroID, novoLivroNome;
        int opcaoMenu;
        Scanner lerSistema = new Scanner(System.in);
        
        System.out.println("Seja bem-vindo!");
        System.out.println("Escolha uma ação\n[1] CATALOGAR NOVO LIVRO\n[2] CADASTRAR USUÁRIO\n[3] EFETUAR LOGIN");
        opcaoMenu = lerSistema.nextInt();
        switch(opcaoMenu){
            case 1:
                cadastrarLivro(livros);
                break;
            case 2:
                cadastrarUsuario(usuarios);
                break;
            case 3:
                efetuarLogin(usuarios, livros);
                break;
            default:
                System.out.println("Escolha uma opção válida!");
                System.exit(0);
                break;
        }
        
        
    }
    
    public void cadastrarLivro(ArrayList livros){
        int escolhaContinuar;
        do{
            Livro livroNovo = new Livro();
            livros.add(livroNovo);
            System.out.println("Deseja adicionar mais um livro?\n[1] SIM\n[2] NÃO");
            escolhaContinuar = lerMain.nextInt();
        }
        while(escolhaContinuar==1);
    }
    
    public void cadastrarUsuario(ArrayList usuarios){
        Usuario novoUsuario = new Usuario();
        usuarios.add(novoUsuario);
    }
    
    public void efetuarLogin(ArrayList usuarios, ArrayList livros){
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
                                emprestimo(senhaVerifica, livroEmprestimo, livros, usuarios, livros.get(j).getExemplares());
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
                                reserva(senhaVerifica, livroReserva, livros, usuarios, livros.get(j).getExemplares());
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
    
    public void emprestimo(String senhaVerifica, String livroEmprestimo, ArrayList livros, ArrayList usuarios, ArrayList exemplares){
        for(int i=0; i<livros.size(); i++){
            if(livroEmprestimo.equalsIgnoreCase(livros.get(i).getIDLivro())){
                for(int j=0; j<usuarios.size(); j++){
                    if(senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())){
                        for(int y=0; y<exemplares.size(); y++){
                            if(exemplares.get(y).getEmprestado() == false){
                                System.out.println("Empréstimo realizado.");
                                exemplares.get(y).setEmprestado(true);
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
    
    public void reserva(String senhaVerifica, String livroReserva, ArrayList livros, ArrayList usuarios, ArrayList exemplares){
        for(int i=0; i<livros.size(); i++){
            if(livroReserva.equalsIgnoreCase(livros.get(i).getIDLivro())){
                for(int j=0; j<usuarios.size(); j++){
                    if(senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())){
                        for(int y=0; y<exemplares.size(); y++){
                            if(exemplares.get(y).getReservado() == false){
                                System.out.println("Reserva realizada.");
                                exemplares.get(y).setReservado(true);
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
    
}