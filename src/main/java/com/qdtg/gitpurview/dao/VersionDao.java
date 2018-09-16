package com.qdtg.gitpurview.dao;

import com.qdtg.gitpurview.pojo.VersionFile;

import java.io.IOException;
import java.util.List;

/**
 * @program: git-purview
 * @description: 版本管理Dao
 * @author: JavaLitterBoy
 * @create: 2018-09-13 10:57
 **/
public interface VersionDao {
    /**
     *
     * @param commit1 提交标识
     * @param commit2 提交标识
     * @return 返回两次提交的不同文件
     */
    public List<VersionFile> getDiffFilea(String commit1, String commit2) throws IOException, InterruptedException;

    public boolean is_exist(String commit) throws IOException, InterruptedException;
}
