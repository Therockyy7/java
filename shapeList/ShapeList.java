package shapeList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ShapeList {
    ArrayList<Shape> arr= new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    

    public void input() {
    	
        int choice;
        do {
        	System.out.println("-----------MENU-----------");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Retangle");
			System.out.println("0. Exit");
			System.out.print("Enter choice: "); choice = sc.nextInt();
			System.out.println();
            switch (choice) {
                case 1:
                    System.out.println("Enter r, color");
                    Circle circle = new Circle(sc.nextDouble(), sc.next().trim());
                    arr.add(circle);
                    break;
                case 2:
                    System.out.println("Enter x, color");
                    Square square = new Square(sc.nextDouble(), sc.next().trim());
                    arr.add(square);
                    break;
                case 3:
                    System.out.println("Enter high, weight, color");
                    Retangle retangle = new Retangle(sc.nextDouble(), sc.nextDouble(), sc.next().trim());
                    arr.add(retangle);
                    break;
                // case 4:
                //     sys
                default:
                    System.out.println("Exit");
            }
        } while (choice != 0);
    }

    public void output() {
        for (Shape shape : arr) {
            System.out.println(shape);
        }
    }

    public void sort() {
//    	Comparator<Shape> c= (o1, o2) -> {
//			return (o1.getArea()>o2.getArea()?1:o1.getArea()>o2.getArea()?-1:0);
//		};
////		Collections.sort(arr, (o1, o2) -> {
////			return (o1.getArea()>o2.getArea()?-1:o1.getArea()>o2.getArea()?1:0)
////		});
        Comparator<Shape> c = Comparator.comparingDouble(Shape::getArea);
//        Comparator<Shape> c = Comparator.comparingDouble(Shape::getArea).reversed();
//        de sort tu max den min
        Collections.sort(arr, c);
    }
    
    public List<Shape> listSameColor (String color){
        Predicate<Shape> sameColor = s -> s.color.equalsIgnoreCase(color);      
// -> lamdaexpresstion. s la tham so dau vao.Predicate la mot phuong thuc test so sanh cai sameCOlor la cai minh dat ten va tra ve true hoac false
        List<Shape> sColList = arr.stream().filter(sameColor).collect(Collectors.toList());
        return sColList;
    }

    public static void main(String[] args) {
        ShapeList sl = new ShapeList();
        sl.input();
        
        sl.sort();
        sl.output();
        
        DrawShape<Circle> s = new DrawShape<Circle>();
        
        Circle c = new Circle(5.5,"red");
        s.draw(c);
        //        Kiểu dữ liệu trở thành tham số
        Square sq = new Square(10,"blue");
       
        // System.out.println("Predicate: ");
        
//        tìm hình trong shapelist có giá trị Area >= Giá trị 
        
        System.out.println(sl.listSameColor("red"));
    }
}