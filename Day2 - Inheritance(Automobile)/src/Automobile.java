class Automobile {

    long id;
    String make;
    String model;
    private double price;

    Automobile() {
        System.out.println("Default Automobile Constructor\n");
    }

    Automobile(long id, String make, String model, double price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        System.out.println("Customized Automobile Constructor\n");
    }

    public double getPrice() {
        return this.price;
    }

    void display() {
        System.out.println("id: " + this.id);
        System.out.println("make: " + this.make);
        System.out.println("model: " + this.model);
        System.out.println("price: " + this.price);
    }
}
