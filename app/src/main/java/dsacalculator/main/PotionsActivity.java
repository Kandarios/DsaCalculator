package dsacalculator.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import dsacalculator.main.basic.Potion;
import dsacalculator.main.utility.CSVFile;

public class PotionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potions);


        List<Potion> potions = new ArrayList<Potion>();
        List<String> potionNameList = new ArrayList<String>();

        //Intent intent = getIntent();
        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        InputStream inputStream = getResources().openRawResource(R.raw.potions);
        CSVFile csvFile = new CSVFile(inputStream);
        List<String[]> csvList = csvFile.read();
        for(String[] row: csvList) {
            potions.add(new Potion(row));
            potionNameList.add( row[0] );
        }

        Spinner typeSelection = (Spinner) findViewById(R.id.potion_spinner);


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, potionNameList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        typeSelection.setAdapter(dataAdapter);

    }
}
