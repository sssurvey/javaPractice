// import java.lang.reflect.Array;
import java.util.Arrays;

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

        int[] intArry = new int[10];
        intArry[0] = 1;
        intArry[1] = 2;
        int lengthofArr = intArry.length;

        int[] a = new int[2];
        int[] b = new int[2];

        a[0] = 0;
        a[1] = 1;


        b[0] = 0;
        b[1] = 1;

        boolean ans = Arrays.equals(b, a);

        System.out.println(ans);



    }
} 