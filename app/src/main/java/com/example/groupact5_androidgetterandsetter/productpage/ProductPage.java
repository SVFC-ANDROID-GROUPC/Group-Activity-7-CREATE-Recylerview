package com.example.groupact5_androidgetterandsetter.productpage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.groupact5_androidgetterandsetter.R;


public class ProductPage extends AppCompatActivity {

    EditText etName, etPrice;
    Button btnAddItem;
    TextView tvResults;

    Product productObject;

    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);

        productObject = new Product();
        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etPrice = findViewById(R.id.et_price);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());

    }

    private void addFunction(){
        productObject.setName(etName.getText().toString());
        productObject.setPrice(Integer.parseInt(etPrice.getText().toString()));

        Log.d("MAIN", "name: " + productObject.getName() + ", prices: " + productObject.getPrice());

        stringBuilder.append("\n\n Name: ").append(productObject.getName());
        stringBuilder.append("\n Price: ").append(productObject.getPrice());

        tvResults.setText(stringBuilder.toString());
    }
}