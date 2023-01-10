package transport;

import java.time.LocalDate;

public class Car extends Transport {
    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }
    private Key key;
    //private final String brand;
    //private final String model;
    private double engineVolume;
    //private String color;
    //private final int year;
    //private final String country;
    private String transmissionType;
    private final String bodyType;
    private String registerNumber;
    private final int seats;

    private boolean winterTiers;

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String bodyType, int seats, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (bodyType != null) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "default";
        }

        if (seats > 0) {
            this.seats = seats;
        } else {
            this.seats = 1;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, сборка в %s, %s цвета, объем двигателя — %.1f л. Максимальная скорость - %dкм/час.",
                brand, model, year, country, color, engineVolume, maxSpeed);
    }

    public String getParameters() {
        return String.format("%s %s, %d год выпуска, сборка в %s, %s цвета, объем двигателя — %.1f л. %s %s %s Кол-во мест %d. Зимняя резина = %b"
                , brand, model, year, country, color, engineVolume, bodyType, transmissionType, registerNumber, seats, winterTiers);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public int getSeats() {
        return seats;
    }

    public String getKeyInformation() {
        return String.format("Удаленный запуск - %s, Бесключевой доступ - %s\n",
                key.keylessEntry ? "есть" : "нет",
                key.remoteEngineStart ? "есть" : "нет");
    }

    public boolean isWinterTiers() {
        return winterTiers;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public void setSeasonalTiers() {
        int month = LocalDate.now().getMonth().getValue();
        if (month > 4 && month < 10) {
            winterTiers = false;
        } else {
            winterTiers = true;
        }
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
