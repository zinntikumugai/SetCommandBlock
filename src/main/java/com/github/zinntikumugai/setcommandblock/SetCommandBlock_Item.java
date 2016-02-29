/**
 *
 */
package com.github.zinntikumugai.setcommandblock;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

/**
 * @author zinntikumugai
 * @Licence GPL v3.0
 *
 */
public class SetCommandBlock_Item {

	public static void itemdelete(Player player) {

		PlayerInventory inventory = player.getInventory();
		ItemStack itemstack = new ItemStack(Material.COMMAND , 1);

		System.out.println(inventory.getItemInHand());
		if(inventory.getItemInHand().equals(Material.COMMAND)) {
			System.out.println("xxxxxxxxxxxxxx");
		}


		ItemStack ditemstack = inventory.getItemInHand();
		ditemstack.setAmount(ditemstack.getAmount() - 1);
		inventory.setItemInHand(ditemstack);
		//アイテムが減らないため削除
		//inventory.remove(itemstack);

	}
}
