package equipoise;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import equipoise.biome.BiomeGenCorruption;
import equipoise.biome.BiomeGenPurity;
import equipoise.common.CommonProxy;


@Mod(modid="equipoise", name="EquiPoise", version="0.1.0")
public class EquiPoise {

        @Instance(value = "equipoise")
        public static EquiPoise instance;
        
        @SidedProxy(clientSide="equipoise.client.ClientProxy", serverSide="equipoise.common.CommonProxy")
        public static CommonProxy proxy;
        
        public static BiomeGenBase purity, corruption; // Initialize last
        
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
                
                purity = new BiomeGenPurity(146);
                corruption = new BiomeGenCorruption(147);
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
		
		public static CreativeTabs tabEP = new CreativeTabsEP("equipoise");
}