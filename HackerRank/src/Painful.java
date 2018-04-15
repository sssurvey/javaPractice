public class Painful {
    public static int counter = 0;


    static void nFact(int n){

        for(int i = 0; i< n; i++){
            nFact(n-1);
            System.out.print(n);
            counter++;
            if(counter == 100){
                System.out.println("");
                counter = 0;
            }
        }
    }
    public static void main(String [] args){
        nFact(10);
    }


}
