package com.example.nitinnikamanth.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,submit;
    int x=0,f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,win=0,f=0;

    private void draw()
    {
        if(b1.getText()!=" " && b2.getText()!=" " && b3.getText()!=" " && b4.getText()!=" " && b5.getText()!=" " && b6.getText()!=" " && b7.getText()!=" " && b8.getText()!=" " && b9.getText()!=" " )
        {
            if(win==0 && f==9)
            {
                Intent i =new Intent(MainActivity.this,DrawActivity.class);
                startActivity(i);
            }
        }
    }

    private int check()
    {
        if(b1.getText()=="O"&&b2.getText()=="O"&&b3.getText()=="O"){
            return 0;
        }
        else if(b4.getText()=="O"&&b5.getText()=="O"&&b6.getText()=="O"){
            return 0;
        }
        else if(b7.getText()=="O"&&b8.getText()=="O"&&b9.getText()=="O"){
            return 0;
        }
        else if(b1.getText()=="O"&&b5.getText()=="O"&&b9.getText()=="O"){
            return 0;
        }
        else if(b3.getText()=="O"&&b5.getText()=="O"&&b7.getText()=="O"){
            return 0;
        }
        else if(b1.getText()=="O"&&b4.getText()=="O"&&b7.getText()=="O"){
            return 0;
        }
        else if(b2.getText()=="O"&&b5.getText()=="O"&&b8.getText()=="O"){
            return 0;
        }
        else if(b3.getText()=="O"&&b6.getText()=="O"&&b9.getText()=="O"){
            return 0;
        }
        else if(b1.getText()=="X"&&b2.getText()=="X"&&b3.getText()=="X"){
            return 1;
        }
        else if(b4.getText()=="X"&&b5.getText()=="X"&&b6.getText()=="X"){
            return 1;
        }
        else if(b7.getText()=="X"&&b8.getText()=="X"&&b9.getText()=="X"){
            return 1;
        }
        else if(b1.getText()=="X"&&b5.getText()=="X"&&b9.getText()=="X"){
            return 1;
        }
        else if(b3.getText()=="X"&&b5.getText()=="X"&&b7.getText()=="X"){
            return 1;
        }
        else if(b1.getText()=="X"&&b4.getText()=="X"&&b7.getText()=="X"){
            return 1;
        }
        else if(b2.getText()=="X"&&b5.getText()=="X"&&b8.getText()=="X"){
            return 1;
        }
        else if(b3.getText()=="X"&&b6.getText()=="X"&&b9.getText()=="X"){
            return 1;
        }
        return -1;
    }


    @Override
    protected void onRestart() {

        super.onRestart();
        setContentView(R.layout.activity_main);
        b1 =(Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        submit = (Button) findViewById(R.id.submit);
        b1.setText(" ");
        b2.setText(" ");
        b3.setText(" ");
        b4.setText(" ");
        b5.setText(" ");
        b6.setText(" ");
        b7.setText(" ");
        b8.setText(" ");
        b9.setText(" ");
        x=0;f1=0;f2=0;f3=0;f4=0;f5=0;f6=0;f7=0;f8=0;f9=0;win=0;f=0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        submit = (Button) findViewById(R.id.submit);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f1==0)
                {
                    if(x==0)
                    {
                        b1.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b1.setText("X");
                        x-=1;
                    }
                    f1++;

                    if(check()==0){
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        //submit.setText("O wins");
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        //submit.setText("X wins");
                        x=-1;
                        win++;
                    }
                    draw();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f2==0)
                {
                    if(x==0)
                    {
                        b2.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b2.setText("X");
                        x-=1;
                    }
                    f2++;
                    if(check()==0){
                        // submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        // submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f3==0)
                {
                    if(x==0)
                    {
                        b3.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b3.setText("X");
                        x-=1;
                    }
                    f3++;
                    if(check()==0){
                        Intent i = new Intent(MainActivity.this , WinActivity.class);
                        startActivity(i);
                        // submit.setText("O wins");
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        Intent i = new Intent(MainActivity.this , Xwins.class);
                        startActivity(i);
                        //submit.setText("X wins");
                        x=-1;
                        win++;
                    }
                    draw();
                }


            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f4==0)
                {
                    if(x==0)
                    {
                        b4.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b4.setText("X");
                        x-=1;
                    }
                    f4++;
                    if(check()==0){
                        //submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        //submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f5==0)
                {
                    if(x==0)
                    {
                        b5.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b5.setText("X");
                        x-=1;
                    }
                    f5++;
                    if(check()==0){
                        //submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        //submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }

            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f6==0)
                {
                    if(x==0)
                    {
                        b6.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b6.setText("X");
                        x-=1;
                    }
                    f6++;
                    if(check()==0){
                        //submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        // submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }
            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f7==0)
                {
                    if(x==0)
                    {
                        b7.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b7.setText("X");
                        x-=1;
                    }
                    f7++;
                    if(check()==0){
                        //submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        //submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }
            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f8==0)
                {
                    if(x==0)
                    {
                        b8.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b8.setText("X");
                        x-=1;
                    }
                    f8++;
                    if(check()==0){
                        //submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        //submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f++;
                if(f9==0)
                {
                    if(x==0)
                    {
                        b9.setText("O");
                        x+=1;
                    }
                    else if(x==1)
                    {
                        b9.setText("X");
                        x-=1;
                    }
                    f9++;
                    if(check()==0){
                        //submit.setText("O wins");
                        Intent i =new Intent(MainActivity.this ,WinActivity.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    else if(check()==1){
                        //submit.setText("X wins");
                        Intent i =new Intent(MainActivity.this ,Xwins.class);
                        startActivity(i);
                        x=-1;
                        win++;
                    }
                    draw();
                }
            }

        });



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText(" ");
                b2.setText(" ");
                b3.setText(" ");
                b4.setText(" ");
                b5.setText(" ");
                b6.setText(" ");
                b7.setText(" ");
                b8.setText(" ");
                b9.setText(" ");
                x=0;
                f1=0;f2=0;f3=0;f4=0;f5=0;f6=0;f7=0;f8=0;f9=0;win=0;f=0;
            }
        });
    }
}
