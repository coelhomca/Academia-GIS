import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento est = new Estacionamento();

        /*
        * Preencher tabela veículos
        * Preencher tabela vagas
        * */
        int i=0;
        while(i<10){
            est.registrarVaga(new Vaga());
            i++;
        }
        est.registrarVeiculo(new Veiculo(new Cliente("Flower", "123", "333"), "A33", "carro"));
        est.registrarVeiculo(new Veiculo(new Cliente("Gustavo", "456", "555"), "B55", "moto"));
        est.registrarVeiculo(new Veiculo(new Cliente("Fabricio", "789", "777"), "C66", "carro"));
        est.registrarVeiculo(new Veiculo(new Cliente("Ildefonso", "897", "888"), "D40", "minivan"));

        est.alocar(8, 1, "A33");
        est.alocar(15, 7, "C66");
        /*
        Chamar telas usadas como interface entre as operações e entradas de dados das propriedades
        da classe Estacionamento. Como já foi criado o objeto est do tipo estacionamento para entrada de dados,
        o constrtor de tela é enviando est como parâmetro, mas também tem a opção de criar uma nova insstância de
        classe Estacionamento, basta usar o constrtor Telas() sem parâmetros.
        * */

        Telas telas = new Telas(est);
    }
}