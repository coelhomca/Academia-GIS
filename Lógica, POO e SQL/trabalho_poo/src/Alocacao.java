public class Alocacao {
    private int horaEntrada;
    private int horaSaida;
    private Vaga vaga;
    private Veiculo veiculo;
    public Alocacao(int horaEntrada, Vaga vaga, Veiculo veiculo){
        this.horaEntrada = horaEntrada;
        this.vaga = vaga;
        this.veiculo = veiculo;
    }
    public int calcularCusto() {
        return Estacionamento.getPrecoHora() * calcularTempoPermanencia();
    }
    public int calcularTempoPermanencia(){
        if (horaEntrada > horaSaida)
            return (24 - horaEntrada + horaSaida);
        return horaSaida - horaEntrada;
    }
    public Vaga getVaga() { return vaga;}
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setHoraSaida(int horaSaida){
        this.horaSaida=horaSaida;
    }

    public String toString() {
        return "Alocacao: " +
                "Hora de entrada=" + horaEntrada +"h "+
                "| Vaga: " + vaga +
                "" + veiculo;
    }

}
