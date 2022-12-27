import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "Sedan", 4);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8", 3.0, "black", 2020, "Germany", "Coupe", 2);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", "Coupe", 2);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "red", 2018, "South Korea", "Crossover", 4);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "Sedan", 4);
        System.out.println(hyundai);

        System.out.println(hyundai.getParameters());
        hyundai.setSeasonalTiers();
        hyundai.setTransmissionType("Automatic");
        hyundai.setRegisterNumber("A111AA121");
        System.out.println(hyundai.getParameters());
        hyundai.setKey(hyundai.new Key(true, false));
        System.out.println(hyundai.getKeyInformation());
    }
}
