package DayOne;

import java.util.Collections;
import java.util.List;

import DayOne.shape.IShape;

public class SortCircleFirst extends ShapeCollection  {

    protected SortCircleFirst(List<IShape> items) {
        super(items);
    }

    @Override
    public List<IShape> sortShape(List<IShape> shapes) {
        Collections.sort(shapes, new SortbyType(new ISetOrder() {
            @Override
            public int setOrder(IShape shape) {
                switch (shape.type()) {
                    case CIRCLE:
                        return 0;
                    default:
                        return 1;
                }
            }
        }));
        
        return shapes;
    }

}

