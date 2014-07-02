 
package git.spielwiese.parts;

import javax.inject.Inject;
import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class NewView {
	@Inject
	public NewView() {
		
		
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		Label label = new Label(parent, SWT.None);
		label.setText("Hallo Bernd");
		Label label1 = new Label(parent, SWT.None);
		label1.setText("Hallo Orhan");
		
	}
	
	
	
	
}