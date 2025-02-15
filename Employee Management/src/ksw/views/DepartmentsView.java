package ksw.views;

import javax.swing.text.html.ListView;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class DepartmentsView extends ViewPart {

	private ListViewer departmentList;
	
	@Override
	public void createPartControl(Composite parent) {
	
		departmentList = new ListViewer(parent, SWT.SINGLE);
		
		departmentList.add("Resources");
		departmentList.add("Shipping");
		departmentList.add("IT");
		departmentList.add("Public Relations");
		departmentList.add("Sales");
		departmentList.add("Executive");
		departmentList.add("Finance");
		departmentList.add("Accounting");
		departmentList.add("Treasury");
		departmentList.add("Corporate Tax");
		departmentList.add("Control and Credit");
		
		departmentList.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				IStructuredSelection structuredSelection = event.getStructuredSelection();
				String department = (String)structuredSelection.getFirstElement();
				System.out.println(department);
				
			}
		});
		
	}

	@Override
	public void setFocus() {
		departmentList.getControl().setFocus();
		
	}

}
