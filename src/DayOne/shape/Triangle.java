package DayOne.shape;

public class Triangle implements IShape {

    @Override
    public ShapeType type() {
        return ShapeType.TRIANGLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a TRIANGLE");
    }

}
