import java.util.Scanner;

public class TheMuon {
    private double sophieumuon;
    private double ngaymuon;
    private double ngaytra;
    private double sohieusach;
    private Student student =new Student();

    public TheMuon() {
    }

    public TheMuon(double sophieumuon, double ngaymuon, double ngaytra, double sohieusach, Student student) {
        this.sophieumuon = sophieumuon;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.sohieusach = sohieusach;
        this.student = student;
    }

    public double getSophieumuon() {
        return sophieumuon;
    }

    public void setSophieumuon(double sophieumuon) {
        this.sophieumuon = sophieumuon;
    }

    public double getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(double ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public double getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(double ngaytra) {
        this.ngaytra = ngaytra;
    }

    public double getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(double sohieusach) {
        this.sohieusach = sohieusach;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    public void NhapthongtinSinhvienmuonthe(){
        this.student.InputInfoSinhVien();
        Scanner scanner=new Scanner(System.in);
        System.out.println("So phieu muon :");
        this.sophieumuon=scanner.nextDouble();
        System.out.println("Ngay muon :");
        this.ngaymuon=scanner.nextDouble();
        System.out.println("Ngay tra :");
        this.ngaytra=scanner.nextDouble();
        System.out.println("So hieu sach :");
        this.sohieusach= scanner.nextDouble();
    }
    public void showThongTinSinhvienmuonthe(){
        System.out.printf("So phieu muon %s, Ngay muon %s,Ngay tra %s,So hieu sach %s \n",this.sophieumuon,this.ngaymuon,this.ngaytra,this.sohieusach);

        student.showInfoSinhVien();
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "sophieumuon=" + sophieumuon +
                ", ngaymuon=" + ngaymuon +
                ", ngaytra=" + ngaytra +
                ", sohieusach=" + sohieusach +
                ", student=" + student +
                '}';
    }
}
