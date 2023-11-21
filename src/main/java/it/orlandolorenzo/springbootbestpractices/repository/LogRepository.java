package it.orlandolorenzo.springbootbestpractices.repository;

import it.orlandolorenzo.springbootbestpractices.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
}
