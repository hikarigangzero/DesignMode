package work4;

import java.io.IOException;

public class Client {
    public static void main(String[] args){
        DataSet dataSet=new DataSet("zzzzzzzzzzzzzzzzz");
        DataChart dataChart=new DataChart(dataSet,1,"pink");
        
        DataChart dataChart1,dataChart2;
        try {
            dataChart1= (DataChart) dataChart.clone();
            dataChart2=dataChart.deepClone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(dataChart.getDataSet()+" "+dataChart.getId()+" "+dataChart.getColor());
        System.out.println(dataChart1.getDataSet()+" "+dataChart1.getId()+" "+dataChart1.getColor());
        System.out.println(dataChart2.getDataSet()+" "+dataChart2.getId()+" "+dataChart2.getColor());
    }
}
