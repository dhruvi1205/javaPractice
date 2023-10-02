// Program to implement Recursion (Printing elements of an Array)
public class p8 {
    public static void printarray(int[] data, int index){
        if (index != -1) {
            System.out.println(data[index]);
            printarray(data, index - 1);
        }
    }

    public static void main(String[] args) {
        int[] data = {34,67,89,90,22,67};

        printarray(data, data.length -1 );
    }
}
