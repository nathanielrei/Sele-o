package selecao.jogadores.teste;

import selecao.jogadores.modelos.Jogadores;

import java.util.ArrayList;
import java.util.*;


//test

public class TesteJogadores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList list = new ArrayList<Jogadores>();

        System.out.println("quantos jogadores vc quer?");
        int numeroTime = leitura.nextInt();
        int jogadores = 1;
        while (jogadores<=numeroTime) {

            System.out.println("nome do Jogador: ");
            String nome = leitura.next();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Seleção: ");
            String selecao = leitura.next();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Posição do jogador: ");
            String posicao = leitura.next();
            System.out.println("--------------------------------------------------------------");
            System.out.println("Numero da camisa: ");
            int numero = leitura.nextInt();

            list.add(new Jogadores(nome,selecao, numero, posicao));
            jogadores++;
        }
        System.out.println(list);
    }
}

