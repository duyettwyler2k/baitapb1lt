import java.util.Scanner;

public class Student {
    private String name;
    private double MSV;
    private String dateOfBirth;
    private String lop;

    public Student() {
    }

    public Student(String name, double MSV, String dateOfBirth, String lop) {
        this.name = name;
        this.MSV = MSV;
        this.dateOfBirth = dateOfBirth;
        this.lop=lop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMSV() {
        return MSV;
    }

    public void setMSV(double MSV) {
        this.MSV = MSV;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void InputInfoSinhVien(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho va ten :");
        this.name=scanner.nextLine();
        System.out.println("Nhap ma sinh vien :");
        this.MSV=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        this.dateOfBirth=scanner.nextLine();
        System.out.println("Nhap ten lop");
        this.lop=scanner.nextLine();
    }
    public void showInfoSinhVien(){
        System.out.printf("Ho ten : %s, ma sinh vien %s, ngay sinh : %s,ten lop %s",name,MSV,dateOfBirth,lop);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", MSV=" + MSV +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
