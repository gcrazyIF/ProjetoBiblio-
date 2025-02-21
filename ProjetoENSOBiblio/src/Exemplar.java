import java.util.*;
    public class Exemplar {
        private String IDUsuarioReserva, IDExemplar, IDReserva;
        private boolean emprestado, reservado;
        Scanner lerExemplar = new Scanner(System.in);
       
        public Exemplar(){
            System.out.println("Insira o ID do exemplar: ");
            IDExemplar = lerExemplar.next();
            IDExemplar = lerExemplar.next();
            
            emprestado = false;
            reservado = false;
        }
        // Parâmetro: String IDLivro, String titulo, String autor, String genero, String sinopse, int numExemplares, int anoPubli
        public Exemplar(String IDLivro, String titulo, String autor, String genero, String sinopse, int numExemplares, int anoPubli, String IDExemplar, boolean emprestado, boolean reservado) {
            this.IDExemplar = IDExemplar;
            this.emprestado = emprestado;
            this.reservado = reservado;
        }

        public Exemplar(String IDExemplar, boolean emprestado, boolean reservado) {
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

        public String getIDUsuarioReserva() {
            return IDUsuarioReserva;
        }

        public void setIDReserva(String IDReserva) {
            this.IDReserva = IDReserva;
        }

        public String getIDReserva() {
            return IDReserva;
        } 
}