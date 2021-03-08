package com.ossovita.databindingtraining2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ossovita.databindingtraining2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main);
        amb.setStudent(getCurrentStudent());
    }

    private Student getCurrentStudent(){
        Student student = new Student();
        student.setStudentName("Mike");
        student.setStudentEmail("mike@gmail.com");
        return student;
    }

}