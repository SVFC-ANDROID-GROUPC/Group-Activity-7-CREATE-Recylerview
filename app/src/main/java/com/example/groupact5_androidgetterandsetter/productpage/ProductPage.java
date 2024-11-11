package com.example.groupact5_androidgetterandsetter.productpage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.groupact5_androidgetterandsetter.R;
import com.example.groupact5_androidgetterandsetter.adapter.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends AppCompatActivity {

    RecyclerView rvProduct;
    EditText etName, etPrice;
    List<Product> productList = new ArrayList<>();
    ProductAdapter productAdapter;
    Button btnAddItem;

    Product productObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);

        productObject = new Product();
        productAdapter = new ProductAdapter(productList);

        rvProduct = findViewById(R.id.rv_product);
        etName = findViewById(R.id.et_name);
        etPrice = findViewById(R.id.et_price);
        btnAddItem = findViewById(R.id.btn_add_item);

        btnAddItem.setOnClickListener(v -> addFunction());

    }

    private void addFunction(){
        productObject.setName(etName.getText().toString());
        productObject.setPrice(Integer.parseInt(etPrice.getText().toString()));

        Log.d("MAIN", "name: " + productObject.getName() + ", prices: " + productObject.getPrice());

        productList.add(new Product(productObject.getName(), productObject.getPrice()));

        rvProduct.setAdapter(productAdapter);
        rvProduct.setLayoutManager(new LinearLayoutManager(this));
    }
}