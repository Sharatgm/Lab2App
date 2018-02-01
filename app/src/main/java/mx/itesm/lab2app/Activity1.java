package mx.itesm.lab2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;

import java.util.Random;


public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Button back = (Button)findViewById(R.id.back);
        Button background = (Button)findViewById(R.id.btn_background);


        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Activity1.this, MainActivity.class);
                startActivity(intent);

            }

        });
        background.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                view.setBackgroundColor(color);

            }

        });


    }
}
