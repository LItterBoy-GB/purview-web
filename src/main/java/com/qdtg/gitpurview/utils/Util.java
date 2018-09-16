package com.qdtg.gitpurview.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @program: git-purview
 * @description: 工具类
 * @author: JavaLitterBoy
 * @create: 2018-09-16 10:25
 **/
public class Util {
    public static ArrayList<String> run(String cmd) throws IOException, InterruptedException {
        ArrayList<String> lines =new ArrayList<>();
        Process p = Runtime.getRuntime().exec(cmd, new String[]{""}, new File("E:\\learn\\WEB_STU"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = reader.readLine();
        boolean res = true;
        if(line==null||line.startsWith("fatal:")) res = false;
        if(!res) return null;       // 执行失败
        lines.add(line);
        while((line=reader.readLine())!=null) lines.add(line);
        p.waitFor();
        p.getInputStream().close();
        reader.close();
        return lines;
    }
}
