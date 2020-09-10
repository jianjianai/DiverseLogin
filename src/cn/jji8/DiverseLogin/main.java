package cn.jji8.DiverseLogin;

import cn.jji8.DiverseLogin.Manager.controller;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    Metrics Metrics;
    controller controller;
    static main main;

    /**
     * 插件启动时调用的方法
     * */
    @Override
    public void onEnable() {
        Metrics = new Metrics(this,8790);
        getLogger().info("开始加载");
        controller = new controller();
        main =this;
        getLogger().info("加载完成");
    }
    /**
     * 获取插件主类
     * */
    public static main getMain() {
        return main;
    }
    /**
     * 获取controller
     * */
    public cn.jji8.DiverseLogin.Manager.controller getController() {
        return controller;
    }
}
