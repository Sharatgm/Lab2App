package mx.itesm.lab2app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button back = (Button)findViewById(R.id.back);
        final TextView t = (TextView) findViewById(R.id.textView2);
        Button colorText = (Button) findViewById(R.id.btn_text);

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent);

            }

        });

        colorText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                t.setTextColor(color);
            }

        });
    }
}
