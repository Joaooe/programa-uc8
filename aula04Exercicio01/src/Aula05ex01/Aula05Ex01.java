

    package Aula05ex01;


public class Aula05Ex01 {

 
    public static void main(String[] args) {
       
        Automovel carro1 = new Automovel("Corolla", "Toyota", "Branca", 300.0, 500.0,true);
        //System.out.println(carro1.getModelo());
        
        Automovel carro2 = new Automovel("Model X", "Tesla", "Preto", 295.0, 490.0,false);
        //System.out.println(carro2.getModelo());
        
        Automovel carro3 = new Automovel("Brasilia", "VW", "Amarela", 80.0, 800.0, true);
        //System.out.println(carro3.getCor() + " " + carro3.getMarca());
        //carro3.setCor("Laranja");
        //System.out.println(carro3.getCor());
    }
    
}

