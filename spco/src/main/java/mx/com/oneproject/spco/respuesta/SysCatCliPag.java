package mx.com.oneproject.spco.respuesta;

import java.util.List;

import mx.com.oneproject.spco.modelo.SysCatCli;

public class SysCatCliPag {

	int page;
	int perPage;
	int total;
	int totalPages;
	private List<SysCatCli> sysCatClientes;
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPage() {
		return perPage;
	}
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<SysCatCli> getSysCatClientes() {
		return sysCatClientes;
	}
	public void setSysCatClientes(List<SysCatCli> sysCatClientes) {
		this.sysCatClientes = sysCatClientes;
	}

	
	
}
