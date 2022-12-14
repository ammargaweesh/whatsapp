package com.instant.whatsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ChatsFragment extends Fragment {

    RecyclerView chatRecycler;
    ArrayList<UserModel>users = new ArrayList<>();
    ChatAdapter chatAdapter;

    public ChatsFragment() {
    }

    public static ChatsFragment newInstance(String param1, String param2) {
        ChatsFragment fragment = new ChatsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_chats, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecycler(view);

    }
    private void setupRecycler(View view){

        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));
        users.add(new UserModel(R.drawable.dog,"dog"));

        chatRecycler=view.findViewById(R.id.chat_recycler);
        chatAdapter= new ChatAdapter(users);
        chatRecycler.setLayoutManager(new LinearLayoutManager(requireContext()));
        chatRecycler.setAdapter(chatAdapter);


    }
}