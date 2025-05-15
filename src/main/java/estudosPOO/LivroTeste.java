package estudosPOO;

public class LivroTeste {
    public static void main(String[] args) {
        Livro livro = new Livro("Antes", "Clarisse", 2023, 50.0);
        
        System.out.println("Preco antigo: ");
        livro.mostrarDetalhes();
        
        System.out.println("Preco atualizado");
        livro.atualizarPreco(45.0);
        
        System.out.println(livro.preco);
    }
  
}
