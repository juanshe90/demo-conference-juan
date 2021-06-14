package com.pluaralsight.democonference.repositories;

import com.pluaralsight.democonference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
