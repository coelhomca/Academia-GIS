public class Veiculo {
    private Cliente cliente;
    private String placa;
    private String tipo;
    public Veiculo(Cliente cliente, String placa, String tipo) {
        this.cliente = cliente;
        this.placa = placa;
        this.tipo = tipo;
    }
    public String getPlaca() {
        return placa;
    }
    public String getTipo() {
        return tipo;
    }
    public String toString() {
        return cliente+" Veículo: Placa=" + placa +
                " Tipo=" + tipo+"| ";
    }
}
