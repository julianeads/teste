package estudosPOO;

public class VeiculoTeste {
    public static void main(String[] args) {
        //instanciando
        Veiculo c1 = new Veiculo(); //Carro = chamar classe;  c1 = novo nome;
        
        //declarando valores
        c1.nome = "Gol"; //Sempre que usar "" quando o tipo de dado for String
        c1.marca = "Vw";
        c1.ano = 2018;
        c1.vel = 60;
        
        //chamando metodos
       c1.acelerar(15);
        System.out.println("Velocidade" + c1.vel + "km/h"); //concatenar
        
        c1.buzinar();
        
        c1.freiar(30);
        System.out.println(c1.vel);
    }
}
