import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BilleteraParque billetera = new BilleteraParque(100);
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("\n== Administrador de billeteras para parques temáticos ==");

        do {
            Menu.menuPrincipal(billetera);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\n¿Cuántos boletos se agregan?");
                    int agregar = scanner.nextInt();
                    billetera.agregarTickets(agregar);
                    break;

                case 2:
                    System.out.println("\nEstablecer saldo de tickets en: ");
                    int establecer = scanner.nextInt();
                    billetera.setTickets(establecer);
                    break;

                case 3:
                    int precioCamiseta = 150;
                    int precioSombrero = 350;
                    int precioTenis = 600;

                    if (BilleteraParque.getFestivo()) {
                        precioCamiseta /= 2;
                        precioSombrero /= 2;
                        precioTenis /= 2;
                        Menu.menuPremioFestivo(precioCamiseta, precioSombrero, precioTenis);
                    } else {
                        Menu.menuPremioNormal(precioCamiseta, precioSombrero, precioTenis);
                    }
                    int premio = scanner.nextInt();
                     switch (premio) {
                        case 1:
                            billetera.removerTickets(precioCamiseta);
                            System.out.println("\nHas comprado una camiseta.");
                            break;
                        case 2:
                            billetera.removerTickets(precioSombrero);
                            System.out.println("\nHas comprado un sombrero.");
                            break;
                        case 3:
                            billetera.removerTickets(precioTenis);
                            System.out.println("\nHas comprado unos tenis.");
                            break;
                        case 4:
                            System.out.println("\nRegresando al menú principal...");
                            break;
                        default:
                            System.out.println("\nEscoge una opción del 1 al 4.");
                            break;
                    }
                    break;

                case 4:
                    BilleteraParque.setFestivo();       
                    if (BilleteraParque.getFestivo() == true) {
                        System.out.println("\nAhora es día festivo.");
                    } else {
                        System.out.println("\nAhora es un día normal");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
