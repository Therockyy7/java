package billManeger;

public class MyException extends Exception{
    // Ngoại lệ nhận vào một thông điệp
    public MyException(String msg){
        super(msg);
    }   
    
    // Ngoại lệ nhận vào một thông điệp và 1 ngoại lệ gây ra ngoại lệ này
    public MyException(String msg, Throwable cause){
        super(msg, cause);
    }
}
