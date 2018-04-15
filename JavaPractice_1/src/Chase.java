public class Chase extends Banks implements SavaNTake {
    String speciality;


    public Chase(String n, int a, long money, String s) {
        super(n, a, money);
        this.speciality = "I can do this: "+s;
    }

    @Override
    public long saveMoney(int m) {
        this.total_assets += m;
        return total_assets;
    }

    @Override
    public long takeMoney(int m) {
        this.total_assets -= m;
        return total_assets;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static void main(String [] args){
        Chase chase = new Chase("JP Morgen & Chase", 12311,1132312313,"I am close to your location");
        System.out.println(chase.getName());
        System.out.println(chase.getAmount_of_workers());
        System.out.println(chase.getTotal_assets());
        System.out.println(chase.getSpeciality());

        System.out.println(chase.getTotal_assets());
        System.out.println(chase.saveMoney(1000));
        System.out.println(chase.getTotal_assets());
        System.out.println(chase.takeMoney(1000));
        System.out.println(chase.getTotal_assets());

    }
}
