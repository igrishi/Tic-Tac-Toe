package com.rishi.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText p1=findViewById(R.id.player1);
        final EditText p2=findViewById(R.id.player2);
        Button mButton=findViewById(R.id.B_1);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name1=p1.getText().toString();
                final String name2=p2.getText().toString();
                Log.d("rishi",name1+name2);
                Intent intent =new Intent(MainActivity.this,Game.class);
                intent.putExtra("pn1",name1);
                intent.putExtra("pn2",name2);
                startActivity(intent);
            }
        });

    }

}
