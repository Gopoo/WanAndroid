package com.didi.wancore.bean;

import java.util.List;

/**
 * Created by didi on 2018/2/3.
 */

public class SignBean {


    /**
     * http://www.wanandroid.com/user/login
     * http://www.wanandroid.com/user/register
     * data : {"collectIds":[2254,2253,2247,2237,2241],"icon":"","id":2355,"password":"a612325","type":0,"username":"praia2"}
     * errorCode : 0
     * errorMsg :
     */

    private User data;
    private int errorCode;
    private String errorMsg;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class User {
        /**
         * collectIds : [2254,2253,2247,2237,2241]
         * icon :
         * id : 2355
         * password : a612325
         * type : 0
         * username : praia2
         */

        private String icon;
        private int id;
        private String password;
        private int type;
        private String username;
        private List<Integer> collectIds;

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public List<Integer> getCollectIds() {
            return collectIds;
        }

        public void setCollectIds(List<Integer> collectIds) {
            this.collectIds = collectIds;
        }
    }
}
