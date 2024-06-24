
package exercicio01;

import java.util.Scanner;


public class Exercicio01 {

  
    public static void main(String[] args) {
     
        //declaraçao das variaveis
       
         Scanner lerTeclado= new Scanner(System.in);
        double precoUnitario = 0;
        double qtdeProduto = 0;
        double valorSemDesconto =0;
        double valorComDesconto = 0;
        double taxaDesconto = 0;
        
       
      
        //aquisição de dados do usuario
        
        
        System.out.println("bem vindo a loja do senhor Joao");  
        System.out.println("digite a quantidade de produtos");
        qtdeProduto = lerTeclado.nextDouble();
        
      
        
         System.out.println("usuario digite o valor Unitario");
         precoUnitario =lerTeclado.nextDouble();
      
         
        
        
        
        //processamento das imformaçoes
        
        valorSemDesconto = qtdeProduto * precoUnitario;
        if(valorSemDesconto<=2500){
            System.out.println("nenhum desconto concedido!");
            System.out.println("o valor sem desconto foi:" + valorSemDesconto);
        }
        else if(valorSemDesconto>2500 && valorSemDesconto<=6000){
            taxaDesconto = 0.96;
            valorComDesconto =valorSemDesconto * taxaDesconto;
        System.out.println("o valor sem desconto foi:" + valorSemDesconto);
        System.out.println("o valor com desconto de 4% foi:" + valorComDesconto);
        }
        else if(valorComDesconto>6000 && valorSemDesconto<=10000){
            taxaDesconto = 0.93;
            valorComDesconto =valorSemDesconto * taxaDesconto;
        System.out.println("o valor sem desconto foi:" + valorSemDesconto);
        System.out.println("o valor com desconto de 7% foi:" + valorComDesconto);
        }
        else if(valorSemDesconto>10000){
            taxaDesconto = 0.89;
            valorComDesconto =valorSemDesconto * taxaDesconto;
        System.out.println("o valor sem desconto foi:" + valorSemDesconto);
        System.out.println("o valor com desconto de 11% foi:" + valorComDesconto);
        }
        
    }   
    }
    

