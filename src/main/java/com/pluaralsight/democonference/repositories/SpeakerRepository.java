package com.pluaralsight.democonference.repositories;

import com.pluaralsight.democonference.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
