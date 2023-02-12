public class PcFactory implements ComputerAbstarctFactory{

    private String ram;
    private String cpu;

    public PcFactory(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public Computer creatComputer(){
        return new Pc(this.ram,this.cpu);
    }
}
