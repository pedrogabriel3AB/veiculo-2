package sample.model;

public class Carro extends Veiculo{

    private int portas;


    public Carro(String nome, int portas){
        super(nome);
        this.portas = portas;
    }


    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String toString(){
        return super.toString() + "\nPortas: " + portas;
    }
}
