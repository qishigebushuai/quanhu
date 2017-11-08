package com.zhongkeruan.util;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;


public class ImageUtil {

	// 鐢熸垚闅忔満楠岃瘉鐮�
	public static String getRandomCode() {
		char[] codes = new char[] { '1', '2', '3', '4', '5', '6', '7', '8',
				'9', '0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' };

		char[] sj = new char[4];
		for (int i = 0; i < sj.length; i++) {
			sj[i] = codes[new Random().nextInt(21)];
		}
		return new String(sj);
	}

	// 鏍规嵁楠岃瘉鐮� 鐢诲浘
	public static BufferedImage createImage(String code){

		// 1 鑾峰緱缂撳啿鍖�
		BufferedImage bi = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
		// 1.1 鑾峰緱鐢荤瑪
		Graphics graphics = bi.getGraphics();

		// 1.2鐢昏儗鏅�
		graphics.setColor(Color.BLACK);
		graphics.drawRect(0, 0, 80, 20);

		// 1.4璁剧疆鍓嶆櫙鏂囧瓧 棰滆壊
		graphics.setColor(Color.WHITE);
        
		graphics.drawString("" + code.charAt(0), 16, 10);
		graphics.drawString("" + code.charAt(1), 32, 13);
		graphics.drawString("" + code.charAt(2), 57, 12);
		graphics.drawString("" + code.charAt(3), 71, 17);

		// 鎶婄紦鍐插尯涓殑鐢荤敓鎴愬嚭鏉�
		graphics.dispose();
		
		return bi;
	}
}
