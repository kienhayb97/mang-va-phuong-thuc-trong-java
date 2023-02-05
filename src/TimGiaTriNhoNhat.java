public class TimGiaTriNhoNhat {


    public static void main(String[] args) {
        int [] array = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }
    public static int minValue(int[] array) {
        int index = 1;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
