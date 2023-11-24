// **What is stored in the static heap, stack, dynamic heap?
// -static heap:
// +value, creator
// +((Painting)item).inputPainting();
// +((Statue)item).inputStatue();            
// +((Vase)item).inputVase();
// +Item item = null;

// -Stack:
// +height,material.
// +weight,colour.
// +height, width, isWatercolour, isFramed.
// +Vase()
// +Vase(int, String, int, String)
// +outputVase():void
// +InputVase(): void
// +Statue()
// +Statue(int, String, int, String)
// +outputStatue():void
// +inputStatue():void
// +Painting()
// +Painting(int, String, int, int,
// boolean, boolean )
// +outputPaiting():void
// +inputPainting():void

// -Dynamic heap
// + item = new Painting();
// +item = new Statue();
// +item = new Vase();
// +Menu op = new Menu();

// **What are objects in the program?
// -Objects in the program are Vase,Statue,Painting.

// **What is the item variable storing?
// - The item variable is a abstract class name Item, it has input and output function to other class override that.

// **Why must you cast to call the method inputVase()/outputVase()?
// -  the inputVase and outputVase is the method separation of subfunctions so if we want to use that method we need to call by its name.

// **What is the error thrown when you cast it wrong?
// -When we cast it wrong, it's can thrown ClassCastException such as we have Item is the abstract class so we can not use Item item = new Item.

// **- What methods can you call if you don’t cast the item variable?
// -If we don't cast the item variable, you can only call methods that are defined in the Item class. This is because the compiler knows that the item variable can contain any object of type Item or a subclass of Item.