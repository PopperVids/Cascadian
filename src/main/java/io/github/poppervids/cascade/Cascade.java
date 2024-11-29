package io.github.poppervids.cascade;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cascade implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Cascade");

    @Override
    public void onInitialize(ModContainer mod) {
		ModItems.register(mod);
    }
}
