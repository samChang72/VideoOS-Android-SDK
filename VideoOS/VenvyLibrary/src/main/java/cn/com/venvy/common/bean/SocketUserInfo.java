package cn.com.venvy.common.bean;

/**
 * Created by videojj_pls on 2018/9/18.
 */

public class SocketUserInfo {

    public String host;
    public String port;
    public String key;
    public String password;

    public SocketUserInfo(String key, String password, String host, String port) {
        this.host = host;
        this.password = password;
        this.key = key;
        this.port = port;
    }
}
