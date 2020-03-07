package com.openrsc.server.plugins.listeners;

import com.openrsc.server.model.entity.player.Player;

public interface DepositListener {
	/**
	 * Called when a user deposits an item
	 */
	void onDeposit(Player player, Integer catalogID, Integer amount);

	/**
	 * Return true if you wish to prevent a user from depositing an item
	 */
	boolean blockDeposit(Player p, Integer catalogID, Integer amount);
}