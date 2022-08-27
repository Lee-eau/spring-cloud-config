package cn.lee.test;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;

import java.util.HashMap;

public class SendTest {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String,Object> map = new HashMap<>();
        while (true){
            String url = "http://localhost:1010/acturator/bus-refresh";
            HttpRequest request = HttpUtil.createPost(url);
            request.contentType("application/json");
            HttpResponse response = request.execute();
            Thread.sleep(1000 * 10);
        }
    }
}
