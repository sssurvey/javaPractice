public class Anonymous {
    interface Hello{
        public void greet();
        public void greetSomeone(String name);
    }

    void sayHello(){
        class EnglishGreet implements Hello{
            String name = "world";
            public void greet(){greetSomeone("world");}
            public void greetSomeone(String n){
                name = n;
                System.out.println("Hello " + name);
            }
        }
        EnglishGreet sayHello = new EnglishGreet();
    }





    public static void main(String [] args){
        Anonymous an = new Anonymous();
        an.sayHello();
        //String testing
        String s = "sssss";
        s = s.toUpperCase()+" "+ "sss";
        int j = s.hashCode();
        System.out.println(s + " " + j);



    }

}
