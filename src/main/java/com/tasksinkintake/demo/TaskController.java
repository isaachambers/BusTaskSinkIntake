package com.tasksinkintake.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

	@Autowired
	private CustomTaskProcessor t;

	@RequestMapping(path = "/tasks", method = RequestMethod.POST)
	public String launchTask(@RequestBody String data) {
		t.publishRequest(data);
		return "success";
	}

}
