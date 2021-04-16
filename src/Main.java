import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiSinhVien quanLiSinhVien = new QuanLiSinhVien();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    TheMuon theMuon = new TheMuon();
                    theMuon.NhapthongtinSinhvienmuonthe();
                    quanLiSinhVien.addInfoSinhVien(theMuon);
                    break;
                }
                case 2: {
                    quanLiSinhVien.showInfoSinhvien();
                    break;
                }
                case 3:{
                   quanLiSinhVien.Sinhvientrasach();
                }
            }
        } while (choice != 0);
    }

    private static void menu() {
        System.out.println("Nhập lựa chọn của bạn : ");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Hiển thị thông tin sinh viên");
        System.out.println("3 .Hiển thị những sinh viên cần trả sách vào cuối tháng");
        System.out.println("0. Exit");
    }
}
