package itemManager.GUI;

import java.util.Scanner;

import itemManager.DTO.Item;
import itemManager.DTO.Painting;
import itemManager.DTO.Statue;
import itemManager.DTO.Vase;

public class AntiqueShop {
    public static void main(String[] args) {
        Item item = null;
        String[] option = {"Create a Vase: ", "Create a Statue: ", "Create a Painting: ", "Display the Item: ", "0. out!.", "Input a choice: "};
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{

            Menu op = new Menu();
            choice = op.getChoice(option);
            // System.out.println("1. Create a Vase: ");
            // System.out.println("2. Create a Statue: ");
            // System.out.println("3. Create a Painting: ");
            // System.out.println("4. Display the Item: ");
            // System.out.println("0. out!.");
            // System.out.print("Input a choice: ");
            // choice = sc.nextInt(); 

            switch(choice){
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();            
                    break;
                case 3: 
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
             /*
((Vase)item).outputVase(); là một câu lệnh downcast. Downcast là một kỹ thuật ép kiểu một biến từ kiểu cha sang kiểu con. Trong trường hợp này, biến item có kiểu Item, và chúng ta đang ép kiểu nó sang kiểu Vase.

Chúng ta cần ép kiểu biến item sang kiểu Vase vì phương thức outputVase() chỉ có thể được gọi trên các đối tượng của lớp Vase (hoặc các lớp con của lớp Vase).

Để ép kiểu một biến từ kiểu cha sang kiểu con, chúng ta cần sử dụng toán tử instanceof. Toán tử instanceof kiểm tra xem một biến có phải là một thể hiện của một lớp cụ thể hay không.
              * 
              */
                
                    if(item instanceof Vase){
                        ((Vase)item).outputVase();
                    }else if(item instanceof Statue){
                        ((Statue)item).outputStatue();
                    }else if(item instanceof Painting){
                        ((Painting)item).outputPainting();
                    }else{
                        System.out.println("Not any Item!");
                        System.out.println("Exit!");
                        choice = 0;
                    }
                    }
                   
        }while(choice != 0);
            

        
}
}