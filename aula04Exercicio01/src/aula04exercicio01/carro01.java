/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04exercicio01;

/**
 *
 * @author 03564547037
 */
public class carro01 {
    
    
    public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;
    private boolean ligado;
    
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }
    
    public void ligar() {
        if (!ligado) {
            System.out.println("O carro está ligando...");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    
    public void desligar() {
        if (ligado) {
            System.out.println("O carro está desligando...");
            ligado = false;
            velocidadeAtual = 0;
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
    
    public void acelerar(int quantidade) {
        if (ligado) {
            velocidadeAtual += quantidade;
            System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }
    
    public void frear(int quantidade) {
        if (ligado) {
            if (velocidadeAtual >= quantidade) {
                velocidadeAtual -= quantidade;
                System.out.println("Freando. Velocidade atual: " + velocidadeAtual + " km/h");
            } else {
                System.out.println("Não é possível frear mais do que a velocidade atual.");
            }
        } else {
            System.out.println("Não é possível frear, o carro está desligado.");
        }
    }
    
    public void exibirStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.println("O carro está " + (ligado ? "ligado" : "desligado"));
    }
    


 
}

    
    
    
}
