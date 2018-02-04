package com.didi.wanandroid.view;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by didi on 2018/2/4.
 */

public class BottomItems {

    private List<BottomBean> beans = new LinkedList<>();
    private BottomItems(){}
    public BottomItems add(BottomBean bean){
        beans.add(bean);
        return this;
    }
    public BottomItems add(List<BottomBean> beans){
        beans.addAll(beans);
        return this;
    }
    public List<BottomBean> get(){
        return beans;
    }
    public static class Holder{
        private static final BottomItems INSTANCE = new BottomItems();
        public static final BottomItems creat(){
            return INSTANCE;
        }
    }
}
