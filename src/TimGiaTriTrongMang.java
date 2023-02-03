import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hoc sinh: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i=0;i<students.length;i++){
            if (students[i].equals(input_name)){
                System.out.println("vi tri cua sinh vien trong danh sach "+input_name+" la :"+(i+1));
                isExist = true;
                break;
            }
        }if (!isExist)
            System.out.println("ten "+input_name+" khong co trong danh sach");
    }
}
