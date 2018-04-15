public abstract class Banks {
    String name;
    int amount_of_workers;
    long total_assets;

    public Banks(String n, int a, long money){
        this.name = n;
        this.amount_of_workers = a;
        this.total_assets = money;
    }

    public String getName() {
        return name;
    }

    public int getAmount_of_workers() {
        return amount_of_workers;
    }

    public long getTotal_assets() {
        return total_assets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount_of_workers(int amount_of_workers) {
        this.amount_of_workers = amount_of_workers;
    }

    public void setTotal_assets(long total_assets) {
        this.total_assets = total_assets;
    }
}
