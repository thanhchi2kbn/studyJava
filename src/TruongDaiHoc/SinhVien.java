package TruongDaiHoc;

public class SinhVien {
    //thuộc tính
    private String hoTen;
    private double diem;

    //constructor mặc định
    public SinhVien(){
        hoTen = "no name";
        diem = 0.0;
    }

    //constructor có đối số (alt+ins)
    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    //phương thức(các hàm)
    public void hienThiThongTin(){
        System.out.println(hoTen+ ": "+diem);
    }
    //get - set
    public String getHoTen(){
        return hoTen;
    }
    public double getDiem(){
        return diem;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    //phương thức có kiểu trả về
    public double tinhDTB(double diemToan, double diemVan){
        return (diemToan+diemVan)/2;
    }
    //phương thức đặc biệt toString (alt+ins)
    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }
    //parameter List
    public double tongDiem(double ...arr){
        double kq = 0.0;
        for (double x: arr)
        {
            kq += x;
        }
        return kq;
    }
}
