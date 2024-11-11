package com.example.groupact5_androidgetterandsetter.restaurantpage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groupact5_androidgetterandsetter.R;
import com.example.groupact5_androidgetterandsetter.adapter.RestaurantAdapter;

import java.util.ArrayList;
import java.util.List;

public class RestaurantPage extends AppCompatActivity {

    RecyclerView rvRestaurant;
    List<Restaurant> restaurantList = new ArrayList<>();
    RestaurantAdapter restaurantAdapter;
    EditText etName, etType;
    Button btnAddItem;

    Restaurant restaurantObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_page);

        restaurantObject = new Restaurant();
        restaurantAdapter = new RestaurantAdapter(restaurantList);

        rvRestaurant = findViewById(R.id.rv_restaurant);
        etName = findViewById(R.id.et_name);
        etType = findViewById(R.id.et_type);
        btnAddItem = findViewById(R.id.btn_add_item);

        btnAddItem.setOnClickListener(v -> addFunction());

    }

    private void addFunction(){
        restaurantObject.setName(etName.getText().toString());
        restaurantObject.setType(etType.getText().toString());

        Log.d("MAIN", "name: " + restaurantObject.getName() + ", type: " + restaurantObject.getType());

        restaurantList.add(new Restaurant(restaurantObject.getName(), restaurantObject.getType()));

        rvRestaurant.setAdapter(restaurantAdapter);
        rvRestaurant.setLayoutManager(new LinearLayoutManager(this));
    }
}