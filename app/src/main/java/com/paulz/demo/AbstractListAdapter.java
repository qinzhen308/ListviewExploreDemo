package com.paulz.demo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: kait
 * Date: 12-10-24
 * Time: 上午11:56
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractListAdapter <T> extends BaseAdapter {

    protected List<T> mList;
    protected Context mContext;
    private AdapterView mListView;
    protected boolean isGridMode;

    protected LayoutInflater mInflater;

    public AbstractListAdapter(Activity context) {
        this.mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    public AbstractListAdapter(Context context) {
    	mContext=context;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public Object getItem(int i) {
        return mList == null ? null : mList.get(i);
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.size();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public abstract View getView(int i, View view, ViewGroup viewGroup);

    public void setList(List<T> list) {
        this.mList = list;
    }

    public List<T> getList() {
        return this.mList;
    }

    public AdapterView getListView(){
        return mListView;
    }

    public void setListView(AdapterView listView){
        mListView = listView;
    }

    public Context getContext(){
        return mContext;
    }

    public void setList(T[] list){
        if (list == null) return;
        ArrayList<T> arrayList = new ArrayList<T>(list.length);
        for (T t : list) {
            arrayList.add(t);
        }
        setList(arrayList);
    }

    public void clear() {
        if (mList != null && mList.size() > 0){
            mList.clear();
        }
    }

}
