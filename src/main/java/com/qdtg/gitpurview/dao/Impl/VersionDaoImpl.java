package com.qdtg.gitpurview.dao.Impl;

import com.qdtg.gitpurview.constant.VersionFileState;
import com.qdtg.gitpurview.dao.VersionDao;
import com.qdtg.gitpurview.pojo.VersionFile;
import com.qdtg.gitpurview.utils.Util;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: git-purview
 * @description: git版本管理Dao
 * @author: JavaLitterBoy
 * @create: 2018-09-13 11:37
 **/

@Component
public class VersionDaoImpl implements VersionDao {
    @Override
    public List<VersionFile> getDiffFilea(String commit1, String commit2) throws IOException, InterruptedException {
        if(!is_exist(commit1)||!is_exist(commit2))
            return null;
        String cmd = "git diff "+commit1+" "+commit1+" --name-status";
        ArrayList<String> res = Util.run(cmd);
        if(res==null)
            return null;
        List<VersionFile> files = new ArrayList<>();
        for(String line:res){
            String[] arr = line.replaceAll("\"","").split(" ");
            VersionFile versionFile = new VersionFile();
            versionFile.setDown_path(arr[1]);
            versionFile.setFile_path(arr[1]);
            switch (arr[0]){
                case "A":
                    versionFile.setFile_state(VersionFileState.ADD);
                    break;
                case "M":
                    break;
                case "D":
                    break;
            }
        }
        files.add(versionFile);
        return null;
    }

    @Override
    public boolean is_exist(String commit) throws IOException, InterruptedException {
        String cmd = "git show "+commit;
        return Util.run(cmd)!=null;
    }
}
