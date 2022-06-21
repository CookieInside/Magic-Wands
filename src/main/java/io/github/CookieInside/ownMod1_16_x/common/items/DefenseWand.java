package io.github.CookieInside.ownMod1_16_x.common.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class DefenseWand extends Item {

	public DefenseWand(Properties properties) {
		super(properties);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldownTracker().hasCooldown(this)) {
		
		FallingBlockEntity entity1 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity2 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity3 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity4 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity5 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity6 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity7 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity8 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity9 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity10 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity11 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity12 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity13 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity14 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity15 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		FallingBlockEntity entity16 = new FallingBlockEntity(EntityType.FALLING_BLOCK, worldIn);
		
		
		LightningBoltEntity entity17 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity18 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity19 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity20 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity21 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity22 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity23 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity24 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity25 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity26 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity27 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity28 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity29 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity30 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity31 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		LightningBoltEntity entity32 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
		
		
		entity1.setPosition(playerIn.getPosX() + 2, playerIn.getPosY() + 5, playerIn.getPosZ() + 0);
		entity2.setPosition(playerIn.getPosX() - 2, playerIn.getPosY() + 5, playerIn.getPosZ() + 0);
		entity3.setPosition(playerIn.getPosX() + 0, playerIn.getPosY() + 5, playerIn.getPosZ() + 2);
		entity4.setPosition(playerIn.getPosX() + 0, playerIn.getPosY() + 5, playerIn.getPosZ() - 2);
		
		entity5.setPosition(playerIn.getPosX() + 2, playerIn.getPosY() + 5, playerIn.getPosZ() + 1);
		entity6.setPosition(playerIn.getPosX() - 2, playerIn.getPosY() + 5, playerIn.getPosZ() - 1);
		entity7.setPosition(playerIn.getPosX() + 1, playerIn.getPosY() + 5, playerIn.getPosZ() + 2);
		entity8.setPosition(playerIn.getPosX() - 1, playerIn.getPosY() + 5, playerIn.getPosZ() - 2);
		
		entity9.setPosition(playerIn.getPosX() + 2, playerIn.getPosY() + 5, playerIn.getPosZ() - 1);
		entity10.setPosition(playerIn.getPosX() - 2, playerIn.getPosY() + 5, playerIn.getPosZ() + 1);
		entity11.setPosition(playerIn.getPosX() - 1, playerIn.getPosY() + 5, playerIn.getPosZ() + 2);
		entity12.setPosition(playerIn.getPosX() + 1, playerIn.getPosY() + 5, playerIn.getPosZ() - 2);
		
		entity13.setPosition(playerIn.getPosX() + 2, playerIn.getPosY() + 10, playerIn.getPosZ() + 0);
		entity14.setPosition(playerIn.getPosX() - 2, playerIn.getPosY() + 10, playerIn.getPosZ() + 0);
		entity15.setPosition(playerIn.getPosX() + 0, playerIn.getPosY() + 10, playerIn.getPosZ() + 2);
		entity16.setPosition(playerIn.getPosX() + 0, playerIn.getPosY() + 10, playerIn.getPosZ() - 2);
		
		
		entity17.setPosition(playerIn.getPosX() + 4, playerIn.getPosY(), playerIn.getPosZ() + 1);
		entity18.setPosition(playerIn.getPosX() + 4, playerIn.getPosY(), playerIn.getPosZ() - 1);
		entity19.setPosition(playerIn.getPosX() - 4, playerIn.getPosY(), playerIn.getPosZ() + 1);
		entity20.setPosition(playerIn.getPosX() - 4, playerIn.getPosY(), playerIn.getPosZ() - 1);
		
		entity21.setPosition(playerIn.getPosX() + 1, playerIn.getPosY(), playerIn.getPosZ() + 4);
		entity22.setPosition(playerIn.getPosX() - 1, playerIn.getPosY(), playerIn.getPosZ() + 4);
		entity23.setPosition(playerIn.getPosX() + 1, playerIn.getPosY(), playerIn.getPosZ() - 4);
		entity24.setPosition(playerIn.getPosX() - 1, playerIn.getPosY(), playerIn.getPosZ() - 4);
		
		entity25.setPosition(playerIn.getPosX() + 3, playerIn.getPosY(), playerIn.getPosZ() + 2);
		entity26.setPosition(playerIn.getPosX() + 3, playerIn.getPosY(), playerIn.getPosZ() - 2);
		entity27.setPosition(playerIn.getPosX() - 3, playerIn.getPosY(), playerIn.getPosZ() + 2);
		entity28.setPosition(playerIn.getPosX() - 3, playerIn.getPosY(), playerIn.getPosZ() - 2);
		
		entity29.setPosition(playerIn.getPosX() + 2, playerIn.getPosY(), playerIn.getPosZ() + 3);
		entity30.setPosition(playerIn.getPosX() - 2, playerIn.getPosY(), playerIn.getPosZ() + 3);
		entity31.setPosition(playerIn.getPosX() + 2, playerIn.getPosY(), playerIn.getPosZ() - 3);
		entity32.setPosition(playerIn.getPosX() - 2, playerIn.getPosY(), playerIn.getPosZ() - 3);
		
		entity1.fallTime = 1;
		entity2.fallTime = 1;
		entity3.fallTime = 1;
		entity4.fallTime = 1;
		entity5.fallTime = 1;
		entity6.fallTime = 1;
		entity7.fallTime = 1;
		entity8.fallTime = 1;
		entity9.fallTime = 1;
		entity10.fallTime = 1;
		entity11.fallTime = 1;
		entity12.fallTime = 1;
		entity13.fallTime = 1;
		entity14.fallTime = 1;
		entity15.fallTime = 1;
		entity16.fallTime = 1;
		
		
		worldIn.addEntity(entity1);
		worldIn.addEntity(entity2);
		worldIn.addEntity(entity3);
		worldIn.addEntity(entity4);
		worldIn.addEntity(entity5);
		worldIn.addEntity(entity6);
		worldIn.addEntity(entity7);
		worldIn.addEntity(entity8);
		worldIn.addEntity(entity9);
		worldIn.addEntity(entity10);
		worldIn.addEntity(entity11);
		worldIn.addEntity(entity12);
		worldIn.addEntity(entity13);
		worldIn.addEntity(entity14);
		worldIn.addEntity(entity15);
		worldIn.addEntity(entity16);
		worldIn.addEntity(entity17);
		worldIn.addEntity(entity18);
		worldIn.addEntity(entity19);
		worldIn.addEntity(entity20);
		worldIn.addEntity(entity21);
		worldIn.addEntity(entity22);
		worldIn.addEntity(entity23);
		worldIn.addEntity(entity24);
		worldIn.addEntity(entity25);
		worldIn.addEntity(entity26);
		worldIn.addEntity(entity27);
		worldIn.addEntity(entity28);
		worldIn.addEntity(entity29);
		worldIn.addEntity(entity30);
		worldIn.addEntity(entity31);
		worldIn.addEntity(entity32);
		
		
		playerIn.getCooldownTracker().setCooldown(this, 6000);
		
		
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
		
	}

}
