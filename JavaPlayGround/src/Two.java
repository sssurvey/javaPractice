public class Two extends One implements Three{
    int a = 1;
    int b = 2;
    String name;

    public Two(String s){
        this.name = s;
    }

    @Override
    void doA() {
        System.out.println(this.name);
    }

    @Override
    int doBplusA(int a, int b) {
        return a+b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getName() {
        return name;
    }

    @Override
    public int times(int a, int b, String name) {
        System.out.println("The Obj Name is: " + name + "\n" + "And product is: ");
        return a*b;
    }

    public static void main(String [] args){
        Two two = new Two("Haha");
        two.doA();
        System.out.println(two.doBplusA(1,3));
        System.out.print(two.times(two.getA(), two.getB(), two.getName()));
    }


}
