package pdn.bee.model.bpel11.elements;
import javax.xml.namespace.QName;

public interface From extends BPELRoot {
	
	public Variable getVariable();
	public void setVariable(Variable var);
	
	public String getPart();
	public void setPart(String part);
	
	public String getQuery();
	public void setQuery(String query);
	
	public QName getProperty();
	public void setProperty(QName prop);
	
	public PartnerLink getPartnerLink();
	public void setPartnerLink(PartnerLink partnerlink);
	
	public Roles getEndpointReference();
	public void setEndpointReference(Roles endopint);
	
	public String getExpression();
	public void setExpression(String expression);
	
	public boolean getOpaque();
	public void setOpaque(boolean isOpaque);

}
