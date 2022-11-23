package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.exception.ServerNotFoundException;
import com.rest.model.Server;
import com.rest.repository.IServerRepository;

@Service
public class ServerService implements IServerService{

	@Autowired
	private IServerRepository iServerRepository;

	// all
	@Override
	public Iterable<Server> findAllServers() {
		Iterable<Server> all = iServerRepository.findAll();
		List<Server> list = (List<Server>) all;
		list.sort((l1,l2)->l1.getName().compareTo(l2.getName()));
		return list;
	}

	// by id
	@Override
	public Server findServerById(String id) {
		Server server = iServerRepository.findById(id).get();
		return server;
	}

	// create
	@Override
	public String createServer(Server server) {
		Server save = iServerRepository.save(server);
		return "Actor register with id: "+save.getId();
	}

	// update
	@Override
	public String updateServer(String id, Server server) {
		Optional<Server> optional = iServerRepository.findById(id);
		if(optional.isPresent()) {
			iServerRepository.save(server);
			return "Actor Information is updated!";
		}
		else {
			throw new ServerNotFoundException("Actor Not Found");
		}
	}

	// delete
	@Override
	public String deleteServerById(String id) {
		Optional<Server> optional = iServerRepository.findById(id);
		if (optional.isPresent()) {
			iServerRepository.deleteById(id);
			return "Actor Information is deleted";
		}
		else {
			throw new ServerNotFoundException("Actor Not Found");
		}
	}

	// by name
	@Override
	public List<Server> findServerByName(String name) {
		 List<Server> servers = iServerRepository.getServerByName(name);
		 return servers;
	}
}
	

