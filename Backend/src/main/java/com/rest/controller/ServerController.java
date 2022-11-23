package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.model.Server;
import com.rest.service.IServerService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:3000/")
public class ServerController {

	@Autowired
	private IServerService iServerService;

	@GetMapping("server")
	@ApiOperation("list of all server")
	public ResponseEntity<?> getAllServers(){

		Iterable<Server> servers = iServerService.findAllServers();
		return new ResponseEntity<Iterable<Server>>(servers, HttpStatus.OK);
	}
	
	@GetMapping("server/{id}")
	@ApiOperation("get server by  id")
	public ResponseEntity<?> getServerId(@PathVariable(value = "id") String id){

		Server server = iServerService.findServerById(id);
		return new ResponseEntity<Server>(server,HttpStatus.OK);
	}
	
	@PostMapping("server")
	@ApiOperation("create a new sever")
	public ResponseEntity<String> createServer(@RequestBody Server server){

		String createServer = iServerService.createServer(server);
		return new ResponseEntity<String>(createServer, HttpStatus.CREATED);
	}
	
	@PutMapping("server/{id}")
	@ApiOperation("update a server")
	public ResponseEntity<String> updateServer(@PathVariable(value = "id") String id, @RequestBody Server server){

		String updateServer = iServerService.updateServer(id, server);
		return new ResponseEntity<String>(updateServer, HttpStatus.OK);
	}
	
	@DeleteMapping("server/{id}")
	@ApiOperation("delete server by id")
	public ResponseEntity<String> deleteServer(@PathVariable("id") String id) {

		String deleteServer = iServerService.deleteServerById(id);
		return new ResponseEntity<String>(deleteServer,HttpStatus.OK);
	}
	
	@GetMapping("server/getBy/{name}")
	@ApiOperation("get a server by name")
	public List<Server> getServerByName(@PathVariable String name){
		
		 List<Server> servers = iServerService.findServerByName(name);
		 return servers;
	}
}
