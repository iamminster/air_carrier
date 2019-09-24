package minh.nguyen.eas.air.carrier.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carrier/search")
public class SearchController {

	public SearchController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/lowfares")
	public String getLowFares() {
		return "carrier";
	}

}
