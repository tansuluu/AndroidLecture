package ru.android.start.p0091_onclickbuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut=findViewById(R.id.tvOut);
        btnOk=findViewById(R.id.btnOk);
        btnCancel=findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("OK button clicked");
            }
        };
        btnOk.setOnClickListener(oclBtnOk);

        View.OnClickListener cncelBtn=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Cancel button clicked");
            }
        };
        btnCancel.setOnClickListener(cncelBtn);
    }
}
