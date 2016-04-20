package org.grjug.bootlab.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface LaunchRepository extends CrudRepository<Launch, Long> {

    List<Launch> findByStatus(@Param("status") int status);
    
    default List<Launch> findByStatus(LaunchStatus status) {
        return LaunchRepository.this.findByStatus(status.intValue());
    }
}
