package com.openrsc.server.plugins.listeners.executive;

import com.openrsc.server.model.entity.player.Player;

public interface DepositExecutiveListener {
	/**
	 * Return true if you wish to prevent a user from depositing an item
	 */
	boolean blockDeposit(Player p, Integer catalogID, Integer amount);
}
