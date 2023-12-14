import java.util.Scanner;

public class bai5_scanner_nhapTuBanPhim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //cho phép nhập liệu từ bàn phím
        System.out.println("moi nhap vao mk cấp 1: ");
        String mk1 = scanner.nextLine();
        System.out.println(mk1);
        // nhập số nguyên
        System.out.println("nhập vào 1 số nguyên a:");
        int a = scanner.nextInt();
        System.out.println("a= "+a);
        System.out.println(Math.PI + 1);
    }
}
