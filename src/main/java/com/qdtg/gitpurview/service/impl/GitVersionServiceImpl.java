package com.qdtg.gitpurview.service.impl;

import com.qdtg.gitpurview.pojo.Result;
import com.qdtg.gitpurview.pojo.VersionFile;
import com.qdtg.gitpurview.service.VersionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: git-purview
 * @description: git版本控制
 * @author: JavaLitterBoy
 * @create: 2018-09-13 11:36
 **/
@Service
public class GitVersionServiceImpl implements VersionService {
    @Override
    public Result commitFiles(List<VersionFile> files) {
        return null;
    }

    @Override
    public Result pullFiles(String commit) {
        return null;
    }
}
