package estudosPOO;

public class Pessoa {
    private String nome;
    private int idade;
    private int altura;

    public Pessoa() {
    }
    
    public Pessoa(String nome, int idade, int altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mostrarNome(){
        System.out.println("Oi, " + nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
        } else {
            System.out.println("Idade invalida.");
        }
    }
        
        public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void mostrarInformações(){
        System.out.println("Nome: " + nome + ";");
        System.out.println("Idade: " + idade + " anos;");
        System.out.println("altura: " + altura + " cm;");
    }
    public void fazerAniversário(){
       idade++;
        System.out.println("Apos o aniversario tera: " + idade + " anos.");
    }
    
    
}
