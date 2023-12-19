package TinhDaHinh;

public class test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("thanh","1234","Bac Ninh");
        System.out.println(ns1.getTen() +": "+ ns1.tinhLuong(23));
        ns1 = new TruongPhong("thien","12234","Ha Noi");
        System.out.println(ns1.getTen() +": "+  ns1.tinhLuong(23));
    }
}
