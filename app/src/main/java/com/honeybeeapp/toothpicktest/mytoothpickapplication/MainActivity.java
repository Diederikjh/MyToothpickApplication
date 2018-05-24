package com.honeybeeapp.toothpicktest.mytoothpickapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.honeybeeapp.toothpicktest.mytoothpickapplication.deps.ContextNamer;

import javax.inject.Inject;

import toothpick.Scope;
import toothpick.Toothpick;
import toothpick.smoothie.module.SmoothieActivityModule;

public class MainActivity extends AppCompatActivity {

    private Scope scope;

    @Inject ContextNamer contextNamer;
    private TextView title;
    private TextView subTitle;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        scope = Toothpick.openScopes(getApplication(), this);
        scope.installModules(new SmoothieActivityModule(this));
        super.onCreate(savedInstanceState);
        Toothpick.inject(this, scope);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.title);
        subTitle = findViewById(R.id.subtitle);
        button = findViewById(R.id.helloButton);

        title.setText(contextNamer.getApplicationName());
        subTitle.setText(contextNamer.getActivityName());
        button.setText("click me !");

    }

    @Override
    protected void onDestroy() {
        Toothpick.closeScope(this);
        super.onDestroy();
    }

}
