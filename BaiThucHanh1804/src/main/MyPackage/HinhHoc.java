package MyPackage;

public class HinhHoc {

    public double pi = 3.14;
    public String ten;
    public double chuvi;
    public double dientich;
    public double thetich;

    public HinhHoc() {
        ten = "";
        chuvi = 0;
        dientich = 0;
        thetich = 0;
    }

    public HinhHoc(String ten, double chuvi, double dientich, double thetich) {
        this.ten = ten;
        this.chuvi = chuvi;
        this.dientich = dientich;
        this.thetich = thetich;
    }

    public void xuatTen() {
        System.out.println("Ten: " + ten);
    }

    public void inchuvi() {
        System.out.println("Chu vi: " + chuvi);
    }

    public void indientich() {
        System.out.println("Dien tich: " + dientich);
    }

    public void inthetich() {
        System.out.println("The tich: " + thetich);
    }

}
