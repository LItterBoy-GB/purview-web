package com.qdtg.gitpurview.pojo;

import org.springframework.stereotype.Component;

/**
 * @program: git-purview
 * @description: 版本文件
 * @author: JavaLitterBoy
 * @create: 2018-09-13 10:50
 **/

public class VersionFile {

    private int file_state; // 文件状态
    private String file_path;   // 文件路径 相对路径 相对版本管理
    private String down_path;   // 文件获取路径

    public VersionFile(){

    }

    public int getFile_state() {
        return file_state;
    }

    public void setFile_state(int file_state) {
        this.file_state = file_state;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getDown_path() {
        return down_path;
    }

    public void setDown_path(String down_path) {
        this.down_path = down_path;
    }
}
