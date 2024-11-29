public class Main {
    public static void main(String[] args) {
        // Interfaz
        Esfera esfera1 = new Esfera(3);

        // user
        System.out.printf("Radio: %.3f\n", esfera1.getRadio());
        System.out.printf("Diametro: %.3f\n", esfera1.getDiametro());
        System.out.printf("Circunferencia: %.3f\n", esfera1.getCircunferencia());
        System.out.printf("Area: %.3f\n", esfera1.getArea());
        System.out.printf("Volumen: %.3f\n", esfera1.getVolumen());

    }
}