import static java.lang.Integer.parseInt;

/**
 * @author Haomin Shi
 * @version v.01
 */
public class Test1 {
    public static void main(String [] arg){
        String s = "hello world";
        System.out.println(s);

        String a = new String("hello world");

        if (s.equals(a)){
            System.out.println("yeah, they are .equals to each others");
        } else {
            System.out.println("No, they are not .equals to each others");
        }


        int[] intArray = new int[3];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;

        for (int i = 0; i<= intArray.length-1;i++)
        {
            System.out.println(intArray[i]);
        }
        intArray[2] = 3;
        System.out.println(intArray[2]);

        //char char1Array[] = new char[2];




        TestObject t = new TestObject("xxx",21,23123.22);
        System.out.println(t);

        String ss = "23";
        int g = Integer.valueOf(ss);
        int gg = parseInt(ss);
        System.out.println(g);
        System.out.println(gg);
        System.out.println("------------------");
        System.out.println(5%3);

        //example about 2d array
        int intArray2dRows = 2;
        int intArray2dColoums = 3;
        int intArray2D[][] =new int[intArray2dRows][intArray2dColoums];
        intArray2D[0][0] = 0;
        intArray2D[0][1] = 01;
        intArray2D[1][0] = 10;
        intArray2D[1][1] = 11;
        intArray2D[1][2] = 12;

        for(int i = 0; i < intArray2dRows;i++){
            System.out.println("Right now we are at ROW: "+i);
            for(int f = 0; f < intArray2dColoums; f++){
                System.out.println(intArray2D[i][f]);
            }
        }
        //example about 2d array ends






    }
}



