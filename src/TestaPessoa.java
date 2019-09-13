
public class TestaPessoa {
    public static void main (String [] args)
    {
        Pessoa p1 = new Pessoa ();
        p1.setNome ("Josiane");
        p1.setIdade (20);
        
        
        System.out.println("Idade antiga  " + p1.getIdade());
        
        
        p1.fazAniversario();
        System.out.println("Parabéns Você fez  " + p1.getIdade());
       
        
    }
    
}
