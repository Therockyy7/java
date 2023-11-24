package shapeList;

public class Square extends Shape{
    private double a;
    
    public Square(double a, String color){
        super(color);
        this.a = a;
    }
    @Override
    public String toString(){
        return super.toString() + "Square with Per " + getPerimeter() + " and Area " + getArea();
    }
    @Override
    public double getArea() {
    	return a*a;
    }
    @Override
    public double getPerimeter() {
    	return a*4;
    }
}
