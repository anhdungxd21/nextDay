import java.util.Arrays;
import java.util.List;

public class CalculationNextDay {
    private int day;
    private int month;
    private int year;

    public CalculationNextDay() {
        day = 1;
        month = 1;
        year = 1;
    }

    public CalculationNextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int[] nextDay(){
        int[] array = {day,month,year};
        if(this.day >= 1 && this.day <=27){
            array[0] = this.day + 1;
        }else if(this.day == 28){
            if(isFebruary()){
                if (isLeapYear(this.year)){
                    array[0] = this.day +1;
                }else {
                    array[0] = 1;
                    array[1] = 3;
                }
            }
        }else if(this.day == 29){
            if(isFebruary()){
                array[0] = 1;
                array[1] = 3;
            }else {
                array[0] = this.day + 1;
            }
        }else if(this.day == 30){
            if(isThirtyDay()){
                array[0] = 1;
                array[1] = this.month + 1;
            }
        }else {
            if(this.month == 12){
                array[0] = 1;
                array[1] = 1;
                array[2] = this.year +1;
            }else{
                array[0] = 1;
                array[1] = this.month + 1;
            }
        }

        return array;
    }
    public boolean isFebruary(){
        if (this.month == 2){
            return true;
        }
        return false;
    }

    public boolean isThirtyDay(){
        int containOf = 0;
        int[] monthWith30Day = {4,6,9,11};
        for (int i = 0; i < monthWith30Day.length; i++) {
            if (this.month == monthWith30Day[i]){
                containOf = 1;
            }
        }
        if(containOf != 0){
            return true;
        }else {
            return false;
        }

    }

    public boolean isLeapYear(int year) {
        boolean isDivideByFour = year % 4 == 0;
        boolean isDivideBy100 = year % 100 == 0;
        boolean isDivideBy400 = year % 400 == 0;
        if (isDivideBy400){
            return true;
        }
        if (isDivideByFour && !isDivideBy100){
            return true;
        }
        return false;
    }
}
