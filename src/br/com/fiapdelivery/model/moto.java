package br.com.fiapdelivery.model;

public class moto extends Veiculo {

    private boolean possuiBau;

    public moto(String placa, double capacidade, boolean possuiBau) {
        super(placa, capacidade);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }
}
