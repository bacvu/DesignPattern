package DayOne.shape;

import DayOne.IShape;

public class Triangle implements IShape {

    @Override
    public Shape type() {
        return Shape.TRIANGLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a TRIANGLE");
    }

}
