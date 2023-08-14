package zfmoth.addons.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    /**
     * @author
     * @reason
     */
    @Overwrite
    public boolean isFallFlying() {
        return true;
    }
}
