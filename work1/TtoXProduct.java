package work1;

public class TtoXProduct extends FileChangeProduct{
    public TtoXProduct(int tag) {
        super.tag=tag;
    }

    @Override
    public void Change() {
        System.out.println("实现TXT文件向XML文件的转换!");
    }
}
