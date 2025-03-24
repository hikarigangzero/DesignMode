package work3;

public abstract class Builder {
    protected Component component=new Component();

    public abstract void buildCPU();
    public abstract void buildMemory();
    public abstract void buildDisk();
    public abstract void buildMainMachine();
    public abstract void buildDisplay();
    public abstract Component createComponent();
    public boolean Visible(){
        return true;
    }
}
