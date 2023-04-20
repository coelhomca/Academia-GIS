import java.util.Scanner;
public class Telas {
    Estacionamento est;
    public Telas(Estacionamento est){
        this.est = est;
        telaMenu();
    }
    public Telas(){
        this.est = new Estacionamento();
        telaMenu();
    }
    public void telaMenu(){
        int op=0;
        Scanner sc = new Scanner(System.in);
        while(op!=7){
            System.out.println("---Menu:---" +
                    "\n1-Registrar veículo" +
                    "\n2-Alocar vaga" +
                    "\n3-Desalocar vaga" +
                    "\n4-Alocações"+
                    "\n5-Ver vagas"+
                    "\n6-Ver veículos"+
                    "\n7-Sair.");
            op=sc.nextInt();

            switch(op){
                case 1: telaRegistrarVeiculo();break;
                case 2: telaAlocar();break;
                case 3: telaDesalocar();break;
                case 4: telaVerAlocacoes();break;
                case 5: telaVagas();break;
                case 6: telaVeiculos();break;
                case 7: telaSair();break;
                default: telaErroOpIndiponivel();break;
            }
        }
    }
    public Cliente telaRegistroCliente(){
        Scanner sc = new Scanner(System.in);
        String nome;
        String cpf, telefone;
        System.out.println("----Cliente:----");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("CPF: ");
        cpf = sc.nextLine();
        System.out.print("Telefone: ");
        telefone = sc.nextLine();
        return new Cliente(nome, cpf, telefone);
    }
    public void telaRegistrarVeiculo(){
        Scanner sc = new Scanner(System.in);
        String placa, tipo;
        System.out.println("----Veículo:----");
        Cliente cliente = telaRegistroCliente();
        System.out.println("Veículo:");
        System.out.print("Placa: ");
        placa = sc.nextLine();
        System.out.print("Tipo: ");
        tipo = sc.nextLine();
        Veiculo veiculo = new Veiculo(cliente, placa, tipo);
        est.registrarVeiculo(veiculo);
    }
    public void telaAlocar(){
        int numeroVaga, hora;
        String placa;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Alocacao:----");
        System.out.print("Informe a placa do veículo: ");
        placa = sc.nextLine();
        System.out.print("Informe o numero da vaga: ");
        numeroVaga = sc.nextInt();
        System.out.print("Informe a hora atual de entrada do veículo: ");
        hora = sc.nextInt();
        est.alocar(hora, numeroVaga, placa);
    }
    public void telaDesalocar(){
        int horaSaida, numeroVaga;
        Scanner sc = new Scanner(System.in);
        System.out.println("----Desalocacao:----");
        System.out.print("Informe o numero da vaga: ");
        numeroVaga = sc.nextInt();
        System.out.print("Informe a hora atual de saida do veículo: ");
        horaSaida = sc.nextInt();
        est.desalocar(horaSaida, numeroVaga);
    }
    public void telaVerAlocacoes(){
        System.out.println(est);
    }
    public void telaVagas(){
        System.out.println(est.verVagasTotais());
    }
    public void telaVeiculos(){
        System.out.println(est.verVeiculosRegistrados());
    }
    public void telaSair(){
        System.out.println("Até a próxima!");
    }
    public void telaErroOpIndiponivel(){
        System.out.println("Opção indisponível!");
    }
}
