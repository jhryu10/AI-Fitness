package kr.ssu.ai_fitness;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import kr.ssu.ai_fitness.fragment.TrainerExrProgramFragment;
import kr.ssu.ai_fitness.poseestimation.CameraActivity;
import kr.ssu.ai_fitness.sharedpreferences.SharedPrefManager;

//메모장
/*
계정 비밀번호 최소한이 암호화

파란 버튼 백그라운드: @drawable/button_background1
버튼의 텍스트 사이즈: 18sp
버튼 마진: 15dp

db - exr_program 테이블에 title 추가해야됨
 */
public class MainActivity extends AppCompatActivity {
    //승혁

    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;

    //제호
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;

    //관욱
    Button btn16;
    Button btn17;
    Button btn18;
    Button btn19;
    Button btn20;
    Button btn21;
    Button btn22;
    Button btn23;

    //란 화면
    Button btn24;
    Button btn25;
    Button btn26;
    Button btn27;
    Button btn28;
    Button btn29;
    Button btn30;

    Button btn100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);

        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn10 = findViewById(R.id.button10);
        btn11 = findViewById(R.id.button11);
        btn12 = findViewById(R.id.button12);
        btn13 = findViewById(R.id.button13);
        btn14 = findViewById(R.id.button14);
        btn15 = findViewById(R.id.button15);

        btn16 = findViewById(R.id.button16);
        btn17 = findViewById(R.id.button17);
        btn18 = findViewById(R.id.button18);
        btn19 = findViewById(R.id.button19);
        btn20 = findViewById(R.id.button20);
        btn21 = findViewById(R.id.button21);
        btn22 = findViewById(R.id.button22);
        btn23 = findViewById(R.id.button23);

        btn24 = findViewById(R.id.button24);
        btn25 = findViewById(R.id.button25);
        btn26 = findViewById(R.id.button26);
        btn27 = findViewById(R.id.button27);
        btn28 = findViewById(R.id.button28);
        btn29 = findViewById(R.id.button29);
        btn30 = findViewById(R.id.button30);

        btn100 = findViewById(R.id.button100);

    }

    public void onClick(View v) {
        Intent intent = new Intent();

         if (v == btn2) {
             //intent = new Intent(getApplicationContext(), MemberExrProgramListActivity.class);
             intent = new Intent(getApplicationContext(), CameraActivity.class);
        } else if (v == btn3) {
            intent = new Intent(getApplicationContext(), ExrProgramDetailActivity.class);
        } else if (v == btn4) {
            intent = new Intent(getApplicationContext(), MemberAllExrProgramListActivity.class);
        } else if (v == btn5) {
             intent = new Intent(getApplicationContext(), TrainerExrProgramFragment.class);
        } else if (v == btn6) {
            intent = new Intent(getApplicationContext(), AdminProgramManageActivity.class);
        } else if (v == btn7) {
        }
        //제호
        else if (v == btn8) {

        } else if (v == btn9) {
            intent = new Intent(getApplicationContext(), RegMemberDetailActivity.class);
        } else if (v == btn10) {
            intent = new Intent(getApplicationContext(), ProfileActivity.class);
        } else if (v == btn11) {
            intent = new Intent(getApplicationContext(), ProfileEditActivity.class);
        } else if (v == btn12) {
            intent = new Intent(getApplicationContext(), TrainerProfileActivity.class);
        } else if (v == btn13) {
            intent = new Intent(getApplicationContext(), TrainerListActivity.class);
        } else if (v == btn14) {
            intent = new Intent(getApplicationContext(), AdminUserManageActivity.class);
        } else if (v == btn15) {
        } else if (v == btn16) {
            intent = new Intent(this, LoginActivity.class);
        } else if (v == btn17) {
            intent = new Intent(this, SignupActivity.class);
        } else if (v == btn18) {
            intent = new Intent(this, HomeActivity.class);
        } else if (v == btn19) {
            if (SharedPrefManager.getInstance(MainActivity.this).isLoggedIn()) {
                SharedPrefManager.getInstance(MainActivity.this).logout();
            }
            return;
        } else if (v == btn20) {
            intent = new Intent(this, BeforeDayExrProgramActivity.class);
        } else if (v == btn21) {
            intent = new Intent(this, AfterDayExrProgramActivity.class);
        } else if (v == btn22) {
            intent = new Intent(this, ExrResultActivity.class);
        } else if (v == btn23) {
            intent = new Intent(this, ChattingListActivity.class);
        }
        //조란
        else if (v == btn24) {
            intent = new Intent(this, ExrProgramRegActivity.class);
        } else if (v == btn25) {
            intent = new Intent(this, DayExrProgramRegActivity.class);
        } else if (v == btn26) {
            intent = new Intent(this, DayExrProgramDetailRegActivity.class);
        } else if (v == btn27) {
            intent = new Intent(this, TrainerVideoRegActivity.class);
        } else if (v == btn28) {
            intent = new Intent(this, TrainerVideoListActivity.class);
        } else if (v == btn29) {
            intent = new Intent(this, AdminVideoManageActivity.class);
        } else if (v == btn30) {
            intent = new Intent(this, VideoPlayActivity.class);
        }

        else if (v == btn100) {
             intent = new Intent(this, ExercisingActivity.class);
         }
        startActivity(intent);
    }
}
