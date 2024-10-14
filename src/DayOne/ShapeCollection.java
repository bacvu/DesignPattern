package DayOne;

import java.util.List;

import DayOne.shape.IShape;

public abstract class ShapeCollection {
    List<IShape> items;

    protected ShapeCollection(List<IShape> items) {
        this.items = items;
    }

    public abstract List<IShape> sortShape(List<IShape> shapes);

    public void drawAllShape()
    {
        for (IShape shape : sortShape(items)) {
            shape.draw();
        }
    }
}
