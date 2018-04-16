public class TestObject {
    private String name;
    private int whole_number;
    private double digits;

    public TestObject(String n, int w, double d){
        name = n;
        whole_number = w;
        digits = d;
    }

    public double getDigits() {
        return digits;
    }

    public String getName() {
        return name;
    }

    public int getWhole_number() {
        return whole_number;
    }

    public void setDigits(long d){
        this.digits = d;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWhole_number(int whole_number) {
        this.whole_number = whole_number;
    }

    @Override
    public String toString() {
        return "This is Name: "+getName()+"\nThis is Digits: "+getDigits()+"\nThis is wholenumber: "+getWhole_number();
    }

    public static void main (String [] arg){
        //unit testing
        TestObject to = new TestObject("test", 1, 0.3);
        System.out.println(to.toString());

        //done


    }



}
