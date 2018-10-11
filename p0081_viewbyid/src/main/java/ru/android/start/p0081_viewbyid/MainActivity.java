package ru.android.start.p0081_viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView=(TextView) findViewById(R.id.myText);
        myTextView.setText("Next");
        Button myBtn=findViewById(R.id.myBtn);
        myBtn.setText("MyButton");
        myBtn.setEnabled(false);
        CheckBox myChb=(CheckBox) findViewById(R.id.myChb);
        myChb.setChecked(true);
        }
}
