package work3;

public class Director {
    public Component createComputer(Builder builder){
        builder.buildCPU();
        builder.buildMemory();
        builder.buildDisk();
        builder.buildMainMachine();
        if(builder.Visible()){
            builder.buildDisplay();
        }
        else {
            //无操作
        }
        return builder.createComponent();
    }
}
