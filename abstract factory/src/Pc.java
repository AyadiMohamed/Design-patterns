public class Pc extends Computer {

    private String ram;
    private String cpu;

    public Pc(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Pc : "+super.toString();
    }
}
