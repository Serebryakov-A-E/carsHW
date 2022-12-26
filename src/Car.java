public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    {
        brand = "default";
        model = "default";
        engineVolume = 1.5;
        color = "white";
        year = 2000;
        country = "default";
    }
    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null) {
            this.brand = brand;
        }
        if (model != null) {
            this.model = model;
        }
        if (country != null) {
            this.country = country;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
        if (color != null) {
            this.color = color;
        }
        if (year > 0) {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка в %s, %s цвета, объем двигателя — %.1f л.", brand, model, year, country, color, engineVolume);
    }
}
