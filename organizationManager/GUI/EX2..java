// ***What is stored in the static heap, stack, dynamic heap?

// -static heap
// +size
// +df2.createWorker();
// +System.out.println(df2);
// +df.createWorker();
// +System.out.println(df);
// +obj2.educate();
// +obj2.enroll();
// +System.out.println(obj2);
// +obj1.reproduce();
// +obj1.grow();
// +System.out.println(obj1);

// -stack
// +String place
// +String name
// +String type
// +String address
// + Organization ()
// + Organization (String)
// + setSize(int):void
// + communicateByTool(): void, abstract
// + toString():String
// + Colony ()
// + Colony (int, String)
// + communicateByTool(): void
// + grow():void
// + reproduce():void
// + toString():String
// + University ()
// + University (int, String)
// + communicateByToTool(): void
// + enroll():void
// + educate(): void
// + BeeColony ()
// + BeeColony (int, String, String)
// + FPTUniversity ()
// + FPTUniversity (int, String, String)

// -Dynamic heap
// +FPTUniversity df2 = new FPTUniversity(100000, "FPT", "Hanoi");
// +BeeCology df = new BeeCology(3000, "wasp", "land");
// +University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
// +Colony obj1 = new BeeCology(2000, "honey", "land");


// ***Why the Organization class is abstract?
// - because the Organization class is used for Colony and University extend, and they will you many function in Organization also override the abstract method

// ***Why must the Colony/University class implement the communicateBytool() method?
// - because the communicateByTool() method is the abstract method in a abstract class, so we need to override it.

// ***You explain the polymorphism feature in your code?
// -University obj2 = new FPTUniversity(100000, "FPT", "Cantho");
// -Colony obj1 = new BeeCology(2000, "honey", "land");

// I used University obj2 = new FPTUniversity instead of FPTUniversity obj2 = new FPTUniversity, this is because FPTUniversity and BeeCology is a subclass of University and Colony,
//  so a FPTUniversity and BeeCology object is also a University and Colony object

// ***Describe the difference between an interface and an abstract class
// Feature	    |Interface	                                                                                                                |                Abstract class							
// Definition	|A blueprint for a class that defines the methods that the class must implement, but not how the methods are implemented.	|A blueprint for a class that defines the methods that the class must implement, as well as some of the code for those methods.							
// Methods	    |All methods are abstract.	All abstract methods must be implemented by subclasses.                                         |Concrete methods can also be defined.							
// Fields	    |Fields can be declared, but they must be public, static, and final.	                                                    |Fields can be declared, and they can be public, protected, or private.							
// Inheritance	|Interfaces can be extended by multiple classes.	                                                                        |Abstract classes can be extended by a single class.							