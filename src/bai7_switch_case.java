import java.util.Scanner;

public class bai7_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so a:");
        int a = sc.nextInt();
        int kq = a%2;
        switch (kq) {
            case 0:
                System.out.println("a là số chẵn");
                break;
            default:
                System.out.println("a là số lẻ");
        }
    }
}
