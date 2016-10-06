package com.rohin.receiver;




import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button receiver;
	String Send;
	EditText inputR;
	TextView outputR;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
		receiver=(Button) findViewById(R.id.btn_receiver);
		inputR = (EditText) findViewById(R.id.edt_text);
		outputR= (TextView) findViewById(R.id.txt_output);
		btn_Receiver();
	}
	public void btn_Receiver() {
		// TODO Auto-generated method stub
		receiver.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
			Intent inent = new Intent("com.rohin.sender.BackActivity");
			 Send = inputR.getText().toString();
		     inent.putExtra("showtext1", Send);
		     inent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
			 startActivity(inent);
		
			}
		});
		
	}

	
}
