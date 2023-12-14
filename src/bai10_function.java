public class bai10_function {
    public static void main(String[] args) {
//        int kq = Sum(1,5,3);
//        System.out.println(kq);
//
//        XinChao("nu");
        String kq = ptBac2(0,0,3);
        System.out.println(kq);
    }
    public static int Sum(int x, int y, int z){
        return x+y+z;
    }
    //ham thu tuc
    public static void XinChao(String gioiTinh){
        if (gioiTinh.equals("nu")){
            System.out.println("ban la nu");
        }
        else if (gioiTinh.equals("nam")) {
            System.out.println("ban la nam");
        }
        else System.out.println("ban la gi");
    }

    //ptrinh bac 2
    public static String ptBac2(double a, double b, double c){
        if (a==0){
            if(b==0 && c==0){
                return "PT vo so nghiem";
            } else if (b==0 && c!=0) {
                return "PT vo  nghiem";
            }else
                return "PT co  nghiem ";
        }
        else return "PT co 2 ng phan biet";
    }
}
