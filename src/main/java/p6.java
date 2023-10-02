// call by reference
public class p6 {
    int number=10;

    // pass object as parameter
    public static void increment(p6 pb){
        pb.number = pb.number+1;
        System.out.println("value in method: "+pb.number);
    }

    public static void main(String[] args) {
        p6 pb=new p6();

        System.out.println("value before method call: "+pb.number);
        increment(pb);
        System.out.println("value after method call: "+pb.number);
    }
}
