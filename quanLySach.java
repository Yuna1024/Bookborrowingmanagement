import java.util.Scanner;

public class quanLySach {
    private banDoc bandoc;
    private Sach[] sachMuon;
    private int[] soluong;
    private int soluongmuon;

    public quanLySach(banDoc bandoc){
        this.bandoc = bandoc;
        this.sachMuon = new Sach[5];
        this.soluong = new int[3];
        this.soluongmuon=0;
    }


    public banDoc getBandoc() {
        return bandoc;
    }

    public Sach[] getSach() {
        return sachMuon;
    }

    public int[] getSoluong() {
        return soluong;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public boolean themSach(Sach sach,int sosachmuon) {
        if (soluongmuon > 5 || sosachmuon > 3) {
            return false;
        }

        for (int i = 0; i < soluongmuon; i++) {
            if (sachMuon[i].getId() == sach.getId()) {
                if (soluong[i] + sosachmuon > 3) {
                    return false;
                } else {
                    soluong[i] += sosachmuon;
                    return true;
                }
            }
        }
        sachMuon[soluongmuon] = sach;
        soluong[soluongmuon]= sosachmuon;
        sosachmuon++;
        return true;
    }

    @Override
    public  String toString() {
        StringBuilder result = new StringBuilder("Thong tin muon sach cua: " + bandoc.getHoten() + ":\n");
        for (int i = 0; i < soluongmuon; i++) {
            result.append("Book: ").append(sachMuon[i].getTenSach()).append(", Quantity: ").append(soluong[i]).append("\n");
        }
        return result.toString();
        }
}
