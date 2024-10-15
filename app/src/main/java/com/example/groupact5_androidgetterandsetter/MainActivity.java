package com.example.groupact5_androidgetterandsetter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.groupact5_androidgetterandsetter.bookspage.BooksPage;
import com.example.groupact5_androidgetterandsetter.employeepage.EmployeePage;
import com.example.groupact5_androidgetterandsetter.productpage.ProductPage;
import com.example.groupact5_androidgetterandsetter.restaurantpage.RestaurantPage;
import com.example.groupact5_androidgetterandsetter.universitypage.UniversityPage;

public class MainActivity extends AppCompatActivity {

    Button btnProductPage, btnEmployeePage, btnBookPage, btnUniversityPage, btnRestaurantPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProductPage = findViewById(R.id.btn_product_page);
        btnEmployeePage = findViewById(R.id.btn_employee_page);
        btnBookPage = findViewById(R.id.btn_book_page);
        btnUniversityPage = findViewById(R.id.btn_university_page);
        btnRestaurantPage = findViewById(R.id.btn_restaurant_page);

        btnProductPage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProductPage.class);
            startActivity(intent);
        });

        btnEmployeePage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EmployeePage.class);
            startActivity(intent);
        });

        btnBookPage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BooksPage.class);
            startActivity(intent);
        });

        btnUniversityPage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, UniversityPage.class);
            startActivity(intent);
        });

        btnRestaurantPage.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RestaurantPage.class);
            startActivity(intent);
        });

    }
}