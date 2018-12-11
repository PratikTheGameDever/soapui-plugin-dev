package soapui.demo.teststeps.email;

import com.eviware.soapui.config.TestStepConfig;
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestCase;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStepResult;
import com.eviware.soapui.impl.wsdl.teststeps.WsdlTestStepWithProperties;
import com.eviware.soapui.model.testsuite.TestCaseRunContext;
import com.eviware.soapui.model.testsuite.TestCaseRunner;
import com.eviware.soapui.model.testsuite.TestStepResult;
import com.eviware.soapui.model.testsuite.TestStepResult.TestStepStatus;
import com.eviware.soapui.support.UISupport;

public class EMailTestStep extends WsdlTestStepWithProperties {

	protected EMailTestStep(WsdlTestCase testCase, TestStepConfig config, boolean forLoadTest) {
		super(testCase, config, true, forLoadTest);
		if (!forLoadTest) {
			setIcon(UISupport.createImageIcon("email.png"));
		}

	}

	@Override
	public TestStepResult run(TestCaseRunner arg0, TestCaseRunContext arg1) {
		WsdlTestStepResult result = new WsdlTestStepResult(this);
		result.setStatus(TestStepStatus.OK);
		return result;
	}

}
