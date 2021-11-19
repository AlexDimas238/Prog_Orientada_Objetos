package conta;

import java.util.HashSet;
import java.util.Set;

public class banco {
    public static void main(String args[]) {
       Conta p1 = new Conta();
       p1.setNumConta(2211);
       p1.setDono("Jubileu da Silva");
       p1.abrirConta("CP");
       
       Conta p2 = new Conta();
       p2.setNumConta(3344);
       p2.setDono("Cleusa de Jesus");
       p2.abrirConta("CC");
       
       p1.depositar(100);
       p2.depositar(500);
       
       p2.sacar(230);
      
       p1.fecharConta();
               
       p1.estadoAtual();
       p2.estadoAtual();
    }
}
