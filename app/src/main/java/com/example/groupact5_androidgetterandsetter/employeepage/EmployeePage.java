package com.example.groupact5_androidgetterandsetter.employeepage;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.groupact5_androidgetterandsetter.R;
import com.example.groupact5_androidgetterandsetter.adapter.EmployeeAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeePage extends AppCompatActivity {

    RecyclerView rvEmployee;
    List<Employee> employeeList = new ArrayList<>();
    EmployeeAdapter employeeAdapter;
    EditText etName, etDepartment;
    Button btnAddItem;

    Employee employeeObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_page);

        employeeObject = new Employee();
        employeeAdapter = new EmployeeAdapter(employeeList);

        rvEmployee = findViewById(R.id.rv_employee);
        etName = findViewById(R.id.et_name);
        etDepartment = findViewById(R.id.et_department);
        btnAddItem = findViewById(R.id.btn_add_item);

        btnAddItem.setOnClickListener(v -> addFunction());
    }

    private void addFunction(){
        employeeObject.setName(etName.getText().toString());
        employeeObject.setDepartment(etDepartment.getText().toString());

        Log.d("MAIN", "name: " + employeeObject.getName() + ", department: " + employeeObject.getDepartment());

        employeeList.add(new Employee(employeeObject.getName(), employeeObject.getDepartment()));

        rvEmployee.setAdapter(employeeAdapter);
        rvEmployee.setLayoutManager(new LinearLayoutManager(this));
    }
}