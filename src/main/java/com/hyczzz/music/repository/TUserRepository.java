package com.hyczzz.music.repository;

import com.hyczzz.music.dataobject.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: hyczzz
 * @date: 2019/4/5 0005 22:31
 * @description:
 */
public interface TUserRepository extends JpaRepository<TUser,Long> {
}
