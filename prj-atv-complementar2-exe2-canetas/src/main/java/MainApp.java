public class MainApp {
    public static void main(String[] args) {
        Caneta canetaAzul = new Caneta("Azul", 0.7F, true);
        Caneta canetaVermelha = new Caneta("Vermelha", 0.5F, true);

        System.out.println("Cor da caneta: " + canetaAzul.getCor());
        System.out.println("Ponta da caneta: " + canetaAzul.getPonta());
        System.out.println("Carga da caneta Azul: "
                + canetaAzul.getCarga());
        canetaAzul.escrever("Olá, mundo!");
        canetaAzul.destampar();
        canetaAzul.escrever("Olá, mundo!");
        canetaAzul.tampar();
        System.out.println("Carga da caneta Azul: "
                + canetaAzul.getCarga());

        System.out.println("Cor da caneta: " + canetaVermelha.getCor());
        System.out.println("Ponta da caneta: " + canetaVermelha.getPonta());
        System.out.println("Carga da caneta Vermelha: "
                + canetaVermelha.getCarga());
        canetaVermelha.pintar();
        canetaVermelha.destampar();
        canetaVermelha.pintar();
        canetaVermelha.tampar();
        System.out.println("Carga da caneta Vermelha: "
                + canetaVermelha.getCarga());
    }
}
