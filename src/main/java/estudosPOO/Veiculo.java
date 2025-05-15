package estudosPOO;

public class Veiculo {
    String nome;
    String marca;
    int ano;
    int vel;
    
    public void acelerar(int aceleracao){  //dentro dos parentes usamos as variaveis que irão fazer parte
        vel+= aceleracao;
    }
    
    public void freiar(int reduzir){
        vel-= reduzir;
    }
    
    public void buzinar(){
        System.out.println("bibibi");
    }
}
