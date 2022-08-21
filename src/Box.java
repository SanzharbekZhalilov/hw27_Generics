public class Box <T> {

    private T weight;
    private T length;
    private T width;
    private T height;

    public Box(T weight, T length, T width, T height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static <T> Box getBox() {
        Box box = new Box(10, 30, 20, 15);
        return box;
    }

}
