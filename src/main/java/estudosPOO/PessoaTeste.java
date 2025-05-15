package estudosPOO;

public class PessoaTeste {
    public static void main(String[] args) {
   /* Pessoa p1 = new Pessoa("Juliane", 28, 164); //para inserir dados dessa forma precisa ter um construtor vazio
    Pessoa p2 = new Pessoa("Vinicius", 29, 190);
    
        System.out.println("Idade atual: ");
        p1.mostrarInformações();
        p2.mostrarInformações();
        
       
       p1.fazerAniversário();
       p2.fazerAniversário();
       
        System.out.println("Apos o aniversario: ");
        
       p1.mostrarInformações();
       p2.mostrarInformações();*/
   
   Pessoa p1 = new Pessoa();
   Pessoa p2 = new Pessoa();
   
        p1.setNome("Luiza");
        p1.setIdade(6);
        p1.setAltura(128);
       
        p1.mostrarNome();
        p1.mostrarInformações();
        
        p1.fazerAniversário();
        
        p2.setNome("Juliane");
        p2.setIdade(28);
        p2.setAltura(164);
        
        p2.mostrarNome();
        p2.mostrarInformações();
        
        p2.fazerAniversário();
        
        
        
        
    
        
}
}