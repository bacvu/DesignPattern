package DayOne.shape;

public class Rectangle implements IShape {

    @Override
    public ShapeType type() {
        return ShapeType.RECTANGLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }

}
