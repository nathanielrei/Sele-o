package selecao.jogadores.modelos;

public class Jogadores {

    private String selecao;
    private String posicao;
    private int numero;
    private String nome;

    public Jogadores(String nome ,String selecao,int numero, String posicao){
        this.nome = nome;
        this.numero =numero;
        this.posicao = posicao;
        this.selecao = selecao;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getSelecao() {
        return selecao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "(Nome do Jogador: " + this.nome + ") (Camisa do jogador: "
                + numero + ") (Posição do Jogador: " +
                posicao + ") (Seleção em que o Jogador joga: " + selecao +")";
    }
}
