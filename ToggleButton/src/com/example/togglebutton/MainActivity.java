package com.example.togglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity 
{
     ToggleButton tgbtn;
    
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tgbtn = (ToggleButton) findViewById(R.id.toggleButton);
        tgbtn.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1)
			{
				if(arg1==true)
				{
					Toast.makeText(MainActivity.this, " Switched On", Toast.LENGTH_SHORT).show();
					
				}
				else
				{
					Toast.makeText(MainActivity.this, " Switched off", Toast.LENGTH_SHORT).show();
				}
 				
			}
		});
    }


   
    
}
