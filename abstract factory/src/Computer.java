abstract public class Computer {

    public abstract String getRam();
    public abstract String getCpu();

    @Override
    public String toString(){
        return "Ram = "+this.getRam()+" ,Cpu = "+this.getCpu();
    }

}
