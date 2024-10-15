public class Instruments {
    protected String name;
    protected double price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instruments() {
        name = "empety";
        price= 0;
    }
    public Instruments(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void print(){
        System.out.println("name: "+name);
        System.out.println("price: "+price);
    }
}
