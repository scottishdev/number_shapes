package pcodeclan.com.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int n;

        public boolean isSquare(int n) {
            for (int i = 0; i < n / 2 + 2; i++) {
                if (i * i == n) {
                    return true;
                }
            }
            return false;
        }
    }
    public void checkNumber(View view) {
        Log.i("Info", "Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editTextNumber);

        Number myNumber = new Number();
        myNumber.n = Integer.parseInt(editText.getText().toString());

        String message = editText.getText().toString();

        if (editText.getText().toString().isEmpty()) {
            message = "Please enter a number";
        } else {
            if (myNumber.isSquare(8 * myNumber.n + 1) && (myNumber.isSquare(myNumber.n))) {
                message += "is a triangular square number";
            } else if (myNumber.isSquare(8 * myNumber.n + 1)) {
                message += "is a triangular number";
            } else if (myNumber.isSquare(myNumber.n)) {
                message += " is a square number";
            } else {
                message += " is neither a triangular nor square number";
            }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}