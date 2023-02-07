//Builder interface
public class CarBuilder implements CarBuilderInterface {

    //mandatory args
    private String carBrand;
    private String enginType;
    //optional args
    private String carModel;
    private String buildDate;

    public CarBuilder(String carBrand,String enginType){
        this.carBrand = carBrand;
        this.enginType = enginType;
    }

    @Override
    public CarBuilder setCarBrand(String carBrand) {
        this.carBrand = carBrand;
        return this;
    }

    @Override
    public CarBuilder setEnginType(String enginType) {
        this.enginType = enginType;
        return this;
    }

    @Override
    public CarBuilder setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    @Override
    public CarBuilder setBuildDate(String buildDate) {
        this.buildDate = buildDate;
        return this;
    }

    public Car Build(){
        return new Car(carBrand,enginType,carModel,buildDate);
    }
}
