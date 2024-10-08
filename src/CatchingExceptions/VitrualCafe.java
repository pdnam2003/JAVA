package CatchingExceptions;

import Exeption.TemperatureException;
import Exeption.TooColdException;
import Exeption.TooHotException;
import ThrowingExceptions.VirtualPerson;

public class VitrualCafe {
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup){
        try {
            cust.drinkCoffee(cup);
            System.out.println("Coffee is just right");
        }
        catch (TooColdException e) {
            System.out.println("Coffee is too cold");
// Deal with an irate customer...
        }
        catch (TemperatureException e) {
// This catches TooHotException as well
// as TemperatureException.
            System.out.println("There's temperature trouble in this coffee");
// Deal with an irate customer...
        } catch (TooHotException e) {
            throw new RuntimeException(e);
        } catch (TooColdException e) {
            throw new RuntimeException(e);
        }
    }
    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) {
        try {
            cust.drinkCoffee(cup);
            System.out.println("Coffee tastes just right.");
        }
        catch(UnusualTasteException e) {
            System.out.println("Customer is complaining of an unusual taste.");
            String s = e.getMessage();
            if (s != null) {
                System.out.println(s);
            }
        }
    }
}
