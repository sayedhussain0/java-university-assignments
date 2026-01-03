public class RoomCarpet {
    private String name;
    private double length;
    private double width;
    private double cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getarea(){
        return this.length*this.width;
    }

    public double getTotalCost(){
        return getarea()*this.cost;
    }

    public void printAll(){
        System.out.println("Name: "+name);
        System.out.println("Length: "+length);
        System.out.println("Width: "+width);
        System.out.println("cost: "+cost);
        System.out.println("Area: "+getarea());
        System.out.println("Total cost: "+getTotalCost());
    }



}
