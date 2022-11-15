package org.letustryandlearn.task;

import io.quarkus.logging.Log;
import io.quarkus.scheduler.Scheduled;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Task {


    /*
    *
    *
    *
  ______________Second(0-59)
|  ___________________Minute(0-59)
| |  ________________________Hour(0-23)
| | |  ____________________________Day of the month(1-31)
| | | |  ________________________________Month (1-12) or (JAN-DEC)
| | | | |  ___________________________________ Day of the week (0-7)or (MON-SUN)
| | | | | |
| | | | |  |
| | | | | |
* * * * * *
    *
    *
    * */

    @Scheduled(cron = "* * * * * ?")//Every Second
    public void everySecond() {
        Log.info("every SECOND ");
    }

    @Scheduled(every = "10s")//Every 10 Second
    public void runEveryTENSecond() {
        Log.info("runEvery TEN Second ");
    }

    @Scheduled(cron = "0 * * * * ?")//Every MINUTE
    public void everyMinute() {
        Log.info("every MINUTE ");
    }


    @Scheduled(cron = "0 0 0 ? * 7")//Every Sunday
    public void EverySunday() {
        Log.info("every Sunday ");
    }

    @Scheduled(cron = "0 0 0 L * ?")//Every Month
    public void lastDayOfTheMonth() {
        Log.info("every Last Day Of Month ");
    }
}
