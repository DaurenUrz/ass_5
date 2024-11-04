public class DataModel {
    private String data;

    public DataModel(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void appendData(String moreData) {
        this.data += " | " + moreData;
    }
}
