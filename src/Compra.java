public class Compra {
    private double total;
    private MetodoPago metodoPago;

    public Compra(double total, MetodoPago metodoPago) {
        this.total = total;
        this.metodoPago = metodoPago;
    }

    public double calcularTotalConComision() {
        return total + metodoPago.calcularComision(total);
    }

    public String mostrarInformacion() {
        double comision = metodoPago.calcularComision(total);
        return "Monto base: $" + total +
                "\nComisión aplicada: $" + comision +
                "\nTotal a pagar: $" + calcularTotalConComision() +
                "\nMétodo -> " + metodoPago.mostrarInformacion();
    }
}