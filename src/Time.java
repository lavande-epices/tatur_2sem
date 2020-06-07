public class Time {
    int hour;
    int minute;

    Time() {
        this.hour = hour;
        this.minute = minute;
    }

    void show() {
        System.out.println("Сейчас " + this.hour + ":" + this.minute);
    }

    boolean isDay() {
        if (this.hour >= 11 && this.hour < 18) {
        return true;
    }
        return false;
    }

    boolean isMorning() {
        if (this.hour > 4 && this.hour <= 10) {
            return true;
        }
        return false;
    }

    boolean isEvening() {
        if (this.hour >= 18 && this.hour < 21) {
        return true;
    }
        return false;
    }

    boolean isNight() {
        if (this.hour >= 21 || this.hour < 4){
        return true;
        }
        return false;
    }
    void sayHello(){
        if(isNight()){
            System.out.println("Добрая ночь");
        }
        if(isEvening()){
            System.out.println("Добрый вечер");
        }
        if (isMorning()){
            System.out.println("Доброе утро");
        }
        if (isDay()){
            System.out.println("Добрый день");
        }
    }
    void add(int i){
        int s = i + this.minute;
        if (s < 60){
            this.minute = s;
        }
        else {
           int m = (int) s / 60;
           this.minute = s - m*60;
           this.hour = this.hour + m;
        }
        System.out.println("сейчас " + this.hour + ":" + this.minute);
    }
}