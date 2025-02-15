package ksw.views;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

public class RegionsView extends ViewPart {

	private ListViewer regionList;
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		regionList = new ListViewer(parent, SWT.SINGLE);
		regionList.add("Europe");
		regionList.add("America");
		regionList.add("Asia");
		regionList.add("Middle East and Africa");

		regionList.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				IStructuredSelection structuredSelection = event.getStructuredSelection();
				String region = (String) structuredSelection.getFirstElement();
				
				CountriesView countriesView = (CountriesView)PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView("kws.views.countries");
				countriesView.updateView(region);
			}
		});

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
