package junitcucumber;

import junitcucumber.TestCaseStep;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Action implements Serializable {
	private Set<TestCaseStep> testExecutionSteps = new LinkedHashSet<TestCaseStep>();

	public Set<TestCaseStep> getTestExecutionSteps() {
		return testExecutionSteps;
	}

	public void setTestExecutionSteps(Set<TestCaseStep> testExecutionSteps) {
		this.testExecutionSteps = testExecutionSteps;
	}
}
