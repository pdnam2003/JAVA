import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap vao so tien can rut (so tien phai chia het cho 50'000 : ");
    int input = scanner.nextInt();
    if (input % 50000 !=0 && input % 50000 < 0){
        System.out.println("khong the rut so tien da phap");
    }
    else{
        int originalAmount = input;
        int count500 = 0;
        int count200 = 0;
        int count100 = 0;
        int count50 = 0;
        System.out.println("so tien can rut la : " + input);
        if (input>=500000){
            count500 = input / 500000;
            input=input % 500000;
        }
        if (input>=200000){
            count200 = input / 200000;
            input=input % 200000;
        }
        if (input>=100000){
            count100 = input / 100000;
            input= input % 100000;
        }
        if (input>=50000){
            count50 = input / 50000;
            input=input % 50000;
        }
            int numberMoney = count500 + count200 + count100 + count50;

        System.out.println("so luong to tien nhan duoc la : " + numberMoney);
        System.out.println("so to tien 500'000 la :" + count500);
        System.out.println("so to tien 200'000 la :" + count200);
        System.out.println("so to tien 100'000 la :" + count100);
        System.out.println("so to tien 50'000 la :" + count50);
    }
    scanner.close();
    }
}