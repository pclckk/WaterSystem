package com.souhou.watersystem.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/7/18.
 */

public class NewsList {

    private List<InstallationBean> Installation;

    public List<InstallationBean> getInstallation() {
        return Installation;
    }

    public void setInstallation(List<InstallationBean> Installation) {
        this.Installation = Installation;
    }

    public static class InstallationBean {
        /**
         * id : 18
         * installation_SendTime : null
         * Installation_User : 琳达
         * Installation_Userphone : 13526023026
         * Installation_Address : 大方向海南购房人已经
         */

        private int id;
        private Object installation_SendTime;
        private String Installation_User;
        private long Installation_Userphone;
        private String Installation_Address;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Object getInstallation_SendTime() {
            return installation_SendTime;
        }

        public void setInstallation_SendTime(Object installation_SendTime) {
            this.installation_SendTime = installation_SendTime;
        }

        public String getInstallation_User() {
            return Installation_User;
        }

        public void setInstallation_User(String Installation_User) {
            this.Installation_User = Installation_User;
        }

        public long getInstallation_Userphone() {
            return Installation_Userphone;
        }

        public void setInstallation_Userphone(long Installation_Userphone) {
            this.Installation_Userphone = Installation_Userphone;
        }

        public String getInstallation_Address() {
            return Installation_Address;
        }

        public void setInstallation_Address(String Installation_Address) {
            this.Installation_Address = Installation_Address;
        }
    }
}
