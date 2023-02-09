public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        CarAgency carAgency = new CarAgency();
        carAgency.setName("Agency1");
        carAgency.load();


        CarAgency carAgency2 = carAgency.clone();
        System.out.println(carAgency.toString());
        System.out.println(carAgency2.toString());
    }
}