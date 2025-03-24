package work3;

public class ServiceBuilder extends Builder {
    @Override
    public void buildCPU() {
        component.setCPU("服务器CPU");
    }

    @Override
    public void buildMemory() {
        component.setMemory("服务器内存");
    }

    @Override
    public void buildDisk() {
        component.setDisk("服务器硬盘");
    }

    @Override
    public void buildMainMachine() {
        component.setMainMachine("服务器主机");
    }

    @Override
    @Deprecated
    public void buildDisplay() {
        component.setDisplay("服务器显示屏");
    }

    @Override
    public Component createComponent() {
        return component;
    }

    @Override
    public boolean Visible() {
        return !super.Visible();
    }
}
