package com.example.ll.recycleview_staggered;

import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private StaggeredGridLayoutManager staggeredgridlayoutmanager;
    private List<Gril> grils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grils=new ArrayList<>();
        grils.add(new Gril("a0",R.drawable.a0));
        grils.add(new Gril("a1",R.drawable.a1));
        grils.add(new Gril("a2",R.drawable.a2));
        grils.add(new Gril("a3",R.drawable.a3));
        grils.add(new Gril("a4",R.drawable.a4));
        grils.add(new Gril("a5",R.drawable.a5));
        grils.add(new Gril("a6",R.drawable.a6));
        grils.add(new Gril("a7",R.drawable.a7));
        grils.add(new Gril("a8",R.drawable.a8));
        grils.add(new Gril("a9",R.drawable.a9));
        grils.add(new Gril("b0",R.drawable.b0));
        grils.add(new Gril("b1",R.drawable.b1));
        grils.add(new Gril("b2",R.drawable.b2));
        grils.add(new Gril("b3",R.drawable.b3));
        grils.add(new Gril("b4",R.drawable.b4));
        grils.add(new Gril("b5",R.drawable.b5));
        grils.add(new Gril("b6",R.drawable.b6));
        grils.add(new Gril("b7",R.drawable.b7));
        grils.add(new Gril("b8",R.drawable.b8));
        grils.add(new Gril("b9",R.drawable.b9));
        recyclerView= (RecyclerView) findViewById(R.id.recycle);
        staggeredgridlayoutmanager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredgridlayoutmanager);
        recyclerView.setAdapter(new MyAdapter());
    }
    class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
    {
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(MainActivity.this).inflate(R.layout.recycleview_item,parent,false));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            Gril gril=grils.get(position);
            ((MyViewHolder)holder).iv.setImageDrawable(ContextCompat.getDrawable(MainActivity.this,gril.getPicture()));
            ((MyViewHolder) holder).tv.setText(gril.getName());
        }

        @Override
        public int getItemCount() {
            return grils.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder
        {
            private ImageView iv;
            private TextView tv;

            public MyViewHolder(View itemView) {
                super(itemView);
                iv= (ImageView) itemView.findViewById(R.id.item_iv);
                tv= (TextView) itemView.findViewById(R.id.item_tv);
            }
        }
    }
}
