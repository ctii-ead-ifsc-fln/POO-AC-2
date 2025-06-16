public class Circulo {
    public float raio;

    public void desenhar() {
        System.out.println("Desenhando um círculo");
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
