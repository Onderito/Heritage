public abstract class Vehicle {
    String brand;
    int kilometers;

    // constrcuteur
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // setteurs et getteurs
    public String getBrand() {
        return brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}
