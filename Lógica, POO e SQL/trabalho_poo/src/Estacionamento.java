import java.util.ArrayList;
/*
    Registros e Alocações
 */
public class Estacionamento {
    private static int precoHora=10;
    private ArrayList<Vaga> vagasTotais = new ArrayList<>();
    private ArrayList<Vaga> vagasDisponiveis = new ArrayList<>();
    private ArrayList<Veiculo> veiculosRegistrados = new ArrayList<>();
    private ArrayList<Alocacao> alocs = new ArrayList<>();
    private Excecoes e;
    public void registrarVeiculo(Veiculo veiculo){
        veiculosRegistrados.add(veiculo);
    }
    public void registrarVaga(Vaga vaga){
        vagasTotais.add(vaga);
        vagasDisponiveis.add(vaga);
    }
    public void alocar(int horaEntrada, int numeroVaga, String placa){
        Vaga vaga = buscarVaga(numeroVaga, vagasTotais);
        Veiculo veiculo = buscarVeiculo(placa);

        if(vaga == null){
            e.msgVagaInexistente();
        }else if(veiculo == null){
            e.msgVeiculoNRegistrado();
        }else if(vagasDisponiveis.contains(vaga)){
            Alocacao noAux = new Alocacao(horaEntrada, vaga, veiculo);
            alocs.add(noAux);
            vagasDisponiveis.remove(vaga);
        }else{
            e.msgVagaIndisponivel();
        }
    }
    public void desalocar( int horaSaida, int numeroVaga){
        Alocacao no = buscarAlocacao(numeroVaga);
        if(no == null){
            e.msgNoInexistente();
        }else{
            no.setHoraSaida(horaSaida);
            vagasDisponiveis.add(no.getVaga());
            alocs.remove(no);
            mensagemSaida(no);
        }
    }
    private Alocacao buscarAlocacao(int numeroVaga){
        for (Alocacao aux : alocs) {
            if(aux.getVaga().getNumero() == numeroVaga){
                return aux;
            }
        }
        return null;
    }
    private Vaga buscarVaga(int numeroVaga, ArrayList<Vaga> conjVagas){
        for (Vaga aux : conjVagas) {
            if(aux.getNumero() == numeroVaga){
                return aux;
            }
        }
        return null;
    }

    private Veiculo buscarVeiculo(String placa){
        for (Veiculo aux : veiculosRegistrados) {
            if(aux.getPlaca().equals(placa)){
                return aux;
            }
        }
        return null;
    }
    public static int getPrecoHora() {
        return precoHora;
    }

    public String toString() {
        String texto="--ALOCAÇÕES ATUAIS:--\n";
        for (Alocacao loc : alocs) {
            texto += loc.toString()+"\n";
        }
        return texto;
    }
    private void mensagemSaida(Alocacao no){
        System.out.println("O veículo de "+no.getVeiculo().getPlaca()+" "+no.getVeiculo().getTipo()+
                ", ocupou a vaga "+no.getVaga().getNumero()+" por "+no.calcularCusto()+" reais.");
    }
    public String verVagasTotais() {
        String texto="--VAGAS TOTAIS:--\n";
        for (Vaga aux : vagasTotais) {
            texto += aux;
            if(vagasDisponiveis.contains(aux))
                texto+="Disponível\n";
            else
                texto+="Ocupada\n";
        }
        return texto;
    }
    public String verVeiculosRegistrados(){
        String texto="--VEICULOS:--\n";
        for (Veiculo aux : veiculosRegistrados) {
            texto += aux+"\n";
        }
        return texto;
    }
}
