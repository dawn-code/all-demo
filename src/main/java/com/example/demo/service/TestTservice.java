package com.example.demo.service;

import org.springframework.stereotype.Service;

/**
 * 接口泛型使用
 *
 * @author chetianliang
 */


public interface TestTservice<T> {

    /**
     * 添加
     *
     * @param t 传入参数
     */
    void add(T t);
}
