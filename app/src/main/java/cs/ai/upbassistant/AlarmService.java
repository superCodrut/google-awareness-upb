package cs.ai.upbassistant;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AlarmService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Eu sunt alarma", Toast.LENGTH_SHORT).show();
    }

    public void setAlarm(Context context) {
        AlarmManager alarm = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmService.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);

        // 10 de secunde
        int minutes = 1000 * 10;
        alarm.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(),minutes, pendingIntent );
    }

    public void cancelAlarm(Context context) {
        Intent intent = new Intent(context, AlarmService.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        AlarmManager alarm = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarm.cancel(pendingIntent);
    }
}
