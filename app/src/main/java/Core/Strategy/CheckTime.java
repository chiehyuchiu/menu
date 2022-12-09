//Client "TimeTest"
package Core.Strategy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckTime{

    //判斷現在時機是否在[startTime,endTime]內
    public static boolean isEffectiveDate(Date nowTime, Date startTime, Date endTime) {
        if (nowTime.getTime() == startTime.getTime() || nowTime.getTime() == endTime.getTime()) {
            return true;
        }
        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(startTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        }
        else{
            return false;
        }
    }

}