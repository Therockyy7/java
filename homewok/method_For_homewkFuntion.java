package homewok;
import java.util.ArrayList;

public class method_For_homewkFuntion {
    
    public int sum(int a[]){
        int sum = 0;
        for(int out : a){
            sum += out; 
        }
        return sum;
    }

    public int sum(ArrayList<Integer> arrlist){
        int sum = 0;
        for(int out : arrlist){
            sum += out;
        }
        return sum;
    }

    public int sum(int arr[][]){
        int count = 0;
        int sum = 0;
        int i = 0;
        
        do{
            sum = sum + arr[i][arr[i].length - 1];
            i++;
            count++;
        }while(count != arr.length);
        return sum;
    }

    public void setAllZero(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = 0;
        }
        for(int out : a){
            System.out.print(out + " ");
        }
    }

    public int maxNumn(int a[]){
        int  max = a[0];
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }
    public int minNum(int a[]){
        int min = a[0];
        for(int out : a){
            if(out < min){
                min = out;
            }
        }
        return min;
    }

    public void differenceOfMax_Min(int a[]){
        int max = maxNumn(a);
        int min = minNum(a);
        int fact = max - min;
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);
        System.out.println("Max is larger than Min: "+ fact);
    }

    public int odd(int a[]){
        int sum = 0;
        for(int out : a){
            if(out % 2 != 0){
                sum += out;
            }
        }
        return sum;
    }
    public boolean check_Hello(String str[]){
        String trueStr[] = {"Hello", "hello"};
        for(String out : str){
            if(out.equalsIgnoreCase("Hello")){
                return true;
            }
        }
        return false;        
    }
    public void reverselist(char a[]){
      for(int i = a.length - 1; i >= 0; i--){
        System.out.print(a[i]);
      }

    }
    
    public String oddEven(ArrayList<String> list){
        if(list.size() % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public int numberOfRow(double list[][]){
        return list.length;
    }

    
}
