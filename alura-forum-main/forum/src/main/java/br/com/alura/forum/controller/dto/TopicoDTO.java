package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import br.com.alura.forum.modelo.Topico;

public class TopicoDTO {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	
	public TopicoDTO(Topico entity) {
		this.id = entity.getId();
		this.titulo = entity.getTitulo();
		this.mensagem = entity.getMensagem();
		this.dataCriacao = entity.getDataCriacao();
	}
	
	public static Page<TopicoDTO> converter(Page<Topico> topicos){
		return topicos.map(TopicoDTO::new);
	}


	public Long getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getMensagem() {
		return mensagem;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

}