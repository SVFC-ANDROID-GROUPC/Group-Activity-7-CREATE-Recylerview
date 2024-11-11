package com.example.groupact5_androidgetterandsetter.bookspage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groupact5_androidgetterandsetter.R;
import com.example.groupact5_androidgetterandsetter.adapter.BookAdapter;
import com.example.groupact5_androidgetterandsetter.adapter.EmployeeAdapter;
import com.example.groupact5_androidgetterandsetter.employeepage.Employee;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends AppCompatActivity {

    RecyclerView rvBook;
    List<Book> bookList = new ArrayList<>();
    BookAdapter bookAdapter;
    EditText etTitle, etAuthor;
    Button btnAddItem;

    Book bookObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_page);

        bookObject = new Book();
        bookAdapter = new BookAdapter(bookList);

        rvBook = findViewById(R.id.rv_books);
        etTitle = findViewById(R.id.et_title);
        etAuthor = findViewById(R.id.et_author);
        btnAddItem = findViewById(R.id.btn_add_item);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction(){
        bookObject.setTitle(etTitle.getText().toString());
        bookObject.setAuthor(etAuthor.getText().toString());

        Log.d("MAIN", "title: " + bookObject.getTitle() + ", author: " + bookObject.getAuthor());

        bookList.add(new Book(bookObject.getTitle(), bookObject.getAuthor()));

        rvBook.setAdapter(bookAdapter);
        rvBook.setLayoutManager(new LinearLayoutManager(this));
    }
}