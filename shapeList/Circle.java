package shapeList;

public class Circle extends Shape{
	private double r;
	final double Pi = 3.14;
	
	public Circle(double r, String color){
        super(color);
        this.r = r;
    }
	@Override
	public String toString(){
	        return super.toString() + "Circle with Per " + getPerimeter() + "and Area " + getArea();
	}
	@Override
	public double getArea() {
	    return Pi*r*r;
	}
	@Override
	public double getPerimeter() {
	    return 2*r*Pi;
	}
}
