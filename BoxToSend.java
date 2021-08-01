package Box;

import java.math.BigDecimal;

public class BoxToSend {
    private int widthA = 80;
    private int widthB = 190;
    private int widthC = 410;
    private int height = 380;
    private int deep = 640;
    private int weight = 25;

    private BigDecimal priceA = BigDecimal.valueOf(12.99);
    private BigDecimal priceB = BigDecimal.valueOf(13.99);
    private BigDecimal priceC = BigDecimal.valueOf(15.49);


    public BigDecimal getPriceA() {
        return priceA;
    }

    public BigDecimal getPriceB() {
        return priceB;
    }


    public BigDecimal getPriceC() {
        return priceC;
    }


    public int getWidthA() {
        return widthA;
    }


    public int getWidthB() {
        return widthB;
    }


    public int getWidthC() {
        return widthC;
    }


    public int getHeight() {
        return height;
    }


    public int getDeep() {
        return deep;
    }


    public int getWeight() {
        return weight;
    }

}
