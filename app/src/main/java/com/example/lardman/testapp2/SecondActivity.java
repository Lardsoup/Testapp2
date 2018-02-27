package com.example.lardman.testapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent data = getIntent();
        String navn = data.getStringExtra("navn");
        Log.d("Mine", navn);
        TextView nameView = findViewById(R.id.secondNameTextView);
        nameView.setText(navn);
    }

    public void backButtonClick(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("shoesize", 42);
        setResult(RESULT_OK, intent);
        finish();
    }
}
