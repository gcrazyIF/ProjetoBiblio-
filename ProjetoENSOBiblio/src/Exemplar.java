import java.util.*;
    public class Exemplar {
        private String IDUsuarioReserva, IDExemplar;
        private int emprestEscolha, reservEscolha;
        private boolean emprestado, reservado;
        Scanner lerExemplar = new Scanner(System.in);
       
        public Exemplar(){
            System.out.println("Insira o ID do exemplar: ");
            IDExemplar = lerExemplar.next();
            
            emprestado = false;
            reservado = false;
        }
        
        public Exemplar(String IDLivro, String titulo, String autor, String genero, String sinopse, int numExemplares, int anoPubli, String IDExemplar, boolean emprestado, boolean reservado) {
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

        public void setIDUsuarioReserva(String IDUsuarioReserva) {
            this.IDUsuarioReserva = IDUsuarioReserva;
        }

        public String getIDExemplar() {
            return IDExemplar;
        }
}