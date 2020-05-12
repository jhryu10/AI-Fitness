package kr.ssu.ai_fitness.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.SimpleDateFormat;

import kr.ssu.ai_fitness.ChattingActivity;
import kr.ssu.ai_fitness.R;
import kr.ssu.ai_fitness.adapter.PersonAdapter;
import kr.ssu.ai_fitness.listener.OnPersonItemClickListener;
import kr.ssu.ai_fitness.dto.Person;
import kr.ssu.ai_fitness.sharedpreferences.SharedPrefManager;


public class ChattingListFragment extends Fragment {

    final private int maxNumPeople = 3;

    private int uid;//채팅을 요구하는 아이디, 즉 단말기에 로그인된 uid
    private String chatRoomUid;
    private String festivalName;
    private String contentId;

    RecyclerView recyclerView;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup view = (ViewGroup)inflater.inflate(R.layout.fragment_chatting_list, container, false);

        uid = SharedPrefManager.getInstance(getActivity()).getUser().getId();

        recyclerView = view.findViewById(R.id.fragment_chatting_list_rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        Log.d("xxxxxxxxx", "here1");
        PersonAdapter adapter = new PersonAdapter(uid, getActivity());
        adapter.addItem(new Person("홍길동", "뭐하지", "10:20"));
        adapter.addItem(new Person("김가나", "안녕하세요", "10:50"));
        recyclerView.setAdapter(adapter);


        Log.d("xxxxxxxxx", "here2");

        adapter.setOnItemClickListner(new OnPersonItemClickListener() {
            @Override
            public void onItemClick(PersonAdapter.ViewHolder holder, View view, int position) {
                Intent intent = new Intent(getActivity(), ChattingActivity.class);

                //*****여기 또는 어댑터에서 상대방 아이디(destinationUid) 넘겨줘야함.

                startActivity(intent);
            }
        });

        return view;
    }
}
