package sanetna.estabina.demo.gozor;

public class DataItem {

    String name;
    String loaction;
    String phone;
    String amount;

    public DataItem(String name, String loaction, String phone) {
        this.name = name;
        this.loaction = loaction;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaction() {
        return loaction;
    }

    public void setLoaction(String loaction) {
        this.loaction = loaction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
