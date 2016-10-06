package com.rohin.receiver;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class AnotherActivity extends Activity {
	String rece , Send ;
    Button back;
    EditText inputR1;
	TextView outputR1;
	ImageView ivR1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bitmap bitmap = (Bitmap)this.getIntent().getParcelableExtra("Bitmap");
		setContentView(R.layout.activity_another);
		InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
		back =  (Button) findViewById(R.id.btn_receiverBack);
		inputR1 = (EditText) findViewById(R.id.edt_text);
		outputR1= (TextView) findViewById(R.id.txt_output);
		ivR1 =(ImageView) findViewById(R.id.iv_image);
		rece = getIntent().getStringExtra("showtext");
		ivR1.setImageBitmap(bitmap);
		outputR1.setText(rece);
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				 Intent inent = new Intent("com.rohin.sender.BackActivity");
				 Send = inputR1.getText().toString();
			     inent.putExtra("showtext1", Send);
			     inent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
			     startActivity(inent);
			     
				
			}
		});
		
	}

}
