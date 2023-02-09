import java.util.ArrayList;

public class CarAgency implements Cloneable{

    private String name;
    private ArrayList<Car> carsAgency ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getCars() {
        return carsAgency;
    }

    public void setCars(ArrayList<Car> cars) {
        this.carsAgency = cars;
    }
    public void load(){
        for(int i=0;i<5;i++){
            Car car = new Car();
            car.setId(i);
            car.setModel("Car"+i);
            this.getCars().add(car);
        }
    }

    @Override
    public String toString() {
        return "CarAgency{" +
                "name='" + name + '\'' +
                ", cars=" + carsAgency +
                '}';
    }


    @Override
    protected CarAgency clone() throws CloneNotSupportedException {
        CarAgency carAgency2 = new CarAgency();
        for (Car car : carsAgency){
            carAgency2.getCars().add(car);
        }
        return  carAgency2;
    }
}
