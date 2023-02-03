import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap size : ");
            size = scanner.nextInt();
            if (size>20)
                System.out.print("size khong duoc lon hon 20 : ");
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Nhap gia tri "+(i+1)+" : ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.print("danh sach gia tri : ");
        for (int j=0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }
        int max=array[0];
        int index=1;
        for (int j=0;j<array.length;j++){
            if (array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.print("Gia tri lon nhat la "+max+" tai vi tri "+index);
    }
}
