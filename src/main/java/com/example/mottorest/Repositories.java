package com.example.mottorest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositories
    extends JpaRepository<Mott,Long> {
}
