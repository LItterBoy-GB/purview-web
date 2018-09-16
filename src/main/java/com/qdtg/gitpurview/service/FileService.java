package com.qdtg.gitpurview.service;

/**
 * @program: git-purview
 * @description: 文件相关操作
 * @author: JavaLitterBoy
 * @create: 2018-09-10 12:32
 **/
public interface FileService {

    /**
     * 加密文件
     * @param files 待加密的文件
     */
    public void encode(String files[]);

    /**
     * 判断文件是否加密
     * @param file 被判断文件
     * @return true/false
     */
    public boolean is_encode(String file);
}
