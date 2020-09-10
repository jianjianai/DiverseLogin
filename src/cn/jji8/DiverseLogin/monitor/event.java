package cn.jji8.DiverseLogin.monitor;

import cn.jji8.DiverseLogin.main;
import cn.jji8.DiverseLogin.pilot.Null;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.*;

/**
 * 一个事件监听器
 * */
public class event implements Listener {
    /**
     * 玩家离开服务器时触发
     * */
    @EventHandler
    public void Listener(PlayerQuitEvent dj){
        main.getMain().getController().remove(dj.getPlayer());
    }
    /**
     * 玩家进入服务器
     * */
    @EventHandler
    public void wanjia(PlayerJoinEvent dj){
        main.getMain().getController().set(dj.getPlayer(),new Null(dj.getPlayer()));
    }

    @EventHandler
    public void wanjia(PlayerMoveEvent dj){//玩家移动时
        transmit(dj);
    }
    @EventHandler
    public void wanjia(BlockBreakEvent dj){//玩家破坏方块
        transmit(dj,dj.getPlayer());
    }
    @EventHandler
    public void wanjia(BlockPlaceEvent dj){//玩家放置方块
        transmit(dj,dj.getPlayer());
    }
    @EventHandler
    public void wanjia(AsyncPlayerChatEvent dj){//玩家聊天
        transmit(dj);
    }
    @EventHandler
    public void wanjia(PlayerCommandPreprocessEvent dj){//玩家命令
        transmit(dj);
    }
    @EventHandler
    public void wanjia(PlayerSwapHandItemsEvent dj){//玩家切换副手
        transmit(dj);
    }
    @EventHandler
    public void  wanjia(PlayerInteractEvent dj) {//玩家与空气方块交互时
        transmit(dj);
    }
    @EventHandler
    public void wanjia(PlayerInteractEntityEvent dj){//玩家点击实体时
        transmit(dj);
    }
    @EventHandler
    public void wanjia(PlayerTeleportEvent dj){//玩家传送事件
        transmit(dj);
    }
    @EventHandler
    public void wanjia(PlayerDropItemEvent dj){//玩家丢弃物品时
        transmit(dj);
    }
    @EventHandler
    public void wanjia(InventoryClickEvent dj){//玩家点击
        transmit(dj,(Player)dj.getWhoClicked());
    }
    void transmit(PlayerEvent a){
        transmit(a,a.getPlayer());
    }
    void transmit(Object a,Player Player){
        main.getMain().getController().transmit(a,Player);
    }
}
