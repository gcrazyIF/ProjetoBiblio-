import java.util.*;
import java.time.LocalDate;
public class Emprestimo {
    LocalDate dataVencimento, dataNovaVencimento;
    boolean emprestado, reservado;
    String IDEmprestimo;
    Scanner lerEmprestimo = new Scanner(System.in);

    public Emprestimo(){
        System.out.println("Insira o ID do Empréstimo: ");
        IDEmprestimo = lerEmprestimo.next();
        
        System.out.println("Insira a data de vencimento: ");
        dataVencimento = LocalDate.now().plusDays(7);
        System.out.println(dataVencimento);
        
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