package id.sch.smktelkom_mlg.tugas001.xirpl6014.formorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvBS, tvNoS, tvC, tvS, tvR;
    EditText etN, etA, etPN;
    CheckBox cbCB, cbCG, cbCBl, cbS42, cbS43, cbS44, cbS45;
    RadioGroup rgM;
    RadioButton rbL, rbH;
    Button btnO;
    Spinner spr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvBS = (TextView) findViewById(R.id.textViewBS);
        tvNoS = (TextView) findViewById(R.id.textViewNoS);
        tvC = (TextView) findViewById(R.id.textViewC);
        tvS = (TextView) findViewById(R.id.textViewS);
        tvR = (TextView) findViewById(R.id.textViewResult);

        etN = (EditText) findViewById(R.id.editTextN);
        etA = (EditText) findViewById(R.id.editTextA);
        etPN = (EditText) findViewById(R.id.editTextPN);

        cbCB = (CheckBox) findViewById(R.id.checkBoxCB);
        cbCG = (CheckBox) findViewById(R.id.checkBoxCG);
        cbCBl = (CheckBox) findViewById(R.id.checkBoxCBl);

        cbS42 = (CheckBox) findViewById(R.id.checkBoxS42);
        cbS43 = (CheckBox) findViewById(R.id.checkBoxS43);
        cbS44 = (CheckBox) findViewById(R.id.checkBoxS44);
        cbS45 = (CheckBox) findViewById(R.id.checkBoxS45);

        rgM = (RadioGroup) findViewById(R.id.radioGroupM);

        spr = (Spinner) findViewById(R.id.spinner);

        rbH = (RadioButton) findViewById(R.id.radioButtonH);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        btnO = (Button) findViewById(R.id.buttonO);
    }
}