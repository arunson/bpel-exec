package pdn.bee.binder;

import org.apache.commons.digester.AbstractObjectCreationFactory;
import org.xml.sax.Attributes;

import pdn.bee.model.BPELElementFactory;
import pdn.bee.model.bpel11.activity.Invoke;
import pdn.bee.model.bpel11.activity.Sequence;
import pdn.bee.model.bpel11.elements.BPELRoot;
import pdn.bee.model.bpel11.process.BPELProcess;

public class InvokeFactory extends AbstractObjectCreationFactory {

	@Override
	public Object createObject(Attributes attrs) throws Exception {
		// 
		BPELProcess bpelproc=(BPELProcess)this.getDigester().getRoot();
		
		BPELElementFactory fac=BPELElementFactory.getInstance(bpelproc);
		String name=attrs.getValue(BPELRoot.NAME);
		String joincond=attrs.getValue(BPELRoot.JOIN_CONDITION);
		String supp=attrs.getValue(BPELRoot.SUPPRESS_JOIN_FAILURE);
		
		String partnerlink=attrs.getValue(BPELRoot.PARTNER_LINK);
		String porttype=attrs.getValue(BPELRoot.PORT_TYPE);
		String operation=attrs.getValue(BPELRoot.OPERATION);
		String invar=attrs.getValue(BPELRoot.INPUT_VARIABLE);
		String outvar=attrs.getValue(BPELRoot.OUTPUT_VARIABLE);
		
		Invoke invk=fac.createInvoke(name, joincond, supp, partnerlink, porttype,
				operation, invar, outvar);
		return invk;
		
	}

}
