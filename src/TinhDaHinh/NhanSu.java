package TinhDaHinh;

public abstract class NhanSu {
    private String ten;
    private String cccd;
    private String que;

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public String getTen() {
        return ten;
    }

    public abstract  double tinhLuong(int ngayCong);
}
