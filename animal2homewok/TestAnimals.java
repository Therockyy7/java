import java.util.Comparator;

public class TestAnimals {
	public static void main(String[] args) {
		
	Cat a = new Cat("ChiChi", 3, "black");
	System.out.println(a.toString());
	a.makeNoise();
	Lion b = new Lion(false);
	System.out.println(b.toString());
	b.makeNoise();
	a.setWeight(3.8);
	Cat c = new Cat("MiuMiu", 4, "Yellow", 5.4);
	if(c.compareTo(a) > 0) {
		System.out.println(c.toString() + " heavier than " + a.toString());
	}
	Animals mySheep = new Animals() {
		
		@Override
		public void makeNoise() {
			System.out.println("Beeeeeeeeeeeee!!");
		}
	};
	mySheep.makeNoise();
	
	b.setWeight(250);
	
	b = new Lion(false);
	System.out.println(b.toString());
	b.makeNoise();
	b.setWeight(200);
	Lion d = new Lion(true);
	d.setWeight(250);
	
	Comparator<Lion> c1 = new Comparator<Lion>() {
		
		@Override
		public int compare(Lion o1, Lion o2) {
			return (o1.getWeight() > o2.getWeight() ? 1 : o1.getWeight() < o2.getWeight() ? -1 : 0);
		}
	};
	
	if(c1.compare(b, d)>0) {
		System.out.println(b.toString() + " heavier than " + d.toString());
	}else if(c1.compare(b, d)<0) {
		System.out.println(d.toString() + " heavier than " + b.toString());
	}else System.out.println(b.toString() + " equal to " + d.toString());
	
	Dog dog1 = new Dog(2, 10);
	Dog.HusKy hus1 = dog1.new HusKy("Black");
	System.out.println("Stand for cool :"+hus1.standForCool());

	}
}
