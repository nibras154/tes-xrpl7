public class piano extends Instruments {
    private String pianoType;

    public String getPianoType() {
        return this.pianoType;
    }

    public void setPianoType(String pianoType) {
		this.pianoType = pianoType;
	}
    public piano() {
        super("spinet piano",200000);
        pianoType= "UpRight Piano";
    }
    public piano(String name,double price,String pianoType) {
        super("Spinet Piano", 2000000);
        this.pianoType=pianoType;
    }
    public void print() {
        super.print();
        System.out.println("piano type: "+pianoType);
    }

    public String next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
}
