package bh.edu.ahlia.convertall;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends Activity {

    EditText t1,t2;
    Button b1,b2,b3,b4,b5,b6,b7;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.editText3);
        t2 = findViewById(R.id.editText4);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);



    }

    public void Clear(View view) {
        t1.setText("");
        t2.setText("");
        t1.requestFocus();
        Toast.makeText(getApplicationContext(),"Clear", Toast.LENGTH_SHORT).show();
    }

    public void MiletoKM(View view) {

        double convert = Double.valueOf(t1.getText().toString());
        String km = (new DecimalFormat("0.00").format(1.60934*convert));
        t2.setText(km);
        Toast.makeText(getApplicationContext(),"Convert Mile to KM",Toast.LENGTH_SHORT).show();
    }

    public void KMtoMile(View view) {

        double convert = Double.valueOf(t1.getText().toString());
        String mile = (new DecimalFormat("0.00").format(0.621371*convert));
        t2.setText(mile);
        Toast.makeText(getApplicationContext(),"Convert KM to Mile",Toast.LENGTH_SHORT).show();
    }

    public void poundtokg(View view) {

        double convert = Double.valueOf(t1.getText().toString());
        String kg = (new DecimalFormat("0.00").format(.453592*convert));
        t2.setText(kg);
        Toast.makeText(getApplicationContext(),"Convert Pound to KG",Toast.LENGTH_SHORT).show();


    }

    public void inchtocm(View view) {

        double convert = Double.valueOf(t1.getText().toString());
        String cm = (new DecimalFormat("0.00").format(2.54*convert));
        t2.setText(cm);
        Toast.makeText(getApplicationContext(),"Convert Inches to CM",Toast.LENGTH_SHORT).show();



    }


    public void kgtopound(View view) {

        double convert = Double.valueOf(t1.getText().toString());
        String pound = (new DecimalFormat("0.00").format(2.20462*convert));
        t2.setText(pound);
        Toast.makeText(getApplicationContext(),"Convert KG to Pound",Toast.LENGTH_SHORT).show();


    }

    public void cmtoinch(View view) {

        double convert = Double.valueOf(t1.getText().toString());
        String inch = (new DecimalFormat("0.00").format(0.393701*convert));
        t2.setText(inch);
        Toast.makeText(getApplicationContext(),"Convert CM to Inches",Toast.LENGTH_SHORT).show();

    }
}
