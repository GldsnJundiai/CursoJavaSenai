import javax.swing.*;

public class validarEntrada {

    public void senhaCx() {
        int i = 0;
        int acerto = 0;
        int erro = 0;


        String userCx1 = JOptionPane.showInputDialog(null, "Insira a senha do CAIXA para efetuar movimentações (cx)");

        if (userCx1.equals("cx")) {

        }
        else if (userCx1 != "cx") {
            System.out.println("Operação finalizada");
            System.exit(0);
        }
    }


    public void senhaConta1() {
        int i = 0;
        int acerto = 0;
        int erro = 0;


        String userConta1 = JOptionPane.showInputDialog(null, "Insira a senha do usuário Gustavo (c)", "Digite SAIR para fechar");

        if (userConta1.equals("c")) {

        } else if (userConta1 != "c") {
            System.out.println("Operação finalizada");
            System.exit(0);
            erro++;
        }
    }
    public void senhaConta2 () {
        int i = 0;
        int acerto = 0;
        int erro = 0;


        String userConta2 = JOptionPane.showInputDialog(null, "Insira a senha do usuário Heloísa (cc)", "Digite SAIR para fechar");

        if (userConta2.equals("cc")) {

        } else if (userConta2 != "cc") {
            System.out.println("Operação finalizada");
            System.exit(0);
            erro++;
        }

    }
}

