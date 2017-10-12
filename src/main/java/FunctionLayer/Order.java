
package FunctionLayer;


public class Order {
    
    private int userid;
    private int length;
    private int width;
    private int height;
    private String date;
    

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" + "userid=" + userid + ", length=" + length + ", width=" + width + ", height=" + height + ", date=" + date + '}';
    }
    
    
    
}
