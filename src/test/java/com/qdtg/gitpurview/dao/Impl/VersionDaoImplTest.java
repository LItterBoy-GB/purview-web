package com.qdtg.gitpurview.dao.Impl;

import com.qdtg.gitpurview.utils.Util;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class VersionDaoImplTest {

    private VersionDaoImpl versionDao;

    @Before
    public void before(){
        versionDao = new VersionDaoImpl();
    }

    @Test
    public void getDiffFilea() {

    }

    @Test
    public void is_exist() throws IOException, InterruptedException {
        assertFalse(versionDao.is_exist("asdf"));
        assertTrue(versionDao.is_exist("df4d711d78d0055183cb41d8936ad3b3a874e749"));
    }
}