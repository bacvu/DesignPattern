package DayOne;

import java.util.Comparator;

public class SortbyType implements Comparator<IShape>
{ 
    public SortbyType(ISetOrder setOrder) {
        this.setOrder = setOrder;
    }

    ISetOrder setOrder;
    
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(IShape shape1, IShape shape2) 
    { 
        return Integer.compare(setOrder.setOrder(shape1), setOrder.setOrder(shape2));
    }
}
