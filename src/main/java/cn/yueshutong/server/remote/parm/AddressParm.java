package cn.yueshutong.server.remote.parm;

import cn.yueshutong.server.remote.parm.entity.Address;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * 远程主机的地址列表
 * Create by yster@foxmail.com 2018/12/31 0031 0:16
 */
@Validated
@Component
@ConfigurationProperties(prefix="monitor")
@Data
public class AddressParm {

    private List<Address> serve;

}