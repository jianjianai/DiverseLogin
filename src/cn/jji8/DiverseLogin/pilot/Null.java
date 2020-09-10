package cn.jji8.DiverseLogin.pilot;

import cn.jji8.DiverseLogin.Interface.Login;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;

/**
 * 一个空控制器，玩家默认的控制器
 * 玩家进入时的默认控制器
 * */
public class Null implements Login {
    Player Player;
    public Null(Player Player){
        this.Player = Player;
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
