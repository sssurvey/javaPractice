public class Two extends One {
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

    public static void main(String [] args){
        Two two = new Two("Haha");
        two.doA();
        System.out.println(two.doBplusA(1,3));
    }

}
