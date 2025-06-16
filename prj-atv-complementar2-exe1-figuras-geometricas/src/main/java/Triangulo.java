public class Triangulo {
    public float base;
    public float altura;
    //método construtor de classe
    public Triangulo() {
        this.base = 0.0F;//double
        this.altura = 0.0F;
    }
    //sobrecarga de método construtor de classe
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public void desenhar() {
        System.out.println("Desenhando um triângulo");
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }
}
