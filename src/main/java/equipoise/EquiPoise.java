package equipoise;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
import cpw.mods.fml.common.registry.GameRegistry;
import equipoise.biome.BiomeGenCorruption;
import equipoise.biome.BiomeGenPurity;
import equipoise.block.BalanceBlock;
import equipoise.common.CommonProxy;


@Mod(modid="equipoise", name="EquiPoise", version="0.1.0")
public class EquiPoise {
	
	public static Block lightDirt;
	public static Block darkDirt;

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
        	lightDirt = new BalanceBlock(Material.grass, 1).setHardness(0.6F).setBlockName("lightDirt").setBlockTextureName("equipoise:lightDirt");
        	darkDirt = new BalanceBlock(Material.grass, 2).setHardness(0.6F).setBlockName("darkDirt").setBlockTextureName("equipoise:darkDirt");
		}

		private void Items() {

		}

		private void BlockRegistry() {
			GameRegistry.registerBlock(lightDirt, "lightDirt");
			GameRegistry.registerBlock(darkDirt, "darkDirt");
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