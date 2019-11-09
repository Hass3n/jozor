package sanetna.estabina.demo.gozor;

public class Data {

    String Title;
    String name;
    String time;
    int image;
    public  Data()
    {


    }
    public Data(String title, String name, String time, int image) {
        Title = title;
        this.name = name;
        this.time = time;
       this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
