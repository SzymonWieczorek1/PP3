public class Clock
{
    int hour;
    int minute;
    int alarmH;
    int alarmM;
    Clock(){
    this.hour=0;
    this.minute=0;
    }
    
    void setAlarm(int alarmM, int alarmH){
    this.alarmM=alarmM;
    this.alarmH=alarmH;
    }
    
    void runAlarm(){
    System.out.println("beep-beep-beep-beep !!");
    }
    
    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        if(minute>59){
        System.out.println("Range from 0 to 59");
        this.minute=0;
        }
        if(hour>23){
        System.out.println("Range from 0 to 23");
        this.hour=0;
        }
    }
    
    void displayTime(){
         System.out.println("Current Time: " + hour + " " + minute);
    }
    void addOneMinute(){
        minute = minute+1;
        if(minute>59){
        minute=0;
        hour+=1;
        }
        if(hour>23){
        hour=0;
        }
        
        if(hour == alarmH && minute == alarmM){
        runAlarm();
        }
    }
    
    }