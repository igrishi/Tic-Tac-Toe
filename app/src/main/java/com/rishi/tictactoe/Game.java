package com.rishi.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Game extends AppCompatActivity {
    int count=0;
    int[] numcross={2,3,4,5,6,7,8,9,10};
    int[] numcircle={2,3,4,5,6,7,8,9,10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent intent=getIntent();
        final String name1= intent.getExtras().getString("pn1");
        final String name2= intent.getExtras().getString("pn2");
        final int[] images={R.drawable.gamecross,
                R.drawable.gamecircle};
        final ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9;
        i1=findViewById(R.id.I_1);
        i2=findViewById(R.id.I_2);
        i3=findViewById(R.id.I_3);
        i4=findViewById(R.id.I_4);
        i5=findViewById(R.id.I_5);
        i6=findViewById(R.id.I_6);
        i7=findViewById(R.id.I_7);
        i8=findViewById(R.id.I_8);
        i9=findViewById(R.id.I_9);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("rishi","helo "+name1);
                if(count%2==0){i1.setImageResource(images[0]);
                    ++count;
                    numcross[0]=1;}
                else{ i1.setImageResource(images[1]);
                    ++count;
                    numcircle[0]=1;}
                winnercircle(numcircle,name2,name1);
                winnercross(numcross,name1,name2);
                draw(count, name1, name2);
                i1.setEnabled(false);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i2.setImageResource(images[0]);
                    ++count;
                    numcross[1]=1;}
                else{ i2.setImageResource(images[1]);
                    ++count;
                    numcircle[1]=1;}
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count,name1,name2);
                i2.setEnabled(false);

            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i3.setImageResource(images[0]);
                    ++count;
                    numcross[2]=1;}
                else{ i3.setImageResource(images[1]);
                    ++count;
                    numcircle[2]=1;}
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i3.setEnabled(false);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i4.setImageResource(images[0]);
                    ++count;
                    numcross[3]=1;}
                else{ i4.setImageResource(images[1]);
                    ++count;
                    numcircle[3]=1;
                }
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i4.setEnabled(false);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i5.setImageResource(images[0]);
                    ++count;
                    numcross[4]=1;
                }
                else{ i5.setImageResource(images[1]);
                    ++count;
                    numcircle[4]=1;}
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i5.setEnabled(false);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i6.setImageResource(images[0]);
                    ++count;
                    numcross[5]=1;}
                else{ i6.setImageResource(images[1]);
                    ++count;
                    numcircle[5]=1;
                }
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i6.setEnabled(false);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i7.setImageResource(images[0]);
                    ++count;
                    numcross[6]=1;}
                else{ i7.setImageResource(images[1]);
                    ++count;
                    numcircle[6]=1;
                }
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i7.setEnabled(false);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i8.setImageResource(images[0]);
                    ++count;
                    numcross[7]=1;}
                else{ i8.setImageResource(images[1]);
                    ++count;
                    numcircle[7]=1;
                }
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i8.setEnabled(false);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(count%2==0){i9.setImageResource(images[0]);
                    ++count;
                    numcross[8]=1;}
                else{ i9.setImageResource(images[1]);
                    ++count;
                    numcircle[8]=1;
                }
                winnercircle(numcircle, name2, name1);
                winnercross(numcross, name1, name2);
                draw(count, name1, name2);
                i9.setEnabled(false);
            }
        });
    }
    public void winnercircle(int[] n1, String name2, String name1){
        if(n1[0]==n1[1]&&(n1[0]==n1[2])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[3]==n1[4]&&(n1[3]==n1[5])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[6]==n1[7]&&(n1[7]==n1[8])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[0]==n1[3]&&(n1[3]==n1[6])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[1]==n1[4]&&(n1[4]==n1[7])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[2]==n1[5]&&(n1[5]==n1[8])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[0]==n1[4]&&(n1[4]==n1[8])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n1[2]==n1[4]&&(n1[4]==n1[6])){
            Toast.makeText(getApplicationContext(),name2+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
    }
    public void winnercross(int[] n2, String name1, String name2){
        if(n2[0]==n2[1]&&(n2[0]==n2[2])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[3]==n2[4]&&(n2[3]==n2[5])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[6]==n2[7]&&(n2[7]==n2[8])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[0]==n2[3]&&(n2[3]==n2[6])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[1]==n2[4]&&(n2[4]==n2[7])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[2]==n2[5]&&(n2[5]==n2[8])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[0]==n2[4]&&(n2[4]==n2[8])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
        if(n2[2]==n2[4]&&(n2[4]==n2[6])){
            Toast.makeText(getApplicationContext(),name1+" wins",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
    }
    public void draw(int c, String name1, String name2){
        if(c==9){
            Toast.makeText(getApplicationContext(),"Match is Draw",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Game.this,Game.class);
            intent.putExtra("pn1",name1);
            intent.putExtra("pn2",name2);
            startActivity(intent);
            finish();
        }
    }
}
