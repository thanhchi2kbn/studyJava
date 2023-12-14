import java.util.Scanner;

public class bai6_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap điểm tb");
        double dtb = sc.nextDouble();
        System.out.println("diem tb cua ban la: "+dtb);
        if(dtb >= 8  && dtb <= 10) {
            System.out.println("bạn giỏi");
        } else if (dtb >= 6.5 && dtb <8) {
            System.out.println("bạn khá");
        } else
            System.out.println("bạn tạch");

        String str = (dtb > 8)? "Bạn Đỉnh" : "Bạn gà";
        System.out.println(str);
    }
}
