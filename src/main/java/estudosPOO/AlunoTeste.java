
package estudosPOO;

public class AlunoTeste {
    public static void main(String[] args) {
        //instanciando o objeto:
        Aluno aluna1 = new Aluno();
        Aluno aluna2 = new Aluno();
        
        //declarando valores:
        //aluna1.nome = "Juliane"; //neste caso não há nenhum construtor vazio na classe aluno
        aluna1.setNome("Juliane");
        //aluna1.idade = 28;
        aluna1.setIdade(28);
        aluna1.getIdade();
        aluna1.curso = "ADS";
        /*System.out.println(aluna1.getNome());
        System.out.println(aluna1.curso);
        System.out.println(aluna1.idade);*/
        
        //aluna2.nome = "Luíza";
        aluna2.setNome("Luiza");
       // aluna2.idade = 6; metodo anterior ao get/set
       aluna2.setIdade(6);
       aluna2.getIdade();
        aluna2.curso = "Primeiro ano";
       /* System.out.println(aluna2.getNome());
        System.out.println(aluna2.curso);
        System.out.println(aluna2.idade);*/
        
        
        //chamando métodos:
        aluna1.assistirAula();
        aluna1.calcularNota();
        aluna1.fazerProva();
        
}
}