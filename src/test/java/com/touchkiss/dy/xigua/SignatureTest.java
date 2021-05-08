package com.touchkiss.dy.xigua;

import org.apache.commons.io.FileUtils;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.File;

/**
 * Created on 2021/04/28 10:34
 *
 * @author Touchkiss
 */
public class SignatureTest {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        try{
            File jsFile = new File("D:\\documents\\java\\dy\\src\\main\\resources\\static\\xigua\\xigua.js");
            String js = FileUtils.readFileToString(jsFile, "utf-8");
            engine.eval(js);
            if (engine instanceof Invocable) {
                Invocable in = (Invocable) engine;
                System.out.println(in.invokeFunction("get_signature","'https://www.ixigua.com/api/videov2/author/new_video_list?to_user_id=4183675287&offset=0&limit=30&order=new'"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
