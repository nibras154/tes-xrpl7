public class guitar extends stringinstruments{
    boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
    public guitar() {
        isElectric=false;
    }
    public guitar(String name,double price,int numString,boolean isElectric) {
        super(name, price,numString);
        this.isElectric=isElectric;
    }

    public void print() {
        super.print();
        System.out.println("gitar listrik: "+isElectric);
    }
}