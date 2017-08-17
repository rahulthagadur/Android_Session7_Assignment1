package com.example.thagadur.android_session7_assignment1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

TextView textView;
    Button button;
    //Assigning the url of Google to a string
    String Url="https://www.google.co.in/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ////Getting the Button ID.
        button=(Button)findViewById(R.id.clickBtn);
        //OnClickListener funtion hear action of button
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //creating Intent for Action view to display all the apps installed of type browser
                Intent i=new Intent(Intent.ACTION_VIEW);
                //Adding url for the intent
                i.setData(Uri.parse(Url));
                startActivity(i);
            }
        });

    }
}
