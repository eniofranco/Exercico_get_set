
public class TestaPorta {
    public static void main (String[] args){
        
        Porta pt1 = new Porta();
        pt1.fecha();
        pt1.setCor ("azul");
        pt1.setDimensaoX (0.39);
        pt1.setDimensaoY (1.77);
        pt1.setDimensaoZ (4.66);
        pt1.abre();
        
        System.out.println(pt1.getCor());
        System.out.println( pt1.getDimensaoX() );
        
       
        pt1.estaAberta();
        
    }
    
}
