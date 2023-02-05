import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[m][n];
        System.out.println("Nhập các phần tử của ma trận: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("A["+i+"]["+j+"]");
                A[i][j] = scanner.nextInt();
            }
        }
        int max = A[0][0];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (max<A[i][j]){
                    max=A[i][j];
                }
            }
        }
        System.out.println("phần tủ có giá trị lớn nhất trong ma trân là: "+max);
    }
}
