package web.model;

import persistence.entity.ExampleEntity;

import java.util.List;

public class ExampleModel implements PageModel {

    ExampleEntity entity;
    List<ExampleEntity> entities;

    public ExampleEntity getEntity() {
	return entity;
    }

    public void setEntity(ExampleEntity entity) {
	this.entity = entity;
    }

    public List<ExampleEntity> getEntities() {
	return entities;
    }

    public void setEntities(List<ExampleEntity> entities) {
	this.entities = entities;
    }

}
