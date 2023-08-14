package zfmoth.addons.mixin;

import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Debug(export = true)
@Mixin(ElytraItem.class)
public abstract class ElytraItemMixin {
	/**
	 * @author MotH
	 * @reason Bypass Elytra health check
	 */
	@Overwrite
	public static boolean isUsable(ItemStack stack) {
		return true;
	}
}
