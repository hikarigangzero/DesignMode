package work4;

import java.io.*;
import java.lang.annotation.Annotation;

public class DataChart implements Cloneable, Serializable {
    private DataSet dataSet;
    private int id;
    private String color;

    //浅克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //深克隆
    public DataChart deepClone() throws IOException, ClassNotFoundException{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bais);
        return (DataChart)ois.readObject();
    }

    public DataChart(DataSet dataSet, int id, String color) {
        this.dataSet = dataSet;
        this.id = id;
        this.color = color;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
