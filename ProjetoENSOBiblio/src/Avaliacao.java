public class Avaliacao {
    private int IDAvaliacao;
    private float estrelas, mediaEstrelas;
    private String comentario, IDLivroAva;

    public Avaliacao(float estrelas, String comentario, String IDLivroAva, float mediaEstrelas) {
        this.estrelas = estrelas;
        this.comentario = comentario;
        this.IDLivroAva = IDLivroAva;
        this.mediaEstrelas = mediaEstrelas;
    }
    
    public float getMediaEstrelas() {
        return mediaEstrelas;
    }

    public String getComentario() {
        return comentario;
    }

    public String getIDLivroAva() {
        return IDLivroAva;
    }

    public int getIDAvaliacao() {
        return IDAvaliacao;
    }

    public float getEstrelas() {
        return estrelas;
    }

    public void setMediaEstrelas(float mediaEstrelas) {
        this.mediaEstrelas = mediaEstrelas;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setIDLivroAva(String IDLivroAva) {
        this.IDLivroAva = IDLivroAva;
    }
}
