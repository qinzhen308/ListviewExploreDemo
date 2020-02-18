package com.paulz.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.paulz.demo.mode.Data1;
import com.paulz.demo.mode.Data2;
import com.paulz.demo.mode.Data3;
import com.paulz.demo.mode.Data4;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mListview;
    private MultiStyleListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListview=(ListView)findViewById(R.id.listview);
        mAdapter=new MultiStyleListAdapter(this);
        mListview.setAdapter(mAdapter);

        createData();
    }

    private void createData(){
        List<Object> dataAll=new ArrayList<>();
        dataAll.add(new Data1("小白兔和大灰狼的故事"));
        dataAll.add(new Data1("话说小白兔遇到大灰狼"));
        dataAll.add(new Data2(R.drawable.img1));
        dataAll.add(new Data2(R.drawable.img2));
        dataAll.add(new Data1("小白兔说大灰狼大灰狼 你快问我是不是小白兔"));
        dataAll.add(new Data3(R.drawable.img3,R.drawable.img4,R.drawable.img5));
        dataAll.add(new Data4("你快问啊快问啊！！！！",true));
        dataAll.add(new Data1("大灰狼说 你是不是小白兔啊？"));
        dataAll.add(new Data2(R.drawable.img6));
        dataAll.add(new Data2(R.drawable.img7));
        dataAll.add(new Data1("小白兔很高兴 是的是的我是的！！！"));
        dataAll.add(new Data1("然后"));
        dataAll.add(new Data1("小白兔又说 大灰狼大灰狼 你快问我是不是长颈鹿"));
        dataAll.add(new Data2(R.drawable.img8));
        dataAll.add(new Data1("你快问啊快问啊！！！！"));
        dataAll.add(new Data1("大灰狼很无奈 好吧。。。那。。。你是不是长颈鹿啊"));
        dataAll.add(new Data4("小白兔朝他后脑勺一巴掌 你个笨蛋！我都说了我是小白兔了！！！。。。。。",true));
        dataAll.add(new Data4("撒角度看",true));
        dataAll.add(new Data3(R.drawable.img9,R.drawable.img10,R.drawable.img11));
        dataAll.add(new Data1("。。。。。。。。。。。。"));
        mAdapter.setList(dataAll);
        mAdapter.notifyDataSetChanged();
    }


}
