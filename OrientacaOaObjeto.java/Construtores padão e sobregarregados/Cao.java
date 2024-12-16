

public class Cao {
 String nome;
 String cor;
 int idade; 
 double peso;
 
 public Cao (){
   cor = "Caramelo";
 }
 
 public Cao (String nome, int idade){
   //this, indica a variavel local que esta recebendo um dado.
   this.nome = nome;
   this.idade = idade;
 }
 
  public void Andar(){
    System.out.print("Estou andando " + cor);
  }
  
  public void DadosCao(){
    System.out.println(nome + " " + idade);
    
  }

}