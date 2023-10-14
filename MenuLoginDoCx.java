import javax.swing.*;
import java.util.Date;

public class MenuLoginDoCx {
    private static final double VALUATION_BANK = 4000;
    public void MenuDeLoginCC() {

        Date hoje = new Date();
        String menu = null;
        String menuGr = null;
        String transf = null;


        Movimentacoes conta1 = new Movimentacoes("Gustavo H. Araújo ", 27897, 1000);
        Movimentacoes conta2 = new Movimentacoes("Heloísa F. Siqueira", 29863, 3000);



        while (menu != "Sair") {

            menu = (JOptionPane.showInputDialog(null, "Selecione a Conta Corrente do usuário: ", "Selecione",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecione", "27897 - Gustavo H", "29863 - Heloísa F.", "Saldo Total da Agência", "Sair"},
                    "Selecione")).toString();


            if (menu == "27897 - Gustavo H") {
                menuGr = (JOptionPane.showInputDialog(null, "Selecione o tipo de operação desejada: ", "Selecione",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecione", "Depósito", "Saque", "Transferência", "Extrato CC", "Sair"},
                        "Selecione")).toString();

                validarEntrada testeValidacao = new validarEntrada();

                if (menuGr == "Depósito") {
                    testeValidacao.senhaCx();

                    String ccDep = JOptionPane.showInputDialog("insira o valor para depósito: ");
                    double cc1 = Double.parseDouble(ccDep);
                    //Método para depósito na conta1
                    conta1.depositar(cc1);

                    //Imprimir extrato do usuário
                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("Depósito para: " + conta1.getNome());
                    System.out.println("Número da Conta Corrente: " + conta1.getNumConta());
                    System.out.println("Saldo anterior: " + (conta1.getSaldo() - cc1));
                    System.out.println("valor depositado é: R$ " + cc1);
                    System.out.println("Seu saldo atual é: R$ " + conta1.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");
                    //     System.out.println(conta1.saldo + conta2.saldo);
                }
                else if (menuGr == "Saque") {
                    testeValidacao.senhaConta1();
                    String ccSaque = JOptionPane.showInputDialog("insira o valor para saque: ");
                    double cc2 = Double.parseDouble(ccSaque);
                    //Método para SAQUE na conta1
                    conta1.saque(cc2);

                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("Saque para: " + conta1.getNome());
                    System.out.println("Número da Conta Corrente: " + conta1.getNumConta());
                    System.out.println("Saldo anterior: " + (conta1.getSaldo() + cc2));
                    System.out.println("valor retirado é: R$ " + cc2);
                    System.out.println("Seu saldo atual é: R$ " + conta1.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");

                }
                else if (menuGr == "Transferência") {
                    testeValidacao.senhaConta1();
                    String ccSaque = JOptionPane.showInputDialog("insira o valor para Transferência: ");
                    double cc4 = Double.parseDouble(ccSaque);

                    transf = (JOptionPane.showInputDialog(null, "Selecione uma conta para receber a Transferência: ", "Selecione",
                            JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecione", "29863 - Heloísa F.", "Sair"},
                            "Selecione")).toString();

                    //Método para Transferência na conta2
                    conta1.saque(cc4);
                    conta2.depositar(cc4);

                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("--COMPROV. DE TRANSFERÊNCIA--");
                    System.out.println();
                    System.out.println("Transfência de: " + conta1.getNome());
                    System.out.println("Conta Corrente emissor(a): " + conta1.getNumConta());
                    System.out.println();
                    System.out.println("Transf. para: " + conta2.getNome());
                    System.out.println("Conta Corrente do beneficiado(a): " + conta2.getNumConta());
                    System.out.println();
                    System.out.println("Saldo anterior: " + (conta1.getSaldo() + cc4));
                    System.out.println("valor retirado é: R$ " + cc4);
                    System.out.println("Seu saldo atual é: R$ " + conta1.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");
                }
                else if (menuGr == "Extrato CC") {
                    testeValidacao.senhaConta1();

                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("--SALDO DE CONTA-CORRENTE--");
                    System.out.println();
                    System.out.println("Saldo atual de: " + conta1.getNome());
                    System.out.println("Número da Conta-Corrente: " + conta1.getNumConta());
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("Seu saldo atual é: R$ " + conta1.saldo);
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");

                }
                else if (menuGr == "Sair") {
                    System.exit(0);
                }
            }
            if (menu == "Sair") {
                System.exit(0);
            }




            //Segunda conta


            if (menu == "29863 - Heloísa F.") {
                menuGr = (JOptionPane.showInputDialog(null, "Selecione o tipo de operação desejada: ", "Selecione",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecione", "Depósito", "Saque", "Transferência", "Extrato CC", "Sair"},
                        "Selecione")).toString();

                validarEntrada testeValidacao2 = new validarEntrada();


                if (menuGr == "Depósito") {
                    testeValidacao2.senhaCx();
                    String ccDep = JOptionPane.showInputDialog("insira o valor para depósito: ");
                    double cc3 = Double.parseDouble(ccDep);

                    //Método para depósito na conta2
                    conta2.depositar(cc3);

                    //Imprimir extrato do usuário
                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("---COMPROVANTE DE DEPÓSITO---");
                    System.out.println();
                    System.out.println("Depósito para: " + conta2.getNome());
                    System.out.println("Número da Conta Corrente: " + conta2.getNumConta());
                    System.out.println("Saldo anterior: " + (conta2.getSaldo() - cc3));
                    System.out.println("valor depositado é: R$ " + cc3);
                    System.out.println("Seu saldo atual é: R$ " + conta2.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");
                    //     System.out.println(conta1.saldo + conta2.saldo);


                }
                else if (menuGr == "Saque") {
                    testeValidacao2.senhaConta2();
                    String ccSaque = JOptionPane.showInputDialog("insira o valor para saque: ");
                    double cc5 = Double.parseDouble(ccSaque);

                    //Método para SAQUE na conta2
                    conta2.saque(cc5);

                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("----COMPROVANTE DE SAQUE-----");
                    System.out.println();
                    System.out.println("Saque para: " + conta2.getNome());
                    System.out.println("Número da Conta Corrente: " + conta2.getNumConta());
                    System.out.println("Saldo anterior: " + (conta2.getSaldo() + cc5));
                    System.out.println("valor retirado é: R$ " + cc5);
                    System.out.println("Seu saldo atual é: R$ " + conta2.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");

                }
                else if (menuGr == "Transferência") {
                    testeValidacao2.senhaConta2();
                    String ccSaque = JOptionPane.showInputDialog("insira o valor para Transferência: ");
                    double cc4 = Double.parseDouble(ccSaque);

                    transf = (JOptionPane.showInputDialog(null, "Selecione uma conta para receber a Transferência: ", "Selecione",
                            JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecione", "27897 - Gustavo H", "Sair"},
                            "Selecione")).toString();

                    //Método para Transferência na conta2
                    conta2.saque(cc4);
                    conta1.depositar(cc4);

                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("--COMPROV. DE TRANSFERÊNCIA--");
                    System.out.println();
                    System.out.println("Transfência de: " + conta2.getNome());
                    System.out.println("Conta Corrente emissor(a): " + conta2.getNumConta());
                    System.out.println();
                    System.out.println("Transf. para: " + conta1.getNome());
                    System.out.println("Conta Corrente do beneficiado(a): " + conta1.getNumConta());
                    System.out.println();
                    System.out.println("Saldo anterior: " + (conta2.getSaldo() + cc4));
                    System.out.println("valor retirado é: R$ " + cc4);
                    System.out.println("Seu saldo atual é: R$ " + conta2.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");
                }
                else if (menuGr == "Extrato CC") {
                    testeValidacao2.senhaConta2();

                    System.out.println("_____________________________");
                    System.out.println("*** JAVA FOUNDATIONS BANK ***");
                    System.out.println("-----------------------------");
                    System.out.println("--SALDO DE CONTA-CORRENTE--");
                    System.out.println();
                    System.out.println("Saldo atual de: " + conta2.getNome());
                    System.out.println("Número da Conta-Corrente: " + conta2.getNumConta());
                    System.out.println();
                    System.out.println();
                    System.out.println("Seu saldo atual é: R$ " + conta2.extrato());
                    System.out.println("-----------------------------");
                    System.out.println(hoje);
                    System.out.println("_____________________________");

                }
            }
                if (menu == "Saldo Total da Agência") {
                    validarEntrada testeValidacao = new validarEntrada();
                        testeValidacao.senhaCx();

                        //Visualizar Saldo da Agencia

                        System.out.println("_____________________________");
                        System.out.println("*** JAVA FOUNDATIONS BANK ***");
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println();
                        System.out.println("Seu saldo TOTAL da Agência: R$ " + (VALUATION_BANK));
                        System.out.println();
                        System.out.println();
                        System.out.println("-----------------------------");
                        System.out.println(hoje);
                        System.out.println("_____________________________");
                        //     System.out.println(conta1.saldo + conta2.saldo);
                    }
                else if (menuGr == "Sair") {
                    System.exit(0);
                }
            }
            if (menu == "Sair"){
                System.exit(0);
        }
    }
}






