package com.mahi.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity
{

	Button loginbuttton,cancelbutton;
	 EditText username,password;
	 
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
    	 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cancelbutton = (Button)findViewById(R.id.loginbutton);
        loginbuttton = (Button) findViewById(R.id.cancelbutton);
        username = (EditText) findViewById(R.id.editTextusername);
        
        
        
    }

  
    
    
}
