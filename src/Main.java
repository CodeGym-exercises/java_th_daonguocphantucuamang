import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;

        do {
            System.out.printf("Enter size: ");
            size = scanner.nextInt();
            if(!isAcceptableSizeNumber(size)){
                System.out.printf("This size isn't valid ");
            }
        }while (!isAcceptableSizeNumber(size));

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.println("");
        reverse(array);
        System.out.printf("%-20s%s", "Elements in reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
    public static boolean isAcceptableSizeNumber(int size){
        return size>0&&size<=10?true:false;
    }
    public static int[] reverse(int[] arr){
        int[] newArr;
        int first = 0, last = arr.length-1, temp;
        while (first<last){
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }
}
