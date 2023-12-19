package oppSapXepClass;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        //tao list
        ArrayList<SanPham> ds = new ArrayList<>();
        //khởi tạo các đối tựg sp
        SanPham sp1 = new SanPham(1, "SamSung", 10000);
        SanPham sp2 = new SanPham(2, "IPhone", 24000);
        SanPham sp3 = new SanPham(3, "Nokia", 3000);
        ds.add(sp1);
        ds.add(sp2);
        ds.add(sp3);

        for (SanPham sp: ds)
        {
            System.out.println(sp);
        }

        //gọi pt sắp xếp
        Collections.sort(ds);
        System.out.println("danh sach sau sx: ");
        for (SanPham sp: ds)
        {
            System.out.println(sp);
        }
    }
}
