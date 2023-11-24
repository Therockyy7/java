package fraction;


public class fruction {
    private int nominator;
    private int denominator;
    public fruction(){}


    
    public fruction(int nome, int deno){
        this.nominator = nome;
        if(deno != 0){

            this.denominator = deno;
        }
        else {this.denominator = 1;}
        
    }
    public void setDenominator(int denominator) {
        if(denominator != 0){
            this.denominator = denominator;
        }else{
            this.denominator = 1;
        }
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNominator(int nominator) {
        if(nominator != 0){

            this.nominator = nominator;
        }else{
            this.nominator = 1;
        }
    }
    public int getNominator() {
        return nominator;
    }

    static int gcd (int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }

    String view(){
        String s = nominator + " / " + denominator;
        return s;
    }

    fruction simpity(){
        int a = gcd(nominator, denominator);
        this.nominator = nominator / a;
        this.denominator = denominator / a;
        return this;
    }
//     public static void main(String[] args) {
//         fruction f1 = new fruction(4, 8);
//         System.out.println("Before: "+ f1.view());
//         System.out.println("After: "+ f1.simpity().view());

//  }


    
}
