package DayOne.shape;

public class Circle implements IShape {

    @Override
    public ShapeType type() {
        return ShapeType.CIRCLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }

}
