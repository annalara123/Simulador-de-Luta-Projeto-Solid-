package Main;

import Model.Espadachin;
import Model.Lutador;
import Model.Monge;
import Model.Ninja;
import Exception.ParametroErradoException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParametroErradoException {
        int idade = 0;
        Monge akali = new Monge("Akali", 18, "F", 179, 65, "Japonesa");
        Ninja zed = new Ninja("Zed", 34, "M", 189, 89, "Japones");
        Espadachin irelia = new Espadachin("Irelia", 18, "F", 160, 75, "Japonesa");



        System.out.println("Bem-Vindo(a) ao Projeto L!\n");

        String menu = "Escolha sua acao: \n" +
                "1-CRIAR UM PERSONAGEM;\n" +
                "2-VER PERSONAGENS EXISTENTES; \n" +
                "OUTRA TECLA - SAIR";

        String menu2 = "Escolha o personagem para testar: " +
                "\n1-" + akali.getNome() +
                "\n2-" + zed.getNome() +
                "\n3-" + irelia.getNome() +
                "\nOUTRA TECLA - SAIR";

        String menu3 = "\n1-ATACAR" +
                "\n2-DEFENDER" +
                "\n3-HABILIDADE 1" +
                "\n4-HABILIDADE 2" +
                "\n5-HABILIDADE 3"+
                "\nOUTRA TECLA - SAIR";

        System.out.println(menu);
        Scanner hid = new Scanner(System.in);
        String opcao = hid.nextLine();

        switch (opcao){
            case "1":
                int a = 0;
                Lutador lutadorPlayer = new Lutador("null", 0, "null", 0, 0, "null");
                while(a <= 6) {
                    System.out.println("Nome: ");
                    lutadorPlayer.setNome(new Scanner(System.in).nextLine());
                    a = a+1;
                    System.out.println("Idade: " + "\n(A idade minima é de 18 anos!)");
                    lutadorPlayer.setIdade(new Scanner(System.in).nextInt());
                    if (lutadorPlayer.getIdade() < 18) {
                        throw new ParametroErradoException("A idade minima e de 18 anos");
                    }
                    a = a+1;
                    System.out.println("Sexo: ");
                    lutadorPlayer.setSexo(new Scanner(System.in).nextLine());
                    a = a+1;
                    System.out.println("Altura: " + "A altura minima é de 160 cm(1.60 m)!");
                    lutadorPlayer.setAltura(new Scanner(System.in).nextInt());
                    if (lutadorPlayer.getAltura() < 160) {
                        throw new ParametroErradoException("A altura minima e de 160 cm!");
                    }
                    a = a+1;
                    System.out.println("Peso: " + "O peso minimo e de 70kg");
                    lutadorPlayer.setPeso(new Scanner(System.in).nextInt());
                    if (lutadorPlayer.getPeso() < 70) {
                        throw new ParametroErradoException("O peso minimo de 70 kg!");
                    }
                    a = a+1;
                    System.out.println("Nacionalidade: ");
                    lutadorPlayer.setNacionalidade(new Scanner(System.in).nextLine());
                    a = a+2;
                    }

                    System.out.println(lutadorPlayer);



                    break;

            case "2":
                System.out.println(akali);
                System.out.println("\n");
                System.out.println(zed);
                System.out.println("\n");
                System.out.println(irelia);

                System.out.println(menu2);
                Scanner hid2 = new Scanner(System.in);
                String escolha = hid.nextLine();

                switch (escolha){
                    case "1":

                        System.out.println("Voce escolheu " + akali.getNome() +"!");
                        System.out.println("Escolha a acao para realizar: " + menu3);
                        Scanner hid3 = new Scanner(System.in);
                        String acao = hid.nextLine();
                        switch (acao){
                            case "1":
                                akali.ataqueNormal();
                                break;
                            case "2":
                                akali.defender();
                                break;
                            case "3":
                                akali.meditar();
                                break;
                            case "4":
                                akali.chuteLunar();
                                break;
                            case "5":
                                akali.socoSolar();
                                break;
                            default:
                                System.out.println("\"Obrigado por jogar!\"");
                                break;
                        }

                        break;

                    case "2":
                        System.out.println("Voce escolheu " +zed.getNome() +"!");
                        System.out.println("Escolha a acao para realizar: " + menu3);
                        hid3 = new Scanner(System.in);
                        acao = hid.nextLine();
                        switch (acao){
                            case "1":
                                zed.ataqueNormal();
                                break;
                            case "2":
                                zed.defender();
                                break;
                            case "3":
                               zed.bombaDeFumassa();
                                break;
                            case "4":
                                zed.shuriken();
                                break;
                            case "5":
                                zed.puxarParaSombra();
                                break;
                            default:
                                System.out.println("\"Obrigado por jogar!\"");
                                break;
                        }
                        break;

                    case "3":
                        System.out.println("Voce escolheu " + irelia.getNome() +"!");
                        System.out.println("Escolha a acao para realizar: " + menu3);
                        hid3 = new Scanner(System.in);
                        acao = hid.nextLine();
                        switch (acao){
                            case "1":
                                irelia.ataqueNormal();
                                break;
                            case "2":
                                irelia.defender();
                                break;
                            case "3":
                                irelia.contraGolpe();
                                break;
                            case "4":
                                irelia.corteTransversal();
                                break;
                            case "5":
                                irelia.chuvaDeLaminas();
                                break;
                            default:
                                System.out.println("\"Obrigado por jogar!\"");
                                break;
                        }
                        break;
                }
            break;

            default:
                System.out.println("Obrigado por jogar!");
                break;
        }




    }
}
