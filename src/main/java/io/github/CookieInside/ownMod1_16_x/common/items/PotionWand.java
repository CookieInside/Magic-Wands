package io.github.CookieInside.ownMod1_16_x.common.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class PotionWand extends Item{

	public PotionWand(Properties properties) {
		super(properties);
	}
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldownTracker().hasCooldown(this)) {
		playerIn.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 200, 10));
		playerIn.addPotionEffect(new EffectInstance(Effects.SATURATION, 200, 100));
		playerIn.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 200, 20));
		playerIn.addPotionEffect(new EffectInstance(Effects.SPEED, 200, 5));
		playerIn.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 200, 3));
		playerIn.addPotionEffect(new EffectInstance(Effects.REGENERATION, 200, 20));
		playerIn.addPotionEffect(new EffectInstance(Effects.STRENGTH, 200, 8));
		playerIn.getCooldownTracker().setCooldown(this, 12000);
		return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
	}

}
