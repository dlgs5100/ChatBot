package com.example.dlgs5.chatbot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //recyclerView.findViewById(R.id.recyclerview_message_list);

        recyclerView = new RecyclerView(this);
        setContentView(recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new RecyclerView.Adapter() {

            class ViewHolder extends RecyclerView.ViewHolder{
                private TextView tv;
                public ViewHolder(TextView itemView) {
                    super(itemView);
                    tv = itemView;
                }
                public TextView getTv(){return  tv;}
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ViewHolder(new TextView(parent.getContext()));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                ViewHolder vh = (ViewHolder) holder;
                vh.getTv().setText(Integer.toString(position));
            }

            @Override
            public int getItemCount() {
                return 100;
            }
        });
    }

}
