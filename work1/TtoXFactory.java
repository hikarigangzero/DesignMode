package work1;

public class TtoXFactory implements ChangeFactory{
    @Override
    public FileChangeProduct Create(int tag) {
        return new TtoXProduct(tag);
    }

    public TtoXFactory() {

    }
}
