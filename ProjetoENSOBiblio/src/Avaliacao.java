public class Avaliacao {
    private float estrelas, mediaEstrelas;
    private String comentario, IDLivroAva;

    public Avaliacao(float estrelas, String comentario, String IDLivroAva) {
        this.estrelas = estrelas;
        this.comentario = comentario;
        this.IDLivroAva = IDLivroAva;
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
