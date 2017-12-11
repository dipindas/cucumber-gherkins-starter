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
		
		
		
		
//		Iterator<String> itr = testcase.getAction().getSteps().keySet().iterator();
//		while(itr.hasNext()) {
//			System.out.println("Action Items = " + itr.next());
//		}
		//Iterator iterator = testcase.getAction().getSteps().keySet().iterator();
//		while(iterator.hasNext()) {
//			String key = iterator.next().toString();
//			String value = testcase.getAction().getSteps().get(key).toString();
//			System.out.println("Initializer Key = " + key);
//			System.out.println("Initializer Value = " + value);
//		}
		//System.out.println("Action" + Arrays.asList(testcase.getAction()));
		
//		Multimap<String, String> multimap = ArrayListMultimap.create();
//		multimap.put("resolve", "rohit");
//		multimap.put("resolve", "jain");
//		String jsonString = gson.toJson(multimap.asMap());
	}
}
