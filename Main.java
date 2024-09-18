import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so tien ban can gui lai xuat: ");
        long principalAmount = scanner.nextInt();
        if (principalAmount < 0 ) {
            System.out.println("so tien khong hop le ");
        }
        else {
            System.out.println( "thong so ve lai theo ki han :"+
                    "\n1: 6 thang lai suat 5.1%" +
                    "\n2: 9 thang lai suat 5.5%" +
                    "\n3: 12 thang lai suat 6.4%" +
                    "\n4: 24 thang lai suat 6.5%" +
                    "\n5: 32 thang lai suat 6.5%" +
                    "\nban muon gui ky han trong bao lau :");
            int month = scanner.nextInt();
            switch (month) {
                case 1:
                    System.out.println("Loai Tien Gui : VND");
                    double  interest = principalAmount * 51 / 1000 ;
                    System.out.println("so tien lai sau khi gui 6 thang la: " + interest);
                    double   totalMoney = principalAmount + principalAmount * 51 / 1000 ;
                    System.out.println("so tien lai va goc la : " + totalMoney);
                    break;
                case 2:
                    System.out.println("Loai Tien Gui : VND");
                    double  interest2 = principalAmount * 55 / 1000 ;
                    System.out.println("so tien lai sau khi gui 9 thang la: " + interest2);
                    double   totalMoney2 = principalAmount + principalAmount * 55 / 1000 ;
                    System.out.println("so tien lai va goc la : " + totalMoney2);
                    break;
                case 3:
                    System.out.println("Loai Tien Gui : VND");
                    double  interest3 = principalAmount * 64 / 1000 ;
                    System.out.println("so tien lai sau khi gui 12 thang la: " + interest3);
                    double   totalMoney3 = principalAmount + principalAmount * 64 / 1000 ;
                    System.out.println("so tien lai va goc la : " + totalMoney3);
                    break;
                case 4:
                    System.out.println("Loai Tien Gui : VND");
                    double  interest4 = principalAmount * 65 / 1000 ;
                    System.out.println("so tien lai sau khi gui 24 thang la: " + interest4);
                    double   totalMoney4 = principalAmount + principalAmount * 65 / 1000 ;
                    System.out.println("so tien lai va goc la : " + totalMoney4);
                    break;
                case 5:
                    System.out.println("Loai Tien Gui : VND");
                    double  interest5 = principalAmount * 65 / 1000 ;
                    System.out.println("so tien lai sau khi gui 32 thang la: " + interest5);
                    double   totalMoney5 = principalAmount + principalAmount * 65 / 1000 ;
                    System.out.println("so tien lai va goc la : " + totalMoney5);
                    break;
            }
        }


}
}