package org.grjug.bootlab;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface LaunchRepository extends CrudRepository<Launch, Long> {

    Page<Launch> findAll(Pageable pageable);

    List<Launch> findByStatus(int status);
}
