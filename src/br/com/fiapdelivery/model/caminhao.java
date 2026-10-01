package br.com.fiapdelivery.model;

public class caminhao extends Veiculo {

    private int quantidadeEixos;

    public caminhao(String placa, double capacidade, int quantidadeEixos) {
        super(placa, capacidade);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
}
