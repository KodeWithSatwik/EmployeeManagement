package ksw.views;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class CountriesView extends ViewPart {

	private ListViewer countries;
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		
		countries = new ListViewer(parent, SWT.SINGLE);
		countries.setContentProvider(ArrayContentProvider.getInstance());
		
		
		
	}
	
	
	public void updateView(String region)
	{
		Map<String, List<String>> regionCountryMap = new HashMap<>();
		regionCountryMap.put("Europe", Arrays.asList("Italy", "United Kingdom", "France", "Germany", "Switzerland",
				"Netherlands", "Denmark", "Belgium"));
		regionCountryMap.put("Americas",
				Arrays.asList("United States of America", "Canada", "Brazil", "Mexico", "Argentina"));
		regionCountryMap.put("Asia", Arrays.asList("Japan", "China", "India", "Australia", "Singapore", "Malaysia"));
		regionCountryMap.put("Middle East and Africa", Arrays.asList("Zimbabwe", "Zambia", "Egypt", "Kuwait", "Israel", "Nigeria"));
		countries.setInput(regionCountryMap.get(region));
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}

}
