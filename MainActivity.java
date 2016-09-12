package com.connect.s2a4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img_launcher;

    Button btn_hide,btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_launcher=(ImageView)findViewById(R.id.img_launcher);
        btn_hide=(Button) findViewById(R.id.btn_hide);
        btn_show=(Button) findViewById(R.id.btn_show);


        btn_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_show.setVisibility(View.VISIBLE);
                img_launcher.setVisibility(View.INVISIBLE);

                btn_hide.setVisibility(View.INVISIBLE);
            }
        });


        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_hide.setVisibility(View.VISIBLE);
                img_launcher.setVisibility(View.VISIBLE);

                btn_show.setVisibility(View.INVISIBLE);


            }
        });
    }
}
