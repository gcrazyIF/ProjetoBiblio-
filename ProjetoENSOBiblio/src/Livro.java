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
        
        Exemplar exeVBSA1 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA1", false, true);
        Exemplar exeVBSA2 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA2", true, false);
        Exemplar exeVBSA3 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA3", false, false);
        Exemplar exeVBSA4 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA4", false, false);
        Exemplar exeVBSA5 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA5", false, false);
        Exemplar exeVBSA6 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA6", false, false);
        Exemplar exeVBSA7 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA7", false, false);
        Exemplar exeVBSA8 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA8", false, false);
        Exemplar exeVBSA9 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA9", false, false);
        Exemplar exeVBSA10 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "VBSA10", true, true);
        Exemplar exeULTPARAD1 = new Exemplar("VBSAUK", "Vermelho, Branco e Sangue Azul", "Casey MCQuinston", "Romance", "Relações internacionais entre o príncipe da Inglaterra e o filho da presidenta dos Estados Unidos.", 10, 2019, "ULTPARAD1", true, true);
        Exemplar exeULTPARAD2 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "ULTPARAD2", false, false);
        Exemplar exeULTPARAD3 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "ULTPARAD3", false, false);
        Exemplar exeULTPARAD4 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "ULTPARAD4", false, false);
        Exemplar exeULTPARAD5 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "ULTPARAD5", true, false);
        Exemplar exeHRSTP1 = new Exemplar("ULTPARAD", "Última Parada", "Romance", "Casey MCQuinston", "Jovem adulta tem crise existencial em um metrô e encontra o amor da sua vida: uma garota badass.", 5, 2021, "HRSTP1", false, false);
        Exemplar exeHRSTP2 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 5, 2019, "HRSTP2", true, true);
        Exemplar exeHRSTP3 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 5, 2019, "HRSTP3", false, false);
        Exemplar exeHRSTP4 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 5, 2019, "HRSTP4", false, false);
        Exemplar exeHRSTP5 = new Exemplar("HRSTP", "Heartstopper", "Romance", "Alice Oseman", "Dois garotos apaixonados descobrem as nuâncias da sexualidade, do amor e do afeto.", 5, 2019, "HRSTP5", false, false);
       
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