package cn.yueshutong.server.remote.parm.entity;

import lombok.Data;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Create by yster@foxmail.com 2018/12/31 0031 12:48
 */
@Data
public class Address implements Serializable {
    private String name; //用于前端展示
    private String address; //真实ip地址
    private String baseAddress; //加密ip地址

    /**
     * 默认主机名
     */
    public String getName() {
        if (this.name==null||this.name.trim().isEmpty()){
            try {
                this.name= InetAddress.getByName(this.address).getHostName();
            } catch ( UnknownHostException e) {
                this.name = this.address;
                e.printStackTrace();
            }
        }
        return name;
    }

}
