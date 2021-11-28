package com.tannu.service;

import java.util.ArrayList;
import com.tannu.bean.Element;
import com.tannu.persistence.ElementDao;
import com.tannu.persistence.ElementDaoImpl;

public class ElementServiceImpl implements ElementService {
	private ElementDao elementDao=new ElementDaoImpl();
	

	@Override
	public ArrayList<Element> searchAllElement() {
		return elementDao.getAllElement();
	}

	@Override
	public Element searchElementByName(String name) {
		// TODO Auto-generated method stub
		return elementDao.getElementByName(name);
	}

	@Override
	public boolean insertElement(Element element) {
		int rows=elementDao.addElement(element);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean removeElement(String name) {
		int rows=elementDao.deleteElement(name);
		if(rows>0) 
		   return true;
		return false;
	}

	@Override
	public boolean updateAtomicWeightByElementName(String name, int atomicWeight) {
		int rows=elementDao.updateAutomicweightByName(name, atomicWeight);
		if(rows>0)
			return true;
		return false;
	}



}
