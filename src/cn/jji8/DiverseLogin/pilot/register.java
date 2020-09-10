package cn.jji8.DiverseLogin.pilot;

import cn.jji8.DiverseLogin.Interface.Login;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * 基础的注册控制器，用于给玩家选择登入模块
 * */
public class register implements Login {
    public register(Player Player){

    }
    /**
     * 玩家事件的监听器
     */
    @Override
    public void Playerevents(Object a) {
        if(a instanceof Cancellable){
            ((Cancellable)a).setCancelled(true);
        }
    }
}
