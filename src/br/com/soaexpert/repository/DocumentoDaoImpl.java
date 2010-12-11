package br.com.soaexpert.repository;

import java.util.HashMap;
import java.util.Map;

import br.com.soaexpert.ged.domain.Entity;

public class DocumentoDaoImpl implements EntityDao {

	Map<Long,Entity> repo = new HashMap<Long,Entity>();
	
	public void delete(Entity entity) {
		repo.remove(entity.getId());
	}

	public Entity findByExample(Entity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Entity findById(Long id) {
		return repo.get(id);
	}

	public void save(Entity entity) {
		repo.put(entity.getId(), entity);
	}

}
