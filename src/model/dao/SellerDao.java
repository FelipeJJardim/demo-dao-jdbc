package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj); //responsavel por inserir no banco de dados o objeto 
	void update(Seller obj); //responsavel por fazer o updade mno bancop de dados
	void deleteById(Integer id); //responsavel por deletar um objeto no banco de dados
	Seller findById(Integer id); //responsavel por comparar o objeto no banco de dados, se existir retorna o objeto se nao existir retorna nulo
	List<Seller> findAll(); //responsavel por retornar todos os departamentos
	List<Seller> findByDepartment(Department department);
	
}
