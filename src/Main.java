public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
        Car lada1 = new Car("Lada", null, -5, null, -5, "Russia");
        System.out.println(lada);
        System.out.println(lada1);
        Car audi = new Car("Audi", "A8", 3.0, "black", 2020, "Germany");
        System.out.println(audi);
    }
}
