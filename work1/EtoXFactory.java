package work1;

public class EtoXFactory implements ChangeFactory{
    @Override
    public FileChangeProduct Create(int tag) {
        return new EtoXProduct(tag);
    }

    public EtoXFactory() {

    }
}
