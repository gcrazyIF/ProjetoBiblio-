import java.util.*;
public class Emprestimo {
    String IDEmprestimo, dataVencimento, dataNovaVencimento;
    boolean emprestado, reservado;
    Scanner lerEmprestimo = new Scanner(System.in);

    public Emprestimo(){
        System.out.println("Insira o ID do Empréstimo: ");
        IDEmprestimo = lerEmprestimo.next();
        
        System.out.println("Insira a data de vencimento: ");
        dataVencimento = lerEmprestimo.next();
        
        emprestado = true;
        reservado = false;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }

    public boolean isReservado() {
        return reservado;
    }
    
    
    
}