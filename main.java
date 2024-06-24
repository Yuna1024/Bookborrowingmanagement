import java.util.Scanner;

public class main {
    private  static banDoc[] banDocs = new banDoc[100];
    private static  int soLuongBanDoc = 0;

    private  static  Sach[] sachs = new Sach[100];
    private static  int soLuongSach = 0;

    private static quanLySach[] qlMuonSachs = new quanLySach[100];
    private  static int soLuongMuonSach = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.print("\nLibrary Management System");
            System.out.println("\n1: Them sach");
            System.out.println("2: Hien thi sach");
            System.out.println("3: Them ban doc");
            System.out.println("4: Hien thi ban doc");
            System.out.println("5: Muon sach");
            System.out.println("6: Hien thi danh sach muon");
            System.out.println("7: Sap xep ten ban doc");
            System.out.println("8: Sap xep theo so luong sach muon");
            System.out.println("9: Tim kiem ban doc theo ten");
            System.out.println("10: Thoat!!!");
            System.out.println("Lua chon cua ban: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    themSach();
                    pause();
                    break;
                case 2:
                    hienthiSach();
                    pause();
                    break;
                case 3:
                    themBanDoc();
                    pause();
                    break;
                case 4:
                    hienThiBanDoc();
                    pause();
                    break;
                case 5:
                    muonSach();
                    pause();
                    break;
                case 6:
                    hienThiDanhSachMuonSach();
                    pause();
                    break;
                case 7:
                    sapXepTheoTenBanDoc();
                    pause();
                    break;
                case 8:
                    sapXepTheoTongSoLuongMuon();
                    pause();
                    break;
                case 9:
                    timKiemTheoTen();
                    pause();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!!!");
                    break;
                default:
                    System.out.println("Lua chon cua ban khong hop le.Vui long chon lai");
            }
        }while (choose != 0);
        sc.close();
    }

    public static void themSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach ban muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Nhap sach thu "+(i+1)+":");
            System.out.print("Nhap ten sach:");
            String tenSach = sc.nextLine();
            System.out.print("Nhap ten tac gia:");
            String tenTacGia = sc.nextLine();
            System.out.print("Lua chon chuyen nganh (1. Khoa hoc tu nhien, 2. Van hoc - Nghe thuat, 3. Dien tu vien thong, 4. Cong nghe thong tin): ");
            int check =sc.nextInt();
            sc.nextLine();
            String chuyenNganh = "";
            switch (check){
                case 1:
                    chuyenNganh = "Khoa hoc tu nhien";
                    break;
                case 2:
                    chuyenNganh = "Van hoc - nghe thuat";
                    break;
                case 3:
                    chuyenNganh = "Dien tu vien thong";
                    break;
                case 4:
                    chuyenNganh = "Cong nghe thong tin";
                    break;
                default:
                    System.out.println("Lua chon khong hop le nen lua chon mac dinh la 'Khoa hoc tu nhien'.");
                    chuyenNganh = "Khoa hoc tu nhien";
            }
            System.out.println("Nam xuat ban: ");
            int namXb = sc.nextInt();
            sc.nextLine();

            Sach newSach = new Sach(tenSach,tenTacGia,chuyenNganh,namXb);
            sachs[soLuongSach++] =newSach;
        }
    }

    public static  void hienthiSach(){
        System.out.println("Hien thi danh sach:");
        for(int i=0;i<soLuongSach;i++){
            System.out.println("\nSach thu "+(i+1)+":");
            System.out.print("Id:"+ sachs[i].getId());
            System.out.print("\nTen sach:"+ sachs[i].getTenSach());
            System.out.print("\nChuyen nganh:"+ sachs[i].getChuyenNganh());
            System.out.print("\nNam xuat ban:"+sachs[i].getNamXb());
        }
    }


    public static void themBanDoc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ban doc muon them: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Nhap ban doc thu "+(i+1)+":");
            System.out.print("Nhap ten ban doc:");
            String hoTen = sc.nextLine();
            System.out.print("Nhap dia chi:");
            String diaChi = sc.nextLine();
            System.out.println("Nhap so dien thoai: ");
            int SDT = sc.nextInt();
            System.out.print("Lua chon loai ban doc (1. Sinh vien,2. Hoc vien cao hoc,3. Giao vien: ");
            int check =sc.nextInt();
            sc.nextLine();
            String loaiBanDoc = "";
            switch (check){
                case 1:
                    loaiBanDoc = "Sinh vien";
                    break;
                case 2:
                    loaiBanDoc = "Hoc vien cao hoc";
                    break;
                case 3:
                    loaiBanDoc = "Giao vien";
                    break;
                default:
                    System.out.println("Lua chon khong hop le nen lua chon mac dinh cua ban la 'Sinh vien'.");
                    loaiBanDoc = "Sinh vien";
            }


             banDoc newBanDoc= new banDoc(hoTen,diaChi,SDT,loaiBanDoc);
            banDocs[soLuongBanDoc++]= newBanDoc;
        }
    }

    public static void hienThiBanDoc(){
        System.out.println("Hien thi danh sach:");
        for(int i=0;i<soLuongBanDoc;i++){
            System.out.println("\nBan doc thứ "+(i+1)+":");
            System.out.print("Id:"+ banDocs[i].getId());
            System.out.print("\nTên:"+ banDocs[i].getHoten());
            System.out.print("\nSDT:"+ banDocs[i].getSDT());
            System.out.print("\nLoai ban doc:"+banDocs[i].getLoaibandoc());
        }
    }


    public static void muonSach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id ban doc : ");
        int findId = sc.nextInt();
        sc.nextLine();

        banDoc BD= timKiemBanDoc(findId);
        if(BD==null){
            System.out.println("ID khong hop le!");
            return;
        }

        quanLySach qlMuonsach = findOrCreate(BD);

        System.out.println("Nhap so luong sach muon muon: ");
        int slSach = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<slSach;i++){
            System.out.print("Nhap id sach:");
            int idSach = sc.nextInt();
            sc.nextLine();
            Sach sach = timKiemSach(idSach);
            if (sach==null){
                System.out.println("Khong tim thay sach");
                continue;
            }
            System.out.print("Nhap so luong can muon:");
            int sl = sc.nextInt();
            sc.nextLine();
            boolean added = qlMuonsach.themSach(sach,sl);
            if(added){
                System.out.println("Muon sach thanh cong!");
            }
            else System.out.println("Khong the muon sach.");
        }
    }

    public static quanLySach findOrCreate(banDoc BD){
        for (int i=0;i<soLuongMuonSach;i++){
            if(qlMuonSachs[i].getBandoc().getId()==BD.getId()){
                return qlMuonSachs[i];
            }
        }
        quanLySach newQlMuonSachs = new quanLySach(BD);
        qlMuonSachs[soLuongMuonSach++]= newQlMuonSachs;
        return newQlMuonSachs;
    }


    public static void hienThiDanhSachMuonSach(){
        System.out.println("Danh sach muon la:");
        for(int i=0;i<soLuongMuonSach;i++){
            System.out.println(qlMuonSachs[i]);
        }
    }

    public static void sapXepTheoTenBanDoc(){
        if (soLuongMuonSach <=1){
            System.out.println("Khong du du lieu de sap xep");
            return;
        }

        for (int i=0;i<soLuongMuonSach-1;i++) {
            for (int j = i + 1; j < soLuongMuonSach; j++) {
                if (qlMuonSachs[i].getBandoc().getHoten().compareTo(qlMuonSachs[j].getBandoc().getHoten()) > 0) {
                    quanLySach temp = qlMuonSachs[i];
                    qlMuonSachs[i] = qlMuonSachs[j];
                    qlMuonSachs[j] = temp;
                }
            }
            hienThiDanhSachMuonSach();
        }
    }


    public static void sapXepTheoTongSoLuongMuon(){
        if (soLuongMuonSach <=1){
            System.out.println("Khong du du lieu de sap xep");
            return;
        }
        for(int i=0;i<soLuongMuonSach-1;i++) {
            for (int j = i + 1; j < soLuongMuonSach; j++) {

                if (tongSoLuongMuon(qlMuonSachs[i]) < tongSoLuongMuon(qlMuonSachs[j])) {
                    quanLySach temp = qlMuonSachs[i];
                    qlMuonSachs[i] = qlMuonSachs[j];
                    qlMuonSachs[j] = temp;
                }
            }
            hienThiDanhSachMuonSach();
        }
    }


    public static  void timKiemTheoTen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten ban muon tim kiem:");
        String name = sc.nextLine();
        boolean check =false;
        for (int i =0 ;i<soLuongMuonSach;i++){
            if (qlMuonSachs[i].getBandoc().getHoten().equalsIgnoreCase(name)){
                check = true;
            }
        }
        if (check){
            for(int i=0;i<soLuongMuonSach;i++){
                if(qlMuonSachs[i].getBandoc().getHoten().equalsIgnoreCase(name)){
                    System.out.println(qlMuonSachs[i]);
                }
            }
        }else System.out.println("Khong tim thay ban doc");
    }

    public static int tongSoLuongMuon(quanLySach quanLySach){
        int total =0 ;
        for(int quantity: quanLySach.getSoluong()){
            total+=quantity;
        }
        return total;
    }

    public  static banDoc timKiemBanDoc(int findId){
        for (int i=0;i<soLuongBanDoc;i++){
            if (banDocs[i].getId()==findId){
                return banDocs[i];
            }
        }
        return null;
    }

    public static Sach timKiemSach(int idSach){
        for (int i=0;i<soLuongSach;i++){
            if (sachs[i].getId()==idSach){
                return sachs[i];
            }
        }
        return null;
    }


    public static void pause(){
        System.out.println("\nNhan Enter de tiep tuc...");
        try{
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
