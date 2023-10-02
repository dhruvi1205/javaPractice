//Implementation of Stack

public class p3 {
    private int arr[];
    private int top;
    private int capacity;
    p3(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //to push an element
    public void push(int x){
        if (isFull())
        {
            System.out.println("Stack is full");
            System.exit(1);
        }
        else{
            System.out.println("Inserting" + x);
            arr[++top] = x;
        }
    }

    //to pop an element
    public int pop(){
        if (isEmpty()){
            System.exit(1);
        }
        System.out.println("Deleting");
        return arr[--top];
    }
    // to get the size of the stack
    public int getSize(){
        return top+1;
    }

    // check if stack is Empty
    public Boolean isEmpty(){
        return top == -1;
    }

    // check if stack is Full
    public Boolean isFull(){
        return top == capacity - 1;
    }

    // Display element of Stack
    public void printStack(){
        for (int i = 0; i <= top; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        p3 stack = new p3(10);

        stack.push(4);
        stack.push(7);
        stack.push(8);

        stack.printStack();

        stack.pop();
        stack.printStack();
    }
}
