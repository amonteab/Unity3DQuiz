package com.projects.aaronmonteabaro.unity3dquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadQuiz(View view)
    {
        if(view.getTag().toString().equals("Unity3D Basics"))
        {
            Intent intent = new Intent(this, quizBasics3d.class);
            startActivity(intent);
            return;
        }
        Toast.makeText(getApplicationContext(), "The " + view.getTag().toString() + " quiz coming soon!", Toast.LENGTH_SHORT).show();
    }
}
