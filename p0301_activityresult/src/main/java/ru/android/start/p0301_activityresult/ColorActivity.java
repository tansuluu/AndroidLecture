package ru.android.start.p0301_activityresult;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnRed;
    Button btnGreen;
    Button btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        btnBlue=findViewById(R.id.btnBlue);
        btnGreen=findViewById(R.id.btnGreen);
        btnRed=findViewById(R.id.btnRed);

        btnRed.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent();
        switch (view.getId()){
            case R.id.btnRed:
                intent.putExtra("color", Color.RED);
                break;
            case R.id.btnBlue:
                intent.putExtra("color", Color.BLUE);
                break;
            case R.id.btnGreen:
                intent.putExtra("color", Color.GREEN);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}
