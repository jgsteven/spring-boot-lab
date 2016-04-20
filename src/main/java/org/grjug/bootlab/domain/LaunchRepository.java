package org.grjug.bootlab.domain;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface LaunchRepository extends CrudRepository<Launch, Long> {

    Page<Launch> findAll(Pageable pageable);

    List<Launch> findByStatus(int status);
    
    default List<Launch> findByStatus(LaunchStatus status) {
        return LaunchRepository.this.findByStatus(status.intValue());
    }
}
