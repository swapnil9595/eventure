package com.example.eventure;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ViewEventActivity extends AppCompatActivity {
    ImageView cardImage;
    TextView cardDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_event);

//        cardImage = findViewById(R.id.horizontal_image);
//        cardDescription = findViewById(R.id.horizontal_text);
//
//        Intent intent = getIntent();
//        cardImage.setImageResource(intent.getIntExtra("image",0));
//        cardDescription.setText(intent.getStringExtra("description"));
    }


}
