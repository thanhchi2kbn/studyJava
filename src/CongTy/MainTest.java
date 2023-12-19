package CongTy;

public class MainTest {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("nhân viên 1", "bắc ninh",1234);
//        System.out.println("luong nv1: "+nv1.tinhLuong());

        //tạo đối tượng là nv hành chính
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hành chính 1","Hà nội",1235);
        System.out.println("luong hc1: "+hc1.tinhLuong());

        //tạo đối tượng là nv đi ca
        NhanVienDiCa dc1 = new NhanVienDiCa("đi ca 1","Hà Tây",1236, 1);
        System.out.println("luong dc1: "+dc1.tinhLuong());
    }
}
