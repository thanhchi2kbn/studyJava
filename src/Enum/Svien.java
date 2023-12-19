package Enum;

public class Svien {
    private int ma;
    private String ten;
    private double dtb;
    private XepLoai loai;

    public Svien(int ma, String ten, double dtb) {
        this.ma = ma;
        this.ten = ten;
        this.dtb = dtb;
        this.loai = getLoai();
    }

    public XepLoai getLoai(){
        if(this.dtb >= 8)
            loai=XepLoai.gioi;
        else if (this.dtb >= 6.5) {
            loai = XepLoai.kha;
        }

        else if (this.dtb >= 5.5) {
            loai = XepLoai.tb;
        }

        else if (this.dtb >= 3.5) {
            loai = XepLoai.yeu;
        }
        else   {
            loai = XepLoai.dup;
        }
        return loai;
    }

    @Override
    public String toString() {
        return "Svien{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                ", dtb=" + dtb +
                ", loai=" + loai +
                '}';
    }
}
