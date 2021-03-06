/**
 *
 */
package com.github.zinntikumugai.setcommandblock;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SetCommandBlock_Listerer implements Listener {

	//コマンドブロックを置く権限
	public static final String permission_str = "setcommandblock.set";

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {

		//右クリック以外終了
		if( !(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) ) {
			return;
		}


		//手に持っているアイテムがコマンドブロック以外終了
		if( !(event.getPlayer().getItemInHand().getType().equals(Material.COMMAND)) ) {

			return;
		}

		//置こうとしたプレイヤーがOPだったら終了
		//2616/3/7/追加
		if( event.getPlayer().isOp())
			return;


		//コマンドブロックにコマンドブロックを置こうとしたとき
		if(event.getClickedBlock().getType().equals(Material.COMMAND)) {

			//スニーク状態になっていないとき終了
			if( !(event.getPlayer().isSneaking()) ) {
				return;
			}
		}
/*
			if( !(event.getPlayer().isSneaking())) {
				if( SetCommandBlock_BlackList.ChekBlock( event.getPlayer().getItemInHand().getType()) ) {
					return;
				}
			}*/

		//権限を持っていないなら終了
		if( !(event.getPlayer().hasPermission(permission_str)) ) {
			return;
		}

		//ブロックを置く
		SetCommandBlock_SetBlock.setblock(event);

		//プレイヤーのインベントリからアイテムを減らす
		SetCommandBlock_Item.itemdelete(event.getPlayer());
	}
}
