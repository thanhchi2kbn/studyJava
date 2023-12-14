public class bai3_khaiBaoBien_EpKieu {
    public static void main(String[] args) {
        //khai baso biến
        int a;
        byte tuoi;
        float diemToan;
        int c, d, e, f;

        //khởi tạo biến
        int tuoiCon = 10;
        float diemVan = 7.5f; //float cần thêm f
        double diemAnh = 7.5;

        tuoiCon = 15;
        System.out.println(tuoiCon);

        //hằng số
        final float PI = 3.14f;
        //ép kiểu
        int x = 2, y = 4;
        double kq = x/y;
        System.out.println(kq); // ra 0.0 vì nguyên/nguyên ra nguyên
        double kq2 = (double) x/y; //ép kiểu về số thực ra 0.5
        System.out.println(kq2);

        int a1 = 128;
        byte a2 = (byte) a1;
        System.out.println(a2); //ép ra sai kqua do byte chỉ lưu được kết quả
        //từ -127 -> 127
    }
}
