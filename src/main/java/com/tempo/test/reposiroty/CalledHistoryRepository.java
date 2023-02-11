package com.tempo.test.reposiroty;

import com.tempo.test.model.CalledHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CalledHistoryRepository extends JpaRepository<CalledHistory, UUID>, QueryByExampleExecutor<CalledHistory> {
}
