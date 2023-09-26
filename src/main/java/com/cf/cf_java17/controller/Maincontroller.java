inpackage com.cf.cf_java17.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "")
public class Maincontroller {
	@GetMapping(path = "")
	   public ResponseEntity<String> getDroneMedications() {
	      return new ResponseEntity<String>("Hello World jenkins!", HttpStatus.OK);
	   }


}

