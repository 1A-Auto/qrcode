package com.example;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping(value={"/",""})
	public Link index(){
		Link link = linkTo(CodeController.class).slash("/").withRel("qrCode");
		return link;
	}
	
}
