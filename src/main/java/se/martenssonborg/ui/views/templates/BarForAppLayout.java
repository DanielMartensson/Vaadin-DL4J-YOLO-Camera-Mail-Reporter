package se.martenssonborg.ui.views.templates;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

import lombok.Data;
import se.martenssonborg.ui.views.ConfigurationView;
import se.martenssonborg.ui.views.RunView;

@Data
public class BarForAppLayout {
	
	private Image img;
	private Tabs tabs;
	private DrawerToggle drawerToggle;

	public BarForAppLayout() {
		// Bar image
		img = new Image("https://i.imgur.com/GPpnszs.png", "Vaadin Logo");
        img.setHeight("44px");
        
        // Drawer
        drawerToggle = new DrawerToggle();
        drawerToggle.setAutofocus(true); 
        
        // Tabs
        Tab runTab = new Tab("Run");
        runTab.getElement().addEventListener("click", e -> {
        	UI.getCurrent().navigate(RunView.class);
        });
        Tab configurationTab = new Tab("Configuration");
        configurationTab.getElement().addEventListener("click", e -> {
        	UI.getCurrent().navigate(ConfigurationView.class);
        });
        Tab createTab = new Tab("Create");
        configurationTab.getElement().addEventListener("click", e -> {
        	
        });
        tabs = new Tabs(runTab, configurationTab, createTab);
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
	}

}
