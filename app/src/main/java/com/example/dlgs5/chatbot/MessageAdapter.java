package com.example.dlgs5.chatbot;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter {

    private ArrayList<Message> messageList;

    MessageAdapter(ArrayList<Message> messageList){
        this.messageList = messageList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        switch (viewType) {
            case 0:
                View view0 = inflater.inflate(R.layout.item_message_sent, parent, false);
                return new ViewHolder(view0);
            case 1:
                View view1 = inflater.inflate(R.layout.item_message_received, parent, false);
                return new ViewHolder(view1);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
        vh.getMsgBody().setText(messageList.get(position).getContent());
        vh.getMsgTime().setText(messageList.get(position).getTime());
    }

    @Override
    public int getItemViewType(int position) {
        return messageList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView msgBody;
        private TextView msgTime;
        public ViewHolder(View itemView) {
            super(itemView);
            msgBody = itemView.findViewById(R.id.text_message_body);
            msgTime = itemView.findViewById(R.id.text_message_time);
        }
        public TextView getMsgBody(){return  msgBody;}
        public TextView getMsgTime(){return  msgTime;}
    }
}
