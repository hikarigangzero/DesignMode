package work1;

public class Client {
    public static void main(String[] args) {
        ChangeFactory changeFactory;
        changeFactory=new DBtoXFactory();
        FileChangeProduct product;
        product=changeFactory.Create(1);
        product.Change();
    }
}
