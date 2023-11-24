package shapeList;

public abstract class Shape {
	protected String color;
	public abstract double getArea();
	public abstract double getPerimeter();
	
	Shape(String color){
		this.color = color;
	}
	@Override // dùng để kế thừa từ phương thức của cha và phát triển
	public String toString() {
		return "Shape [color= " + color + "]";
	}
	
}
