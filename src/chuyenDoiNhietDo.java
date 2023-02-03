import java.sql.SQLOutput;
import java.util.Scanner;

public class chuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyen tu do F sang do C");
            System.out.println("2.Chuyen tu do C sang do F");
            System.out.println("0. Ket thuc");
            System.out.println("Moi ban chon: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Moi nhap do F: ");
                    doF=scanner.nextDouble();
                    System.out.println(doF+" Do F se bang "+DoF_sang_DoC(doF) +" Do C");
                    break;
                case 2:
                    System.out.println("Moi nhap do C: ");
                    doC=scanner.nextDouble();
                    System.out.println(doC+"Do C se bang "+DoC_sang_DoF(doC)+" Do F");
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public static double DoC_sang_DoF(double doC){
        double doF= (9.0/5)*doC+32;
        return doF;
    }
    public static double DoF_sang_DoC(double doF){
        double doC = (5.0/9)*(doF-32);
        return doC;
    }
}
