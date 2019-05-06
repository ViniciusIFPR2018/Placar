package com.example.aluno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView time1;
    private TextView time2;
    private Button gol1;
    private Button gol2;
    public int golstime1;
    public int golstime2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time1 = (TextView) findViewById(R.id.tim1);
        time2 = (TextView) findViewById(R.id.time2);
        gol1 = (Button) findViewById(R.id.gol1);
        gol2 = (Button) findViewById(R.id.gol2);

        gol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    golstime1 = golstime1+1;
                   time1.setText(""+golstime1);
                }catch (Exception e){
                }
            }
        });

        gol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    golstime2 = golstime2+1;
                    time2.setText(""+golstime2);
                }catch (Exception e){
                }
            }
        });

    }
}
