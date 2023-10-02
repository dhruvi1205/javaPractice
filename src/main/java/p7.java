// Implementation of Recursion
public class p7 {
    public static double fact(int k){
        if (k == 0){return 1;}
        return k * fact(k-1);
    }

    public static void main(String[] args) {
        double result = fact(5);
        System.out.println(result);
    }
}
