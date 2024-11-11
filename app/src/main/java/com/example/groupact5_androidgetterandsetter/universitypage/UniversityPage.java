package com.example.groupact5_androidgetterandsetter.universitypage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.groupact5_androidgetterandsetter.R;
import com.example.groupact5_androidgetterandsetter.adapter.EmployeeAdapter;
import com.example.groupact5_androidgetterandsetter.adapter.UniversityAdapter;
import com.example.groupact5_androidgetterandsetter.employeepage.Employee;

import java.util.ArrayList;
import java.util.List;

public class UniversityPage extends AppCompatActivity {

    RecyclerView rvUniversity;
    List<University> universityList = new ArrayList<>();
    UniversityAdapter universityAdapter;
    EditText etName, etType;
    Button btnAddItem;

    University universityObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_page);

        universityObject = new University();
        universityAdapter = new UniversityAdapter(universityList);

        rvUniversity = findViewById(R.id.rv_university);
        etName = findViewById(R.id.et_name);
        etType = findViewById(R.id.et_type);
        btnAddItem = findViewById(R.id.btn_add_item);

        btnAddItem.setOnClickListener(v -> addFunction());

    }

    private void addFunction(){
        universityObject.setName(etName.getText().toString());
        universityObject.setType(etType.getText().toString());

        Log.d("MAIN", "name: " + universityObject.getName() + ", type: " + universityObject.getType());

        universityList.add(new University(universityObject.getName(), universityObject.getType()));

        rvUniversity.setAdapter(universityAdapter);
        rvUniversity.setLayoutManager(new LinearLayoutManager(this));
    }
}