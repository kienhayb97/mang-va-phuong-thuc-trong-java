import java.util.Scanner;

public class GopMang {
    public static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {
        float[] A = null;
        float[] B = null;
        float[] C = null;
        System.out.println("Nhap mang A");
        A = input(A);
        System.out.println("Nhap mang B");
        B = input(B);
        C = merge(A, B);
        show(C);
    }
    public static float[] input(float[] arr){
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        arr = new float[n];
        System.out.println("Nhap cac phan tu cua mang: \n");
        for (int i=0;i<n;i++){
            System.out.printf("A[%d] = ",i);
            arr[i] = scanner.nextInt();
        }return arr;
    }

    public static void sortASC(float[] arr) {
        float temp = arr[0];
        for (int i=0;i< arr.length-1;i++){
            for (int j=0;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static float[] merge(float[] A,float[] B){
        int AIndex = A.length-1;
        int BIndex = B.length-1;
        int CIndex = A.length + B.length-1;
        float[] C = new float[CIndex+1];
        sortASC(A);
        sortASC(B);
        for (int i=CIndex;i>-1;i--){
            if (AIndex>-1 && BIndex>-1){
                if (A[AIndex]>B[BIndex]){
                    C[i] = A[AIndex--];
                }else {
                    C[i] = B[BIndex--];
                }
            } else if (BIndex==-1){
                C[i] = A[AIndex--];
            }else if (AIndex==-1){
                C[i] = B[BIndex--];
            }
        }return C;
    }
    public static void show(float[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
