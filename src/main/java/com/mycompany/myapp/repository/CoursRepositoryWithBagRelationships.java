package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Cours;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;

public interface CoursRepositoryWithBagRelationships {
    Optional<Cours> fetchBagRelationships(Optional<Cours> cours);

    List<Cours> fetchBagRelationships(List<Cours> cours);

    Page<Cours> fetchBagRelationships(Page<Cours> cours);
}
