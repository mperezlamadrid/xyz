package com.example.android.xyz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private EditText cantidad;
    private Spinner genero, tipo, marca;
    private Resources res;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        cantidad =(EditText)findViewById(R.id.txtCantidad);
        genero =(Spinner)findViewById(R.id.cmbGenero);
        tipo =(Spinner)findViewById(R.id.cmbTipo);
        marca =(Spinner)findViewById(R.id.cmbMarca);
        res = getResources();
        resultado =(TextView)findViewById(R.id.lblResultado);

        String opg[] =res.getStringArray(R.array.arr_genero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opg);
        genero.setAdapter(adapter);

        String opt[]=res.getStringArray(R.array.arr_tipo);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opt);
        tipo.setAdapter(adapter2);

        String opm[]=res.getStringArray(R.array.arr_marca);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opm);
        marca.setAdapter(adapter3);

        genero.setAdapter(adapter);
        tipo.setAdapter(adapter2);
        marca.setAdapter(adapter3);
    }

    public void comprar(View V) {
        int cant, gen, tip, mar;
        double res=0;

        if(validar()) {
            cant = Integer.parseInt(cantidad.getText().toString());
            gen = genero.getSelectedItemPosition();
            tip = tipo.getSelectedItemPosition();
            mar = marca.getSelectedItemPosition();

            switch (gen) {
                case 0:
                    switch (tip) {
                        case 0:
                            switch (mar) {
                                case 0:
                                    res = cant * 120000;
                                    break;
                                case 1:
                                    res = cant * 140000;
                                    break;
                                case 2:
                                    res = cant * 130000;
                                    break;
                            }
                            break;
                        case 1:
                            switch (mar) {
                                case 0:
                                    res = cant * 50000;
                                    break;
                                case 1:
                                    res = cant * 80000;
                                    break;
                                case 2:
                                    res = cant * 100000;
                                    break;
                            }
                            break;
                    }
                    break;
                case 1:
                    switch (tip) {
                        case 0:
                            switch (mar) {
                                case 0:
                                    res = cant * 100000;
                                    break;
                                case 1:
                                    res = cant * 130000;
                                    break;
                                case 2:
                                    res = cant * 110000;
                                    break;
                            }
                            break;
                        case 1:
                            switch (mar) {
                                case 0:
                                    res = cant * 60000;
                                    break;
                                case 1:
                                    res = cant * 70000;
                                    break;
                                case 2:
                                    res = cant * 120000;
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }

        resultado.setText("$ " + res);
    }

    public void clear(View v){
        cantidad.setText("");
        resultado.setText("");
        genero.setSelection(0);
        tipo.setSelection(0);
        marca.setSelection(0);
        cantidad.requestFocus();
    }

    private boolean validar(){
        if (cantidad.getText().toString().isEmpty()) {
            cantidad.setError(res.getString(R.string.error_uno));
            cantidad.requestFocus();
            return false;
        }

        if (Integer.parseInt(cantidad.getText().toString()) == 0) {
            cantidad.setError(res.getString(R.string.error_dos));
            cantidad.requestFocus();
            return false;
        }

        return true;
    }
}
