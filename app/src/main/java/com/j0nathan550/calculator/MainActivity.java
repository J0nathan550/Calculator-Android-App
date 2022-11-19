package com.j0nathan550.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Calculator calculator = new Calculator(findViewById(R.id.resultTab), findViewById(R.id.operationView));
        SetupButtons(calculator);
    }
    private void SetupButtons(Calculator calculator){
        Button oneButton = findViewById(R.id.buttonOne);
        Button twoButton = findViewById(R.id.buttonTwo);
        Button threeButton = findViewById(R.id.buttonThree);
        Button fourButton = findViewById(R.id.buttonFour);
        Button fiveButton = findViewById(R.id.buttonFive);
        Button sixButton = findViewById(R.id.buttonSix);
        Button sevenButton = findViewById(R.id.buttonSeven);
        Button eightButton = findViewById(R.id.buttonEight);
        Button nineButton = findViewById(R.id.buttonNine);
        Button zeroButton = findViewById(R.id.buttonZero);
        Button plusButton = findViewById(R.id.buttonPlus);
        Button minusButton = findViewById(R.id.buttonMinus);
        Button divideButton = findViewById(R.id.buttonDivide);
        Button multiplyButton = findViewById(R.id.buttonMultiply);
        Button percentButton = findViewById(R.id.buttonPercent);
        Button equalsButton = findViewById(R.id.buttonEquals);
        Button clearAllButton = findViewById(R.id.buttonClearAll);
        Button commaButton = findViewById(R.id.buttonComma);
        Button clearCharacterButton = findViewById(R.id.buttonRemove);

        oneButton.setOnClickListener(view -> calculator.buttonOneClick());
        twoButton.setOnClickListener(view -> calculator.buttonTwoClick());
        threeButton.setOnClickListener(view -> calculator.buttonThreeClick());
        fourButton.setOnClickListener(view -> calculator.buttonFourClick());
        fiveButton.setOnClickListener(view -> calculator.buttonFiveClick());
        sixButton.setOnClickListener(view -> calculator.buttonSixClick());
        sevenButton.setOnClickListener(view -> calculator.buttonSevenClick());
        eightButton.setOnClickListener(view -> calculator.buttonEightClick());
        nineButton.setOnClickListener(view -> calculator.buttonNineClick());
        zeroButton.setOnClickListener(view -> calculator.buttonZeroClick());
        plusButton.setOnClickListener(view -> calculator.buttonPlusClick());
        minusButton.setOnClickListener(view -> calculator.buttonMinusClick());
        divideButton.setOnClickListener(view -> calculator.buttonDivideClick());
        multiplyButton.setOnClickListener(view -> calculator.buttonMultiplyClick());
        percentButton.setOnClickListener(view -> calculator.buttonPercentClick());
        equalsButton.setOnClickListener(view -> calculator.buttonEqualClick());
        clearAllButton.setOnClickListener(view -> calculator.buttonClearAllClick());
        commaButton.setOnClickListener(view -> calculator.buttonCommaClick());
        clearCharacterButton.setOnClickListener(view -> calculator.buttonRemoveCharacter());
    }
}