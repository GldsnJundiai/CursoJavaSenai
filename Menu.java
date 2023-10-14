
import javax.swing.JOptionPane;
import java.lang.String;

public class Menu {
    public static <Banco> void main(String[] args) {

        String menu = null;

        menu = (JOptionPane.showInputDialog(null, "Selecione o tipo de usuário: ", "Selecione",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecione", "Gerente", "Sair"},
                "Selecione")).toString();

        if (menu == "Gerente") {
            Senhas login = new Senhas();
            login.senhaCx();
        }
        if (menu == "Sair") {
            System.exit(0);
        }
    }
}