package cn.jji8.DiverseLogin.Manager;

import cn.jji8.DiverseLogin.Interface.Login;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * 控制器管理器
 * 每个玩家在登入时都会有一个对应的控制器
 * */
public class controller {
    Map<Player,Login> controllerList = new HashMap<Player,Login>();
    /**
     * 设置一个玩家，并对应一个控制器
     * */
    public void set(Player player,Login Login){
        controllerList.put(player,Login);
    }
    /**
     * 删除一个这个玩家，代表玩家已经退出服务器或者已经登入
     * */
    public void remove(Player player){
        controllerList.remove(player);
    }
    /**
     * 把事件传递给对应的控制器
     * */
    public void transmit(Object Event,Player Player){
        if(Event==null){
            return;
        }
        Login Login = controllerList.get(Player);
        if(Login==null){
            return;
        }
        Login.Playerevents(Event);
    }
}
