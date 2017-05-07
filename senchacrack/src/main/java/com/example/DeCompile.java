package com.example;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

/**
 * Created by IntelliJ IDEA
 * User:    linxianqing
 * Date:    2017/4/23
 * Email:   linxianqinwork@qq.com
 */
public class DeCompile {
    public static void main(String args[]) {
        ClassPool pool = ClassPool.getDefault();
        System.out.println(pool);
        try {
//            pool.insertClassPath("50228e4ed1034dfe.jar");
            CtClass cc = pool.get("com.sencha.idea.LicenseValidator");
//            CtClass cc1 = pool.get("com.sencha.idea.LicenseValidator");
            System.out.println(cc);
            CtMethod cm = cc.getDeclaredMethod("validateLicense", null);
//            cm.setBody("return true;");
//            cc.writeFile();
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
//        catch (CannotCompileException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
