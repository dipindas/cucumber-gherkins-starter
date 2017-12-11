package junitcucumber;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Initializer implements Serializable {
	private Set<TestCaseStep> testExecutionSteps = new LinkedHashSet<TestCaseStep>();

	public Set<TestCaseStep> getTestExecutionSteps() {
		return testExecutionSteps;
	}

	public void setTestExecutionSteps(Set<TestCaseStep> testExecutionSteps) {
		this.testExecutionSteps = testExecutionSteps;
	}

}
