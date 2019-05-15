package com.sancheru.notificartionchecker;

import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Notifications setting checkbox - " + NotificationManagerCompat.from(this).areNotificationsEnabled()
                , Toast.LENGTH_SHORT).show();
    }
}
