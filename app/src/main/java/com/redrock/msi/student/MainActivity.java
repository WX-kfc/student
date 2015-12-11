package com.redrock.msi.student;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Item> itemList = new ArrayList<>();
    private void initItem() {
        for (int i = 0; i < 100; i++) {
            Item one = new Item("学生：五河士道" + "  学校：" + "约会大作战学院",
                    R.mipmap.one);
            Item two = new Item("学生：夏娜" + "  学校：" + "灼眼的夏娜学院",
                    R.mipmap.two);
            Item three = new Item("学生：刻风雫" + "  学校：" + "秋叶原之旅学院",
                    R.mipmap.three);
            Item four = new Item("学生：夜刀神十香" + "  学校：" + "约会大作战学院",
                    R.mipmap.four);
            Item five = new Item("学生：莉娜" + "  学校：" + "龙之谷学院",
                    R.mipmap.five);
            itemList.add(one);
            itemList.add(two);
            itemList.add(three);
            itemList.add(four);
            itemList.add(five);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = (ListView) findViewById(R.id.list_view);
        initItem();
        ItemAdapter adapter = new ItemAdapter(MainActivity.this, R.layout.list_item, itemList);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item =itemList.get(position);
                Toast.makeText(MainActivity.this, item.getText(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}


