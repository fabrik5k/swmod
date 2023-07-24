package swmod.client;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeMobTabs {
    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("SWMod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack();
        }
    }
}
