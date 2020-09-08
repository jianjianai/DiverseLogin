package cn.jji8.DiverseLogin.Interface;

import java.util.ArrayList;

/**
 * 用于协调各个模块的工作
 * */
public class work {
    //控制器列表
    ArrayList<controller> controllerList = new ArrayList<controller>();
    /**
     * 添加控制器模块
     * */
    public void addController(controller controller){
        controllerList.add(controller);
    }
    /**
     * 删除控制器模块
     * */
    public boolean deleteController(controller controller){
        return controllerList.remove(controller);
    }
    /**
     * 获取控制器模块
     * @param controllerName 控制器模块名字
     * @return null 列表中没有叫这个名字的控制器
     * */
    public controller getController(String controllerName){
        for(controller controller:controllerList){
            if(controllerName.equals(controller.getName())){
                return controller;
            }
        }
        return null;
    }
}
