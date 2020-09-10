package cn.jji8.DiverseLogin.Interface;

import org.bukkit.entity.Player;

/**
 * 控制器的接口
 * */
public interface controller {
    /**
     * 返回控制器模块的名字
     * */
    public String getName();
    /**
     * 获取一个初始化的Login
     * 每个玩家都对应一个Login对象，用作处理登入
     * @param Player 控制的对应玩家
     * */
    public Login getLogin(Player Player);
}
