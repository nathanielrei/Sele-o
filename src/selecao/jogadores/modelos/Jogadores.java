package selecao.jogadores.modelos;

public class Jogadores {

    private String selecao;
    private String posicao;
    private int numero;
    private String nome;

    public Jogadores(String selecao,int numero,String nome){
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void exibirMensagem(){
        System.out.printf("Jogador: %s Camisa: %d selecao: %s nome: ",
                getNome(),getNumero(),getSelecao() );
    }






}
