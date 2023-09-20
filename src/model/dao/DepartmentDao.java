package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	void insert(Department obj); //responsavel por inserir no banco de dados o objeto 
	void update(Department obj); // responsavel por fazer o updade mno bancop de dados
	void deleteById(Integer id); // responsavel por deletar um objeto no banco de dados
	Department findId(Integer id); // responsavel por comparar o objeto no banco de dados, se existir retorna o objeto se nao existir retorna nulo
	List<Department> findAll(); //responsavel por retornar todos os departamentos
	
}
