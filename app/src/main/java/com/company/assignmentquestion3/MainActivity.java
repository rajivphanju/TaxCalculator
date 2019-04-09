package com.company.assignmentquestion3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button calculate;
    private EditText salary,tax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        calculate = findViewById(R.id.btn_calculate);
        salary = findViewById(R.id.et_salary);
        tax = findViewById(R.id.et_tax);

        calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
Double salaryvalue=Double.parseDouble(salary.getText().toString());
 Double yearlySalary = salaryvalue *12;
 Double yearlytax;

 if(yearlySalary<=200000){
     yearlytax = yearlySalary*0.01;
     tax.setText(yearlytax.toString());

 }
 else if(yearlySalary>200000 && yearlySalary<350000){
     yearlytax=((200000*0.01)+(0.15*(yearlySalary-200000)));
     tax.setText(yearlytax.toString());

 }
 else if(yearlySalary>350000){
     yearlytax=((200000*0.01)+((0.15)*150000)+((0.25)*(yearlySalary-350000)));
     tax.setText(yearlytax.toString());

 }




    }
}
