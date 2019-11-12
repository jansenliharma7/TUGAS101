package com.example.jansen;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quizkedua extends Activity {
	
	Button jumlah;
	EditText et1, et2,et3;
	TextView hasil;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagiakedua);
        jumlah=(Button)findViewById(R.id.jumlah2);
        et1=(EditText)findViewById(R.id.inputkedua1);
        et2=(EditText)findViewById(R.id.inputkedua2);
        et3=(EditText)findViewById(R.id.inputkedua3);
        hasil=(TextView)findViewById(R.id.hasil);
	
        jumlah.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int nilai1= Integer.parseInt(et1.getText().toString());
				int nilai2= Integer.parseInt(et2.getText().toString());
				int nilai3= Integer.parseInt(et3.getText().toString());
				if (nilai1 > nilai2 && nilai1>nilai3){
                	hasil.setText("Input Pertama Lebih Besar Yaitu "+String.valueOf(nilai1));
                }
                else if (nilai2> nilai1 && nilai2> nilai3){
                	hasil.setText("Input Kedua Lebih Besar Yaitu "+String.valueOf(nilai2));
                }
                
                else if (nilai3>nilai1&&nilai3>nilai2){
                	hasil.setText("Input ketiga Lebih Besar Yaitu "+String.valueOf(nilai3));
                	
                }
                
                else if (nilai1 == nilai2 && nilai1> nilai3){
                	hasil.setText("Nilai Input Pertama dan Kedua Sama Besar Yaitu "+String.valueOf(nilai1)+"Nilai yg Ketiga adalah "+String.valueOf(nilai3));
                }
                
                else  if (nilai1 == nilai3 && nilai1 >  nilai2 ){
                	hasil.setText("Nilai Input Pertama dan Ketiga Sama Besar Yaitu "+String.valueOf(nilai1)+"Nilai yg Kedua adalah "+String.valueOf(nilai2));
                }
                else if (nilai2 == nilai1 && nilai2 > nilai3){
                	hasil.setText("Nilai Input Kedua dan Pertama Sama Besar Yaitu "+String.valueOf(nilai2)+"Nilai yg Ketiga adalah "+String.valueOf(nilai3));
                	
                }
                else if (nilai2 == nilai3 && nilai2 > nilai1){
                	hasil.setText("Nilai Input Kedua dan Ketiga Sama Besar Yaitu "+String.valueOf(nilai2)+"Nilai yg Pertama adalah "+String.valueOf(nilai1));
                }
                else if (nilai3 == nilai1 && nilai3 > nilai2){
                	hasil.setText("Nilai Input Ketiga dan Pertama Sama Besar Yaitu "+String.valueOf(nilai3)+"Nilai yg Kedua adalah "+String.valueOf(nilai2));
                }
                else if (nilai3 == nilai2 && nilai3 > nilai1){
                	hasil.setText("Nilai Input Ketiga dan Kedua Sama Besar Yaitu "+String.valueOf(nilai3)+"Nilai yg Pertama adalah "+String.valueOf(nilai1));
                }
                else{
                	hasil.setText("Nilai Yang Anda Input Sama Semua Nilai Pertama "+String.valueOf(nilai1)+", Nilai Kedua "+String.valueOf(nilai2)+", NilaiKetiga "+String.valueOf(nilai3));
                }
			}
		});
	}
}
