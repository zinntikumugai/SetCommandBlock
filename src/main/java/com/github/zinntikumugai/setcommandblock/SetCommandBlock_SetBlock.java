/**
 *
 */
package com.github.zinntikumugai.setcommandblock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SetCommandBlock_SetBlock {



	public static void setblock(PlayerInteractEvent event) {

		Location location = event.getClickedBlock().getLocation();

		//取得したブロックをクリックした面の相対パスを+する
		location.setX( location.getX() + event.getBlockFace().getModX() );
		location.setY( location.getY() + event.getBlockFace().getModY() );
		location.setZ( location.getZ() + event.getBlockFace().getModZ() );

		//求めた座標からブロックを取得
		Block block = location.getBlock();

		//置く予定地にすでに置いてないかチェック(看板なのど)
		if( !(block.getType().equals(Material.AIR)) ) {
			return;
		}

		System.out.println("air");
		//置く予定地にEntityが存在するか
		if( block.isEmpty()) {
			return;
		}
		System.out.println("noentity");

		//ブロックをおく
		block.setType(Material.COMMAND);
	}
}
