import java.security.PublicKey;
import java.util.Scanner;

public class banDoc {
    Scanner sc =new Scanner(System.in);
    private static int nextId = 10000;
    private int id;
    private  String hoTen;
    private String diaChi;
    private int SDT;
    private  String loaiBanDoc;

    public banDoc(String hoten,String diachi,int SDT,String loaibandoc){
        this.id = nextId++;
        this.hoTen = hoten;
        this.diaChi = diachi;
        this.SDT = SDT;
        this.loaiBanDoc = loaibandoc;
    }

    public int getId(){
        return id;
    }

    public String getHoten(){
        return hoTen;
    }

    public String getDiachi(){
        return diaChi;
    }

    public  int getSDT(){
        return SDT;
    }

    public String getLoaibandoc(){
        return loaiBanDoc;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setHoten(String hoten){
        this.hoTen=hoten;
    }

    public void setDiachi(String diachi){
        this.diaChi=diachi;
    }

    public void setSDT(int SDT){
        this.SDT=SDT;
    }

    public void setLoaibandoc(String loaibandoc){
        this.loaiBanDoc=loaibandoc;
    }
}
