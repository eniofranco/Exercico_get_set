
public class TestaProduto {
    public static void main (String[] args){
        
        Produto elemento1 = new Produto();
        elemento1.setNome ("Arroz");
        elemento1.setPreco (13.50);
        
        System.out.println("O Produto a ser verificado é: "+elemento1.getNome());
        double valorCalculado = elemento1.diminuir10(elemento1.getPreco());
        System.out.println("Valor com desconto: " +valorCalculado);
        
        double valorCalculado1 = elemento1.aumenta25(elemento1.getPreco());
        System.out.println("Valor com acréscimo:  "+valorCalculado1);
    }
    
    
}
