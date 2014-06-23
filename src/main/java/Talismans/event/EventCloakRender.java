package Talismans.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * @author Gigabit101
 */
public class EventCloakRender {
	// Adds Cape For Developers
	@SideOnly(Side.CLIENT)
	public static void addDevCapes() {
		// Link To The Used Cape
		String capeURL = "https://dl.dropboxusercontent.com/s/l2690eor7dy9ut5/Gigcape.png";
		// Name Of Player
		String[] owners = { "Gigabit101" };
		// Download The Cape
		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL,
				null, null);

		for (String username : owners) {
			Minecraft.getMinecraft().renderEngine.loadTexture(
					new ResourceLocation("cloaks/" + username),
					(ITextureObject) image);
		}

	}

	// Adds Cape For Donators
	@SideOnly(Side.CLIENT)
	public static void addCapes() {
		String capeURL = "https://dl.dropboxusercontent.com/u/27415688/fudgecape.png";
		String[] owners = { "Catey98", "Mj11jM", "dexter_bok", "timebombtech","NexanSv6" };
		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL,
				null, null);

		for (String username : owners) {
			Minecraft.getMinecraft().renderEngine.loadTexture(
					new ResourceLocation("cloaks/" + username),
					(ITextureObject) image);
		}

	}

	// Adds Cape For Icynewyear
	@SideOnly(Side.CLIENT)
	public static void addIcyCapes() {
		String capeURL = "https://dl.dropboxusercontent.com/s/1wbpbe14i620jks/icycape.png";
		String[] owners = { "icynewyear" };
		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL,
				null, null);

		for (String username : owners) {
			Minecraft.getMinecraft().renderEngine.loadTexture(
					new ResourceLocation("cloaks/" + username),
					(ITextureObject) image);
		}

	}
}