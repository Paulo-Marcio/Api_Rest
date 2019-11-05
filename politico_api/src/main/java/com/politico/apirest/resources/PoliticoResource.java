package com.politico.apirest.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.politico.apirest.models.Politico;
import com.politico.apirest.repository.PoliticoRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Politicos")
public class PoliticoResource {
	
	@Autowired
	PoliticoRepository politicoRepository;
	
	@ApiOperation(value="Retorna uma lista de Politico")
	@GetMapping("/politicos")
	public List<Politico> listaPolitico(){
		return politicoRepository.findAll();
	}
	

	@ApiOperation(value="Salva um Politico")
	@PostMapping("/politico")
	public Politico salvaPolitico(@RequestBody @Valid Politico politico) {
		return politicoRepository.save(politico);
	}
	
	@ApiOperation(value="Deleta um Politico")
	@DeleteMapping("/politico")
	public void deletaPolitico(@RequestBody @Valid Politico politico) {
		politicoRepository.delete(politico);
	}
	
	@ApiOperation(value="Atualiza Dados do Politico")
	@PutMapping("/politico")
	public Politico atualizaPolitico(@RequestBody @Valid Politico politico) {
		return politicoRepository.save(politico);
	}
	 

}
