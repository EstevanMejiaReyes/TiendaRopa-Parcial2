
import java.util.Scanner;

public class TiendaRopa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, cantidad;
        double precio = 0, subtotal, descuento = 0, total, iva;

        do {
            System.out.println("Menú de Compras:");
            System.out.println("1. Camisetas   $25.000");
            System.out.println("2. Pantalones   $45.000");
            System.out.println("3. Chaquetas   $65.000");
            System.out.println("4. Salir");
            System.out.print("Digite su opción: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Digite la cantidad que desea comprar: ");
                cantidad = sc.nextInt();

                switch (opcion) {
                    case 1 ->
                        precio = 25000;
                    case 2 ->
                        precio = 45000;
                    case 3 ->
                        precio = 65000;
                }

                subtotal = precio * cantidad;

                // Descuentos
                if (cantidad >= 3 && cantidad <= 4) {
                    descuento = subtotal * 0.10;
                } else if (cantidad > 4) {
                    descuento = subtotal * 0.15;
                }

                double subtotalConDescuento = subtotal - descuento;
                iva = subtotalConDescuento * 0.19;
                total = subtotalConDescuento + iva;

                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("IVA (19%): $" + iva);
                System.out.println("Total a pagar: $" + total);
                System.out.println("-----------------------------------");

            } else if (opcion != 4) {
                System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        System.out.println("Gracias por su compra.");
    }
}
