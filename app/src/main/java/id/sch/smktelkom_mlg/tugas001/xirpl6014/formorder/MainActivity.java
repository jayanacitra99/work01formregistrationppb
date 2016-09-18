package id.sch.smktelkom_mlg.tugas001.xirpl6014.formorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        btnO.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                doProcess();
            }
        });
    }

    private void doProcess() {

        if (isValid()) {
            String name = etN.getText().toString();
            String address = etA.getText().toString();
            String pnm = etPN.getText().toString();
            String nos = spr.getSelectedItem().toString();

            String hsl = "\n Your Order :\n";
            int startlen = hsl.length();

            if (cbCB.isChecked()) hsl += cbCB.getText() + "\n";
            if (cbCG.isChecked()) hsl += cbCG.getText() + "\n";
            if (cbCBl.isChecked()) hsl += cbCBl.getText() + "\n";
            if (cbS42.isChecked()) hsl += cbS42.getText() + "\n";
            if (cbS43.isChecked()) hsl += cbS43.getText() + "\n";
            if (cbS44.isChecked()) hsl += cbS44.getText() + "\n";
            if (cbS45.isChecked()) hsl += cbS45.getText() + "\n";
            if (hsl.length() == startlen) hsl += "You not choice yet";

            String hsl2 = "Your Shoes Model :\n ";
            if (rbL.isChecked()) {
                hsl2 = rbL.getText().toString();
            } else if (rbH.isChecked()) {
                hsl2 = rbH.getText().toString();
            }

            tvR.setText
                    (
                            "Name :\n " + name +
                                    "\n Address :\n " + address +
                                    "\n Phone Number :\n " + pnm +
                                    "\n Number of Shoes :\n " + nos + hsl + hsl2

                    );
        }

    }

    private boolean isValid() {
        boolean valid = true;

        String name = etN.getText().toString();
        String address = etA.getText().toString();
        String pnm = etPN.getText().toString();

        if (name.isEmpty()) {
            etN.setError("Name is Empty!!!");
            valid = false;
        } else {
            etN.setError(null);
        }
        if (address.isEmpty()) {
            etA.setError("Address is Empty!!!");
            valid = false;
        } else {
            etA.setError(null);
        }
        if (pnm.isEmpty()) {
            etPN.setError("Phone Number is Empty!!!");
            valid = false;
        } else {
            etPN.setError(null);
        }
        return valid;
    }
}