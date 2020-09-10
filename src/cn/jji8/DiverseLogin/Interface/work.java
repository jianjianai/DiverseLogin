package cn.jji8.DiverseLogin.Interface;

import cn.jji8.DiverseLogin.main;
import cn.jji8.DiverseLogin.pilot.Null;
import org.bukkit.entity.Player;

import java.util.ArrayList;

/**
 * 用于协调各个模块的工作
 * */
public class work {
    //控制器列表
    static ArrayList<controller> controllerList = new ArrayList<controller>();
    /**
     * 添加控制器模块
     * */
    public static void addController(controller controller){
        controllerList.add(controller);
    }
    /**
     * 删除控制器模块
     * */
    public static boolean deleteController(controller controller){
        return controllerList.remove(controller);
    }
    /**
     * 获取控制器模块
     * @param controllerName 控制器模块名字
     * @return null 列表中没有叫这个名字的控制器
     * */
    public static controller getController(String controllerName){
        for(controller controller:controllerList){
            if(controllerName.equals(controller.getName())){
                return controller;
            }
        }
        return null;
    }
    /**
     * 设置玩家已经成功状态
     * @param state 登入状态true已登入 false未登入
     * */
    public static void LoginState(Player Player,boolean state){
        if(state){
            main.getMain().getController().remove(Player);
        }else {
            main.getMain().getController().set(Player,new Null(Player));
        }

    }
}
