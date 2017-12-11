package junitcucumber;

import java.io.Serializable;

public class TestCase implements Serializable {
	private Initializer initializer;
	private Action action;
	private Validator validator;

	public Initializer getInitializer() {
		return initializer;
	}

	public void setInitializer(Initializer initializer) {
		this.initializer = initializer;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

//public JsonObject toJson() {
//	return new JsonObject().put("initializer", initializer).put("action", action).put("validator", validator);
//}

}

