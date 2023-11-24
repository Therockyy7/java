package shapeList;

public class DrawShape <T extends Shape>{ //Chi chap nhan kieu du lieu T la con cua Shape
    public void draw (T t){
        System.out.println("draw a "+ t.toString());
    }
    
}
