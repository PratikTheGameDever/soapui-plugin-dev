package soapui.demo.teststeps.email;

import com.eviware.soapui.config.TestStepConfig;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStep;
import com.eviware.soapui.impl.wsdl.teststeps.registry.WsdlTestStepFactory;
import com.eviware.soapui.support.UISupport;

public class EMailTestStepFactory extends WsdlTestStepFactory {

	private static final String EMAIL_STEP_ID = "email";

	public EMailTestStepFactory() {
		super(EMAIL_STEP_ID, "Email TestStep", "Sends an email", "email.png");
		UISupport.showInfoMessage("Constructor Called");
	}

	@Override
	public WsdlTestStep buildTestStep(WsdlTestCase testCase, TestStepConfig config, boolean forLoadTest) {
		UISupport.showInfoMessage("buildTestStep Called");
		return new EMailTestStep(testCase, config, forLoadTest);
	}

	@Override
	public boolean canCreate() {
		UISupport.showInfoMessage("canCreate Called");
		return true;
	}

	@Override
	public TestStepConfig createNewTestStep(WsdlTestCase testCase, String name) {
		UISupport.showInfoMessage("createNewTestStep Called");
		TestStepConfig testStepConfig = TestStepConfig.Factory.newInstance();
		testStepConfig.setType(EMAIL_STEP_ID);
		testStepConfig.setName(name);

		return testStepConfig;
	}

}
