package work2;

public class Client {
    public static void main(String[] args) {
        ControlFactory controlFactory=new WindowsFactory();
        ControlFactory controlFactory1=new LinuxFactory();
        controlFactory.createUIProduct().control("111");
        controlFactory.reateOperaterProduct().control("111");
        controlFactory1.createUIProduct().control("222");
        controlFactory1.reateOperaterProduct().control("222");
    }
}
