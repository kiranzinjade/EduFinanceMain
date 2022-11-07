package com.webcorestone.EduFinance.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcorestone.EduFinance.app.modelInformation.ParentDocument;
//import com.webcorestone.EduFinance.app.model.ParentDocument;
import com.webcorestone.EduFinance.app.repository.ParentDocRepository;
import com.webcorestone.EduFinance.app.service.ParentDocService;

@Service
public class ParentDocServiceImpl implements ParentDocService
{
	@Autowired
	ParentDocRepository pdocrepo;

	@Override
	public ParentDocument saveParentDoc(ParentDocument pdoc) {
	
		return pdocrepo.save(pdoc) ;
	}

	@Override
	public List<ParentDocument> getParentDoc() {	
		return (List<ParentDocument>)pdocrepo.findAll();
	}

}
