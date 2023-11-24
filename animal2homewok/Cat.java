
public class Cat implements Animals, Comparable<Cat>{
	private String name;
	private int age;
	private String color;
	private double weight;
	public Cat() {		
	}
	public Cat(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public Cat(String name, int age, String color, double weight) {	
		this.name = name;
		this.age = age;
		this.color = color;
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
	@Override
	public String toString() {
		return "Cat " + name + " color "+ color+ " is " + age + " month";
	}
	public int compareTo(Cat o) {
		return(int)(this.getWeight()-o.getWeight());
	}
}


