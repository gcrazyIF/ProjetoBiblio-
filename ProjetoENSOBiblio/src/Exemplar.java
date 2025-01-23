import java.util.*;
public class Exemplar extends Livro{
    private String IDExemplar;
    private int emprestEscolha, reservEscolha;
    private boolean emprestado, reservado;
    Scanner lerExemplar = new Scanner(System.in);
    
    public Exemplar(){
        System.out.println("Insira o ID do exemplar: ");
        IDExemplar = lerExemplar.next();
        
        System.out.println("O exemplar está atualmente emprestado?\n[1] SIM\n[2] NÃO");
        emprestEscolha = lerExemplar.nextInt();
        if(emprestEscolha == 1){
            emprestado = true;
        }
        else if(emprestEscolha == 2){
            emprestado = false;
        }
        else{
            System.out.println("Escolha uma opção válida!");
            System.exit(0);
        }
        
        System.out.println("O exemplar está reservado?\n[1] SIM\n[2] NÃO");
        reservEscolha = lerExemplar.nextInt();
        if(reservEscolha == 1){
            reservado = true;
        }
        else if(reservEscolha == 2){
            reservado = false;
        }
        else{
            System.out.println("Escolha uma opção válida!");
            System.exit(0);
        }
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
    
    
}
