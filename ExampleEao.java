package persistence.eao;

import persistence.entity.ExampleEntity;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/** 
 * A entity access object class to provide persistent storage functions and CRUD operations for Member entity.  
 * Strongly-typed interface created since it could be used by @Autowired
 * 
 * @author Mikhel Adun
 *
 */
@Transactional
@Component
public interface ExampleEao extends BaseEao<ExampleEntity>
{
}
