public class Desktop extends Computer {

    private String ram;
    private String cpu;

    public Desktop(String ram, String cpu)
    {
        this.ram= ram;
        this.cpu = cpu;

    }

    @Override
    public String getRam(){
        return this.ram;
    }

    @Override
    public String getCpu() {
        return null;
    }

    @Override
    public String toString() {
        return  "Desktop: "+super.toString();
    }
}
