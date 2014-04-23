package Talismans;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EventCloakRender {
	@SideOnly(Side.CLIENT)
	public static void addDevCapes() {
    	String capeURL = "https://dl.dropboxusercontent.com/s/sns1n9za10xoutx/Gigcape.png";
    	String[] owners = {"Gigabit101"};  	
    	ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);
    	
    	for(String username : owners)
    	{
    		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (ITextureObject)image);
    	}
    	
    }
	
	@SideOnly(Side.CLIENT)
	public static void addCapes() {
    	String capeURL = "https://dl.dropboxusercontent.com/u/27415688/fudgecape.png";
    	String[] owners = {"Catey98", "Mj11jM", "dexter_bok"};  	
    	ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);
    	
    	for(String username : owners)
    	{
    		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (ITextureObject)image);
    	}
    	
    }
	@SideOnly(Side.CLIENT)
	public static void addIcyCapes() {
    	String capeURL = "https://dl.dropboxusercontent.com/s/1wbpbe14i620jks/icycape.png";
    	String[] owners = {"icynewyear"};  	
    	ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);
    	
    	for(String username : owners)
    	{
    		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (ITextureObject)image);
    	}

}
}