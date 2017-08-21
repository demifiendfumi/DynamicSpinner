package sg.edu.rp.c346.dynamicspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Spinner spn1;
    Spinner spn2;
    Button btnUpdate;
    ArrayList<String> alNumbers = new ArrayList<String>();
    ArrayAdapter<String> aaNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn1 = (Spinner) findViewById(R.id.spinner1);
        spn2 = (Spinner) findViewById(R.id.spinner2);
        btnUpdate = (Button) findViewById(R.id. buttonUpdate);

        //alNumbers.add("2");
        //alNumbers.add("4");
        //alNumbers.add("6");

        //Get the string-array and store as an Array
        //String[] strNumbers = getResources().getStringArray(R.array.even_numbers);
        //convert Array to List and add to the ArrayList
        //alNumbers.addAll(Arrays.asList(strNumbers));

       // btnUpdate.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {
           //     int pos = spn1.getSelectedItemPosition();
           //     alNumbers.clear();
           //     if(pos==0) {
                    //option 1
           //         alNumbers.add("2");
           //         alNumbers.add("4");
           //         alNumbers.add("6");
           //     }
            //    else  {
                    //option 1
            //        alNumbers.add("1");
            //        alNumbers.add("3");
            //        alNumbers.add("5");
           //     }
            //    aaNumbers.notifyDataSetChanged();
          //  }
       // });

        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                alNumbers.clear();
                switch(i){
                    case 0:
                        String[] strNumbers = getResources().getStringArray(R.array.even_numbers);
                        alNumbers.addAll(Arrays.asList(strNumbers));
                        spn2.setSelection(2);
                        break;
                    case 1:
                        strNumbers = getResources().getStringArray(R.array.odd_numbers);
                        alNumbers.addAll(Arrays.asList(strNumbers));
                        spn2.setSelection(1);
                        break;
                }
                aaNumbers.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //btnUpdate.setOnClickListener(new View.OnClickListener() {
           // @Override
           // public void onClick(View v) {
             //   int pos = spn1.getSelectedItemPosition();
              //  alNumbers.clear();
              //  if(pos==0) {
                    //option 2
                //    String[] strNumbers = getResources().getStringArray(R.array.even_numbers);
                //    alNumbers.addAll(Arrays.asList(strNumbers));
              //  }
               // else  {
                    //option 2
               //     String[] strNumbers = getResources().getStringArray(R.array.odd_numbers);
              //      alNumbers.addAll(Arrays.asList(strNumbers));
             //   }
              //  aaNumbers.notifyDataSetChanged();
         //   }
      //  });


        aaNumbers = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, alNumbers);
        spn2.setAdapter(aaNumbers);
    }
}
