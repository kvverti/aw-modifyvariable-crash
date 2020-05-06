package net.fabricmc.awcrash.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.realms.RealmsBridge;

@Mixin(TitleScreen.class)
public class ExampleMixin {
    @ModifyVariable(
        method = "switchToRealms",
        ordinal = 0,
        at = @At("STORE")
    )
    private RealmsBridge modifyRealmsBridge(RealmsBridge bridge) {
        System.out.println("Switching to realms...");
        return bridge;
    }
}
