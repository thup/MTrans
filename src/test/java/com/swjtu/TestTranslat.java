package com.swjtu;/**
 * @Auther: tlibn
 * @Date: 2021/02/03/11:46
 * @Description:
 */

import com.swjtu.lang.LANG;
import com.swjtu.querier.Querier;
import com.swjtu.trans.AbstractTranslator;
import com.swjtu.trans.impl.GoogleTranslator;

import java.util.List;

public class TestTranslat {
    public static void main(String[] args) {
        Querier<AbstractTranslator> querierTrans = new Querier<>();                   // 获取查询器

        querierTrans.setParams(LANG.ZH, LANG.EN, "如果这都不算爱，我有什么好悲哀！");    // 设置参数

        querierTrans.attach(new GoogleTranslator());                                  // 向查询器中添加 Google 翻译器

        List<String> result = querierTrans.execute();                                 // 执行查询并接收查询结果

        for (String str : result) {
            System.out.println(str);
        }
    }
}
