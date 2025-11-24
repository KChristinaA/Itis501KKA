public class Transport {

    protected String name;
    protected double cost;
    protected int speed;

    public Transport() {
        this.name = this.getClass().getName();
    }

    public Transport(String name) {
        this.name = name;
    }



}
