package com.csm.Repository;

import com.csm.Model.TenderUpload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TenderRepository extends JpaRepository<TenderUpload, Integer> {
}
