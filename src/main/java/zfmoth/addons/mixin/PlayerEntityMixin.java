package zfmoth.addons.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Debug;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;


@Debug(export = true)
@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {
    @Redirect(method = "checkFallFlying", at = @At(value = "INVOKE" , target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean makeElytraCheckAlwaysPass(ItemStack instance, Item item){
        return true;
    }
}