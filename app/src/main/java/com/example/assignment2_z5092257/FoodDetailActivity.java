package com.example.assignment2_z5092257;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private TextView costsTextView;
    private ImageView imageView;
    private ImageButton plusButton;
    private ImageButton minusButton;
    private EditText orderNumber;
    int counter=0;
    private int number1;
    private int number2;
    private Button confirmOrder;
    ArrayList<String> orderArray =new ArrayList<String>();
private TextView orderFood;



@Nullable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        // Get the intent that was used to travel to this activity
        Intent intent = getIntent();

        // Get the extra identified by "ArticleID" that was put into the intent at the origin.
        int foodID = intent.getIntExtra("FoodID", 0);

        // Now that we were passed the ID of the clicked item, we can get the rest of the data
        // from the "database". Imagine this could be a real SQL database.
        Food food = FoodDatabase.getFoodById(foodID);

        nameTextView = findViewById(R.id.name);
        descriptionTextView = findViewById(R.id.description);
        costsTextView = findViewById(R.id.costs);
        imageView = findViewById(R.id.image);
        plusButton= findViewById(R.id.plusButton);
        minusButton= findViewById(R.id.minusButton);
        orderNumber=findViewById(R.id.orderNumber);
        confirmOrder=findViewById(R.id.confirmOrder);
        orderFood=findViewById(R.id.order_foodName);


        // Set the views to show the data of our object
        nameTextView.setText(food.getFoodname());
        descriptionTextView.setText(food.getDescription());
        costsTextView.setText("$"+(food.getCosts()));

        // Don't worry too much about images for now (but if you can get something to work then do)
        // Generally you don't want to store image data in your app (too much space required)
        // We'll learn the way to load images from the internet in a later week.
        imageView.setImageResource(food.getImageDrawableId());


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            counter++;
            orderNumber.setText(Integer.toString(counter));
                Toast.makeText(getApplicationContext(), " Burger has been added", Toast.LENGTH_SHORT).show();
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            counter--;
            orderNumber.setText(Integer.toString(counter));
            Toast.makeText(getApplicationContext(),  " Burger has been added", Toast.LENGTH_SHORT).show();
        }


    });

        confirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getInput=orderNumber.getText().toString();
               orderArray.add(getInput);


            }
        });






    }




}
