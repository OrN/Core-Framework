package com.openrsc.server.plugins.defaults;

import com.openrsc.server.database.impl.mysql.queries.logging.GenericLog;
import com.openrsc.server.external.SpellDef;
import com.openrsc.server.model.container.Item;
import com.openrsc.server.model.entity.GameObject;
import com.openrsc.server.model.entity.GroundItem;
import com.openrsc.server.model.entity.npc.Npc;
import com.openrsc.server.model.entity.player.Player;
import com.openrsc.server.model.states.Action;
import com.openrsc.server.model.struct.EquipRequest;
import com.openrsc.server.model.struct.UnequipRequest;
import com.openrsc.server.net.rsc.ActionSender;
import com.openrsc.server.plugins.DefaultHandler;
import com.openrsc.server.plugins.listeners.action.*;
import com.openrsc.server.util.rsc.DataConversions;

/**
 * We do not need to block, as everything that is not handled has a default here
 */

public class Default implements DefaultHandler,
	CatGrowthListener, CommandListener, DepositListener, DropListener,
	IndirectTalkToNpcListener, InvActionListener, InvUseOnGroundItemListener, InvUseOnItemListener,
	InvUseOnNpcListener, InvUseOnObjectListener, InvUseOnPlayerListener, InvUseOnWallObjectListener,
	NpcCommandListener, ObjectActionListener, PickupListener, PlayerAttackListener,
	PlayerAttackNpcListener, PlayerDeathListener, PlayerKilledNpcListener, PlayerLoginListener,
	PlayerLogoutListener, PlayerMageItemListener, PlayerMageListener, PlayerMageNpcListener,
	PlayerMageObjectListener, PlayerNpcRunListener, PlayerKilledPlayerListener, PlayerRangePlayerListener,
	PlayerRangeNpcListener, StartupListener, TalkToNpcListener, TeleportListener,
	WallObjectActionListener, EquipListener, UnequipListener, WithdrawListener {

	public static final DoorAction doors = new DoorAction();
	private static final Ladders ladders = new Ladders();

	@Override
	public void onInvUseOnNpc(final Player player, final Npc npc, final Item item) {
		player.message("Nothing interesting happens");
	}

	@Override
	public boolean blockInvUseOnNpc(Player player, Npc npc, Item item) {
		return false;
	}

	@Override
	public void onInvUseOnObject(final GameObject object, final Item item, final Player owner) {
		if (doors.blockInvUseOnWallObject(object, item, owner)) {
			doors.onInvUseOnWallObject(object, item, owner);
		} else {
			owner.message("Nothing interesting happens");
			//System.out.println("InvUseOnObject unhandled: item " + item.getID() + " used with object: " + object.getID());
		}
	}

	@Override
	public boolean blockInvUseOnObject(GameObject obj, Item item, Player player) {
		return false;
	}

	@Override
	public void onObjectAction(final GameObject obj, final String command, final Player player) {
		if (doors.blockObjectAction(obj, command, player)) {
			doors.onObjectAction(obj, command, player);
		} else if (ladders.blockObjectAction(obj, command, player)) {
			ladders.onObjectAction(obj, command, player);
		} else {
			player.message("Nothing interesting happens");
		}
	}

	@Override
	public boolean blockObjectAction(GameObject obj, String command, Player player) {
		return false;
	}

	@Override
	public void onTalkToNpc(final Player p, final Npc n) {
		p.message(
			"The " + n.getDef().getName()
				+ " does not appear interested in talking");
	}

	@Override
	public boolean blockTalkToNpc(Player p, Npc n) {
		return false;
	}

	@Override
	public void onInvUseOnWallObject(GameObject object, Item item, Player owner) {
		if (doors.blockInvUseOnWallObject(object, item, owner)) {
			doors.onInvUseOnWallObject(object, item, owner);
		} else {
			owner.message("Nothing interesting happens");
		}
	}

	@Override
	public boolean blockInvUseOnWallObject(GameObject obj, Item item, Player player) {
		return false;
	}

	@Override
	public void onWallObjectAction(GameObject obj, Integer click, Player p) {
		if (doors.blockWallObjectAction(obj, click, p)) {
			doors.onWallObjectAction(obj, click, p);
		} else {
			p.message("Nothing interesting happens");
		}
	}

	@Override
	public boolean blockWallObjectAction(GameObject obj, Integer click, Player player) {
		return false;
	}

	@Override
	public void onCatGrowth(Player p) {
		// No default actions
	}

	@Override
	public boolean blockCatGrowth(Player p) {
		return false;
	}

	@Override
	public void onCommand(String cmd, String[] args, Player player) {
		// No default actions
	}

	@Override
	public boolean blockCommand(String cmd, String[] args, Player player) {
		return false;
	}

	@Override
	public void onDrop(Player p, Item i, Boolean fromInventory) {
		if (fromInventory) {
			if (p.getCarriedItems().remove(i.getCatalogId(), i.getAmount()) < 0) {
				p.setStatus(Action.IDLE);
				return;
			}
		} else {
			int slot = p.getCarriedItems().getEquipment().searchEquipmentForItem(i.getCatalogId());
			if (slot == -1 || p.getCarriedItems().getEquipment().get(slot).getAmount() != i.getAmount()) {
				p.setStatus(Action.IDLE);
				return;
			}
			p.getCarriedItems().getEquipment().remove(i.getCatalogId(), i.getAmount());
			ActionSender.sendEquipmentStats(p);
			if (i.getDef(p.getWorld()).getWieldPosition() < 12)
				p.updateWornItems(i.getDef(p.getWorld()).getWieldPosition(), p.getSettings().getAppearance().getSprite(i.getDef(p.getWorld()).getWieldPosition()));
		}

		GroundItem groundItem = new GroundItem(p.getWorld(), i.getCatalogId(), p.getX(), p.getY(), i.getAmount(), p);
		ActionSender.sendSound(p, "dropobject");
		p.getWorld().registerItem(groundItem, 188000);
		p.getWorld().getServer().getGameLogger().addQuery(new GenericLog(p.getWorld(), p.getUsername() + " dropped " + i.getDef(p.getWorld()).getName() + " x"
			+ DataConversions.numberFormat(groundItem.getAmount()) + " at " + p.getLocation().toString()));
	}

	@Override
	public boolean blockDrop(Player p, Item i, Boolean fromInventory) {
		return false;
	}

	@Override
	public void onIndirectTalkToNpc(Player p, Npc n) {
		// No default actions
	}

	@Override
	public boolean blockIndirectTalkToNpc(Player p, Npc n) {
		return false;
	}

	@Override
	public void onInvAction(Item item, Player player, String command) {
		player.message("Nothing interesting happens");
	}

	@Override
	public boolean blockInvAction(Item item, Player player, String command) {
		return false;
	}

	@Override
	public void onInvUseOnGroundItem(Item myItem, GroundItem item, Player player) {
		player.message("Nothing interesting happens");
	}

	@Override
	public boolean blockInvUseOnGroundItem(Item myItem, GroundItem item, Player player) {
		return false;
	}

	@Override
	public void onInvUseOnItem(Player player, Item item1, Item item2) {
		player.message("Nothing interesting happens");
	}

	@Override
	public boolean blockInvUseOnItem(Player player, Item item1, Item item2) {
		return false;
	}

	@Override
	public void onInvUseOnPlayer(Player player, Player otherPlayer, Item item) {
		player.message("Nothing interesting happens");
	}

	@Override
	public boolean blockInvUseOnPlayer(Player player, Player otherPlayer, Item item) {
		return false;
	}

	@Override
	public void onNpcCommand(Npc n, String command, Player p) {
		// No default actions
	}

	@Override
	public boolean blockNpcCommand(Npc n, String command, Player p) {
		return false;
	}

	@Override
	public void onPickup(Player p, GroundItem i) {
		p.groundItemTake(i);
	}

	@Override
	public boolean blockPickup(Player p, GroundItem i) {
		return false;
	}

	@Override
	public void onPlayerAttack(Player p, Player affectedmob) {
		p.startCombat(affectedmob);
		if (p.getWorld().getServer().getConfig().WANT_PARTIES) {
			if (p.getParty() != null) {
				p.getParty().sendParty();
			}
		}
	}

	@Override
	public boolean blockPlayerAttack(Player p, Player affectedmob) {
		return false;
	}

	@Override
	public void onPlayerAttackNpc(Player p, Npc affectedmob) {
		p.startCombat(affectedmob);
		if (p.getWorld().getServer().getConfig().WANT_PARTIES) {
			if (p.getParty() != null) {
				p.getParty().sendParty();
			}
		}
	}

	@Override
	public boolean blockPlayerAttackNpc(Player p, Npc affectedmob) {
		return false;
	}

	@Override
	public void onPlayerDeath(Player p) {
		// TODO: This plugin is not handled anywhere
		// No default actions
	}

	@Override
	public boolean blockPlayerDeath(Player p) {
		return false;
	}

	@Override
	public void onPlayerKilledNpc(Player p, Npc n) {
		// No default actions
	}

	@Override
	public boolean blockPlayerKilledNpc(Player p, Npc n) {
		return false;
	}

	@Override
	public void onPlayerKilledPlayer(Player killer, Player killed) {
		// No default actions
	}

	@Override
	public boolean blockPlayerKilledPlayer(Player killer, Player killed) {
		return false;
	}

	@Override
	public void onPlayerLogin(Player player) {
		// No default actions
	}

	@Override
	public boolean blockPlayerLogin(Player player) {
		return false;
	}

	@Override
	public void onPlayerLogout(Player player) {
		// No default actions
	}

	@Override
	public boolean blockPlayerLogout(Player player) {
		return false;
	}

	@Override
	public void onPlayerMageItem(Player p, Integer itemID, Integer spellID) {
		// No default actions
	}

	@Override
	public boolean blockPlayerMageItem(Player p, Integer itemID, Integer spellID) {
		return false;
	}

	@Override
	public void onPlayerMage(Player player, Player affectedPlayer, Integer spell) {
		// No default actions
	}

	@Override
	public boolean blockPlayerMage(Player player, Player affectedPlayer, Integer spell) {
		return false;
	}

	@Override
	public void onPlayerMageNpc(Player p, Npc n) {
		// No default actions
	}

	@Override
	public boolean blockPlayerMageNpc(Player p, Npc n) {
		return false;
	}

	@Override
	public void onPlayerMageObject(Player player, GameObject obj, SpellDef spell) {
		// No default actions
	}

	@Override
	public boolean blockPlayerMageObject(Player player, GameObject obj, SpellDef spell) {
		return false;
	}

	@Override
	public void onPlayerNpcRun(Player p, Npc n) {
		// TODO: This plugin is not handled anywhere
		// No default actions
	}

	@Override
	public boolean blockPlayerNpcRun(Player p, Npc n) {
		return false;
	}

	@Override
	public void onPlayerRangePlayer(Player p, Player affectedMob) {
		// No default actions
	}

	@Override
	public boolean blockPlayerRangePlayer(Player p, Player affectedMob) {
		return false;
	}

	@Override
	public void onPlayerRangeNpc(Player p, Npc n) {
		// No default actions
	}

	@Override
	public boolean blockPlayerRangeNpc(Player p, Npc n) {
		return false;
	}

	@Override
	public void onStartup() {
		// No default actions
	}

	@Override
	public boolean blockStartup() {
		return false;
	}

	@Override
	public void onTeleport(Player p) {
		// TODO: player.teleport() logic needs to be moved here. There needs to be an exception when bubble is false.
		// No default actions
	}

	@Override
	public boolean blockTeleport(Player p) {
		return false;
	}

	@Override
	public void onUnequip(UnequipRequest request) {
		request.player.getCarriedItems().getEquipment().unequipItem(request);
	}

	@Override
	public boolean blockUnequip(UnequipRequest request) {
		return false;
	}

	@Override
	public void onEquip(EquipRequest request) {
		request.player.getCarriedItems().getEquipment().equipItem(request);
	}

	@Override
	public void blockEquip(EquipRequest request) {

	}

	@Override
	public void onWithdraw(Player p, Integer catalogID, Integer amount, Boolean wantsNotes) {
		p.getBank().withdrawItemToInventory(catalogID, amount, wantsNotes);
	}

	@Override
	public void blockWithdraw(Player p, Integer catalogID, Integer amount, Boolean wantsNotes) {

	}

	@Override
	public void onDeposit(Player player, Integer catalogID, Integer amount) {
		player.getBank().depositItemFromInventory(catalogID, amount, true);
	}

	@Override
	public boolean blockDeposit(Player p, Integer catalogID, Integer amount) {
		return false;
	}
}
