package DayOne.shape;

import DayOne.IShape;

public class Rectangle implements IShape {

    @Override
    public Shape type() {
        return Shape.RECTANGLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }

}
