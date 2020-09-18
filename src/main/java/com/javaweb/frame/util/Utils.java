package com.javaweb.frame.util;

import java.util.Collection;

/**
 * name: RuoFei Xu
 * 2020/8/31 16:51
 */
public class Utils {

    public static boolean listIsNull(Collection collection){

        if (collection.size()==0 || collection==null){
            return true;
        }
        return false;
    }
}
