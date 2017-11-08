package com.zhongkeruan.action;


import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.zhongkeruan.util.ImageUtil;

public class ImageAction implements Action {

	@Override
	public String execute() throws Exception {
		//1,璋冪敤宸ュ叿绫�,鑾峰彇4浣嶉獙璇佺爜
		String code = ImageUtil.getRandomCode();
		//2,瀛橀獙璇佺爜鍒皊ession涓�
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.setValue("#session.image", code);
		//3,鏍规嵁楠岃瘉鐮�,鐢熸垚鍥剧墖
		BufferedImage bi = ImageUtil.createImage(code);
		//4,鎶婂浘鐗囬�氳繃response杈撳嚭娴佽緭鍑哄埌client
		ServletOutputStream os = ServletActionContext.getResponse().getOutputStream();
		ImageIO.write(bi, "jpg", os);
		return null;
	}

}
