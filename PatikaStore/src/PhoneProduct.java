public class PhoneProduct extends BaseProducts{
    private int power;

    public PhoneProduct(int id, int price, int discountRate, int storage, String name, Brands brand, int memory, double screenSize, int ram, String colour,int power) {
        super(id, price, discountRate, storage, name, brand, memory, screenSize, ram, colour);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
