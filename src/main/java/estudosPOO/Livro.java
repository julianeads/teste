
package estudosPOO;

public class Livro {
    String nome;
    String autor;
    int ano; 
    double preco;

    public Livro(String nome, String autor, int ano, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.preco = preco;
    }
    
    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Preco: " + preco);
    }
    
    public void atualizarPreco(double novoPreco){
       preco = novoPreco;
    }
    
    
}
