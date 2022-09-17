package co.lecompany.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.lecompany.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
