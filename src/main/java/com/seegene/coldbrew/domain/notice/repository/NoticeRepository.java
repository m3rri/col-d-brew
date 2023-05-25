package com.seegene.coldbrew.domain.notice.repository;

import com.seegene.coldbrew.domain.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Integer>, NoticeRepositoryQuery {
}
