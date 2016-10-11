package com.projects.aaronmonteabaro.unity3dquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.List;

public class quizBasics3d extends AppCompatActivity {

    private float mQuestion2Total = 0f;
    private float mQuestion5Total = 0f;

    private boolean mQuestion1Correct = false;
    private boolean mQuestion7Correct = false;
    private boolean mQuestion9Correct = false;
    private boolean mQuestion10Correct = false;

    private boolean[] mQuestion2Correct = new boolean[] {false, false, true, true};

    private String mQuestion3Response;
    private String mQuestion4Response;
    private String mQuestion6Response;
    private String mQuestion8Response;

    private float mTotal = 0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_basics3d);
    }

    public void onRadioButtonClicked(View view) {

        switch (view.getId()) {
            case R.id.question1hierarchyRadio:
                mQuestion1Correct = false;
                break;

            case R.id.question1inspectorRadio:
                mQuestion1Correct = true;
                break;

            case R.id.question1projectRadio:
                mQuestion1Correct = false;
                break;

            case R.id.question1sceneRadio:
                mQuestion1Correct = false;
                break;

            case R.id.question7False:
                mQuestion7Correct = false;
                break;

            case R.id.question7True:
                mQuestion7Correct = true;
                break;

            case R.id.question9False:
                mQuestion9Correct = true;
                break;

            case R.id.question9True:
                mQuestion9Correct = false;
                break;

            case R.id.question10False:
                mQuestion10Correct = true;
                break;

            case R.id.question10True:
                mQuestion10Correct = false;
                break;
        }

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.question2GameObjectMenuCheckbox:
                if(checked) {
                    mQuestion2Correct[0] = true;
                }
                else {
                    mQuestion2Correct[0] = false;
                }
                break;

            case R.id.question2HierarchyCheckbox:
                if(checked) {
                    mQuestion2Correct[1] = true;
                }
                else {
                    mQuestion2Correct[1] = false;
                }
                break;

            case R.id.question2ProjectCheckbox:
                if(checked) {
                    mQuestion2Correct[2] = false;
                }
                else {
                    mQuestion2Correct[2] = true;
                }
                break;

            case R.id.question2SceneClickCheckbox:
                if(checked) {
                    mQuestion2Correct[3] = false;
                }
                else {
                    mQuestion2Correct[3] = true;
                }
                break;

            case R.id.question5CPlusPlusCheckbox:
                //
                break;

            case R.id.question5CSharpCheckbox:
                //
                break;

            case R.id.question5JavascriptCheckbox:
                //
                break;

            case R.id.question5PythonCheckbox:
                //
                break;
        }

    }

    public void gradeQuiz(View view) {
        setTypedAnswers();
        mTotal = 0f;

        if(mQuestion1Correct) {
            mTotal += 1f;
        }

        mQuestion2Total = 0f;
        for(boolean b : mQuestion2Correct) {
            Log.i("b is ", "" + b);
            if(b) {
                mQuestion2Total += .25;
            }
            else {
                mQuestion2Total -= .25;
            }
        }
        Log.i("t is ", "" + mQuestion2Total);


        if(mQuestion2Total >= 0) {
            mTotal += mQuestion2Total;
        }

        if(mQuestion3Response.equalsIgnoreCase("Transform")) {
            mTotal += 1f;
        }

        if(mQuestion4Response.equalsIgnoreCase("Rigidbody")) {
            mTotal += 1f;
        }

        if(mQuestion6Response.equals("MonoBehavior")) {
            mTotal += 1f;
        }

        if(mQuestion7Correct) {
            mTotal += 1f;
        }



        if(mQuestion9Correct) {
            mTotal += 1f;
        }

        if(mQuestion10Correct) {
            mTotal += 1f;
        }


        Log.i("mainactivity", "Total: " + mTotal);

    }

    private void setTypedAnswers() {
        mQuestion3Response = ((EditText)findViewById(R.id.question3Input)).getText().toString();
        mQuestion4Response = ((EditText)findViewById(R.id.question4Input)).getText().toString();
        mQuestion6Response = ((EditText)findViewById(R.id.question6Input)).getText().toString();
        mQuestion8Response = ((EditText)findViewById(R.id.question8Input)).getText().toString();
    }
}
