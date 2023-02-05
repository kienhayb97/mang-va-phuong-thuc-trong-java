import java.util.Scanner;

public class TimGiaTriNhoNhatTongMang {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số dòng cửa ma trân: ");
        m = scanner.nextInt();
        System.out.println("nhập số cột của ma trận: ");
        n = scanner.nextInt();

        int Arr[][] = new int[m][n];
        System.out.println("Nhập phần tử cho mảng ma trận: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("Arr["+i+"]["+j+"]");
                Arr[i][j] = scanner.nextInt();
            }
        }
        int min =Arr[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (min > Arr[i][j]){
                    min = Arr[i][j];
                }
            }
        }
        System.out.println("phan tu nho nhat cua ma tran la: "+min);

    }
}
