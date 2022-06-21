package io.github.CookieInside.ownMod1_16_x.common.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class LightningWand extends Item{

	public LightningWand(Properties properties) {
		super(properties);
	}
	

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldownTracker().hasCooldown(this)) {
		LightningBoltEntity entity1 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity2 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity3 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity4 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity5 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity6 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity7 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity8 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		
		
		entity1.setPosition(playerIn.getPosX() + 2, playerIn.getPosY(), playerIn.getPosZ());
		worldIn.addEntity(entity1);
		
		entity2.setPosition(playerIn.getPosX() + -2, playerIn.getPosY(), playerIn.getPosZ());
		worldIn.addEntity(entity2);
		
		entity3.setPosition(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ() + 2);
		worldIn.addEntity(entity3);
		
		entity4.setPosition(playerIn.getPosX(), playerIn.getPosY(), playerIn.getPosZ() - 2);
		worldIn.addEntity(entity4);
		
		entity5.setPosition(playerIn.getPosX() + 1, playerIn.getPosY(), playerIn.getPosZ() + 1);
		worldIn.addEntity(entity5);
		
		entity6.setPosition(playerIn.getPosX() - 1, playerIn.getPosY(), playerIn.getPosZ() - 1);
		worldIn.addEntity(entity6);
		
		entity7.setPosition(playerIn.getPosX() + 1, playerIn.getPosY(), playerIn.getPosZ() - 1);
		worldIn.addEntity(entity7);
		
		entity8.setPosition(playerIn.getPosX() - 1, playerIn.getPosY(), playerIn.getPosZ() + 1);
		worldIn.addEntity(entity8);
		
		playerIn.getCooldownTracker().setCooldown(this, 3600);
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
	}
	
	
}
