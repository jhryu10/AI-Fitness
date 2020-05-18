package kr.ssu.ai_fitness.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import kr.ssu.ai_fitness.R;
import kr.ssu.ai_fitness.TrainerVideoListActivity;
import kr.ssu.ai_fitness.dto.Member_reg_program;
import kr.ssu.ai_fitness.view.Trainer_reg_programView;

public class TrainerExrProgramFragment extends Fragment {

    private ListView mListview;

    Button buttonMotion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.fragment_trainer_exr_program, container, false);

        ListView listView = (ListView)view.findViewById(R.id.fragment_trainer_exr_program_listview);
        buttonMotion = view.findViewById(R.id.fragment_trainer_exr_program_button_motion);

        TrainerExrProgramFragment.ListAdapter adapter = new TrainerExrProgramFragment.ListAdapter();
        //adapter에 data값
        adapter.addItem(new Member_reg_program("다이어트1", "★★★★☆","★★★★☆","30 명","","","",""));
        adapter.addItem(new Member_reg_program("다이어트2", "★★★★☆","★★★★☆","30 명","","","",""));
        adapter.addItem(new Member_reg_program("다이어트3", "★★★★☆","★★★★☆","30 명","","","",""));
        adapter.addItem(new Member_reg_program("다이어트4", "★★★★☆","★★★★☆","30 명","","","",""));


        listView.setAdapter(adapter);
        //이렇게해서 listView껍데기가 어뎁터에게 몇 개의 데이터가 있고 어떤 뷰를 집어넣어야하는지
        //물어보면 어뎁터가 아래의 코드를 통해 만들어놓은 정보를 종합하여 전달함

        buttonMotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //*****트레이너의 동작 동영상 목록 화면으로 넘어가는데, 인텐트로 넘겨줄 값이 있을 수도 있음
                Intent intent = new Intent(getActivity(), TrainerVideoListActivity.class);

                startActivity(intent);
            }
        });

        return view;
    }

    class ListAdapter extends BaseAdapter {
        //어뎁터가 데이터를 관리하며 데이터를 넣었다가 뺄 수도 있으므로 ArrayList를 활용

        ArrayList<Member_reg_program> items = new ArrayList<Member_reg_program>();
        //데이터형을 다양하게 담고있는 java파일을 하나 더 만들어줄거에요

        //!! 그런데 ArrayList에 데이터를 넣는 기능이 지금 없으므로 함수를 하나 더 만듬
        public void addItem(Member_reg_program item){
            items.add(item);
        }

        //너네 어뎁터 안에 몇 개의 아이템이 있니? 아이템갯수 반환함수
        @Override
        public int getCount() {
            return items.size(); //위의 ArrayList내부의 아이템이 몇 개나 들었는지 알려주게됨
        }

        @Override
        public Object getItem(int position) {
            return items.get(position); //position번째의 아이템을 얻을거야.
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


        //어뎁터가 데이터를 관리하기 때문에 화면에 보여질 각각의 화면에 보일 뷰도 만들어달라는 것
        //각각의 아이템 데이터 뷰(레이아웃)을 만들어주어 객체를 만든다음에 데이터를 넣고 리턴해줄 것임
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Trainer_reg_programView view = new Trainer_reg_programView(getActivity());
            //어떤 뷰든 안드로이드에서는 Context객체를 받게 되어있으므로 getApplicationCotext로 넣어줍니다.

            //이제 이 뷰를 반환해주면 되는데 이 뷰가 몇 번째 뷰를 달라는 것인지 position값이 넘어오므로
            Member_reg_program item  = items.get(position); //SigerItem은 참고로 Dataset임. 따로 기본적인것만 구현해놓음
            //이 position값을 갖는 아이템의 SigerItem객체를 새로 만들어준 뒤
            view.setTitle(item.getTitle());
            view.setLevel(item.getLevel());
            view.setRate(item.getRating());
            view.setMem_id_cnt(item.getMem_id_cnt());
            //이렇게 해당 position에 맞는 값으로 설정

            //그렇게 설정을 잘 해놓은 다음에 view를 반환해야 데이터값이 들어간 레이아웃이 반환
            return view;
        }
    }
}
