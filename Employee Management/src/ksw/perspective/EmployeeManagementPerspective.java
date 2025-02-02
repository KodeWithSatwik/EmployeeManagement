package ksw.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class EmployeeManagementPerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		
		String editorId = layout.getEditorArea();
		
		String regionsId = "kws.views.regions";
		String countriesId = "kws.views.countries";
		String departmentsId = "kws.views.departments";
		String managementHierarchyId = "kws.views.managementHierarchy";
		String jobsId = "kws.views.jobs";
		
		
//		left side layout on reference to editor area
		layout.addStandaloneView(regionsId, true, IPageLayout.LEFT, 0.2f, editorId);
		layout.addStandaloneView(countriesId, true, IPageLayout.BOTTOM, 0.25f, regionsId);
		layout.addStandaloneView(departmentsId, true, IPageLayout.BOTTOM, 0.39f, countriesId);

//		right side layout on reference to editor area
		layout.addStandaloneView(managementHierarchyId, true, IPageLayout.RIGHT, 0.64f, editorId);
		layout.addStandaloneView(jobsId, true, IPageLayout.BOTTOM, 0.52f, managementHierarchyId);
		
//		creating the tab view at bottom of the editor
		IFolderLayout tabView = layout.createFolder("EmployeeDetails", IPageLayout.BOTTOM, 0.61f, editorId);
		tabView.addView(IPageLayout.ID_PROP_SHEET);
		tabView.addView(IPageLayout.ID_BOOKMARKS);
		
	}

}
