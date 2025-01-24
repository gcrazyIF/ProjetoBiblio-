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
}