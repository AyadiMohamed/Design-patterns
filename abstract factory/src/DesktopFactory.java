public class DesktopFactory implements ComputerAbstarctFactory{

    private String ram;
    private String cpu;

    public DesktopFactory(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public Computer creatComputer() {
        return new Desktop(this.ram,this.cpu);
    }
}
