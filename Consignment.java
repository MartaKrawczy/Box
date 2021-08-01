package Box;


public class Consignment {
    private int width;
    private int height;
    private int deep;
    private int weight;

    public Consignment(int width, int height, int deep, int weight) {
        this.width = width;
        this.height = height;
        this.deep = deep;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
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

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDeep(int deep) {
        this.deep = deep;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
