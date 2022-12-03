import java.util.ArrayList;

public class ElectricCarsList {
    ArrayList<ElectricCar> carList = new ArrayList<>();

    public static void main(String[] args) {
        ElectricCarsList cars = new ElectricCarsList();
        cars.addCars();
        cars.printList();
    }

    public void addCars() {
        carList.add(new ElectricCar("2021 Mini Electric Hardtop", 29900, 110, 6.1, 9));
        carList.add(new ElectricCar("2021 BMW i3", 44450, 153, 7.2, 8));
        carList.add(new ElectricCar("2022 Nissan Leaf", 27400, 226, 7.6, 7));
        carList.add(new ElectricCar("2021 Chevrolet Bolt EV", 36500, 259, 8.1, 6));
        carList.add(new ElectricCar("2022 Audi e-tron GT", 99900, 238, 8.5, 5));
        carList.add(new ElectricCar("2022 Polestar 2", 45900, 265, 8.5, 4));
        carList.add(new ElectricCar("2021 Porsche Taycan", 82700, 227, 8.7, 3));
        carList.add(new ElectricCar("2021 Tesla Model 3", 44990, 353, 8.8, 2));
        carList.add(new ElectricCar("2021 Tesla Model S", 94990, 412, 8.9, 1));
    }

    public void printList() {
        for (ElectricCar i : carList) {
            System.out.println(i);
        }
    }
}

class ElectricCar {
    String modelName;
    double mfgPrice;
    int maxRange;
    double usNewsRating;
    int rank;

    public String getModelName() {
        return modelName;
    }

    public double getMfgPrice() {
        return mfgPrice;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public double getUsNewsRating() {
        return usNewsRating;
    }

    public int getRank() {
        return rank;
    }

    public ElectricCar(String modelName, double mfgPrice, int maxRange, double usNewsRating, int rank) {
        this.modelName = modelName;
        this.mfgPrice = mfgPrice;
        this.maxRange = maxRange;
        this.usNewsRating = usNewsRating;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "modelName='" + modelName + '\'' +
                ", mfgPrice=" + mfgPrice +
                ", maxRange=" + maxRange +
                ", usNewsRating=" + usNewsRating +
                ", rank=" + rank +
                '}';
    }
}
