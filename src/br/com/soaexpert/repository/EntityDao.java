package br.com.soaexpert.repository;

import br.com.soaexpert.ged.domain.Entity;

public interface EntityDao {

	public void save(Entity entity);
	
	public void delete(Entity entity);
	
	public Entity findById(Long id);
	
	public Entity findByExample(Entity entity);

}
