package junitcucumber;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class TestStepJSONGenerator {
	TestCase testcase;
	public TestStepJSONGenerator(Initializer initializer, Action action, Validator validator) {
		testcase = new TestCase();
		testcase.setInitializer(initializer);
		testcase.setAction(action);
		testcase.setValidator(validator);
	}
}
