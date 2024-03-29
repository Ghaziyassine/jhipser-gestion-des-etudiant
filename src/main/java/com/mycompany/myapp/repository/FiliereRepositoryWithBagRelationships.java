package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Filiere;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;

public interface FiliereRepositoryWithBagRelationships {
    Optional<Filiere> fetchBagRelationships(Optional<Filiere> filiere);

    List<Filiere> fetchBagRelationships(List<Filiere> filieres);

    Page<Filiere> fetchBagRelationships(Page<Filiere> filieres);
}
