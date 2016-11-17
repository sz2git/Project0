package com.example.z.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessageButton1(View view) {
        android.content.Context context = getApplicationContext();
        CharSequence text = "Hello toast2!";
        int duration = android.widget.Toast.LENGTH_SHORT;

        android.widget.Toast toast = android.widget.Toast.makeText(context, text, duration);
        toast.show();
    }
}
