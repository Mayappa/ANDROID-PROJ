package com.example.button2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{

      Button messagebutton;  
	
	
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messagebutton = (Button) findViewById(R.id.loginbutton);
        messagebutton.setOnClickListener(new OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				Log.d("[DEBUG]","Button was Cliked");
				
			}
		});
    }


    
    
}
