package ca.roumani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class BMI extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }
    private void setContentsOfTextView(int id, String newContents){
        View view=findViewById(id);
        TextView textView= (TextView) view;
        textView.setText(newContents);
    }
    private String getInputOfTextField(int id){
        View view =findViewById(id);
        EditText editText = (EditText) view;
        String input =editText.getText().toString();
        return input;

    }
    private String getItemSelected(int id){
        View view =findViewById(id);
        Spinner spinner = (Spinner) view;
        String string = spinner.getSelectedItem().toString();
        return string;

    }
    public void ComputeBMIButtonclicked (View view)
    {
        String textname= getInputOfTextField(R.id.Inputname);
        String textweight= getInputOfTextField(R.id.Inputweight);
        String textheight= getInputOfTextField(R.id.Inputheight);
        String selectedItem = getItemSelected(R.id.spinnerWeight);
        String selectedItem2 = getItemSelected(R.id.spinnerHeight);
        double height= Double.parseDouble(textheight);
        double weight= Double.parseDouble(textweight);
        if(selectedItem2.equals("Meters")){
            height= Double.parseDouble(textheight);
        }
        else if (selectedItem2.equals("Inches")){
            height= Double.parseDouble(textheight);
            height = height * 0.0254;
        }
        else if (selectedItem2.equals("Centimeters")){
            height= Double.parseDouble(textheight);
            height = height * 0.01;
        }
        if(selectedItem.equals("Pound")){
            weight= Double.parseDouble(textweight);
            weight = weight / 2.2046226;

        }
        else if (selectedItem.equals("KG")) {
            weight= Double.parseDouble(textweight);
        }




       /* double ras= height*height;

        double bmi = weight/ras;
        String contents= textname+"has bmi"+bmi;

        setContentsOfTextView(R.id.labelAnswer, contents);*/
        Person user = new Person(textname, weight, height);
        double userBMI= user.getBMI();

        setContentsOfTextView(R.id.labelAnswer, user.toString());


    }
}
