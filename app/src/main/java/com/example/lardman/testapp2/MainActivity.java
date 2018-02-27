package com.example.lardman.testapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        int showData = data.getIntExtra("shoesize", 0);
        Log.d("MINE", "shoe data:" + showData);
    }

    public void nextPageButtonClicked(View view)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        EditText nameView = findViewById(R.id.mainEditName);
        String name = nameView.getText().toString();
        intent.putExtra("navn", name);
        //startActivity(intent);
        startActivityForResult(intent, 31415);
    }
}
