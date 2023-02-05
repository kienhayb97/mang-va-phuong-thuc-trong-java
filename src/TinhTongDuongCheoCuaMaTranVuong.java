import java.util.Scanner;

public class TinhTongDuongCheoCuaMaTranVuong {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâ vào bậc của ma trận: ");
        n = scanner.nextInt();
        int Arr[][] = new int[n][n];
        System.out.println("nhập vào các phần tử của ma trận: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("Arr["+i+"]["+j+"]");
                Arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Ma tran Arr Vua nhap: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println("\n");
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j){
                    sum+=Arr[i][j];
                }
            }
        }
        System.out.println(" tong gia tri or duong cheo la: "+sum);
    }
}
