package equipoise;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import equipoise.common.CommonProxy;


@Mod(modid="equipoise", name="EquiPoise", version="0.1.0")
public class EquiPoise {

        @Instance(value = "equipoise")
        public static EquiPoise instance;
        
        @SidedProxy(clientSide="equipoise.client.ClientProxy", serverSide="equipoise.common.CommonProxy")
        public static CommonProxy proxy;
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                Blocks();
                Items();
                BlockRegistry();
                ItemRegistry();
                GameRegistry();
                Recipes();
        }
        
        private void Blocks() {
			
		}

		private void Items() {
			
		}

		private void BlockRegistry() {
			
		}
		
		private void ItemRegistry() {
			
		}

		private void GameRegistry() {
			
		}

		private void Recipes() {
			
		}

		@EventHandler
        public void postInit(FMLPostInitializationEvent event) {
                
        }
}