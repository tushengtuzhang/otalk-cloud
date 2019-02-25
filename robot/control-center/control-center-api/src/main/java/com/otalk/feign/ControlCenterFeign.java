package com.otalk.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author zhangtusheng
 */
@FeignClient(value = "control-center-server")
public interface ControlCenterFeign {


}
