package com.j0nathan550.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {

    private String firstStringTab = "", secondStringTab = "";
    private float firstTab = 0, secondTab = 0;
    private int operation = 0;
    private Boolean isAnotherTab = false;
    private Boolean isCommaUsed = false;
    private EditText resultText;
    private TextView operationText;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.calculator);
        SetupButtons();
    }


    private void SetupButtons(){
        resultText = findViewById(R.id.resultTab);
        operationText = findViewById(R.id.operationView);
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

        oneButton.setOnClickListener(view -> buttonOneClick());
        twoButton.setOnClickListener(view -> buttonTwoClick());
        threeButton.setOnClickListener(view -> buttonThreeClick());
        fourButton.setOnClickListener(view -> buttonFourClick());
        fiveButton.setOnClickListener(view -> buttonFiveClick());
        sixButton.setOnClickListener(view -> buttonSixClick());
        sevenButton.setOnClickListener(view -> buttonSevenClick());
        eightButton.setOnClickListener(view -> buttonEightClick());
        nineButton.setOnClickListener(view -> buttonNineClick());
        zeroButton.setOnClickListener(view -> buttonZeroClick());
        plusButton.setOnClickListener(view -> buttonPlusClick());
        minusButton.setOnClickListener(view -> buttonMinusClick());
        divideButton.setOnClickListener(view -> buttonDivideClick());
        multiplyButton.setOnClickListener(view -> buttonMultiplyClick());
        percentButton.setOnClickListener(view -> buttonPercentClick());
        equalsButton.setOnClickListener(view -> buttonEqualClick());
        clearAllButton.setOnClickListener(view -> buttonClearAllClick());
        commaButton.setOnClickListener(view -> buttonCommaClick());
        clearCharacterButton.setOnClickListener(view -> buttonRemoveCharacter());
    }

    private void buttonOneClick(){
        if (!isAnotherTab) {
            firstStringTab += "1";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "1";
        resultText.setText(secondStringTab);
    }
    private void buttonTwoClick(){
        if (!isAnotherTab) {
            firstStringTab += "2";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "2";
        resultText.setText(secondStringTab);
    }
    private void buttonThreeClick(){
        if (!isAnotherTab) {
            firstStringTab += "3";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "3";
        resultText.setText(secondStringTab);
    }
    private void buttonFourClick(){
        if (!isAnotherTab) {
            firstStringTab += "4";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "4";
        resultText.setText(secondStringTab);
    }
    private void buttonFiveClick(){
        if (!isAnotherTab) {
            firstStringTab += "5";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "5";
        resultText.setText(secondStringTab);
    }
    private void buttonSixClick(){
        if (!isAnotherTab) {
            firstStringTab += "6";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "6";
        resultText.setText(secondStringTab);
    }
    private void buttonSevenClick(){
        if (!isAnotherTab) {
            firstStringTab += "7";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "7";
        resultText.setText(secondStringTab);
    }
    private void buttonEightClick(){
        if (!isAnotherTab) {
            firstStringTab += "8";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "8";
        resultText.setText(secondStringTab);
    }
    private void buttonNineClick(){
        if (!isAnotherTab) {
            firstStringTab += "9";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "9";
        resultText.setText(secondStringTab);
    }
    private void buttonZeroClick(){
        if (!isAnotherTab) {
            firstStringTab += "0";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "0";
        resultText.setText(secondStringTab);
    }
    private void buttonPlusClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 1;
        operationText.setText("+");
    }
    private void buttonMinusClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 2;
        operationText.setText("-");
    }
    private void buttonMultiplyClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 3;
        operationText.setText("*");
    }
    private void buttonDivideClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 4;
        operationText.setText("/");
    }
    private void buttonPercentClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 5;
        operationText.setText("%");
    }
    private void buttonEqualClick(){
        if (firstStringTab.equals("") || secondStringTab.equals("")){
            firstTab = 0;
            secondTab = 0;
            isAnotherTab = false;
            operation = 0;
            firstStringTab = "";
            secondStringTab = "";
            operationText.setText("_");
            resultText.setText("0");
            isCommaUsed = false;
            return;
        }
        firstTab = Float.parseFloat(firstStringTab);
        secondTab = Float.parseFloat(secondStringTab);
        float result = 0;
        String result_text;
        switch (operation){
            case 1: // plus
                result = firstTab + secondTab;
                result_text = "" + result;
                resultText.setText(result_text);
                break;
            case 2: // minus
                result = firstTab - secondTab;
                result_text = "" + result;
                resultText.setText(result_text);
                break;
            case 3: // multiply
                result = firstTab * secondTab;
                result_text = "" + result;
                resultText.setText(result_text);
                break;
            case 4: // divide
                result = firstTab / secondTab;
                result_text = "" + result;
                resultText.setText(result_text);
                break;
            case 5: // percent
                result = firstTab % secondTab;
                result_text = "" + result;
                resultText.setText(result_text);
                break;
        }
        firstTab = result;
        secondTab = 0;
        isAnotherTab = false;
        operation = 0;
        firstStringTab = "" + firstTab;
        secondStringTab = "";
        operationText.setText("_");
    }
    private void buttonClearAllClick(){
        firstTab = 0;
        secondTab = 0;
        isAnotherTab = false;
        operation = 0;
        firstStringTab = "";
        secondStringTab = "";
        operationText.setText("_");
        resultText.setText("0");
        isCommaUsed = false;
    }
    private void buttonCommaClick(){
        if (isCommaUsed){
            return;
        }
        if (!isAnotherTab) {
            firstStringTab += ".";
            resultText.setText(firstStringTab);
            isCommaUsed = true;
            return;
        }
        secondStringTab += ".";
        resultText.setText(secondStringTab);
        isCommaUsed = true;
    }
    private void buttonRemoveCharacter(){
        if (firstStringTab.equals("")){
            isCommaUsed = false;
            return;
        }
        int firstTabLength = firstStringTab.length();
        if (!isAnotherTab){
            if (firstStringTab.contains(".")){
                isCommaUsed = false;
            }
            firstStringTab = firstStringTab.substring(0, firstTabLength - 1);
            resultText.setText(firstStringTab);
            return;
        }
        int secondTabLength = secondStringTab.length();
        if (secondTabLength == 0){
            isAnotherTab = false;
            isCommaUsed = false;
            operation = 0;
            operationText.setText("");
            resultText.setText(firstStringTab);
            return;
        }
        if (secondStringTab.contains(".")){
            isCommaUsed = false;
        }
        secondStringTab = secondStringTab.substring(0, secondTabLength - 1);
        resultText.setText(secondStringTab);
    }
}