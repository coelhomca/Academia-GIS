public class Vaga {
    private static int SEQUENCIAL=1;
    private int numero;
    public Vaga(){
        this.numero = SEQUENCIAL++;
    }
    public int getNumero(){
        return this.numero;
    }
    public String toString() {
        return "Número da Vaga=" + numero+"|  ";
    }
}
