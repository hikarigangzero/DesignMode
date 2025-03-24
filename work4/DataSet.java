package work4;

import java.io.Serializable;

public class DataSet implements Serializable {
    private String dataflolw;

    public DataSet(String dataflolw) {
        this.dataflolw = dataflolw;
    }

    public String getDataflolw() {
        return dataflolw;
    }

    public void setDataflolw(String dataflolw) {
        this.dataflolw = dataflolw;
    }
}
