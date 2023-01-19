package org.spring.thymeleafLayout.repository;

import org.spring.thymeleafLayout.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepo extends JpaRepository<BoardEntity, Long> {
}
