package junitcucumber;

import junitcucumber.StaticStepsConfig;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChannelSteps {
	private Initializer initializer = new Initializer();
	private Action action = new Action();
	private Validator validator = new Validator();
	//private TestCaseStep testcasestep = new TestCaseStep();
	TestStepJSONGenerator testStepJSONGenerator;
	//private Map<String, Object> parameterMap = new HashMap<String, Object>();
	//private Map<String, Map> steps = new HashMap<String, Map>();
	private Set<TestCaseStep> intializerTestExecutionSteps = new LinkedHashSet<TestCaseStep>();
	private Set<TestCaseStep> actionTestExecutionSteps = new LinkedHashSet<TestCaseStep>();
	private Set<TestCaseStep> validatorTestExecutionSteps = new LinkedHashSet<TestCaseStep>();
	StaticStepsConfig config = new StaticStepsConfig();
	
	@Given("^that stb is up and running$")
	public void bootSTB() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.STB_POWERON, null);
		testcasestep.setSteps(steps);
		intializerTestExecutionSteps.add(testcasestep);
		//initializer.setTestExecutionSteps(intializerTestExecutionSteps);
	}
	
	@When("^User tunes to any channel in Live TV$")
	public void navigateToLiveTV() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.MOVE_TO_LIVE_TV, null);
		testcasestep.setSteps(steps);
		actionTestExecutionSteps.add(testcasestep);
		//action.setTestExecutionSteps(actionTestExecutionSteps);
	}
	
	@When("^User press TV_Guide hotkey$")
	public void moveToTV_Guide() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.PRESS_TV_GUIDE, null);
		testcasestep.setSteps(steps);
		actionTestExecutionSteps.add(testcasestep);
		
	}
	
	@When("^User select a future program$")
	public void goToFutureProgram() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.MOVE_TO_FUTURE_PROGRAM, null);
		testcasestep.setSteps(steps);
		actionTestExecutionSteps.add(testcasestep);
	}
	
	@When("^User set reminder from action menu$")
	public void setChannelReminder() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.SET_CHANNEL_REMINDER, null);
		testcasestep.setSteps(steps);
		actionTestExecutionSteps.add(testcasestep);
	}
	
	@When("^User launch action menu again")
	public void reLaunchActionMenu() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.RELAUNCH_ACTION_MENU, null);
		testcasestep.setSteps(steps);
		actionTestExecutionSteps.add(testcasestep);
	}
	
	@When("^User select Reset reminder option$")
	public void resetChannelReminder() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(true);
		steps.put(config.RESET_CHANNEL_REMINDER, null);
		testcasestep.setSteps(steps);
		actionTestExecutionSteps.add(testcasestep);
	}
	
	@Then("^the reminder should be reset$")
	public void validateReminderReset() throws Throwable {
		Map<String, Map> steps = new HashMap<String, Map>();
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		TestCaseStep testcasestep = new TestCaseStep();
		testcasestep.setResolveOrNot(false);
		parameterMap.put("x-coordinate", 200);
		parameterMap.put("y-coordinate", 300);
		parameterMap.put("width", 600);
		parameterMap.put("height", 300);
		parameterMap.put("text", "rappel");
		steps.put(config.MATCH_TEXT, parameterMap);
		testcasestep.setSteps(steps);
		validatorTestExecutionSteps.add(testcasestep);
	}
	
	@After
	public void afterScenario() {
		System.out.println("After");
		initializer.setTestExecutionSteps(intializerTestExecutionSteps);
		action.setTestExecutionSteps(actionTestExecutionSteps);
		validator.setTestExecutionSteps(validatorTestExecutionSteps);
		testStepJSONGenerator = new TestStepJSONGenerator(initializer, action, validator);
	}
	
	@Before
	public void beforeScenario() {
		System.out.println("Before");
	}
}
