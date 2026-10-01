package br.com.fiapdelivery.model;
public class rota {

    private pacote pacote;
    private Veiculo veiculo;

    public rota(pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void realizarEntrega() {
        System.out.println("Levando pacote " + pacote.getCodigo()
                + " no veiculo " + veiculo.getPlaca());
    }
}