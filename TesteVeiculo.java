public class TesteVeiculo {
    public static void main(String[] args) {
        // Cria um carro elétrico
        CarroEletrico carro = new CarroEletrico("Tesla Model 3");

        // Polimorfismo: chamando métodos via interfaces
        Recarregavel recarregavel = carro;
        Autonomo autonomo = carro;

        recarregavel.recarregar(25);
        autonomo.dirigirAutonomo();

        // Exibindo as constantes
        System.out.println("Tempo máximo permitido de recarga: " + Recarregavel.TEMPO_MAXIMO + " minutos");
        System.out.println("Modo autônomo ativo: " + Autonomo.ATIVO);
    }
}

