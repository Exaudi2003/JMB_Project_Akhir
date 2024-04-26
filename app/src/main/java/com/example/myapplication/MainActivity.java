package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button)findViewById(R.id.lihatbtn);
        Button btn2=(Button)findViewById(R.id.inputbtn);
        Button btn3=(Button)findViewById(R.id.infobtn);
        Button btn4=(Button)findViewById(R.id.logbouton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, Datamahasiswa.class);
                startActivity(inte);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this, Inputdata.class);
                startActivity(inte);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this,Informasi .class);
                startActivity(inte);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent inte = new Intent(MainActivity.this,LoginActivity .class);
                startActivity(inte);
            }
        });
    }
}
