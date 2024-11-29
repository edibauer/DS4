public class Esfera {
    // data
    private double radio;
    
    // constructor
    public Esfera(double radioIncial) {
        // validatoin
        if (radioIncial > 0) {
            this.radio = radioIncial;
        } else {
            this.radio = 0;
        }
    }

    // methods
    public double getRadio() {
        return this.radio;
    }

    public double getDiametro() {
        return (getRadio() * 2);
    }

    public double getCircunferencia() {
        return ( Math.PI * getDiametro());
    }

    public double getArea() {
        return ( 4 * Math.PI * Math.pow(getRadio(), 2) );
    }

    public double getVolumen() {
        return ( 4 * Math.PI * Math.pow(getRadio(), 3) );
    }    
}
