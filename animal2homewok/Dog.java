
public class Dog implements Animals{
	private int age;
	private String color;
	private double weight;
	
	public Dog(int age, double weight) {
		this.age = age;
		this.weight = weight;
	}

	
	public Dog(int age, String color) {
		this.age = age;
		this.color = color;
	}
	public Dog(int age, String color, double weight) {	
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
	public void makeNoise() {
        System.out.println("Go Go!");
    }
	@Override
	public String toString() {
		return "Dog color "+ color+ " is " + age + " month";
	}

	public void eat(){
		class TypeOfood{
			String food = "whatever";
			void foodToEat(){
				System.out.println("Ăn: "+ food);
			}
		}
		TypeOfood et = new TypeOfood();
		et.foodToEat();
	}

	public class HusKy{
		 public String color;
		 public HusKy(String color){
			this.color = color;
		 }
		 boolean standForCool(){
			return true;
		 }
	}
}
