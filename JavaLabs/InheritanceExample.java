class Vehicle {
    protected String manufacturer;
    protected String model;
    protected int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Car extends Vehicle {
    public Car(String manufacturer, String model, int year) {
        super(manufacturer, model, year);
    }

    public void honk() {
        System.out.println("HONK");
    }

}

public class InheritanceExample {
    public static void main(String[] args) {

        Car myCar = new Car("Honda","Civic", 2017);

        System.out.println("My old car specs:");
        System.out.println(myCar.getManufacturer() + " " + myCar.getModel() + " " + myCar.getYear() + "\n");

        myCar.setManufacturer("Ford");
        myCar.setModel("F150");
        myCar.setYear(2020);

        System.out.println("My new car specs: ");

        System.out.println(myCar.getManufacturer() + " " + myCar.getModel() + " " + myCar.getYear()+ "\n");

        myCar.honk();
    }
}
