package DayOne.shape;

import DayOne.IShape;

public class Circle implements IShape {

    @Override
    public Shape type() {
        return Shape.CIRCLE;
    }

    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }

}
