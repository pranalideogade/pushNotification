package com.example.pranali_deogade.push;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Notification;
import android.app.NotificationManager;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    EditText ed1,ed2,ed3;
    Button b1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed3=(EditText)findViewById(R.id.editText3);
         b1=(Button)findViewById(R.id.button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String body=ed3.getText().toString().trim();
                if(body.equals("amo")){
                    Toast.makeText(MainActivity.this,"equal",Toast.LENGTH_LONG).show();
                    b1.setEnabled(false);}
                NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                Notification notify=new Notification.Builder
                        (getApplicationContext()).setContentTitle("pran").setContentText(body).
                        setContentTitle("amo").setSmallIcon(R.mipmap.ic_launcher).build();

                notify.flags |= Notification.FLAG_AUTO_CANCEL;
                notif.notify(0, notify);
            }
        });
    }
}