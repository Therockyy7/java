package shapeList;

public class Retangle extends Shape{
	private double a, b;
    
    public Retangle(double a, double b, String color){
        super(color);
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString(){
        return super.toString() + "Retangle with Per " + getPerimeter() + "and Area " + getArea();
    }
    @Override
    public double getArea() {
    	return a*b;
    }
    @Override
    public double getPerimeter() {
    	return (a+b)*2;
    }
}
