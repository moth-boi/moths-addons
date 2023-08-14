package zfmoth.addons.mixin.client;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


@Debug(export = true)
@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin {
	@Redirect(method = "tickMovement", at = @At(value = "INVOKE" , target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean makeElytraCheckAlwaysPass(ItemStack instance, Item item){
		return true;
	}
}
