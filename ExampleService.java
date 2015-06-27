package business.service;
import persistence.entity.ExampleEntity;
import java.util.List;

/**
 * An interface to define business services
 * 
 * @author Mikhel Adun
 */
public interface ExampleService extends BusinessService {

    public void add(ExampleEntity entity);

    public List<ExampleEntity> getMembers();

    public ExampleEntity getMember(long id);

    public ExampleEntity getMember(String email);

}
