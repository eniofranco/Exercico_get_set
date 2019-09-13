
public class TestaCasa {
     public static void main (String[] args){
        Casa casa1 = new Casa();
        casa1.setPorta1 (true);
        casa1.setPorta2 (true);
        casa1.setPorta3 (false);
        
        casa1.pinta("Azul");
        
        System.out.println("Portas abertas é " + casa1.quantasPortasAbertas());
        
    }
}
