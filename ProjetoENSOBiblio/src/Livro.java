import java.util.*;
public class Livro {
    private String IDLivro, titulo, autor, sinopse;
    private int numExemplares, anoPubli;
    private float avaLivro;
    private ArrayList exemplares = new ArrayList<Exemplar>();
    Scanner lerLivro = new Scanner(System.in);
    
    public Livro(){
        System.out.println("Insira o ID do livro: ");
        IDLivro = lerLivro.next();
        
        System.out.println("Insira o título do livro: ");
        titulo = lerLivro.nextLine();
        
        System.out.println("Insira o autor do livro: ");
        autor = lerLivro.nextLine();
        
        System.out.println("Insira o ID do livro: ");
        sinopse = lerLivro.nextLine();
        
        System.out.println("Insira o ano de publicação do livro: ");
        anoPubli = lerLivro.nextInt();
    }

    public Livro(String IDLivro, String titulo, String autor, String sinopse, int numExemplares, int anoPubli) {
        this.IDLivro = IDLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.numExemplares = numExemplares;
        this.anoPubli = anoPubli;
        Exemplar exeVBSA1 = new Exemplar("VBSA1", false, true);
        Exemplar exeVBSA2 = new Exemplar("VBSA2", true, false);
        Exemplar exeVBSA3 = new Exemplar("VBSA3", false, false);
        Exemplar exeVBSA4 = new Exemplar("VBSA4", false, false);
        Exemplar exeVBSA5 = new Exemplar("VBSA5", false, false);
        Exemplar exeVBSA6 = new Exemplar("VBSA6", false, false);
        Exemplar exeVBSA7 = new Exemplar("VBSA7", false, false);
        Exemplar exeVBSA8 = new Exemplar("VBSA8", false, false);
        Exemplar exeVBSA9 = new Exemplar("VBSA9", false, false);
        Exemplar exeVBSA10 = new Exemplar("VBSA10", true, true);
        Exemplar exeULTPARAD1 = new Exemplar("ULTPARAD1", true, true);
        Exemplar exeULTPARAD2 = new Exemplar("ULTPARAD2", false, false);
        Exemplar exeULTPARAD3 = new Exemplar("ULTPARAD3", false, false);
        Exemplar exeULTPARAD4 = new Exemplar("ULTPARAD4", false, false);
        Exemplar exeULTPARAD5 = new Exemplar("ULTPARAD5", true, false);
        Exemplar exeHRSTP1 = new Exemplar("HRSTP1", false, false);
        Exemplar exeHRSTP2 = new Exemplar("HRSTP2", true, true);
        Exemplar exeHRSTP3 = new Exemplar("HRSTP3", false, false);
        Exemplar exeHRSTP4 = new Exemplar("HRSTP4", false, false);
        Exemplar exeHRSTP5 = new Exemplar("HRSTP5", false, false);
    }

    public String getIDLivro() {
        return IDLivro;
    }

    public ArrayList getExemplares() {
        return exemplares;
    }
    
}
