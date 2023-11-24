
public class Lion implements Animals{
	private boolean gender;
	private double weight;
	public Lion(boolean gender) {
		this.gender = gender;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
    public void makeNoise() {
        System.out.println("Roar!");
    }
	@Override
	public String toString() {
		return "Lion" + (gender == true ? " " : "ess");
	}
	
}
