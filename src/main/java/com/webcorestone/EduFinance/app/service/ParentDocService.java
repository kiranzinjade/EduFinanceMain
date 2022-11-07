package com.webcorestone.EduFinance.app.service;

import java.util.List;

import com.webcorestone.EduFinance.app.modelInformation.ParentDocument;

public interface ParentDocService 
{

	ParentDocument saveParentDoc(ParentDocument pdoc);

	List<ParentDocument> getParentDoc();

}
