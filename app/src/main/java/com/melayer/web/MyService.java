package com.melayer.web;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by root on 8/13/15.
 */
public class MyService implements IServiceListener {

    private URL urlConnection;
    private HttpURLConnection connectionHttp;


    @Override
    public String doGet(String url) throws Exception {

        urlConnection = new URL(url);

        connectionHttp = (HttpURLConnection) urlConnection.openConnection();
        connectionHttp.setRequestMethod("GET"); // imp

        //connectionHttp.setRequestProperty("Content-Type", "application/json"); //imp
        //connectionHttp.setRequestProperty("Accept", "application/json"); //imp

        connectionHttp.setDoInput(true);
        //connectionHttp.setDoOutput(true);

        InputStream readSteram = connectionHttp.getInputStream();
        StringBuffer bufferResponse = new StringBuffer();

        while (true) {

            int dataByte = readSteram.read();

            if (dataByte == -1) break;
            else {

                bufferResponse.append("" + ((char) dataByte));
            }
        }

        return bufferResponse.toString();
    }

    @Override
    public String doPost(String url, String data, Boolean isParams) throws Exception {
        return null;
    }
}
