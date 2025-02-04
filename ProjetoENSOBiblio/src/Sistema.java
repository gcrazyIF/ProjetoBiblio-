import java.util.*;

public class Sistema {
    Scanner lerMain = new Scanner(System.in);
    private String IDLivroAd, emailVerifica, senhaVerifica;
    private float estrelasAva;
    private int opcaoLoginPro;
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    Usuario admin = new Usuario("0", "admin@gmail.com", "admin123", "(82)94002-8922", "ge", "980.567.323-12");

    public Sistema() {

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
        
        Exemplar exeVBSA1 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA1", false, true);
        Exemplar exeVBSA2 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA2", true, false);
        Exemplar exeVBSA3 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA3", false, false);
        Exemplar exeULTPARAD1 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "ULTPARAD1", true, true);
        Exemplar exeULTPARAD2 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "ULTPARAD2", false, false);
        Exemplar exeULTPARAD3 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "ULTPARAD3", false, false);
        Exemplar exeHRSTP1 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "HRSTP1", false, false);
        Exemplar exeHRSTP2 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 5, 2019, "HRSTP2", true, true);
        Exemplar exeHRSTP3 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 5, 2019, "HRSTP3", false, false);

        livros.get(0).exemplares.add(exeVBSA1);
        livros.get(0).exemplares.add(exeVBSA2);
        livros.get(0).exemplares.add(exeVBSA3);
        livros.get(1).exemplares.add(exeULTPARAD1);
        livros.get(1).exemplares.add(exeULTPARAD2);
        livros.get(1).exemplares.add(exeULTPARAD3);
        livros.get(2).exemplares.add(exeHRSTP1);
        livros.get(2).exemplares.add(exeHRSTP2);
        livros.get(2).exemplares.add(exeHRSTP3);
    }

    public void cadastrarLivro() {
        int escolhaContinuar;

        String IDLivro;
        String titulo;
        String autor;
        String genero;
        String sinopse;
        int numExemplares;
        int anoPubli;
        Scanner lerLivro = new Scanner(System.in);
        do {
            System.out.println("Insira o ID do livro: ");
            IDLivro = lerLivro.next();

            System.out.println("Insira o título do livro: ");
            titulo = lerLivro.nextLine();
            titulo = lerLivro.nextLine();

            System.out.println("Insira o autor do livro: ");
            autor = lerLivro.nextLine();

            System.out.println("Insira o gênero do livro: ");
            genero = lerLivro.nextLine();

            System.out.println("Insira a sinopse do livro: ");
            sinopse = lerLivro.nextLine();

            System.out.println("Quantos exemplares deste livro a biblioteca possui?");
            numExemplares = lerLivro.nextInt();

            System.out.println("Insira o ano de publicação do livro: ");
            anoPubli = lerLivro.nextInt();
            Livro livroNovo = new Livro(
                    IDLivro, titulo, autor, genero, sinopse, numExemplares, anoPubli);
            livros.add(livroNovo);
            System.out.println("Deseja adicionar mais um livro?\n[1] SIM\n[2] NÃO");
            escolhaContinuar = lerMain.nextInt();
        } while (escolhaContinuar == 1);
    }


    public void cadastrarUsuario() {
        Usuario novoUsuario = new Usuario();
        usuarios.add(novoUsuario);
    }

    public void cadastrarAdmin(){
        usuarios.add(admin);
    }

    public void efetuarLogin() {
        String livroPesquisaTitulo, livroPesquisaAutor, livroPesquisaGenero, livroEmprestimo, livroReserva;
        int opcaoAcaoLogin;

        System.out.println("Insira seu e-mail: ");
        emailVerifica = lerMain.next();

        System.out.println("Insira sua senha: ");
        senhaVerifica = lerMain.next();

        for (int i = 0; i < usuarios.size(); i++) {
            if (emailVerifica.equalsIgnoreCase(usuarios.get(i).getEmail()) && senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())) {
                System.out.println("Login efetuado com sucesso!");
                System.out.println("Escolha uma ação para realizar\n[1] REALIZAR EMPRÉSTIMO\n[2] RENOVAR "
                        + "EMPRÉSTIMO\n[3] RESERVAR EXEMPLARES\n[4] AVALIAR LIVROS\n[5] PESQUISAR LIVRO POR "
                        + "TÍTULO\n[6] PESQUISAR LIVRO POR AUTOR\n[7] PESQUISAR LIVRO POR GÊNERO\n"
                        + "[8] CATALOGAR NOVO LIVRO\n[9] CADASTRAR NOVO EXEMPLAR DE UM LIVRO");
                opcaoAcaoLogin = lerMain.nextInt();
                switch (opcaoAcaoLogin) {
                    case 1:
                        System.out.println("Insira a sua senha para realizar o empréstimo: ");
                        senhaVerifica = lerMain.next();
                        if (senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())) {
                            System.out.println("Insira o ID do livro que deseja realizar o empréstimo: ");
                            livroEmprestimo = lerMain.next();
                            for (int j = 0; j < livros.size(); j++) {
                                emprestimo(senhaVerifica, livroEmprestimo);
                            }
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("Insira a sua senha para realizar a reserva: ");
                        senhaVerifica = lerMain.next();
                        if (senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())) {
                            System.out.println("Insira o ID do livro que deseja realizar a reserva: ");
                            livroReserva = lerMain.next();
                            for (int j = 0; j < livros.size(); j++) {
                                reserva(senhaVerifica, livroReserva);
                            }
                        }
                        break;
                    case 4:
                        avaUsuario();
                        break;
                    case 5:
                        System.out.println("Insira o título do livro que deseja pesquisar: ");
                        livroPesquisaTitulo = lerMain.nextLine();
                        livroPesquisaTitulo = lerMain.nextLine();
                        pesquisarLivroTitulo(livroPesquisaTitulo);
                        break;
                    case 6:
                        System.out.println("Insira o autor do livro que deseja pesquisar: ");
                        livroPesquisaAutor = lerMain.nextLine();
                        livroPesquisaAutor = lerMain.nextLine();
                        pesquisarLivroAutor(livroPesquisaAutor);  
                        break;
                    case 7:
                        System.out.println("Insira o gênero do livro que deseja pesquisar: ");
                        livroPesquisaGenero = lerMain.next();
                        pesquisarLivroGenero(livroPesquisaGenero);
                        break;
                    case 8:
                        for (i = 0; i < usuarios.size(); i++) {
                            if (emailVerifica.equalsIgnoreCase(usuarios.get(0).getEmail()) && senhaVerifica.equalsIgnoreCase(usuarios.get(0).getSenha())) {
                                cadastrarLivro();
                            }
                            else{
                                System.out.println("Você não tem permissão para cadastrar livros na biblioteca.");
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Insira o ID do livro que deseja adicionar um exemplar: ");
                        IDLivroAd = lerMain.next();
                        for(int x = 0; x<livros.size(); x++){
                            if(IDLivroAd.equalsIgnoreCase(livros.get(x).getIDLivro())){
                                Exemplar novoExemplar = new Exemplar();
                                livros.get(x).exemplares.add(novoExemplar);
                                for(int m = 0; m<livros.get(x).exemplares.size(); m++){
                                    System.out.println("Exemplares existentes: "+livros.get(x).exemplares.get(m).getIDExemplar());
                                }
                            }
                            else{
                                System.out.println("Livro não encontrado no acervo");
                            }
                        }
                        break;
                    default:
                        System.out.println("Selecione uma opção válida!");
                        System.exit(0);
                }
            }else{
                System.out.println("Senha ou email incorretos.");
            }
        }
    }

    public void emprestimo(String senhaVerifica, String livroEmprestimo) {
        for (int n = 0; n < livros.size(); n++) {
            if (livroEmprestimo.equalsIgnoreCase(livros.get(n).getIDLivro())) {
                for (int j = 0; j < usuarios.size(); j++) {
                    if (senhaVerifica.equalsIgnoreCase(usuarios.get(j).getSenha())) {
                        for (int y = 0; y < livros.get(n).getExemplares().size(); y++) {
                            if (((Exemplar) livros.get(n).getExemplares().get(y)).getEmprestado() == false) {
                                System.out.println("Empréstimo realizado.");
                                ((Exemplar) livros.get(n).getExemplares().get(y)).setEmprestado(true);
                            } else {
                                System.out.println("Todos os exemplares estão atualmente emprestados!");
                            }
                        }
                    } else {
                        System.out.println("Senha incorreta. Tente novamente.");
                    }
                }
            } else {
                System.out.println("Livro não encontrado no acervo!");
            }
        }
    }

    public void reserva(String senhaVerifica, String livroReserva) {
        for (int i = 0; i < livros.size(); i++) {
            if (livroReserva.equalsIgnoreCase(livros.get(i).getIDLivro())) {
                for (int j = 0; j < usuarios.size(); j++) {
                    if (senhaVerifica.equalsIgnoreCase(usuarios.get(i).getSenha())) {
                        for (int y = 0; y < livros.get(i).getExemplares().size(); y++) {
                            if (!((Exemplar) livros.get(i).getExemplares().get(y)).getReservado()) {
                                System.out.println("Reserva realizada.");
                                ((Exemplar) livros.get(i).getExemplares().get(y)).setReservado(true);
                            } else {
                                System.out.println("Todos os exemplares estão atualmente reservados!");
                            }
                        }
                    } else {
                        System.out.println("Senha incorreta. Tente novamente.");
                    }
                }
            } else {
                System.out.println("Livro não encontrado no acervo!");
            }
        }
    }

    public float avaUsuario() {
        System.out.println("Quantas estrelas você dá para este livro?");
        estrelasAva = lerMain.nextFloat();
        return estrelasAva;
    }

    public void pesquisarLivroTitulo(String livroPesquisaTitulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaTitulo.equalsIgnoreCase(livros.get(i).getTitulo())) {
                System.out.println("Livro presente no acervo!");
                livros.get(i).exibirLivro();
            }
        }
    }

    public void pesquisarLivroAutor(String livroPesquisaAutor) {
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaAutor.equalsIgnoreCase(livros.get(i).getAutor())) {
                System.out.println(livros.get(i).getTitulo());
                System.out.println("\nLivro presente do acervo!\n");
                livros.get(i).exibirLivro();
            }
        }
    }

    public void pesquisarLivroGenero(String livroPesquisaGenero) {
        for (int i = 0; i < livros.size(); i++) {
            if (livroPesquisaGenero.equalsIgnoreCase(livros.get(i).getGenero())) {
                System.out.println(livros.get(i).getTitulo());
                System.out.println("\nLivro presente no acervo!");
                livros.get(i).exibirLivro();
            }
        }
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}