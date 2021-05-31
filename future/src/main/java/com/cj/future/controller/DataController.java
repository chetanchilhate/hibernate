package com.cj.future.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cj.future.entity.Data;
import com.cj.future.service.DataService;

@RestController
@RequestMapping("api/v1/datas")
public class DataController {

	private DataService dataService;

	@Autowired
	public DataController(DataService dataRepository) {
		this.dataService = dataRepository;
	}

	@GetMapping
	public List<Data> getDatas() {
		return dataService.findAll();
	}

	@GetMapping("/{id}")
	public Data getDatas(@PathVariable String id) {
		return dataService.findById(id);
	}

	@PostMapping
	public Data createData(@RequestBody Data data) {
		return dataService.saveData(data);
	}

	@PutMapping
	public Data updateData(@RequestBody Data data) {
		return dataService.updateData(data);
	}

}
