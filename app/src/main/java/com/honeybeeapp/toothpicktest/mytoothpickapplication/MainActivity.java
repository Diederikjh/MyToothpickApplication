package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMaker;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.CoffeeMakerComponent;
import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.DaggerCoffeeMakerComponent;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getName();

    private TextView title;
    private TextView subTitle;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doDaggerInjectionActivity();

        title = findViewById(R.id.title);
        subTitle = findViewById(R.id.subtitle);
        button = findViewById(R.id.helloButton);

        button.setText("Start service");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SimpleService.class);
                startService(i);
            }
        });
    }

    private void doDaggerInjectionActivity() {
        CoffeeMakerComponent coffeeMakerComponent = DaggerCoffeeMakerComponent.builder().context(this).build();
        CoffeeMaker maker = coffeeMakerComponent.createMaker();
        Log.d(LOG_TAG, "Injection done");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
