import javax.swing.*;
import java.lang.String;

public class Senhas {
    public void senhaCx() {
        int i = 0;
        int acerto = 0;
        int erro = 0;

        String userCx1 = JOptionPane.showInputDialog(null, "Insira a senha do GERENTE para efetuar movimentações (cx)");

        if (userCx1.equals("cx")) {
            MenuLoginDoCx senhaCaixa = new MenuLoginDoCx();
            senhaCaixa.MenuDeLoginCC();

        }
        else {
            erro++;
        }
    }

    public void senhaConta1() {
        int i = 0;
        int acerto = 0;
        int erro = 0;

        while (erro < 2) {
            String userConta1 = JOptionPane.showInputDialog(null, "Insira a senha do usuário Gustavo (c1)");

            if (userConta1.equals("conta1")) {
                MenuLoginDoCx senhaCliente = new MenuLoginDoCx();
                senhaCliente.MenuDeLoginCC();

            }
            else {
                erro++;
            }
        }
    }

    public void senhaConta2() {
        int i = 0;
        int acerto = 0;
        int erro = 0;

        while (erro < 2) {
            String userConta1 = JOptionPane.showInputDialog(null, "Insira a senha do usuário Heloísa (c2)");

            if (userConta1.equals("conta2")) {
                System.out.println("ok");

            }
            else {
                erro++;
            }
        }
    }
}

