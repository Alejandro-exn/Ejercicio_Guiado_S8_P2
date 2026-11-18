public class MetodoPago {
    private String titular;
    private double limite;

    public MetodoPago(String titular, double limite) {
        this.titular = titular;
        this.limite = limite;
    }

    public double calcularComision(double monto) {
        return monto * 0.01;
    }

    public String mostrarInformacion() {
        return "Titular: " + titular + " | Límite: $" + limite;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimite() {
        return limite;
    }
}