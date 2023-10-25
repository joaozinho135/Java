package pkModelo;

public class Flor {
    private String nome;

    public Flor() {
    }

    public Flor(String nome, String especie, Double valor) {
        this.nome = nome;
        this.especie = especie;
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public Double getValor() {
        return valor;
    }
    private String especie;
    private Double valor;
}
