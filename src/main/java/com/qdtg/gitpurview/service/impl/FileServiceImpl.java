package com.qdtg.gitpurview.service.impl;

import com.qdtg.gitpurview.service.FileService;
import org.springframework.stereotype.Service;

/**
 * @program: git-purview
 * @description:
 * @author: JavaLitterBoy
 * @create: 2018-09-13 11:38
 **/
@Service
public class FileServiceImpl implements FileService {
    @Override
    public void encode(String[] files) {

    }

    @Override
    public boolean is_encode(String file) {
        return false;
    }
}
