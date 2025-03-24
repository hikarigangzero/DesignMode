package work2;

public class WindowsFactory implements ControlFactory{
    @Override
    public ControlProduct createUIProduct() {
        return new UIControlProduct();
    }

    @Override
    public ControlProduct reateOperaterProduct() {
        return new OperatorControlProduct();
    }
}
