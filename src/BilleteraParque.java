public class BilleteraParque {
    private int tickets;
    private static boolean festivo = false;

    public BilleteraParque(){
        this.tickets = 0;
    }

    public BilleteraParque (int tickets){
        this.tickets = tickets;
    }
 
    // Getters
    public int getTickets() {
        return tickets;
    }

    public static boolean getFestivo(){
        return festivo;
    }

    // Setters
    public int setTickets(int tickets){
        if (tickets > 0){
            this.tickets = tickets;
        }
        return this.tickets;
    }

    public static boolean setFestivo(){
        festivo = !festivo;
        return festivo;
    }


    // Methods
    public void agregarTickets(int x){
        if (x > 0){
            this.tickets += x;
        }
    }

    public boolean removerTickets(int y){
        if (this.tickets > y){
            this.tickets -= y;
            return true;
        }
        return false;
    }
}

