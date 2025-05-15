package estudosPOO;

import java.util.ArrayList;

public class Estudantes {
   private String nome;
   private String matricula;
   private double mediaNotas;
   private ArrayList<Double> notas;

    public Estudantes() {
    }

    public Estudantes(String nome, String matricula, double mediaNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.mediaNotas = mediaNotas;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }
   public void mostrarDados(){
       System.out.println("Nome: " + nome + " Matricula: " + matricula + " Media: " + mediaNotas);
   }
   
   public void adicionar(double nota){
       if(notas.size() <= 3){
           notas.add(nota);
       }else {
           System.out.println("3 notas ja foram inseridas!");
       }
   }
   
   public void calularNota(int nota1, int nota2, int nota3){
       mediaNotas = (nota1 + nota2 + nota3)/3.0;
   }
   
     
}
