package com.webcorestone.EduFinance.app.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webcorestone.EduFinance.app.modelInformation.ParentDocument;

//import com.webcorestone.EduFinance.app.model.ParentDocument;

@Repository
public interface ParentDocRepository extends CrudRepository<ParentDocument, Integer>
{

	ParentDocument save(ParentDocument pdoc);
}
