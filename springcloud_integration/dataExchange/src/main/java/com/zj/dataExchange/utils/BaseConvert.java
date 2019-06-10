package com.zj.dataExchange.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.util.CollectionUtils;

/**
 * 
 * 
 * @author zhangjing
 * date: 2019年3月13日 下午12:04:03
 */
public class BaseConvert {

	static Map<String,Map<String,BeanCopier>> map=new ConcurrentHashMap<>();

    public static <T,K> K convert(T t,Class<K> k){
        if(t==null){
            return null;
        }
        String tClassName=t.getClass().getName();
        Map<String,BeanCopier> newBeanCopier=map.get(tClassName);
        BeanCopier beanCopier=null;
        if(newBeanCopier!=null){
            beanCopier=newBeanCopier.get(k.getName());
            if(beanCopier==null){
                beanCopier=BeanCopier.create(t.getClass(), k, false);
                newBeanCopier.put(k.getName(),beanCopier);
            }
        }else{
            newBeanCopier=new HashMap<>();
            beanCopier=BeanCopier.create(t.getClass(), k, false);
            newBeanCopier.put(k.getName(),beanCopier);
            map.put(tClassName,newBeanCopier);
        }
        try {
            K object=k.newInstance();
            beanCopier.copy(t,object,null);
            return object;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static <T,K> List<K> convert(List<T> ts,Class<K> k){
        if(ts==null){
            return null;
        }
        if(CollectionUtils.isEmpty(ts)){
            return null;
        }
        Class<?> tClass=ts.get(0).getClass();
        String tClassName=tClass.getName();
        Map<String,BeanCopier> newBeanCopier=map.get(tClassName);
        BeanCopier beanCopier=null;
        if(newBeanCopier!=null){
            beanCopier=newBeanCopier.get(k.getName());
            if(beanCopier==null){
                beanCopier=BeanCopier.create(tClass, k, false);
                newBeanCopier.put(k.getName(),beanCopier);
            }
        }else{
            newBeanCopier=new HashMap<>();
            beanCopier=BeanCopier.create(tClass, k, false);
            newBeanCopier.put(k.getName(),beanCopier);
            map.put(tClassName,newBeanCopier);
        }
        List<K> list=new ArrayList<>();
        try {
            for(T t:ts){
                K object= k.newInstance();
                beanCopier.copy(t,object,null);
                list.add(object);
            }

            return list;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
