package cs.ai.upbassistant;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import java.util.Calendar;

/**
 * Created by codrut94 on 04.03.2017.
 */

public class BackgroundService extends IntentService {

    private static final String TAG = "BackgroundService";

    public BackgroundService() {
        super(BackgroundService.class.getName());
    }

    public BackgroundService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        while (true) {
            Calendar rightNow = Calendar.getInstance();
            int seconds = rightNow.get(Calendar.SECOND);
            Integer in = new Integer(seconds);
            String s = in.toString();
            Log.d(TAG, s);
        }

    }
}
