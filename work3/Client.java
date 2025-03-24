package work3;

public class Client {
    public static void main(String[] args) {
        Component component1 = new Component();
        Component component2 = new Component();

        Builder builder1,builder2;
        builder1=new TableBuilder();
        builder2=new ServiceBuilder();

        Director director=new Director();

        component1=director.createComputer(builder1);
        component2=director.createComputer(builder2);

        System.out.println("电脑1:"+component1.getCPU()+" "+component1.getMemory()
        +" "+component1.getDisk()+" "+component1.getMainMachine()+" "+component1.getDisplay());
        System.out.println("电脑2:"+component2.getCPU()+" "+component2.getMemory()
        +" "+component2.getDisk()+" "+component2.getMainMachine()+" "+component2.getDisplay());
    }
}
