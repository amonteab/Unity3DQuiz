package com.projects.aaronmonteabaro.unity3dquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class quizBasics3d extends AppCompatActivity {

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
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.question1hierarchyRadio:
                //
                break;

            case R.id.question1inspectorRadio:
                //
                break;

            case R.id.question1projectRadio:
                //
                break;

            case R.id.question1sceneRadio:
                //
                break;

            case R.id.question7False:
                //
                break;

            case R.id.question7True:
                //
                break;

            case R.id.question9False:
                //
                break;

            case R.id.question9True:
                //
                break;

            case R.id.question10False:
                //
                break;

            case R.id.question10True:
                //
                break;
        }

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.question2GameObjectMenuCheckbox:
                //
                break;

            case R.id.question2HierarchyCheckbox:
                //
                break;

            case R.id.question2ProjectCheckbox:
                //
                break;

            case R.id.question2SceneClickCheckbox:
                //
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

        if(mQuestion3Response.equalsIgnoreCase("Transform")) {
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
