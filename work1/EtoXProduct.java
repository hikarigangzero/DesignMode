package work1;

public class EtoXProduct extends FileChangeProduct{
    public EtoXProduct(int tag) {
        super.tag=tag;
    }

    @Override
    public void Change() {
        System.out.println("实现EXCEL文件向XML文件的转换!");
    }
}
