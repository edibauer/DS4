interface Vehiculo {
    void acelerar();
}

public class Coche implements Vehiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando el coche...");
    }
}