package com.zixue;

import java.util.*;

/**
 * java:
 *      数据类型：
 *          -- byte\shot\int\long\float\double\char\boolean
 *      包装类
 *          --Byte\Shot\Integer\Long\Float\Double\Charactor\Boolean
 *          Why:为什么要有包装类
 *              ：a、作为 和基本数据类型对应的类 类型存在，方便涉及到对象的操作。
 *                b、包含每种基本数据类型的相关属性如最大值、最小值等，以及相关的操作方法
 *      字节（1字节=8位）：    byte：    1
 *                          int:      4
 *                          char:     2
 *                          bool:1/8
 *                          float:    4
 *                          long:     8
 *                          double:   8
 *                          shot:     2
 *
 *      类:
 *          Why：什么是类，怎么理解在java中：
 *              https://blog.csdn.net/lvping100/article/details/81563230
 *      对象
 *
 *      集合:
 *          角色：容器
 *           Collection:接口
 *           Collections:工具类
 *           Array:数组
 *           Arrays:数组工具类
 *
 *           Collection:
 *              -- Set
 *                  --Hashset 1.2
 *                      --LinkedHashSet 1.4
 *                  --TreeSet 1.2
 *              -- List
 *                  --AbstractList
 *                      --ArrayList 1.2
 *                      --Vector 1.0
 *                          --Stack 1.0
 *                  --AbstractSequentialList
 *                      --LinkedList 1.2
 *              -- Queue
 *0000 0001
 *0001 0000
 *           --Map
 *              --HashMap 1.2
 *              --TreeMap 1.2
 *              --Hashtable 1.0
 *
 *           --jdk1.7 jdk1.8
 *           HashMap
 *              -结构：link 、数组(hash筒  16：1<<4 )、树
 *              1.7 link 、数组
 *              1.8 link 、数组、树(红黑树)
 *               扩容机制：
 *
 *      String:
 *          final 类
 *
 *          StringBuffer 1.0
 *          StringBuilder 1.5
 *
 *      线程
 *      IO
 *      异常
 *      数据库
 *          关系型数据库：mysql oracle db2
 *          非关系型数据库 redis memcached
 *      spring
 *
 *      mybatis
 *      springmvc
 *      redis
 *      nginx
 *
 *
 */
public class JavaBaseOne {
    public static void main(String[] args) {
        int aa = "123".hashCode();
        System.out.println(aa);
        int a =32 % aa; //&
        int b =32 & aa; //&
        System.out.println(a+"---"+b);
//        new Circle();
        /**
         * shape draw constructor
         * shape constructor
         * circle draw constructor
         * circle constructor
         */


    }


}

class Draw {

    public Draw(String type) {
        System.out.println(type+" draw constructor");
    }
}

class Shape {
    private Draw draw = new Draw("shape");

    public Shape(){
        System.out.println("shape constructor");
    }
}
class Circle extends Shape {
    private Draw draw = new Draw("circle");
    public Circle() {
        System.out.println("circle constructor");
    }
}
