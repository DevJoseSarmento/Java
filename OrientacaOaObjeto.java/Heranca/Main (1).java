import java.util.*;

public class Main {
    public static void main(String[] args) {
     Pessoa p = new Pessoa();
     p.nome = "José";
     p.rg = 876333737;
     //p.comissao = 8.6;
  
      
    Vendedor v = new Vendedor();
    v.nome = "Francisca Graciele";
    v.rg = 1253454545;
    v.comissao = 8.5;
      
      
    
    System.out.println(v.nome + ", comisão: " + v.comissao);  
    System.out.println(p.nome + " Seu numero de RG: " + p.rg);
    }
  
}