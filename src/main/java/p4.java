//Implementation of this keyword

class grocery {

        String veg;
        String fruit;
        String others;
    grocery(String veg, String fruit, String others){
        this.veg = veg;
        this.fruit = fruit;
        this.others = others;
    }
    public void display(){
        System.out.println("I am buying "+ veg+ "in fruits " + fruit + "and " + others);
    }}
public class p4{
    public static void main(String[] args) {
        grocery g1 = new grocery("cucumber", "banana", "bread");
        grocery g2 = new grocery("patato", "apple", "milk");
        g1.display();
        g2.display();
    }
}
