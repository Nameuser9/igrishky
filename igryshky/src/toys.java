public class toys {
    protected int id;
    protected String name;
    protected int quantity;
    protected int ves; //вес


    protected toys(int id , String name , int quantity, int ves){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.ves = ves;
    }

    public String getName() {
        return name;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}