package parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String enterTime = "08:00";
        String exitTime = "09:00";
        SimpleDateFormat sdf =
                new SimpleDateFormat("HH:mm");
        //Exception 例外 vs Error 錯誤
        //Exception handling 例外處理
        Date d = null;
        try {
            d = sdf.parse(enterTime);
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        long a = 3*60*60*1000;
        try {
            Date d2 = sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms = d2.getTime() - d.getTime();
            System.out.println(ms);
            int minutes = (int)(ms/(1000*60));
            int hours = (minutes)/60;
            int times = Math.abs(minutes-hours*60);
            int price = 0;
            if(minutes < 15 ){
                if( hours == 0){
                    price = 30;
                }else {
                    price = (hours)*30;
                }
            }if( minutes >= 30 && minutes < 45){

            }
            else if(minutes >= 45 || (minutes >= 15 && minutes <30)){
                price = (hours+1)*30+15;
            }
            System.out.println(price);
            //不滿15分鐘不算錢
            //15-29分鐘，為半小時，收15元
            //30-44分，為半小時，收15元
        } catch (Exception e) {
            System.out.println("Exit wrong format");
        }
//        d2.setTime(d.getTime()+a);

    }
}
