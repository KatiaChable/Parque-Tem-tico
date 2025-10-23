public class Menu{
    public static void menuPrincipal(BilleteraParque billetera){
        System.out.println("\nSeleccione una opción:");
            System.out.println("1. Agregar tickets");
            System.out.println("2. Establecer tickets");
            System.out.println("3. Comprar premio");
            System.out.println("4. Establecer festivo");
            System.out.println("5. Salir");
            System.out.println("Tu billetera ahora tiene" + billetera.getTickets() + " boletos");
            System.out.print("Opción: ");
    }

    public static void menuPremioNormal(int precioCamiseta, int precioSombrero, int precioTenis){
        System.out.println("\n1. Camiseta (" + precioCamiseta + " tickets)");
        System.out.println("2. Sombrero (" + precioSombrero + " tickets)");
        System.out.println("3. Tenis (" + precioTenis + " tickets)");
        System.out.println("4. Cancelar");
    }

    public static void menuPremioFestivo(int precioCamiseta, int precioSombrero, int precioTenis){
        System.out.println("\n¡Precios de vacaciones!");
        System.out.println("1. Camiseta (" + precioCamiseta + " tickets)");
        System.out.println("2. Sombrero (" + precioSombrero + " tickets)");
        System.out.println("3. Tenis (" + precioTenis + " tickets)");
        System.out.println("4. Cancelar");
    }
}

