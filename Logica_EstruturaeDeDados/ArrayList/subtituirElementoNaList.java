import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //lista de bandas..
    
    ArrayList<String> bandas = new ArrayList<String>();
    
    
    //adicioinar bandas
    
    bandas.add("Chamas Pentecostais");
    bandas.add("Voz da Verdade");
    bandas.add("Maria Marçal");


    System.out.println(bandas);
    
    //substituir um valor e sua posição
    
    bandas.add(bandas.indexOf("Chamas Pentecostais" ), "Gerson Rufino");
    
    System.out.println(bandas);
    
    
    
    
    
    
    
    
    
  }
}