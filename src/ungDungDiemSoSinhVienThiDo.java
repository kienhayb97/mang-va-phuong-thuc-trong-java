import java.util.Scanner;

public class ungDungDiemSoSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size>30)
                System.out.println("Size Khong duoc lon hon 30");
        }while (size>30);
        array = new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Nhap so dien cua hoc sinh thu "+i+1+": ");
            array[i] =scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("Danh sach so diem: ");
        for (int j=0;j< array.length;j++){
            System.out.print(array[j]+"\t");
            if (array[j]>=5 && array[j]<=10)
                count++;
        }
        System.out.print("\n so hoc sinh do la: " +count);
    }
}
