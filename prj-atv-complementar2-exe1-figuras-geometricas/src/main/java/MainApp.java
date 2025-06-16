public class MainApp {
    public static void main(String[] args) {
        System.out.println("Figuras Geométricas");

        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Quadrado quadrado;
        quadrado = new Quadrado();
        quadrado.lado = 3;

        circulo.raio = 2.0F;
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        triangulo.base = 4;
        triangulo.altura = 6;
        triangulo.desenhar();
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

        quadrado.desenhar();
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
    }
}
