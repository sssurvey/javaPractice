public class Four {
    public void finalize() {
        System.out.println("finalize called");
    }

    public static void main(String[] args) {
        Four f1=new Four();
        Four f2=new Four();
        f1=null;
        f2=null;
        System.gc();
    }
} 