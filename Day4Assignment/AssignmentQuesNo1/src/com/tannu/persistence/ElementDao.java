package com.tannu.persistence;

import java.util.ArrayList;

import com.tannu.bean.Element;

public interface ElementDao {
	ArrayList<Element> getAllElement();
	Element getElementByName(String name);
	int addElement(Element element);
	int deleteElement(String name);
	int updateAutomicweightByName(String name,int atomicWeight);


}
