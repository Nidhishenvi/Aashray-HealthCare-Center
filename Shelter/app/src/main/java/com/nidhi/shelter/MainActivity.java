package com.nidhi.shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.shuhart.stepview.StepView;

public class MainActivity extends AppCompatActivity {
    Button nextLayout1, nextLayout2, nextLayout3, nextLayout4, nextLayout5;
    Button nextLayout6, nextLayout7, nextLayout8, nextLayout9, submit;
    LinearLayout layout1, layout2, layout3, layout4, layout5;
    LinearLayout layout6, layout7, layout8, layout9, layout10;

    private int currentStep = 0;
    StepView stepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextLayout1 = findViewById(R.id.nextLayout1);
        nextLayout2 = findViewById(R.id.nextLayout2);
        nextLayout3 = findViewById(R.id.nextLayout3);
        nextLayout4 = findViewById(R.id.nextLayout4);
        nextLayout5 = findViewById(R.id.nextLayout5);
        nextLayout6 = findViewById(R.id.nextLayout6);
        nextLayout7 = findViewById(R.id.nextLayout7);
        nextLayout8 = findViewById(R.id.nextLayout8);
        nextLayout9 = findViewById(R.id.nextLayout9);
        submit = findViewById(R.id.submit);
        layout1 = findViewById(R.id.layout1);
        layout2 = findViewById(R.id.layout2);
        layout3 = findViewById(R.id.layout3);
        layout4 = findViewById(R.id.layout4);
        layout5 = findViewById(R.id.layout5);
        layout6 = findViewById(R.id.layout6);
        layout7 = findViewById(R.id.layout7);
        layout8 = findViewById(R.id.layout8);
        layout9 = findViewById(R.id.layout9);
        layout10 = findViewById(R.id.layout10);

        stepView = findViewById(R.id.step_view);
        stepView.setStepsNumber(10);
        stepView.go(0, true);

        layout1.setVisibility(View.VISIBLE);

        nextLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout2.setVisibility(View.GONE);
                layout3.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout3.setVisibility(View.GONE);
                layout4.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout4.setVisibility(View.GONE);
                layout5.setVisibility(View.VISIBLE);

                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout5.setVisibility(View.GONE);
                layout6.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout6.setVisibility(View.GONE);
                layout7.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout7.setVisibility(View.GONE);
                layout8.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout8.setVisibility(View.GONE);
                layout9.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        nextLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout9.setVisibility(View.GONE);
                layout10.setVisibility(View.VISIBLE);
                if (currentStep < stepView.getStepCount() - 1) {
                    currentStep++;
                    stepView.go(currentStep, true);
                } else {
                    stepView.done(true);
                }

            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
}