/**
 *
 */
package com.github.zinntikumugai.setcommandblock;

import org.bukkit.Material;
import org.bukkit.block.Block;

/**
 * @author zinntikumugai
 *
 */
public class SetCommandBlock_BlackList {


		static final Material[] list = {
				/* レッドストーン関係 */
				//ドア
				Material.ACACIA_DOOR,			//アカシア
				Material.BIRCH_DOOR,				//シラカバ
				Material.DARK_OAK_DOOR,			//ダークオーク
				Material.JUNGLE_DOOR,			//ジャングル
				Material.SPRUCE_DOOR,			//マツ
				Material.WOOD_DOOR,				//オーク
				Material.IRON_DOOR,				//鉄
				//トラップドア
				Material.TRAP_DOOR,				//トラップ
				Material.IRON_TRAPDOOR,			//鉄のトラップ
				//フェンスゲート
				Material.FENCE_GATE,				//フェンスゲート
				Material.SPRUCE_FENCE_GATE,		//マツ
				Material.BIRCH_FENCE_GATE,		//シラカバ
				Material.JUNGLE_FENCE_GATE,		//ジャングル
				Material.DARK_OAK_FENCE_GATE,	//ダークオーク
				Material.ACACIA_FENCE_GATE,		//アカシア
				//インベントリがある系
				Material.DISPENSER,				//ディスペンサー
				Material.DROPPER,				//ドロッパー
				Material.HOPPER,					//ホッパー
				//スイッチ
				Material.WOOD_BUTTON,			//木
				Material.STONE_BUTTON,			//石
				//その他
				Material.DIODE,					//リピータ	//下の二つがブロックでこれがアイテム？
				Material.DIODE_BLOCK_OFF,		//オフのリピータ(ブロック)
				Material.DIODE_BLOCK_ON,		//オンのリピータ(ブロック)
				Material.REDSTONE_COMPARATOR,//コンパレータ
				Material.REDSTONE_COMPARATOR_ON,//コンパレータ(オン)
				Material.REDSTONE_COMPARATOR_OFF,//コンパレータ(オフ)
				Material.DAYLIGHT_DETECTOR,	//日照センサー
				Material.DAYLIGHT_DETECTOR_INVERTED,//日照センサー(月光モード)


		};
		static final int Materials = 0;

		/**
		 * blockが設定されているリストに載っているか確認
		 * @param block	確認するブロック
		 */
	public Block ChekBlock(Block block) {

		for(int i=0; i<Materials; i++) {
			if(block.getType().equals( list[i] ))
				return null;
		}
		return block;


	}


}
