public class CarroEletrico implements Recarregavel, Autonomo {
    private String modelo;

    // Construtor
    public CarroEletrico(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void recarregar(int tempoMinutos) {
        System.out.println("O modelo " + modelo + " está recarregando por " + tempoMinutos + " minutos.");
        if (tempoMinutos > TEMPO_MAXIMO) {
            System.out.println("⚠️ Tempo máximo de recarga (" + TEMPO_MAXIMO + " minutos) excedido!");
        }
    }

    @Override
    public void dirigirAutonomo() {
        if (ATIVO) {
            System.out.println("O modelo " + modelo + " está dirigindo de forma autônoma!");
        } else {
            System.out.println("O modo autônomo está desativado.");
        }
    }
}
