package swmod.client.events;

import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvent {
    @SubscribeEvent
    public static void onPlayerJoinEvent(EntityJoinWorldEvent event){
        if (event.loadedFromDisk()){
            if (event.getEntity() instanceof ServerPlayer){
                //ServerPlayer.UUID_TAG
            }
        }
    }
}
