package sample.model;

public abstract class Veiculo {

    private String nome;
    private Marca marca;

    public Veiculo(String nome){
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(String nome, String descricao) {
        Marca marca = new Marca();
        marca.setDesc(descricao);
        marca.setNome(nome);
        this.marca = marca;
    }

    @Override
    public String toString(){
        return nome
                + " " + (marca != null ? marca : "");
    }
}
