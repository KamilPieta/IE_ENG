package kamil.repositories;

import kamil.entities.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by k on 10.04.16.
 */
public interface ProjectRepository extends CrudRepository <Project,Long>{



    Project findOne(Long id);
}
