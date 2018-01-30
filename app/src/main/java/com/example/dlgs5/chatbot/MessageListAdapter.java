package com.example.dlgs5.chatbot;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageListAdapter extends RecyclerView.Adapter {

    private ArrayList<String> stringUserSend;
    public MessageListAdapter(ArrayList<String> stringUserSend){ //這邊是接 MainActivity 傳進來的值
        this.stringUserSend = stringUserSend;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            // 設定 textView 為 item_title 這個 layout 物件
            textView = itemView.findViewById(R.id.text_message_body);
        }
    }

    @Override
    public MessageListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message_sent, null);
        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Integer size = Integer.valueOf(stringUserSend.get(position));
        Button btn = (Button) holder.itemView;
        btn.setText("size: " + size);
    }

    @Override
    public int getItemCount() {
        // 顯示的數量
        return stringUserSend.size();
    }


}