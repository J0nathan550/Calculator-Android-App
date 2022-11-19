package com.j0nathan550.calculator;

import android.widget.EditText;
import android.widget.TextView;

public class Calculator {

    private String firstStringTab = "", secondStringTab = "";
    private float firstTab = 0, secondTab = 0;
    private int operation = 0;
    private Boolean isAnotherTab = false;
    private Boolean isCommaUsed = false;
    private final EditText resultText;
    private final TextView operationText;

    public Calculator(EditText resultText, TextView operationText){
        this.resultText = resultText;
        this.operationText = operationText;
    }

    public void buttonOneClick(){
        if (!isAnotherTab) {
            firstStringTab += "1";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "1";
        resultText.setText(secondStringTab);
    }
    public void buttonTwoClick(){
        if (!isAnotherTab) {
            firstStringTab += "2";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "2";
        resultText.setText(secondStringTab);
    }
    public void buttonThreeClick(){
        if (!isAnotherTab) {
            firstStringTab += "3";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "3";
        resultText.setText(secondStringTab);
    }
    public void buttonFourClick(){
        if (!isAnotherTab) {
            firstStringTab += "4";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "4";
        resultText.setText(secondStringTab);
    }
    public void buttonFiveClick(){
        if (!isAnotherTab) {
            firstStringTab += "5";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "5";
        resultText.setText(secondStringTab);
    }
    public void buttonSixClick(){
        if (!isAnotherTab) {
            firstStringTab += "6";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "6";
        resultText.setText(secondStringTab);
    }
    public void buttonSevenClick(){
        if (!isAnotherTab) {
            firstStringTab += "7";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "7";
        resultText.setText(secondStringTab);
    }
    public void buttonEightClick(){
        if (!isAnotherTab) {
            firstStringTab += "8";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "8";
        resultText.setText(secondStringTab);
    }
    public void buttonNineClick(){
        if (!isAnotherTab) {
            firstStringTab += "9";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "9";
        resultText.setText(secondStringTab);
    }
    public void buttonZeroClick(){
        if (!isAnotherTab) {
            firstStringTab += "0";
            resultText.setText(firstStringTab);
            return;
        }
        secondStringTab += "0";
        resultText.setText(secondStringTab);
    }
    public void buttonPlusClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 1;
        operationText.setText("+");
    }
    public void buttonMinusClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 2;
        operationText.setText("-");
    }
    public void buttonMultiplyClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 3;
        operationText.setText("*");
    }
    public void buttonDivideClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 4;
        operationText.setText("/");
    }
    public void buttonPercentClick(){
        isCommaUsed = false;
        isAnotherTab = true;
        operation = 5;
        operationText.setText("%");
    }
    public void buttonEqualClick(){
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
    public void buttonClearAllClick(){
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
    public void buttonCommaClick(){
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
    public void buttonRemoveCharacter(){
        if (firstStringTab.equals("")){
            isCommaUsed = false;
            return;
        }
        int firstTabLength = firstStringTab.length();
        if (!isAnotherTab){
            if (firstStringTab.contains(".")){
                isCommaUsed = false;
            }
            String firstStringTab_edited = firstStringTab.substring(0, firstTabLength - 1);
            firstStringTab = firstStringTab_edited;
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
        String secondStringTab_edited = secondStringTab.substring(0, secondTabLength - 1);
        secondStringTab = secondStringTab_edited;
        resultText.setText(secondStringTab);
    }
}