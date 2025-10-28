public class Moto {
    private final String modelo;
    private double velocidade;
    private double gasolina;
    private static final int VEL_FINAL = 150;
    private static final double TAMANHO_TANQUE = 30.0;

    public Moto(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.gasolina = 0;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void acelera(int vel) {
        if (vel < 0) throw new RuntimeException("vel deve ser positiva");

        double consumo = vel * 0.01;
        if (gasolina < consumo) {
            vel = (int)(gasolina / 0.01); // ajusta para o máximo possível
            consumo = vel * 0.01;
        }

        if (this.velocidade + vel > VEL_FINAL) {
            vel = VEL_FINAL - (int)this.velocidade;
        }

        this.velocidade += vel;
        this.gasolina -= consumo;
    }

    public void freia(int vel) {
        if (this.velocidade - vel < 0) this.velocidade = 0;
        else this.velocidade -= vel;
    }

    public void abastecer(double litros) {
        if (litros < 0) throw new RuntimeException("Quantidade negativa");
        this.gasolina = Math.min(this.gasolina + litros, TAMANHO_TANQUE);
    }
}
