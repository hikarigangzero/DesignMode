package work3;

public class TableBuilder extends Builder {
    @Override
    public void buildCPU() {
        component.setCPU("台式CPU");
    }

    @Override
    public void buildMemory() {
        component.setMemory("台式内存");
    }

    @Override
    public void buildDisk() {
        component.setDisk("台式硬盘");
    }

    @Override
    public void buildMainMachine() {
        component.setMainMachine("台式主机");
    }

    @Override
    public void buildDisplay() {
        component.setDisplay("台式显示屏");
    }

    @Override
    public Component createComponent() {
        return component;
    }

    @Override
    public boolean Visible() {
        return super.Visible();
    }
}
