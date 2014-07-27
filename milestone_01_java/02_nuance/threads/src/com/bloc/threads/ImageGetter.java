package com.bloc.threads;
import java.net.URL;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

public class ImageGetter extends Thread {
	String url;
	boolean launch;
	ImageGetter(String url, boolean launch){
		this.url = url;
		this.launch = launch;
	}
	@Override
	public void run() {
		try {
			File existingImage = new File("google_logo.png");
			if (existingImage.exists()) {
				existingImage.delete();
			}
			URL url = new URL(this.url);
			BufferedImage bufferedImage = ImageIO.read(url);
			File outputfile = new File("google_logo.png");
			ImageIO.write(bufferedImage, "png", outputfile);
			if (launch == true) {
				if ("/".equals(System.getProperties().getProperty("file.separator"))) {
				Runtime.getRuntime().exec("open google_logo.png");
				} else {
					Runtime.getRuntime().exec("google_logo.png");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		File logo = new File("google_logo.png");
		boolean exists = false;
		try {
			exists = logo.exists();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		// TODO
	}
}