package selecao.jogadores.teste;
import selecao.jogadores.modelos.Jogadores;
import java.util.Scanner;

//test

public class TesteJogadores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("nome do Jogador: ");
        String nome1= leitura.nextLine();
        System.out.println("Seleção: ");
        String selecao1 = leitura.nextLine();
        System.out.println("Posição do jogador: ");
        String posicao1 = leitura.nextLine();
        System.out.println("Numero da camisa: ");
        int numero1= leitura.nextInt();

        leitura.nextLine();

        System.out.println("nome do Jogador: ");
        String nome2= leitura.nextLine();
        System.out.println("Seleção: ");
        String selecao2 = leitura.nextLine();
        System.out.println("Posição do jogador: ");
        String posicao2 = leitura.nextLine();
        System.out.println("Numero da camisa: ");
        int numero2= leitura.nextInt();

        Jogadores jogador1 = new Jogadores(selecao1,numero1,nome1, posicao1);
        leitura.nextLine();
        Jogadores jogador2 = new Jogadores(selecao2,numero2,nome2,posicao2);

        jogador1.exibirMensagem();
        jogador2.exibirMensagem();
        leitura.nextLine();
    }
}
