public class Main {
    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer(new PcFactory("4GB","2.4GHZ"));
        Computer desktop = ComputerFactory.getComputer(new DesktopFactory("8GB","2.9 GHZ"));

        System.out.println(pc);
        System.out.println(desktop);
    }
}