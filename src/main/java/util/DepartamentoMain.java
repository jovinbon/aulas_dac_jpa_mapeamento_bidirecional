package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import relbidirecional.Departamento;
import relbidirecional.Empregado;
import relbidirecional.Projeto;

public class DepartamentoMain {

	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		
		//Inserindo dados de Projeto
		Projeto projeto = new Projeto();
		projeto.setNomeProjeto("Projeto A");
		Projeto projeto2 = new Projeto();
		projeto2.setNomeProjeto("Projeto B");
		Projeto projeto3 = new Projeto();
		projeto3.setNomeProjeto("Projeto C");
		
		//Inserindo dados Empregado
		Empregado empregado = new Empregado();
		empregado.setNomeEmpregado("Fulano de Tal");
		empregado.setSexo("Masculino");
		empregado.setNumeroSocail(258951357);
		empregado.setDataNascimento("25/04/1980");
		empregado.setEndereco("Rua das bananeiras, numero 120");
		empregado.setSalario(1800.0);
		
		Empregado empregado2 = new Empregado();
		empregado2.setNomeEmpregado("Ciclano da Gaita");
		empregado2.setSexo("Masculino");
		empregado2.setNumeroSocail(258951357);
		empregado2.setDataNascimento("22/09/1979");
		empregado2.setEndereco("Rua das primas, numero 69");
		empregado2.setSalario(2500.0);
		
		Empregado empregado3 = new Empregado();
		empregado3.setNomeEmpregado("José da Penha");
		empregado3.setSexo("Masculino");
		empregado3.setNumeroSocail(258951357);
		empregado3.setDataNascimento("30/08/1977");
		empregado3.setEndereco("Rua Virgem, numero 169");
		empregado3.setSalario(2500.0);
		
		Empregado empregado4 = new Empregado();
		empregado4.setNomeEmpregado("Maria de José");
		empregado4.setSexo("Feminino");
		empregado4.setNumeroSocail(258951357);
		empregado4.setDataNascimento("27/03/1972");
		empregado4.setEndereco("Av das Pedras, numero 269");
		empregado4.setSalario(1600.0);
		
		Empregado empregado5 = new Empregado();
		empregado5.setNomeEmpregado("Maria das Graças");
		empregado5.setSexo("Feminino");
		empregado5.setNumeroSocail(258951357);
		empregado5.setDataNascimento("15/08/1971");
		empregado5.setEndereco("Av das Pedras, numero 1014");
		empregado5.setSalario(1600.0);
		
		Empregado empregado6 = new Empregado();
		empregado6.setNomeEmpregado("Pentaciclano Doido");
		empregado6.setSexo("Não informado");
		empregado6.setNumeroSocail(258951357);
		empregado6.setDataNascimento("15/08/1989");
		empregado6.setEndereco("Rua Projetada, sem numero");
		empregado6.setSalario(1600.0);
		
		Departamento departamento = new Departamento();
		departamento.setNomeDepartamento("Departamento RH");
		departamento.setLocalizacao("Gestão de Pessoas");
		departamento.setProjeto(projeto);
		departamento.setEmpregado(empregado);
		
		Departamento departamento2 = new Departamento();
		departamento2.setNomeDepartamento("Departamento Finanças");
		departamento2.setLocalizacao("Patrimonio 1");
		departamento2.setProjeto(projeto);
		departamento2.setEmpregado(empregado2);
		
		Departamento departamento3 = new Departamento();
		departamento3.setNomeDepartamento("Departamento Deposito");
		departamento3.setLocalizacao("Gestão de Pessoas");
		departamento3.setProjeto(projeto2);
		departamento3.setEmpregado(empregado);
		
		empregado.getDepartamentos().add(departamento);
		empregado2.getDepartamentos().add(departamento2);
		empregado3.getDepartamentos().add(departamento);
		
		projeto.getDepartamentos().add(departamento);
		projeto2.getDepartamentos().add(departamento2);
		projeto3.getDepartamentos().add(departamento);
		
		projeto.getFuncionarios().add(empregado);
		projeto.getFuncionarios().add(empregado2);
		projeto2.getFuncionarios().add(empregado);
		
		empregado.getProjetos().add(projeto);
		empregado2.getProjetos().add(projeto);
		empregado.getProjetos().add(projeto2);
		
        manager.persist(projeto);
        manager.persist(projeto2);
        manager.persist(projeto3);
        
        manager.persist(empregado);
        manager.persist(empregado2);
        manager.persist(empregado3);
        manager.persist(empregado4);
        manager.persist(empregado5);
        manager.persist(empregado6);
        
        manager.persist(departamento);
        manager.persist(departamento2);
        manager.persist(departamento3);
		
		transaction.commit();
		
		manager.close();
	}

}
