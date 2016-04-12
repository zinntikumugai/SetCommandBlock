/**
 *
 */
package com.github.zinntikumugai.setcommandblock;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
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


		Player player = event.getPlayer();

		//設置場所に自分がいたら終了
		/* ごっちゃんありがとう! */

		//プレイヤーの座標(足部)のブロックを取得
		Location pl = player.getLocation();
		Block pb = pl.getBlock();

		//取得したブロックと同じ座標ならば終了
		if( pb.equals(block)) {
			return;
		}

		//プレイヤーの胸部(足部のYを+1)のブロックを取得
		pl.setY( pl.getY()+1 );
		pb = pl.getBlock();

		//取得したブロックと同じ座標ならば終了
		if( pb.equals(block) ) {
			return;
		}

/*
		Location pl = player.getLocation();
		pl.setX( (int)pl.getX() +1);	//Xが足りないので強制的に追加	//対応策考え中
		pl.setY( (int)pl.getY() );
		pl.setZ( (int)pl.getZ() );

		location.setX( (int)location.getX() );
		location.setY( (int)location.getY() );
		location.setZ( (int)location.getZ() );

		if( pl.equals(location) ) {
			return;
		}

		//プレイヤーの上側に置かれたら終了
		pl.setY( pl.getY() + 1);
		if( pl.equals(location) ) {
			return;
		}*/

		/*System.out.println(block.getLocation());
		System.out.println(pl);
		System.out.println(location);*/


		/*まったくもって座標は同じではないため廃止
		 * if( player.getLocation() == location ) {
			return;
		}*/


		//ブロックをおく
		block.setType(Material.COMMAND);
	}


}
