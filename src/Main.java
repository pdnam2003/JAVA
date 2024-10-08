import Exeption.TemperatureException;

public class Main {
    public static void main(String[] args) throws TemperatureException {
        CoffeeCup cup = new CoffeeCup();
        try {
            VirtualPerson cust = new VirtualPerson();
            VirtualCafe.serveCustomer(cust, cup);
        }
        catch (UnusualTasteException e) {
            System.out.println("This coffee has an unusual taste.");
        }
    }

}