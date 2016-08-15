package com.paulz.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        dataAll.add(new Data1("打开链接快乐大脚"));
        dataAll.add(new Data2(R.drawable.img1));
        dataAll.add(new Data2(R.drawable.img2));
        dataAll.add(new Data1("萨达姆分，吗，"));
        dataAll.add(new Data3(R.drawable.img3,R.drawable.img4,R.drawable.img5));
        dataAll.add(new Data4("昂啥呢",true));
        dataAll.add(new Data3(R.drawable.img6,R.drawable.img7,R.drawable.img8));
        dataAll.add(new Data1("萨达姆分，吗，"));
        dataAll.add(new Data2(R.drawable.img9));
        dataAll.add(new Data2(R.drawable.img10));
        dataAll.add(new Data2(R.drawable.img11));
        dataAll.add(new Data1("暗红色的尽快和圣诞节快放假"));
        dataAll.add(new Data1("跨境开理发店了"));
        dataAll.add(new Data1("1434"));
        dataAll.add(new Data1("地方"));
        dataAll.add(new Data1("主线程执行"));
        dataAll.add(new Data4("ansdklma,sdm,",true));
        dataAll.add(new Data4("撒角度看",true));
        dataAll.add(new Data3(R.drawable.img12,R.drawable.img13,R.drawable.img14));
        dataAll.add(new Data1("暗红色的尽快和圣诞节快放假"));
        dataAll.add(new Data1("13123123"));
        dataAll.add(new Data1("154667678"));
        mAdapter.setList(dataAll);
        mAdapter.notifyDataSetChanged();
    }


}
