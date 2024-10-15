public class stringinstruments extends Instruments{
    private int numString;

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    public stringinstruments () {
        super("OnRight Guitar", 4000000);
        numString = 1;
    }

    public stringinstruments (String name, double price, int numString) {
        super();
        this.numString = numString;
    }

    public void print() {
        super.print();
        System.out.println("Number : "+numString);
    }

}