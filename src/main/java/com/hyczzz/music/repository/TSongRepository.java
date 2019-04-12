package com.hyczzz.music.repository;

import com.hyczzz.music.dataobject.TSong;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: hyczzz
 * @date: 2019/4/5 0005 22:33
 * @description:
 */
public interface TSongRepository extends JpaRepository<TSong,Long> {
}
