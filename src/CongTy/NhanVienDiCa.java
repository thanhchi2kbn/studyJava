package CongTy;

public class NhanVienDiCa extends  NhanVien{

    protected int ca;
    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLuong() {
        return luongCB*1.05;
    }

}
