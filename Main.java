//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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

//Enunciado:
//Desafio: Veículos elétricos;
//Numero 1: crie 2 interfasses. A primeira vai ser "Recarregável".
//Dentro tem que ter o método abstrato;
//que recebe como parâmetros int TempoMinutos; imrpima algo como: "recarregando por x minutos"
//dentro dela tem que ter uma constante int Tempo Maximo = 30;

//Numero2: interface "Autonomo" - dentro dela nós temos o método abstrato com o DirigirAutonomo.
//Dentro dele nós temos uma constante boolean igual a true;

//Crie uma classe carro elétrico que implemente ambas as interfaces. Adicione um atributo
//Streaming modelo no construtor nas implementações use o modelo: "o modelo x está recarregando"

//Na classe TesteVeiculo crie um objeto carro elétrico, chame os métodos via referências
//das interfaces (polimorfismo) e use as constantes;