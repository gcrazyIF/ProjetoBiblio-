import java.util.*;
public class Livro {
    private String IDLivro, titulo, autor, genero, sinopse;
    private int numExemplares, anoPubli;
    private float avaLivro;
    ArrayList exemplares = new ArrayList<Exemplar>();
    Scanner lerLivro = new Scanner(System.in);


    public Livro(String IDLivro, String titulo, String autor, String genero, String sinopse, int numExemplares, int anoPubli) {
        this.IDLivro = IDLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.numExemplares = numExemplares;
        this.anoPubli = anoPubli;
    }

    public void exibirLivro(){
        System.out.println("ID: "+IDLivro);
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Gênero: "+genero);
        System.out.println("Ano de publicação: "+anoPubli);
        System.out.println("Sinopse: "+sinopse);
    }

    public String getIDLivro() {
        return IDLivro;
    }


    public ArrayList getExemplares() {
        return exemplares;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public int getAnoPubli() {
        return anoPubli;
    }
}