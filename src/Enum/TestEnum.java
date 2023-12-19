package Enum;

import java.util.ArrayList;

public class TestEnum {
    public static void main(String[] args) {
        System.out.println(XepLoai.gioi.ordinal());

        ArrayList<Svien> ds = new ArrayList<>();
        Svien sv1 = new Svien(1, "sv A", 9.5);
        Svien sv2 = new Svien(2, "sv B", 1.5);
        Svien sv3 = new Svien(3, "sv C", 7.5);

        ds.add(sv1);
        ds.add(sv2);
        ds.add(sv3);

        for (Svien sv: ds)
        {
            System.out.println(sv);
        }
    }
}
