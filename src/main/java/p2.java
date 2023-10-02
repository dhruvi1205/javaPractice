//Program to implement a Class and method with parameters and return value.

public class p2 {
    public static int hello(int a){
        int b = a*a;
        System.out.println(b);
        return b;
    }
    public static void main(String[] args) {
        int a = 20;
        hello(a);
    }
}
