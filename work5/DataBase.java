package work5;

public class DataBase {
    public static DataBase dataBase=new DataBase();

    private DataBaseObject[] dataBaseObject=new DataBaseObject[3];

    public DataBase() {
        for(int i=0;i<dataBaseObject.length;i++){
            dataBaseObject[i]=new DataBaseObject("数据库连接器"+(i+1));
        }
    }

    public void Connect(int id){
        this.Print(dataBaseObject[id-1].getData());
    }

    public void Print(String str){
        System.out.println("使用连接器"+str+"连接数据库成功");
    }
}
