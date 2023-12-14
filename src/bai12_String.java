import java.lang.reflect.Array;
import java.util.Arrays;

public class bai12_String {
    public static void main(String[] args) {
        String s = "Xin chao cac ban";
        StringBuilder chuoi = new StringBuilder();
        chuoi.append("hello guys ");
        chuoi.append("do something ");
        chuoi.append("standup ");
        System.out.println(chuoi);

        chuoi.insert(6, "thanhChi ");
        System.out.println(chuoi);

        chuoi.delete(6, 15);
        System.out.println(chuoi);

        System.out.println(chuoi.length());
        //split
        String str1 = "hello world";
        String[] str2 = str1.split(" ");
        //duyệt mảng
        for (String item: str2) {
            System.out.println(item);
        }

        //toCharArray
        char[] str3 = str1.toCharArray();
        //duyệt mảng
        for (char item: str3) {
            System.out.println(item);
        }

        int[] arr = {1,8,6,2,7,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }
}
