package com.jacob.www.easycar.net;

/**
 * Created by Raven on 2017/11/12.
 */

public interface LoadingCallBack<T> {
    void loaded(T data);
    void error(String msg);
}
