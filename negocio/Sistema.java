package negocio;

import java.util.List;

import dados.Pessoa;
import persistencia.PessoaDAO;

public class Sistema {
	private PessoaDAO pessoaDAO=new PessoaDAO();
	
	public PessoaDAO getPessoaDAO() {
		return pessoaDAO;
	}
	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}
	
	
	public void adicionarPessoa(Pessoa p) {
		pessoaDAO.insert(p);
	}
	public void removerPessoa(Pessoa p) {
		pessoaDAO.delete(p);
	}
	public List<Pessoa> getList(){
		return pessoaDAO.getAll();
	}
}
