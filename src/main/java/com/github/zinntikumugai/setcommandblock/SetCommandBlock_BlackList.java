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
		Material.ACACIA_DOOR,							//アカシア
		Material.BIRCH_DOOR,							//シラカバ
		Material.DARK_OAK_DOOR,						//ダークオーク
		Material.JUNGLE_DOOR,							//ジャングル
		Material.SPRUCE_DOOR,							//マツ
		Material.WOOD_DOOR,							//オーク
		Material.IRON_DOOR,							//鉄
		//トラップドア
		Material.TRAP_DOOR,							//トラップ
		Material.IRON_TRAPDOOR,						//鉄のトラップ
		//フェンスゲート
		Material.FENCE_GATE,							//フェンスゲート
		Material.SPRUCE_FENCE_GATE,					//マツ
		Material.BIRCH_FENCE_GATE,					//シラカバ
		Material.JUNGLE_FENCE_GATE,					//ジャングル
		Material.DARK_OAK_FENCE_GATE,				//ダークオーク
		Material.ACACIA_FENCE_GATE,					//アカシア
		//インベントリがある系
		Material.DISPENSER,							//ディスペンサー
		Material.DROPPER,								//ドロッパー
		Material.HOPPER,								//ホッパー
		//スイッチ
		Material.WOOD_BUTTON,							//木
		Material.STONE_BUTTON,						//石
		Material.STONE_BUTTON,							//石のボタン
		Material.WOOD_BUTTON,							//木のボタン
		//その他
		Material.DIODE,									//リピータ	//下の二つがブロックでこれがアイテム？
		Material.DIODE_BLOCK_OFF,						//オフのリピータ(ブロック)
		Material.DIODE_BLOCK_ON,						//オンのリピータ(ブロック)
		Material.REDSTONE_COMPARATOR,				//コンパレータ
		Material.REDSTONE_COMPARATOR_ON,				//コンパレータ(オン)
		Material.REDSTONE_COMPARATOR_OFF,			//コンパレータ(オフ)
		Material.DAYLIGHT_DETECTOR,					//日照センサー
		Material.DAYLIGHT_DETECTOR_INVERTED,		//日照センサー(月光モード)
		/* 装飾系 */
		//看板
		Material.SIGN,									//看板	//アイテムの看板?
		Material.SIGN_POST,							//立て看板
		Material.WALL_SIGN	,							//張り付き看板
		//インベントリがある系
		Material.CHEST,									//チェスト
		Material.TRAPPED_CHEST,						//トラップチェスト
		Material.FURNACE,								//かまど
		Material.BURNING_FURNACE,						//燃えているかまど(燃焼中のかまど)
		Material.ANVIL,									//金床
		Material.WORKBENCH,							//作業台
		Material.ENDER_CHEST,							//エンダーチェスト
		//Material.BED,									//ベッド
		Material.BED_BLOCK,							//ベッド(設置状態)
		/* ポーション系 */
		Material.BREWING_STAND,						//醸造台
		/* その他 */
		Material.BEACON								//ビーコン

	};

	static final int Materials = 0;

		/**
		 * blockが設定されているリストに載っているか確認
		 * @param block	確認するブロック
		 * @return ture	該当するブロック
		 * @return false	該当しないブロック
		 */
	public static boolean ChekBlock(Block block) {

		for(int i=0; i<Materials; i++) {
			if(block.getType().equals( list[i] ))
				return true;
		}
		return false;


	}


}
