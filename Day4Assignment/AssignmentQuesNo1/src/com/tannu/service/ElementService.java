package com.tannu.service;
import com.tannu.bean.*;
import java.util.ArrayList;

public interface ElementService {
	ArrayList<Element> searchAllElement();
	Element searchElementByName(String name);
	boolean insertElement(Element element);
	boolean removeElement(String empId);
	boolean updateAtomicWeightByElementName(String name,int atomicWeight);

}
