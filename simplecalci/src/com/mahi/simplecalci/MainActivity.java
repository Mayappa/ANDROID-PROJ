package com.mahi.simplecalci;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity 
{
            
	 EditText ed;
	 Button btn;
	 TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed = (EditText) findViewById(R.id.editText1);
        btn = (Button) findViewById(R.id.button1);
        
        btn.setOnClickListener(new OnClickListener()
        {
			
			@Override
			public void onClick(View arg0) 
			{
				if(ed.getText().toString().length()==0)
				{
					Toast.makeText(MainActivity.this, "Enter valid num",Toast.LENGTH_SHORT).show();
				}
				else
				{
					String num1 = ed.getText().toString();
	                int inputnum1 = Integer.parseInt(num1);
	                ed.setText("");
	                
	                String num2 = ed.getText().toString();
	                int inputnum2 = Integer.parseInt(num2);
	                ed.setText("");
	                
	               int result = inputnum1 + inputnum2;            
	                
	               
	                
					
				}
                
                
				
				
			}
		});
    }


    
    
}
