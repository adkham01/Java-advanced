package com.interview.questions;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageHandling {

	public static void main(String[] args)  {
		
		try {
			URL url = new URL("https://c4.wallpaperflare.com/wallpaper/245/715/726/worm-eye-view-of-eiffel-tower-during-night-time-wallpaper-preview.jpg");
			BufferedImage image = ImageIO.read(url);
			ImageIO.write(image, "png", new File("D:/Core Java/mountain.png"));
			ImageIO.write(image, "gif", new File("D:/Core Java/mountain.gif"));
			System.out.println("Image download Success!");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
