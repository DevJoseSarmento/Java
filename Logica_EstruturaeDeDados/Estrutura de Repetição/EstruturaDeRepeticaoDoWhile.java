import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("Digite um valor ou 99 para sair");
            Scanner teclado = new Scanner (System.in);
            opcao = teclado.nextInt();
    
            
        }while (opcao != 99);
        
        
    }

//  "do" significa: "faça" esse laço de repetição, pedindo uma entreda de um numero pelo teclado, e o armazenando na variavel opcao. isso "wihle" "enquanto" a variavel opcao por "!=" "diferente ou igual" a 99.
   
