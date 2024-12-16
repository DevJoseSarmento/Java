import java.util.*;

public class Main {
    public static void main(String[] args) {
      //para criar o Object temos que istanciar na Classe principal, nosso objeto Cao.
      //variavel cachorro recebe um novo construtor,atraves de new, um novo objeto do tipo cachorro.
      // atraves do metodo construtor new.
      Cao cachorro = new Cao ();
      //apartir de agora eu tenho uma entidade cahamda cachorro na memoria, chamada cachoro que ele
      //tem atributos.
      cachoro.nome = "Bobby";
      
      //agora um metodo, da nossa Classe principal Cao, o (.) é o que chama nossa propriedade ou mmetodo.
      //estou entradando dentro do objeto, para manipular os valores.
      cachoro.Anda();
    }
}