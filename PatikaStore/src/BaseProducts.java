public  class  BaseProducts {
    private int id;
    private int price;
    private int discountRate;
    private int storage;
    private String name;
    private Brands brand;
    private int Memory;
    private double screenSize;
    private int Ram;
    private String colour;

    public BaseProducts(int id, int price, int discountRate, int storage, String name, Brands brand, int memory, double screenSize, int ram, String colour) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.storage = storage;
        this.name = name;
        this.brand = brand;
        this.Memory = memory;
        this.screenSize = screenSize;
        this.Ram = ram;
        this.colour = colour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return Memory;
    }

    public void setMemory(int memory) {
        Memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}