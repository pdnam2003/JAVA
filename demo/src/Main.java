//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        //             (0,1,2,3,4)

        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {

                sum += arrays[i]; // sum = sum + array[i]

        }
        System.out.println(sum);

    }
}