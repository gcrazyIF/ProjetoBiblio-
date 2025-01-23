import java.util.*;
public class Principal {
    public static void main(String Biblioteca[]){
        String livroPesquisaTitulo, livroPesquisaAutor, livroPesquisaGenero, novoLivroID, novoLivroNome;
        int opcaoPrincipal;
        Scanner lerPrincipal = new Scanner(System.in);
        Sistema sistema = new Sistema();
        
        System.out.println("Seja bem-vind@! Escolha uma das opções abaixo:\n[1] PESQUISAR LIVRO POR TÍTULO"
                + "\n[2] PESQUISAR LIVRO POR AUTOR\n[3] PESQUISAR LIVRO POR GÊNERO\n[4] CADASTRAR USUÁRIO");
        opcaoPrincipal = lerPrincipal.nextInt();
        switch(opcaoPrincipal){
            case 1:
                System.out.println("Insira o título do livro que deseja pesquisar: ");
                livroPesquisaTitulo = lerPrincipal.nextLine();
                livroPesquisaTitulo = lerPrincipal.nextLine();
                sistema.pesquisarLivroTitulo(livroPesquisaTitulo);
                
            break;
            case 2:
                System.out.println("Insira o autor do livro que deseja pesquisar: ");
                livroPesquisaAutor = lerPrincipal.nextLine();
                sistema.pesquisarLivroAutor(livroPesquisaAutor);
                
            break;
            case 3:
                System.out.println("Insira o gênero do livro que deseja pesquisar: ");
                livroPesquisaGenero = lerPrincipal.next();
                sistema.pesquisarLivroGenero(livroPesquisaGenero);
                
            break;
            case 4:
                sistema.cadastrarUsuario(sistema.usuarios);
            break;
            default:
                System.out.println("Insira uma opção válida!");
                System.exit(0);
                break;
        }
    }
}
