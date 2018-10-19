package com.mycompany.secondproject.caterers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.mycompany.secondproject.R;

public class ChoiceActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton imageButton , imageButton1;

    public void initViews(){
        imageButton = findViewById(R.id.imageButtonP);
        imageButton1 = findViewById(R.id.imageButtonC);
        imageButton.setOnClickListener(this);
        imageButton1.setOnClickListener(this);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        initViews();
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.imageButtonP){
           Intent intent = new Intent(ChoiceActivity.this,com.mycompany.secondproject.userUIActivity.class);
           startActivity(intent);
        }
        else {
            Intent intent1 = new Intent(ChoiceActivity.this,CatererUIActivity.class);
            startActivity(intent1);
        }
    }
}
