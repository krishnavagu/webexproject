package org.cruxframework.crux.core.client.screen.views;

import com.google.gwt.core.client.GWT;
import org.cruxframework.crux.core.client.screen.Screen;
import org.cruxframework.crux.core.client.screen.views.View;
import org.cruxframework.crux.core.client.utils.StringUtils;
import com.google.gwt.user.client.Window;
import org.cruxframework.crux.core.client.screen.views.ViewFactoryUtils;
import org.cruxframework.crux.core.client.screen.views.ViewFactory.CreateCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import org.cruxframework.crux.core.client.screen.views.ViewLoadEvent;
import com.google.gwt.user.client.ui.Panel;
import org.cruxframework.crux.core.client.screen.InterfaceConfigException;
import com.google.gwt.user.client.ui.Widget;
import org.cruxframework.crux.core.client.Crux;

public class main_largeDisplayTouch extends View {
  protected main_largeDisplayTouch(String id){
    super(id);
    setTitle(null);
    this.iocContainer = new org.cruxframework.crux.core.client.ioc.IocContainer_main_largeDisplayTouch(this);
    this.registeredControllers = new org.cruxframework.crux.core.client.controller.RegisteredControllers_main_largeDisplayTouch(this, iocContainer);
    this.registeredFormatters = new org.cruxframework.crux.core.client.formatter.RegisteredFormatters_main();
    this.registeredDataSources = new org.cruxframework.crux.core.client.datasource.RegisteredDataSources_main_largeDisplayTouch(this, iocContainer);
  }
  public org.cruxframework.crux.core.client.controller.RegisteredControllers getRegisteredControllers(){
    return this.registeredControllers;
  }
  public org.cruxframework.crux.core.client.formatter.RegisteredClientFormatters getRegisteredFormatters(){
    return this.registeredFormatters;
  }
  public org.cruxframework.crux.core.client.datasource.DataSource<?> createDataSource(String dataSource){
    return this.registeredDataSources.getDataSource(dataSource);
  }
  protected void createWidgets(){
    __view.addViewLoadHandler(new org.cruxframework.crux.core.client.screen.views.ViewLoadHandler(){
      public void onLoad(org.cruxframework.crux.core.client.screen.views.ViewLoadEvent event){
        ((webex.client.MainController_ControllerProxy)__view.getController("mainController")).onLoad_Exposed_();
      }
    });
    final org.cruxframework.crux.widgets.client.storyboard.Storyboard widget8 = GWT.create(org.cruxframework.crux.widgets.client.storyboard.Storyboard.class);
    __view.addWidget("mainPanel", widget8);
    final com.google.gwt.user.client.ui.TextBox widget9 = GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    __view.addWidget("nameTextBox", widget9);
    widget8.add(widget9);
    final org.cruxframework.crux.smartfaces.client.button.Button widget10 = GWT.create(org.cruxframework.crux.smartfaces.client.button.Button.class);
    __view.addWidget("okButton", widget10);
    widget10.setText("Go!");
    widget10.addSelectHandler(new org.cruxframework.crux.core.client.event.SelectHandler(){
      public void onSelect(org.cruxframework.crux.core.client.event.SelectEvent event){
        ((webex.client.MainController_ControllerProxy)__view.getController("mainController")).sayOk_Exposed_();
      }
    });
    widget8.add(widget10);
    if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
      logger2.fine(Crux.getMessages().viewContainerViewCreated(getId()));
    }
  }
  protected void render(com.google.gwt.user.client.ui.Panel rootPanel4, final org.cruxframework.crux.core.client.screen.views.View.RenderCallback renderCallback) throws InterfaceConfigException{
    if (this.viewPanel0 == null){
      this.viewPanel0 = new com.google.gwt.user.client.ui.HTMLPanel(" <div id=\"_crux_"+__view.getPrefix()+"mainPanel\"></div> ");
      rootPanel4.add(this.viewPanel0);
      this.viewPanel0.addAndReplaceElement(widgets.get("mainPanel"), ViewFactoryUtils.getEnclosingPanelId("mainPanel", __view));
      renderCallback.onRendered();
    }
    else {
      rootPanel4.add(this.viewPanel0);
      renderCallback.onRendered();
    }
    if(!StringUtils.isEmpty(this.width)){
      updateViewWidth(this.width);
    }
    if(!StringUtils.isEmpty(this.height)){
      updateViewHeight(this.height);
    }
    if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
      logger2.fine(Crux.getMessages().viewContainerViewRendered(getId()));
    }
  }
  protected void updateViewHeight(String height){
    if (this.viewPanel0 != null){
      this.viewPanel0.setHeight(height);
    }
  }
  protected void updateViewWidth(String width){
    if (this.viewPanel0 != null){
      this.viewPanel0.setWidth(width);
    }
  }
  protected native org.cruxframework.crux.core.client.collection.Map<String> initializeLazyDependencies()/*-{
  return {};
}-*/;
public org.cruxframework.crux.core.client.ioc.IocContainer getIocContainer(){
  return iocContainer;
}
public org.cruxframework.crux.core.client.ioc.IocContainer_main_largeDisplayTouch getTypedIocContainer(){
  return iocContainer;
}
protected void registerDataObjectBinders(){
}
public com.google.gwt.user.client.ui.HTMLPanel getViewPanel(){
  return viewPanel0;
}
private org.cruxframework.crux.core.client.controller.RegisteredControllers registeredControllers;
private org.cruxframework.crux.core.client.datasource.RegisteredDataSources registeredDataSources;
private org.cruxframework.crux.core.client.formatter.RegisteredClientFormatters registeredFormatters;
protected org.cruxframework.crux.core.client.ioc.IocContainer_main_largeDisplayTouch iocContainer;
private final View __view = this;
private static java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(main_largeDisplayTouch.class.getName());
private com.google.gwt.user.client.ui.HTMLPanel viewPanel0 = null;
}
