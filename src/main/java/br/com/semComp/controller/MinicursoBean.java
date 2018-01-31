package br.com.semComp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.semComp.business.MInicursoRegras;
import br.com.semComp.model.Minicurso;
import br.com.semComp.util.FacesUtil;

@ManagedBean(name = "minicursoBean")
@ViewScoped
public class MinicursoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private final MInicursoRegras minicursoRegras;
	private Minicurso minicurso;
	private List<Minicurso> minicursos;

	public MinicursoBean() {
		minicurso = new Minicurso();
		minicursoRegras = new MInicursoRegras();
		minicursos = minicursoRegras.buscarTodos();
	}

	public void salvarMinicurso() {

		if (minicurso != null) {
			minicursoRegras.salvar(minicurso);
			minicurso = new Minicurso();
			FacesUtil.addInfoMessage("Minicurso Adicionado!!");
		} else {
			System.out.println("Erro");
		}

	}

	public void editarMinicurso() {
		
		System.out.println(minicurso.toString());
//		
//		if (minicurso.getId() > 0) {
//		
//		} else {
//			System.out.println("Parou aki");
//		}
		minicursoRegras.alterar(minicurso);
		
	}

	public void excluirMinicurso(Minicurso minicurso) {
		minicursoRegras.excluir(minicurso);
		minicursos = minicursoRegras.buscarTodos();

		FacesUtil.addInfoMessage("Minicurso Excluido!!");

	}

	public Minicurso getMinicurso() {
		return minicurso;
	}

	public void setMinicurso(Minicurso minicurso) {
		this.minicurso = minicurso;
	}

	public List<Minicurso> getMinicursos() {
		return minicursos;
	}

	public void setMinicursos(List<Minicurso> minicursos) {
		this.minicursos = minicursos;
	}

}
