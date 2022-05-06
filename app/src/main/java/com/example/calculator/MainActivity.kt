package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button0 = findViewById<Button>(R.id.button0)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttonDecimal = findViewById<Button>(R.id.buttonDecimal)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide = findViewById<Button>(R.id.buttonDivide)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val buttonPercent = findViewById<Button>(R.id.buttonPercent)
        val buttonLeftBracket = findViewById<Button>(R.id.buttonLeftBracket)
        val buttonRightBracket = findViewById<Button>(R.id.buttonRightBracket)
        val buttonBackspace = findViewById<ImageButton>(R.id.buttonBackspace)
        val buttonPositiveNegative = findViewById<Button>(R.id.buttonPositiveNegative)
        val buttonEqual = findViewById<Button>(R.id.buttonEqual)
        val display = findViewById<EditText>(R.id.screen)
        display.showSoftInputOnFocus = false
        var textString = ""
        var stringUseToParse = ""
        var finalResult = ""

        button0.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "0" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button1.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "1" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button2.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "2" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button3.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "3" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button4.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "4" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button5.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "5" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button6.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "6" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button7.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "7" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button8.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "8" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        button9.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "9" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonAdd.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "+" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonSubtract.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "-" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonMultiply.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "×" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonDivide.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "÷" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonPercent.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            if (textString.length != 0 && cursorPosition != 0) {
                textString = leftSubstring + "%" + rightSubstring
            }
            display.setText(textString)
            if (textString.length != 0 && cursorPosition != 0) {
                display.setSelection(cursorPosition + 1)
            }
        }

        buttonClear.setOnClickListener {
            textString = ""
            display.setText(textString)
        }

        buttonDecimal.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "." + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonLeftBracket.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + "(" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonRightBracket.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString = leftSubstring + ")" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonBackspace.setOnClickListener {
            var cursorPosition = display.selectionStart
            var rightSubstring = textString.substring(cursorPosition)
            if (textString.length != 0 && cursorPosition != 0) {
                var leftSubstring = textString.substring(0, cursorPosition - 1)
                textString = leftSubstring + rightSubstring
                display.setText(textString)
                display.setSelection(cursorPosition - 1)
            }
        }

        buttonPositiveNegative.setOnClickListener {
            var cursorPosition = display.selectionStart
            var leftSubstring = textString.substring(0, cursorPosition)
            var rightSubstring = textString.substring(cursorPosition)
            textString =  leftSubstring + "(-" + rightSubstring
            display.setText(textString)
            display.setSelection(cursorPosition + 1)
        }

        buttonEqual.setOnClickListener {
            stringUseToParse = display.text.toString()
            while (textString.indexOf("x") != -1) {
                stringUseToParse = textString.replace("×", "*")
                textString = stringUseToParse
            }

            while (textString.indexOf("÷") != -1) {
                stringUseToParse = textString.replace("÷", "/")
                textString = stringUseToParse
            }

            while (textString.indexOf("%") != -1) {
                stringUseToParse = textString.replace("%", "/(100)")
                textString = stringUseToParse
            }

            var expression = Expression(stringUseToParse)
            finalResult = expression.calculate().toString()
            textString = finalResult
            display.setText(textString)
            display.setSelection(textString.length)
        }
    }
}
