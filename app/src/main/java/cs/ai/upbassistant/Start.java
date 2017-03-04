package cs.ai.upbassistant;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void startService (View view) {
        Context context = this.getApplicationContext();
        Toast.makeText(context, "Start", Toast.LENGTH_SHORT).show();
    }
    public void stopService (View view) {
        Context context = this.getApplicationContext();
        Toast.makeText(context, "Stop", Toast.LENGTH_SHORT).show();
    }
    public void exitApp (View view) {
        Context context = this.getApplicationContext();
        Toast.makeText(context, "Exit", Toast.LENGTH_SHORT).show();
    }
}
