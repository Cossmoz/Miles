public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1024;
        int totalFlights = 4;
        int totalMiles = (ticketPrice * totalFlights) / 20;
        System.out.println("Всего бонусных миль: " + totalMiles);
    }
}