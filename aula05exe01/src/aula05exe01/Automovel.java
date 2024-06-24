package aula04Exercicio01;

public class Automovel {

    //Definir atributos
    private String modelo;
    private String marca;
    private String cor;
    private Double velocidade;
    private Double carga;
    private boolean estacionamento;

    //Métodos Construtores
    public Automovel() {
    }

    public Automovel(String modelo, String marca, String cor, Double velocidade, Double carga, boolean estacionamento) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
        this.carga = carga;
        this.estacionamento = estacionamento;
    }

    //Métodos Acessores - Getter e Setter
    public boolean getEstacionamento() {
        return this.estacionamento;
    }

    public void setEstacionamento(boolean estacionamento) {
        this.estacionamento = estacionamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    // Criação dos Métodos definidos pela classe
    public double desacelerar() {
        this.velocidade = this.velocidade - 10;
        return this.velocidade;
    }

    public double acelerar() {
        this.velocidade = this.velocidade + 10;
        return this.velocidade;
    }

    public void estacionar() {

        if (this.estacionamento == true) {
            this.estacionamento = false;
        } else {
            this.estacionamento = true;
        }
    }
}