package work1;

public class DBtoXProduct extends FileChangeProduct{
    public DBtoXProduct(int tag) {
        super.tag=tag;
    }

    @Override
    public void Change() {
        System.out.println("实现数据库文件向XML文件的转换!");
    }
}
