import java.util.*;
    public class Exemplar extends Livro{
        private String IDExemplar;
        private int emprestEscolha, reservEscolha;
        private boolean emprestado, reservado;
        Scanner lerExemplar = new Scanner(System.in);
       
        public Exemplar(String IDLivro, String titulo, String autor, String genero, String sinopse, int numExemplares, int anoPubli, String IDExemplar, boolean emprestado, boolean reservado) {
            super(IDLivro, titulo, autor, genero, sinopse, numExemplares, anoPubli);
            this.IDExemplar = IDExemplar;
            this.emprestado = emprestado;
            this.reservado = reservado;
        }


        public boolean getEmprestado() {
            return emprestado;
        }


        public boolean getReservado() {
            return reservado;
        }


        public void setEmprestado(boolean emprestado) {
            this.emprestado = emprestado;
        }


        public void setReservado(boolean reservado) {
            this.reservado = reservado;
        }
       
       
}