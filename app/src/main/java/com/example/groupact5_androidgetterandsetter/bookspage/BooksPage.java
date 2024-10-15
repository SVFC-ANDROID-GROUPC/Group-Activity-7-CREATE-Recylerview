package com.example.groupact5_androidgetterandsetter.bookspage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.groupact5_androidgetterandsetter.R;

public class BooksPage extends AppCompatActivity {

    EditText etTitle, etAuthor;
    Button btnAddItem;
    TextView tvResults;

    Book bookObject;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_page);

        bookObject = new Book();
        stringBuilder = new StringBuilder();

        etTitle = findViewById(R.id.et_title);
        etAuthor = findViewById(R.id.et_author);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction(){
        bookObject.setTitle(etTitle.getText().toString());
        bookObject.setAuthor(etAuthor.getText().toString());

        Log.d("MAIN", "title: " + bookObject.getTitle() + ", author: " + bookObject.getAuthor());

        stringBuilder.append("\n\n Title: ").append(bookObject.getTitle());
        stringBuilder.append("\n Author: ").append(bookObject.getAuthor());

        tvResults.setText(stringBuilder.toString());
    }
}