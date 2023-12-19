import TruongDaiHoc.SinhVien;

public class bai13_OOP_1 {
    public static void main(String[] args) {
        //khởi tạo đối tượng thuộc lớp sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien("thanh",8.5);
        SinhVien sv3 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        System.out.println(sv2.getDiem());
        sv2.setHoTen("ten mới");
        sv2.setDiem(3.5);
        sv2.hienThiThongTin();
        double dtb = sv2.tinhDTB(5.5,7.2);
        System.out.println("diem tb: "+dtb);
        System.out.println(sv2.toString());

        System.out.println("tổng điểm = "+sv2.tongDiem(1,2.3,3.3,4.4,5.5));


//        sv3.hoTen = "Alex";
//        sv3.hienThiThongTin();
    }
}
