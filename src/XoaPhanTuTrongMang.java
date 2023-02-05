import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
        }while (n<=0);
        int Arr[] = new int[n];
        System.out.println("nhap cac phan tu cho mang: ");
        for (i=0;i<n;i++){
            System.out.print("nhap phan tu thu "+i+" : ");
            Arr[i] = scanner.nextInt();
        }
        System.out.println("nhap phan tu muon xoa K: ");
        int k=scanner.nextInt();
        for (c=i=0;i<n;i++){
            if (Arr[i] !=k){
                Arr[c] = Arr[i];
                c++;
            }
        }
        n=c;
        System.out.println("mang sau khi da xoa: ");
        for (i=0;i<n;i++){
            System.out.print(Arr[i]+"\t");
        }
    }
}
