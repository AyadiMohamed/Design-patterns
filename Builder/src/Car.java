//product class
public class Car {

    private String carBrand;
    private String enginType;
    private String carModel;
    private String buildDate;

    public Car(String carBrand,String enginType,String carModel,String buildDate) {
        this.carBrand = carBrand;
        this.enginType = enginType;
        this.carModel = carModel;
        this.buildDate = buildDate;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getEnginType() {
        return enginType;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getBuildDate() {
        return buildDate;
    }
    @Override
    public String toString(){
        return "Car Brand : "+getCarBrand()+" Engin Type : "+getEnginType()+" Car brand : "+getCarModel()+" Build Date :"+getBuildDate();
    }
}
