package cn.jji8.DiverseLogin;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
    Metrics Metrics;
    static main main;

    /**
     * 插件启动时调用的方法
     * */
    @Override
    public void onEnable() {
        Metrics = new Metrics(this,8790);
        main =this;
    }
    /**
     * 获取插件主类
     * */
    public static main getMain() {
        return main;
    }
}
