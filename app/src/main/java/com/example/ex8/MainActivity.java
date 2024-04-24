package com.example.ex8;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        b1=(Button)findViewById( R.id.b1 );
        e1=(EditText)findViewById( R.id.e1 );
        e2=(EditText)findViewById( R.id.e2 );
        b1.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            Intent i=new Intent( getApplicationContext(),MainActivity2.class );
            i.putExtra( "e1",e1.getText().toString() ); i.putExtra(
                    "e2",e2.getText().toString() );
            startActivity( i );
        }
        } );
    }
}