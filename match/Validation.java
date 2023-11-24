package match;
public class Validation {
    public static boolean checkRealNumber(String input){
        String regex = "^-?+[0-9]+(?:\\.[0-9]+)?$";
        return input.matches(regex);
    }
    public static boolean checkIntNumber(String input){
        String regex = "^-?+[0-9]*$";
        return input.matches(regex);
    }

    // public static boolean checkABC123(String input){
    //     String regex = "[a-z]+[0-9]+";
    //     return input.matches(regex);
    // }
    public static boolean checkABC123(String input){
        String regex = "^[a-zA-Z]{2}[0-9]{3}$";
        return input.matches(regex);
    }

    public static boolean checkEmail(String input){
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9.]+$";
        return input.matches(regex);
    }

    public static boolean checkPhoneNum(String input){
        String regex = "^0[0-9]{9}$";
        return input.matches(regex);
    }

    public static boolean checkFormatDate(String input){
        String regex = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
        return input.matches(regex);
    }

    public static boolean checkStringNum(String input){
        String regex = "^[0-9]+$";
        return input.matches(regex);
    }
    public static boolean checkStringLecter(String input){
        String regex = "^[a-zA-Z]+$";
        return input.matches(regex);
    }
    public static boolean checkStringNumVSLecter(String input){
        String regex = "^[a-zA-Z0-9]+$";
        return input.matches(regex);
    }
}
