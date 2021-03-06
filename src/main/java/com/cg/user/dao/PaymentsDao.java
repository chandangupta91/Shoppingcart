package com.cg.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.user.domain.Payments;

@Repository
public interface PaymentsDao extends JpaRepository<Payments, Integer>{

	Payments findByPaymentId(Integer paymentId);

}
