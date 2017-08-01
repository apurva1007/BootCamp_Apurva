/**
 * Created by ruplaga on 7/25/2017.
 */
public class Car implements Comparable<Car> {
    private int id;
    private double price;
    private String brand;

    public Car(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if (this.getPrice() == o.getPrice())
            return 0;
        else if(this.getPrice() > o.getPrice())
            return -1;
        else
            return 1;
    }
    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        return ((this.getPrice() == car.getPrice()) && (this.getBrand().equals(car.getBrand())) && (this.getId() == car.getId()));
    }

    @Override
    public int hashCode() {
        return (int) (this.getBrand().hashCode() + this.getId() + this.getPrice());
    }
}
