package ru.android.start.p0111_resvalues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llBottom =findViewById(R.id.llBottom);
        TextView tvBottom = findViewById(R.id.tvBottom);
        Button btnBotton =findViewById(R.id.btnBottom);

        llBottom.setBackgroundResource(R.color.llBottomColor);
        tvBottom.setText(R.string.tvBottomText);
        btnBotton.setText(R.string.btnBottomText);

        getResources().getString(R.string.tvBottomText);
    }
}
