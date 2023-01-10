package Transport;

public class Transport {
    protected String brand;
    protected String model;
    protected int year;
    protected String country;
    protected String color;
    protected int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        if (country != null) {
            this.country = country;
        } else {
            this.country = "default";
        }

        if (color != null) {
            this.color = color;
        } else {
            this.color = "white";
        }

        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка в %s, %s цвета. Максимальная скорость - %dкм/час.",
                brand, model, year, country, color, maxSpeed);
    }

    public void setColor(String color) {
        if (color != null && !color.equals("")) {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
