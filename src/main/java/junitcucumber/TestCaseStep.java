package junitcucumber;

import java.util.Map;

public class TestCaseStep {
	private boolean resolveOrNot;
	private Map<String, Object> parameterMap;
	private Map<String, Map> step;
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
	public Map<String, Map> getStep() {
		return step;
	}
	public void setStep(Map<String, Map> step) {
		this.step = step;
	}

}
