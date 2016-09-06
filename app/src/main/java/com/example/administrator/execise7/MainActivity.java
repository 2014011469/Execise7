package com.example.administrator.execise7;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LayoutInflater factory = LayoutInflater.from(this);
        final View LoginView = factory.inflate(R.layout.login_dialog,null);

        final EditText txtUser = (EditText)LoginView.findViewById(R.id.editTextUser);
        final EditText txtPsw = (EditText)LoginView.findViewById(R.id.editTextPsw);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("这是一个普通的对话框")//显示的消息内容
                        .setTitle("对话框");//对话框标题
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "用户按下了确认按钮", Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"用户按下了取消按钮",Toast.LENGTH_LONG).show();
                    }
                });
                builder.setNeutralButton("忽略", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"用户按下了忽略按钮",Toast.LENGTH_LONG).show();
                    }
                });
                builder.show();

            }

        });
        Button btnlogin = (Button)findViewById(R.id.buttonlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
               // LayoutInflater inflater = getLayoutInflater();
                //Toast.makeText(MainActivity.this,"测试",Toast.LENGTH_LONG).show();


                builder.setView(LoginView)
                        .setTitle("登陆")
                        .setPositiveButton("登陆", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if(txtUser.getText().toString().equals("abc")&&txtPsw.getText().toString().equals("123")){
                                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                                }
                                else {
                                    Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();

            }
        });
       /*final View LoginView = factory.inflate(R.layout.)
       final EditText txtUser = (EditText)findViewById(R.id.editTextUserId);
        final EditText txtPsw = (EditText)findViewById(R.id.editTextPwd);
        Button btnDelete = (Button) findViewById(R.id.buttonDelete);
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textResult = (EditText) findViewById(R.id.editTextUserId);
                textResult.setText("");
            }
        });
        /*Button btnlogin =(Button)findViewById(R.id.buttonqueding);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtUser.getText().toString().equals("abc")&&txtPsw.getText().toString().equals("123")){
                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"登陆失败",Toast.LENGTH_LONG).show();
                }
            }
        });*/

    }

}
