package DayOne;

import java.util.ArrayList;
import java.util.List;

import DayOne.shape.Circle;
import DayOne.shape.Rectangle;
import DayOne.shape.Triangle;

public class Dayone {

    public void executeDayOne()
    {
        IShape shape1 = new Rectangle();
        IShape shape2 = new Circle();
        IShape shape3 = new Triangle();
        IShape shape4 = new Circle();

        List<IShape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        shapes.add(shape4);

        SortCircleFirst circleFirst = new SortCircleFirst(shapes);
        circleFirst.drawAllShape();
    }
}
