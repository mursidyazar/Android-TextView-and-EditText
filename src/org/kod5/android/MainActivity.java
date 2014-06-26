package org.kod5.android;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	//Bu k�s�mda bile�enlerimizi tan�ml�yoruz.
	private TextView textView;
	private EditText editText;
	private Button button;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama a��ld���nda 
    														//�al��t�r�lan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bu k�s�mda yukar�da tan�mlad���m�z bile�enlerle xml olarak haz�rlad���m�z bile�enleri
        //birbirlerine ba�l�yoruz. 
        textView = (TextView)findViewById(R.id.textView1);
        editText = (EditText)findViewById(R.id.editText1);
        button = (Button)findViewById(R.id.button1);
        
        button.setOnClickListener(new OnClickListener() {  
			
			@Override
			public void onClick(View v) { //Burada Buttona t�kland���nda 
											//�al��t�r�lacak kodlar yer al�yor.
			  
			  //textView'e kullan�c�n�n girdi�i yaz� set ediliyor.
			  textView.setText(editText.getText()); 
				
			}
		});
    }
}
