public class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    public boolean isEmpty(){
        return (top<0);
    }

    Stack(){
        top = -1;
    }

    public boolean push(int x){
        if (top >= MAX){
            System.out.println("Stack Overflow");
            return false;
        } else{
            a[++top] = x;
            return true;
        }
    }

    public int pop(){
        if (top<0){
            System.out.println("Stack Underflow");
            return 0;
        }else{
            int x = a[top--];
            return x;
        }
    }

    public String toString(){
        int t = this.top;
        int max = this.MAX;
        return "top: "+ t + " MAX: "+max;
    }



    public static void main(String args[]){
        Stack s = new Stack();
        System.out.println(s);
        s.push(10);
        System.out.println(s);
        s.push(20);
        System.out.println(s);
        s.push(30);
        System.out.println(s);
        System.out.println(s.pop()+" POP!");
        System.out.println(s.pop()+" POP!");
        System.out.println(s.pop()+" POP!");
        System.out.println(s.pop()+" POP!");
    }


}