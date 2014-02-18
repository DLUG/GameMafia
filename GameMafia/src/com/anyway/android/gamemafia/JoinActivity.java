package com.anyway.android.gamemafia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewDebug.FlagToString;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class JoinActivity extends Activity {
	
	private ScrollView scroll_terms;
	private TextView text_terms;
	private Button btn_cancel;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_join);
	    
	    scroll_terms = (ScrollView)findViewById(R.id.join_scroll_terms);
	    text_terms = (TextView)findViewById(R.id.join_text_terms);
	    
	    // 스크롤 선언
	    text_terms.setMovementMethod(new ScrollingMovementMethod());
	    
	    btn_cancel = (Button)findViewById(R.id.join_btn_cancel);
	    // click btn_cancel button action
	    btn_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
				startActivity(intent);
			}
		});
	    
//	    Button ok = (Button)findViewById(R.id.button1);
//		ok.setEnabled(false);
//		CheckBox check = (CheckBox)findViewById(R.id.login_checkbox_autologin);
//		if(check == true)
//		{
//			ok.setEnabled(true);
//		}
//		ok.setOnClickListener(new View.OnClickListener(){
//
//			@Override
//			public void onClick(View v) 
//			{
//				
//				String id = editTxt_id.getText().toString();
//				String pw = editTxt_pw.getText().toString();
//				String pw2 = editText3.getText().toString();
//				String email = editText4.getText().toString();
//				if(pw.equals(pw2))
//				{
//					AlertDialog.Builder alert2 = new AlertDialog.Builder(getApplicationContext());
//					alert2.setTitle("오류");
//					alert2.setMessage("패스워드가 틀렸습니다.");
//					alert2.setPositiveButton("확인",null);
//					alert2.create();
//					alert2.show();
//				}
//				String sql = "INSERT INTO(uid, upassword, uemail) VALUE ('" + id + "','" + pw + "','" + email + "')";
//				con = DriverManager.getConnection(url, id, pw);
//				stmt = con.createStatement();
//				re = stmt.executeUpdate(sql);
//				AlertDialog.Builder alert2 = new AlertDialog.Builder(getApplicationContext());
//				alert2.setTitle("확인");
//				alert2.setMessage("회원가입 하셨습니다.");
//				alert2.setPositiveButton("확인",null);
//				alert2.create();
//				alert2.show();
//			}
//			
//		});
	    
	}

}
