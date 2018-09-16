package com.qdtg.gitpurview.service;

import com.qdtg.gitpurview.pojo.Result;
import com.qdtg.gitpurview.pojo.VersionFile;

import java.util.List;

/**
 * @program: git-purview
 * @description: 版本控制相关操作
 * @author: JavaLitterBoy
 * @create: 2018-09-10 14:23
 **/
public interface VersionService {

    /**
     *
     * @param files 待提交文件
     * @return 返回结果
     */
    public Result commitFiles(List<VersionFile> files);

    /**
     * @param commit 待拉去的提交 null为最新  暂时只支持 最新的
     * @return  返回结果{"code","mess","data"=>[]}
     */
    public Result pullFiles(String commit);

}
