import java.util.ArrayList;
import java.util.List;

public class QuanLiSinhVien {
    List<TheMuon> theMuons = new ArrayList<TheMuon>();

    //them phan tu
    public void addInfoSinhVien(TheMuon theMuon) {
        theMuons.add(theMuon);

    }

    //hienthi
    public void showInfoSinhvien() {
        for (TheMuon theMuon : theMuons) {
            theMuon.showThongTinSinhvienmuonthe();
        }
    }
    //hienthi sinh vien muon sach
    public void Sinhvientrasach(){
        for (TheMuon theMuon:theMuons){
            if(theMuon.getNgaytra()>=28){
                System.out.println("Sinh vien do la "+theMuon.getStudent().getName());
                System.out.println("can phai tra sach so "+theMuon.getNgaytra());
            }
        }
    }
}
