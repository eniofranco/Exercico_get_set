
public class TestaAluno {
    
    public static void main (String[] args){
        Aluno a1 = new Aluno ();
        a1.setNome ("Meiriane");
        a1.setCpf ("025.147.892-58");
        
        Data data1 = new Data ();
        data1.setDia (14);
        data1.setMes (4);
        data1.setAno (1988);
        
        a1.getDataDeNascimento();
        
        String dados = a1.imprimir();
        System.out.println(dados);
    }
    
}
