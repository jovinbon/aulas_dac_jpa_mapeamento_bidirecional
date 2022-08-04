package relbidirecional;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeProjeto;

	@ManyToMany(mappedBy = "projetos")
	private Set<Empregado> funcionarios = new HashSet<>();

	@OneToMany(mappedBy = "projeto")
	private Set<Departamento> departamentos = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProjeto() {
		return nomeProjeto;
	}

	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}

	public Set<Empregado> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Set<Empregado> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Set<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Set<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

}
