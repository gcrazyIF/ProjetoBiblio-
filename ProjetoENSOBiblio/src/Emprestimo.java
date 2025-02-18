import java.util.*;
import java.time.LocalDate;
public class Emprestimo {
    private LocalDate dataVencimento, dataNovaVencimento;
    private boolean emprestado, reservado;
    private String IDEmprestimo, IDUsuarioEmpr;
    Scanner lerEmprestimo = new Scanner(System.in);

    public Emprestimo(){
        System.out.println("Insira o ID do Empréstimo: ");
        IDEmprestimo = lerEmprestimo.next();
  
        dataVencimento = LocalDate.now().plusDays(7);
        System.out.println(dataVencimento);
        
        System.out.println("Insira o ID do usuário que está realizando o empréstimo: ");
        IDUsuarioEmpr = lerEmprestimo.next();
        
        emprestado = true;
        reservado = false;
    }

    public Emprestimo(LocalDate dataVencimento, String IDEmprestimo, String IDUsuarioEmpr) {
        this.dataVencimento = dataVencimento;
        this.IDEmprestimo = IDEmprestimo;
        this.IDUsuarioEmpr = IDUsuarioEmpr;
        
        emprestado = true;
        reservado = false;
    }

    public Emprestimo(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setDataNovaVencimento(LocalDate dataNovaVencimento) {
        this.dataNovaVencimento = dataNovaVencimento;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public String getIDEmprestimo() {
        return IDEmprestimo;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public LocalDate getDataNovaVencimento() {
        return dataNovaVencimento;
    }

    public String getIDUsuarioEmpr() {
        return IDUsuarioEmpr;
    }
}