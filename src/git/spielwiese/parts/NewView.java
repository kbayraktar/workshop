 
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
		new Label(parent, SWT.None);
	}
	
	
	
	
}