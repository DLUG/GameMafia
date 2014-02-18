package com.anyway.android.gamemafia;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	private EditText editTxt_id;
	private EditText editTxt_pw;
	private Button btn_login;
	private Button btn_join;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		editTxt_id = (EditText)findViewById(R.id.login_editTxt_id);
		editTxt_pw = (EditText)findViewById(R.id.login_editTxt_pw);
		btn_login = (Button)findViewById(R.id.login_btn_login);
		btn_join = (Button)findViewById(R.id.login_btn_join);
		
		// click join button action
		btn_join.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);	// delete history at stack
				startActivity(intent);
			}
		});
//		btn_login.setOnClickListener(new View.OnClickListener(){	
//			String id = editTxt_id.getText().toString();
//			String pw = editTxt_pw.getText().toString();
//			con = DriverManager.getConnection(url, id, pw);
//			String sql = "SELECG id, pw FROM user WHERE id = '" + id +"' AND pw = '" + pw +"'";
//			pstmt = con.prepareStatment(sql);
//			rs = pstmt.executQuery();
//			if(rs.getString(1).equals(id) && rs.getString(2).equals(pw))
//			{
//				넘어감
//			}
//			else
//			{
//				AlertDialog.Builder alert = new AlertDialog.Builder(this);
//				alert.setTitle("틀림ㅋ");
//				alert.setMessage("ID 혹은 패스워드가 틀렸습니다.");
//				alert.setPositiveButton("확인",null);
//				alert.create();
//			alert.show();
//			}
//		});

		
		// click login button action
		btn_login.setOnClickListener(new View.OnClickListener() {
			
			String admin_id = editTxt_id.getText().toString();
			String admin_pw = editTxt_pw.getText().toString();
			
			@Override
			public void onClick(View v) {
				if(admin_id.equals("admin") && admin_pw.equals("uiop")) {
					Intent intent = new Intent(getApplicationContext(), MainActivity.class);
					intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "환영합니다.", Toast.LENGTH_SHORT).show();
				}
				else {
					/*new AlertDialog.Builder(getApplicationContext())
					.setTitle("로그인 실패")
					.setMessage("아이디 또는 비밀번호를 다시 확인해주세요.")
					.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
							return;
						}
					}).show();*/
					Toast.makeText(getApplicationContext(), admin_id+admin_pw+"꽝", Toast.LENGTH_SHORT).show();
				}
			}
		});
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
