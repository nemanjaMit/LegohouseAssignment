package FunctionLayer;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int length;
    private int width;
    private int height;
    
    private int totalBrickFourLength;
    private int totalBrickTwoLength;
    private int totalBrickOneLength;
    
    private int totalBrickFourWidth;
    private int totalBrickTwoWidth;
    private int totalBrickOneWidth;
    
    private int totalHeightBrickFour;
    private int totalHeightBrickTwo;
    private int totalHeightBrickOne;
    
    private int totalBricks;

    public House(){}

    public House(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        
        this.totalBricks = build(length, width, height);
    }
    
    private int build(int length, int width, int height) {
        int lengthBrickFour = length / 4;
        int lengthBrickTwo = (length % 4) / 2;
        int lengthBrickOne = (length % 2);

        width = width - 4; 
        int widthBrickFour = width / 4;
        int widthBrickTwo = (width % 4) / 2;
        int widthBrickOne = (width % 2);
        
        setTotalBrickFourLength(lengthBrickFour); setTotalBrickTwoLength(lengthBrickTwo); setTotalBrickOneLength(lengthBrickOne); 
        setTotalBrickFourWidth(widthBrickFour);   setTotalBrickTwoWidth(widthBrickTwo);   setTotalBrickOneWidth(widthBrickOne);
        
        setTotalHeightBrickFour( ((getTotalBrickFourLength() * 2) + (getTotalBrickFourWidth() * 2)) * height );
        setTotalHeightBrickTwo( ((getTotalBrickTwoLength() * 2) + (getTotalBrickTwoWidth() * 2)) * height );
        setTotalHeightBrickOne( ((getTotalBrickOneLength() * 2) + (getTotalBrickOneWidth() * 2)) * height );
        
        List<Integer> brickList = new ArrayList<>();
        brickList.add(lengthBrickFour); brickList.add(lengthBrickTwo); brickList.add(lengthBrickOne);
        brickList.add(widthBrickFour);  brickList.add(widthBrickTwo);  brickList.add(widthBrickOne);
        
        int brickCounter = 0;
        
        for (int brick : brickList) {
            brickCounter += brick * height * 2;
        }
        
        return brickCounter;
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

    public int getTotalBrickFourLength() {
        return totalBrickFourLength;
    }

    public void setTotalBrickFourLength(int totalBrickFourLength) {
        this.totalBrickFourLength = totalBrickFourLength;
    }

    public int getTotalBrickTwoLength() {
        return totalBrickTwoLength;
    }

    public void setTotalBrickTwoLength(int totalBrickTwoLength) {
        this.totalBrickTwoLength = totalBrickTwoLength;
    }

    public int getTotalBrickOneLength() {
        return totalBrickOneLength;
    }

    public void setTotalBrickOneLength(int totalBrickOneLength) {
        this.totalBrickOneLength = totalBrickOneLength;
    }

    public int getTotalBrickFourWidth() {
        return totalBrickFourWidth;
    }

    public void setTotalBrickFourWidth(int totalBrickFourWidth) {
        this.totalBrickFourWidth = totalBrickFourWidth;
    }

    public int getTotalBrickTwoWidth() {
        return totalBrickTwoWidth;
    }

    public void setTotalBrickTwoWidth(int totalBrickTwoWidth) {
        this.totalBrickTwoWidth = totalBrickTwoWidth;
    }

    public int getTotalBrickOneWidth() {
        return totalBrickOneWidth;
    }

    public void setTotalBrickOneWidth(int totalBrickOneWidth) {
        this.totalBrickOneWidth = totalBrickOneWidth;
    }

    public int getTotalHeightBrickFour() {
        return totalHeightBrickFour;
    }

    public void setTotalHeightBrickFour(int totalHeightBrickFour) {
        this.totalHeightBrickFour = totalHeightBrickFour;
    }

    public int getTotalHeightBrickTwo() {
        return totalHeightBrickTwo;
    }

    public void setTotalHeightBrickTwo(int totalHeightBrickTwo) {
        this.totalHeightBrickTwo = totalHeightBrickTwo;
    }

    public int getTotalHeightBrickOne() {
        return totalHeightBrickOne;
    }

    public void setTotalHeightBrickOne(int totalHeightBrickOne) {
        this.totalHeightBrickOne = totalHeightBrickOne;
    }    
   
    public int getTotalBricks() {
        return totalBricks;
    }

    public void setTotalBricks(int totalBricks) {
        this.totalBricks = totalBricks;
    }
}