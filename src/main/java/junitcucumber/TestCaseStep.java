package junitcucumber;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestCaseStep {
	private boolean resolveOrNot;
	private Map<String, Object> parameterMap = new HashMap<String, Object>();
	private Map<String, Map> steps = new HashMap<String, Map>();
	
	public boolean isResolveOrNot() {
		return resolveOrNot;
	}
	public void setResolveOrNot(boolean resolveOrNot) {
		this.resolveOrNot = resolveOrNot;
	}
	public Map<String, Object> getParameterMap() {
		return parameterMap;
	}
	public void setParameterMap(Map<String, Object> parameterMap) {
		this.parameterMap = parameterMap;
	}
	public Map<String, Map> getSteps() {
		return steps;
	}
	public void setSteps(Map<String, Map> steps) {
		this.steps = steps;
	}
}
