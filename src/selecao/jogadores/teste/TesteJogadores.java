package selecao.jogadores.teste;
import selecao.jogadores.modelos.Jogadores;
import java.util.Scanner;

//test

public class TesteJogadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nome do Jogador: ");
        String nome1= sc.nextLine();
        System.out.println("Seleo: ");
        String selecao1 = sc.nextLine();
        System.out.println("Numero da camisa: ");
        int numero1= sc.nextInt();

        sc.nextLine();

        System.out.println("nome do Jogador: ");
        String nome2= sc.nextLine();
        System.out.println("Seleo: ");
        String selecao2 = sc.nextLine();
        System.out.println("Numero da camisa: ");
        int numero2= sc.nextInt();

        Jogadores jogador1 = new Jogadores(selecao1,numero1,nome1);
        sc.nextLine();
        Jogadores jogador2 = new Jogadores(selecao2,numero2,nome2);

        jogador1.exibirMensagem();
        sc.nextLine();
        jogador2.exibirMensagem();

    }
}
