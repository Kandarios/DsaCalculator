package dsacalculator.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ElementalsActivity extends AppCompatActivity {

    private Spinner typeSelection;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elementals);

        typeSelection = (Spinner) findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("Elementargeist");
        list.add("Dschinn");
        list.add("Elementarer Meister");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);



        typeSelection.setAdapter(dataAdapter);

    }




}
