package com.cj.future.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import com.cj.future.entity.Data;
import com.cj.future.repository.DataRepository;

@Service
@Transactional
public class DataService {

	private DataRepository dataRepository;

	@Autowired
	public DataService(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	public List<Data> findAll() {
		return dataRepository.findAll();
	}

	public Data findById(@PathVariable String id) {
		return dataRepository.findById(Integer.valueOf(id)).orElse(new Data());
	}

	public Data saveData(@RequestBody Data data) {
		return dataRepository.save(data);
	}

	public Data updateData(@RequestBody Data data) {
		Data uData = dataRepository.findById(data.getDataId()).orElse(new Data());
		uData.setStatus(data.getStatus());
		return dataRepository.save(uData);
	}

}
