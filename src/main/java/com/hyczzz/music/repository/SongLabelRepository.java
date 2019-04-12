package com.hyczzz.music.repository;

import com.hyczzz.music.dataobject.SongLabel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: hyczzz
 * @date: 2019/4/5 0005 22:36
 * @description:
 */
public interface SongLabelRepository extends JpaRepository<SongLabel,Long> {
}
