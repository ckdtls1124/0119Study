package org.spring.thymeleafLayout.repository;

import org.spring.thymeleafLayout.entity.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepo extends JpaRepository<ReplyEntity, Long> {
}
