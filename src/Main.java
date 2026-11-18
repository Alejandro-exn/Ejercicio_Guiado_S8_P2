public class Main {
    static void main() {
        double montoCompra = 100.0;


        MetodoPago pago1 = new Tarjeta("Alejandro", 1000.0, "****1234");
        MetodoPago pago2 = new Transferencia("Josue", 2000.0, "Banco Pichincha");
        MetodoPago pago3 = new BilleteraDigital("Joaquin", 500.0, "PayPal");

        Compra compra1 = new Compra(montoCompra, pago1);
        Compra compra2 = new Compra(montoCompra, pago2);
        Compra compra3 = new Compra(montoCompra, pago3);

        System.out.println("=== COMPRA 1 ===");
        System.out.println(compra1.mostrarInformacion());

        System.out.println("\n=== COMPRA 2 ===");
        System.out.println(compra2.mostrarInformacion());

        System.out.println("\n=== COMPRA 3 ===");
        System.out.println(compra3.mostrarInformacion());
    }
}