public class ComputerFactory {

    public static Computer getComputer(ComputerAbstarctFactory factory){
        return factory.creatComputer();
    }
}
