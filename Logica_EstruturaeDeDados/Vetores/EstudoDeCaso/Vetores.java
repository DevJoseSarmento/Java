import java.io.*;
import java.util.Scanner;
public class Vetores {

    
    
    public static void main(String[] args) {
    
    int[] passarosPorDia = {2,5,0,7,4,1,3,0,2,5,0,1,3,1};
    
    
     int totalPassaros =0;
     int passarosPrimeira =0;
     int passarosSegunda =0;
    
        for (int i=0; i<14; i++){
            totalPassaros = totalPassaros + passarosPorDia [i];
        
            System.out.println("o tatal de Passaros do dia foi " + totalPassaros);
        }
        
        
    }

}


