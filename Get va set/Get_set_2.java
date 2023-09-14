public class Get_set_2 {
    private int day;
    private int month;
    private int year;

    Get_set_2(int day, int month, int year){
        if(day >= 1 && day <= 31){
            this.day = day;
        }else{
            this.day = 0;
        }
        if(month >= 1 && month <= 12){
            this.month = month;
        }else{
            this.month = 0;

        }
        if(year >= 1){
            this.year = year; 
        }else{
            this.year = 0;

        }
    }

    public int getDay(){
        return this.day;
    }
    public void setDay(int d){
        if(d > 0 && d < 32){
            this.day = d;
        }
    }

    public int getMonth(){
        return this.month;
    }
    public void setMonth(int m){
        if(m >= 1 && m < 13){
            this.month = m;
        }    
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        if(y > 1){
            this.year = y;
        }
    }
}
