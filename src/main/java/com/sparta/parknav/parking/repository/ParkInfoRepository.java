package com.sparta.parknav.parking.repository;

import com.sparta.parknav.parking.entity.ParkInfo;
import com.sparta.parknav.parking.entity.ParkOperInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkInfoRepository extends JpaRepository<ParkInfo,Long> {
}
