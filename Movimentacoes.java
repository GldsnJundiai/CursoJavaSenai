
import java.util.Date;

public class Movimentacoes {
    public String nome;
    public int numConta;
    public double saldo;
    public double transferir;


    public Movimentacoes(String nome, int numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double valorEntrada) {
        this.saldo = this.saldo + valorEntrada;

    }

    public void saque(double saque) {
        Date hoje = new Date();
        if (this.saldo - saque < 0) {
            System.out.println("_____________________________");
            System.out.println("*** JAVA FOUNDATIONS BANK ***");
            System.out.println("-----------------------------");
            System.out.println("------MENSAGEM DE ERRO-------");
            System.out.println();
            System.out.println("Saldo insuficiente para saque");
            System.out.println("-----------------------------");
            System.out.println(hoje);
            System.out.println("_____________________________");

            MenuLoginDoCx senhaCliente = new MenuLoginDoCx();
            senhaCliente.MenuDeLoginCC();
        }

        if (this.saldo - saque >= 0) {
            this.saldo = this.saldo - saque;

        }
    }
    public double extrato() {
        return this.saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void transferir(double cc4) {
        Date hoje = new Date();
        if (this.saldo - cc4 < 0) {
            System.out.println("_____________________________");
            System.out.println("*** JAVA FOUNDATIONS BANK ***");
            System.out.println("-----------------------------");
            System.out.println("------MENSAGEM DE ERRO-------");
            System.out.println();
            System.out.println("Saldo insuficiente para transferência");
            System.out.println("-----------------------------");
            System.out.println(hoje);
            System.out.println("_____________________________");
            MenuLoginDoCx senhaCliente = new MenuLoginDoCx();
            senhaCliente.MenuDeLoginCC();
        }

        if (this.saldo - cc4 >= 0) {
            this.saldo = this.saldo + cc4 - cc4;
        }
    }
}
