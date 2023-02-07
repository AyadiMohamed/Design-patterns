public class Main {
    public static void main(String[] args) {

        Car car = new CarBuilder("Audi","8 cilender").setCarModel("R8").Build();
        System.out.println(car.toString());
    }
}