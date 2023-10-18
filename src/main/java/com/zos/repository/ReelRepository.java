package com.zos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zos.model.Reels;
import org.springframework.stereotype.Repository;

public interface ReelRepository extends JpaRepository<Reels, Integer>{

}
