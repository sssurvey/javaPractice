public class Tries {
    final static int length = 26;
    boolean endOfW;
    Tries [] triesArry;
    //26 letters , all lowercase

    public Tries(int length){
        this.triesArry = new Tries[length];
        endOfW = false;

        //clean up the array filling null value
        for (int i = 0; i < length; i++)
            triesArry[i] = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args){


    }


}


