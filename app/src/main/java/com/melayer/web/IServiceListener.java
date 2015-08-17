package com.melayer.web;

/**
 * Created by root on 8/13/15.
 */
public interface IServiceListener {

    String doGet(String url) throws Exception;

    String doPost(String url, String data, Boolean isParams) throws Exception;
}
