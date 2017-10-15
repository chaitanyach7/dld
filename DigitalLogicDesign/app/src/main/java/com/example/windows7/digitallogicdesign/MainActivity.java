package com.example.windows7.digitallogicdesign;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1,b2,b3,b4,b5;
ImageView iv;
RelativeLayout mylayout;
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId())
            {
                case Menu.FIRST:
                    Intent myweb=new Intent(Intent.ACTION_VIEW,Uri.parse("http://theexpert7.blogspot.in"));
                    startActivity(myweb);
                    break;
                case Menu.FIRST+1:
                    Intent myweb2=new Intent(Intent.ACTION_VIEW,Uri.parse("http://theexpert7.blogspot.in"));
                    startActivity(myweb2);
                    break;
                case Menu.FIRST+2:
                    Intent myweb3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://theexpert7.blogspot.in"));
                    startActivity(myweb3);
                    break;
                case Menu.FIRST+3:
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setCancelable(false);
                    builder.setMessage("Do you want to Fail?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            menu.add(0,Menu.FIRST,Menu.NONE,"Blog");
            menu.add(0,Menu.FIRST+1,Menu.NONE,"About us");
            menu.add(0,Menu.FIRST+2,Menu.NONE,"Contact us");
            menu.add(0,Menu.FIRST+3,Menu.NONE,"Exit");
            return super.onCreateOptionsMenu(menu);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        mylayout=(RelativeLayout)findViewById(R.id.mylayout);
        iv=(ImageView)findViewById(R.id.iv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this, Chap1.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, Chap2.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Choice :-p", Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Out of syllabus", Toast.LENGTH_SHORT).show();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Mission Impossible", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Fail?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
