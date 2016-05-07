package com.example;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.glxn.qrgen.core.image.ImageType;
import net.glxn.qrgen.javase.QRCode;

@RestController
public class CodeController {

	@RequestMapping(value="/code/{name}",produces=MediaType.IMAGE_PNG_VALUE)
	public void getCode(@PathVariable String name,HttpServletResponse response) throws IOException {

		QRCode code = net.glxn.qrgen.javase.QRCode.from(name);
		code = code.to(ImageType.PNG);
		response.setContentType(MediaType.IMAGE_PNG_VALUE);
		response.setContentLength(code.stream().size());
		QRCode.from(name).to(ImageType.PNG).writeTo(response.getOutputStream());

	}
}
