import Transport.Bus;
import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Bus first = new Bus("One", "plus", 1995, "Russia", "Black", 150);
        Bus second = new Bus("Two", "minus", 2000, "Russia", "White", 170);
        Bus third = new Bus("Three", "m", 2005, "Kazakhstan", "purple", 201);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "Sedan", 4, 170);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8", 3.0, "black", 2020, "Germany", "Coupe", 2, 220);
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", "Coupe", 2, 240);
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4", 2.4, "red", 2018, "South Korea", "Crossover", 4, 200);
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea", "Sedan", 4, 220);
        System.out.println(hyundai);

        hyundai.setSeasonalTiers();
        hyundai.setTransmissionType("Automatic");
        hyundai.setRegisterNumber("A111AA121");
        System.out.println(hyundai.getParameters());
        hyundai.setKey(hyundai.new Key(true, false));
        System.out.println(hyundai.getKeyInformation());
    }
}
