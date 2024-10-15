package com.example.groupact5_androidgetterandsetter.employeepage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.groupact5_androidgetterandsetter.R;

public class EmployeePage extends AppCompatActivity {

    EditText etName, etDepartment;
    Button btnAddItem;
    TextView tvResults;

    Employee employeeObject;
    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_page);

        employeeObject = new Employee();
        stringBuilder = new StringBuilder();

        etName = findViewById(R.id.et_name);
        etDepartment = findViewById(R.id.et_department);
        btnAddItem = findViewById(R.id.btn_add_item);
        tvResults = findViewById(R.id.tv_results);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction(){
        employeeObject.setName(etName.getText().toString());
        employeeObject.setDepartment(etDepartment.getText().toString());

        Log.d("MAIN", "name: " + employeeObject.getName() + ", department: " + employeeObject.getDepartment());

        stringBuilder.append("\n\n Name: ").append(employeeObject.getName());
        stringBuilder.append("\n Department: ").append(employeeObject.getDepartment());

        tvResults.setText(stringBuilder.toString());
    }
}