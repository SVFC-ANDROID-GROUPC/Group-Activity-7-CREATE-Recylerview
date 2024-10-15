package com.example.groupact5_androidgetterandsetter.restaurantpage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.groupact5_androidgetterandsetter.R;
import com.example.groupact5_androidgetterandsetter.universitypage.University;

public class RestaurantPage extends AppCompatActivity {

    EditText etName, etType;
    Button btnAddItem;
    TextView tvResults;

    Restaurant restaurantObject;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_page);

        restaurantObject = new Restaurant();
        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etType = findViewById(R.id.et_type);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());

    }

    private void addFunction(){
        restaurantObject.setName(etName.getText().toString());
        restaurantObject.setType(etType.getText().toString());

        Log.d("MAIN", "name: " + restaurantObject.getName() + ", type: " + restaurantObject.getType());

        stringBuilder.append("\n\n Restaurant Name: ").append(restaurantObject.getName());
        stringBuilder.append("\n Type: ").append(restaurantObject.getType());

        tvResults.setText(stringBuilder.toString());
    }
}