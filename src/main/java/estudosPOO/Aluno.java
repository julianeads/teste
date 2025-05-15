package estudosPOO;


public class Aluno {
    private String nome;  //atributos são as características de um objeto, também chamadas de váriaveis
    String curso;
    private int idade;
    //private pode ser acessado apenas pela propria classe
    
    //métodos são as ações que os objetos podem realizar

    public void setNome(String nome) { //usamos set para acessar 
        this.nome = nome; //this serve para diferenciar atributo nome do seu valor
    }

    public String getNome() { //usamos get apaenas para retornar
        return nome;
    }    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
           this.idade = idade;
    }
    
    public void assistirAula(){
        
    }
    
    public void calcularNota(){
        
    }
    
    public void fazerProva(){
        
        
 
    }
    }