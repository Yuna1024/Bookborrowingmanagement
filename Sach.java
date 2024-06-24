import java.util.Scanner;

public class Sach {
    Scanner sc =new Scanner(System.in);
    private static int nextId=10000;
    private int id;
    private String tenSach;
    private String tenTacGia;
    private String chuyenNganh;
    private int namXb;

    public Sach(String tenSach,String tenTacGia,String chuyenNganh,int namXb){
        this.id=nextId++;
        this.tenSach=tenSach;
        this.tenTacGia=tenTacGia;
        this.chuyenNganh=chuyenNganh;
        this.namXb=namXb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getNamXb() {
        return namXb;
    }

    public void setNamXb(int namXb) {
        this.namXb = namXb;
    }
}
