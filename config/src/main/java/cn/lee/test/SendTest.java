package cn.lee.test;

import cn.hutool.http.HttpUtil;

import java.util.HashMap;

public class SendTest {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            String url = "http://localhost:1010/acturator/bus-refresh";
            String post = HttpUtil.post(url,new HashMap<>());
            Thread.sleep(1000 * 10);
        }
    }
}
