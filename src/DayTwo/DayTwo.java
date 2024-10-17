package DayTwo;

interface IMessage  {
    public String getMessageSold();
}

interface ISell {
    public void sell(Item item);
}

abstract class Item implements IMessage {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Car extends Item
{
    @Override
    public String getMessageSold() {
        return "Car " + name + " is sold.";
    }

}

class Tool extends Item
{
    @Override
    public String getMessageSold() {
        return "Tool " + name + " is sold.";
    }

}

class Tire extends Item
{
    @Override
    public String getMessageSold() {
        return "Tire " + name + " is sold.";
    }

}

class SaleMan implements ISell
{
    @Override
    public void sell(Item item) {
        System.out.println(item.getName() + " Sold!!");
        System.out.println(item.getMessageSold());
    }
    
}

public class DayTwo {
    public void executeDayTwo()
    {
        System.out.println("Day Two");

        Item car = new Car();
        car.setName("VinFast VF7");

        Item tool = new Tool();
        tool.setName("ToolName");

        Item tire = new Tire();
        tire.setName("TireName");

        ISell saleMan = new SaleMan();
        saleMan.sell(car);
        saleMan.sell(tool);
        saleMan.sell(tire);
    }
}
