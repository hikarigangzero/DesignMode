package work1;

public class DBtoXFactory implements ChangeFactory{
    @Override
    public FileChangeProduct Create(int tag) {
        return new DBtoXProduct(tag);
    }

    public DBtoXFactory() {

    }
}
