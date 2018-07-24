package com.example.jc;

import java.util.ArrayList;
import java.util.List;

import com.example.jc.R.id;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listView;
    List<String> listadecursos;
	private ListAdapter adapter;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(id.listView1);
        //datos para mostrar en mi listas
        listadecursos = new ArrayList<String>();
        listadecursos.add("diseño wed");
        listadecursos.add("programacion web");
        listadecursos.add("diseño grafico");
        listadecursos.add("administracion de redes");
        listadecursos.add("ingles basico");
        listadecursos.add("paginas web");
        listadecursos.add("otros");
      
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,listadecursos);
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> AdapterView, View View, int position,
					long id) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "hola seleccionaste a. "+listadecursos.get(position)+"tiene 4 horas ala semana", Toast.LENGTH_LONG).show();
				
			}
        	
        }
        		
        		
        		
		);
        

	}
}
