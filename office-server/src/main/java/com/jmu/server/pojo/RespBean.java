package com.jmu.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 公共返回对象
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespBean {
        private long code;
        private String message;
        private Object object;

        public static RespBean success(String message,Object object){
            return new RespBean(200,message,object);
        }

        public static RespBean error(String message,Object object){
            return new RespBean(500,message,object);
        }
}
