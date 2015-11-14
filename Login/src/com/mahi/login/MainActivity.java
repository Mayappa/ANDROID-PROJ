package com.mahi.login;

import android.os.Bundle;
import android.app.Activity;
import android.content.Loader;
import android.graphics.Color;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	Button b1,b2;
	EditText ed1,ed2;
    TextView tx1;
    int count=5;
    
  protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        ed1=(EditText) findViewById(R.id.editTextusername);
        ed2=(EditText) findViewById(R.id.editTextpassword);
       
        b1 = (Button) findViewById(R.id.loginbutton);
        b2=(Button) findViewById(R.id.cancelbutton);
        
        tx1 = (TextView) findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);
       
       
        b1.setOnClickListener(new View.OnClickListener() 
        {
		   	
			public void onClick(View v)
			{
				if(ed1.getText().toString().equalsIgnoreCase("jspiders") && 
						ed2.getText().toString().equalsIgnoreCase("1234"))
				{
					Log.d("[DEBUG]","valid user.............");
					Toast.makeText(MainActivity.this,"Login Successffully",Toast.LENGTH_SHORT).show();
				}
				else if(ed1.getText().toString().equals("")  )
				
				{
					Log.d("[DEBUG]", "Invalid user....please check ur Username or password");
					
					Toast.makeText(getApplicationContext(), "PLEASE ENTER THE USERNAME ",Toast.LENGTH_SHORT).show();
					
				}
				else if(ed2.getText().toString().equals("") )
					
				{
					Log.d("[DEBUG]", "Invalid user....please check ur Username or password");
					
					Toast.makeText(getApplicationContext(), "PLEASE ENTER THE  PASSWORD",Toast.LENGTH_SHORT).show();
					
				}
				
				else
				{
					Log.d("[DEBUG]","invalid user.............");
					Toast.makeText(getApplicationContext(), "Please Enter The Correct Details",Toast.LENGTH_SHORT).show();
					tx1.setVisibility(View.VISIBLE);
					
					tx1.setBackgroundColor(Color.RED);
					count--;
					tx1.setText(Integer.toString(count));
					if(count==0)
					{
						
						//finish();
						b1.setEnabled(false);
						
					}
					
				}
			}
			
		}
       );
        b2.setOnClickListener(new View.OnClickListener() 
        {
			
			
			public void onClick(View v) 
			{
			    finish(); 
			    
			}
		});
        
        
    }

	
	
    
    
}
