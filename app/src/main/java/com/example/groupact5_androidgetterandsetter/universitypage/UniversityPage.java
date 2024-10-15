package com.example.groupact5_androidgetterandsetter.universitypage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import com.example.groupact5_androidgetterandsetter.R;

public class UniversityPage extends AppCompatActivity {

    EditText etName, etType;
    Button btnAddItem;
    TextView tvResults;

    University universityObject;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_page);

        universityObject = new University();
        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etType = findViewById(R.id.et_type);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());

    }

    private void addFunction(){
        universityObject.setName(etName.getText().toString());
        universityObject.setType(etType.getText().toString());

        Log.d("MAIN", "name: " + universityObject.getName() + ", type: " + universityObject.getType());

        stringBuilder.append("\n\n School Name: ").append(universityObject.getName());
        stringBuilder.append("\n Type: ").append(universityObject.getType());

        tvResults.setText(stringBuilder.toString());
    }
}