import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
      HashSet<Integer> newSet = new HashSet<Integer>();
      newSet.add(10);
      newSet.add(20);
      newSet.add(30);
      newSet.add(42);
        for(Integer number : newSet){
            if (divisionByThree(number)){
                System.out.println(number);
            }
        }
    }
    public static boolean divisionByThree(int a){
        int sum = 0;
        while(a != 0){
            sum = sum + a %10;
            a/=10;
        }
        while (sum!= 0){
            sum -=3 ;
        }
        return sum == 3;
    }

}