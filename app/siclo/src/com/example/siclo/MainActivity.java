package com.example.siclo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"abriendo aplicacion", Toast.LENGTH_LONG).show();
    	super.onStart();
    }
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"pausando aplicacion", Toast.LENGTH_LONG).show();
    	super.onResume();
    }
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"restaurando aplicacion", Toast.LENGTH_LONG).show();
    	super.onRestart();
    }
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this," parando aplicacion", Toast.LENGTH_LONG).show();
    	super.onStop();
    }
   
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	Toast.makeText(this,"acabando aplicacion", Toast.LENGTH_LONG).show();
    	super.onDestroy();
    }
    
    
}

    

