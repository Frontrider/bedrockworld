package hu.frontrider.bedrock.bedrockworld;

import net.minecraft.world.DimensionType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Bedrockworld.MOD_ID,
        name = Bedrockworld.MOD_NAME,
        version = Bedrockworld.VERSION
)
public class Bedrockworld {

    public static final String MOD_ID = "bedrockworld";
    public static final String MOD_NAME = "Bedrockworld";
    public static final String VERSION = "1.0-SNAPSHOT";

    public static final DimensionType BEDROCK_DIM_TYPE = DimensionType.register("bedrock", "_bedrock", 0, WorldProvider.class, true);
    public static final BedrockWorldType BEDROCK_WORLD_TYPE = new BedrockWorldType();
    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static Bedrockworld INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

}
