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

public class org_cruxframework_crux_widgets_client_storyboard_Storyboard_largeDisplayArrows extends View {
  public org_cruxframework_crux_widgets_client_storyboard_Storyboard_largeDisplayArrows(String id){
    super(id);
    this.iocContainer = new org.cruxframework.crux.core.client.ioc.IocContainer_org_cruxframework_crux_widgets_client_storyboard_Storyboard_largeDisplayArrows(this);
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
    final com.google.gwt.user.client.ui.FlowPanel widget19 = GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    __view.addWidget("storyboard", widget19);
    if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
      logger11.fine(Crux.getMessages().viewContainerViewCreated(getId()));
    }
  }
  protected void render(com.google.gwt.user.client.ui.Panel rootPanel9, final org.cruxframework.crux.core.client.screen.views.View.RenderCallback renderCallback) throws InterfaceConfigException{
    if (this.viewPanel1 == null){
      this.viewPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(" <div id=\"_crux_"+__view.getPrefix()+"storyboard\"></div> ");
      rootPanel9.add(this.viewPanel1);
      this.viewPanel1.addAndReplaceElement(widgets.get("storyboard"), ViewFactoryUtils.getEnclosingPanelId("storyboard", __view));
      renderCallback.onRendered();
    }
    else {
      rootPanel9.add(this.viewPanel1);
      renderCallback.onRendered();
    }
    if(!StringUtils.isEmpty(this.width)){
      updateViewWidth(this.width);
    }
    if(!StringUtils.isEmpty(this.height)){
      updateViewHeight(this.height);
    }
    if (com.google.gwt.logging.client.LogConfiguration.loggingIsEnabled()){
      logger11.fine(Crux.getMessages().viewContainerViewRendered(getId()));
    }
  }
  protected void updateViewHeight(String height){
    if (this.viewPanel1 != null){
      this.viewPanel1.setHeight(height);
    }
  }
  protected void updateViewWidth(String width){
    if (this.viewPanel1 != null){
      this.viewPanel1.setWidth(width);
    }
  }
  protected native org.cruxframework.crux.core.client.collection.Map<String> initializeLazyDependencies()/*-{
  return {};
}-*/;
public org.cruxframework.crux.core.client.ioc.IocContainer getIocContainer(){
  return iocContainer;
}
public org.cruxframework.crux.core.client.ioc.IocContainer_org_cruxframework_crux_widgets_client_storyboard_Storyboard_largeDisplayArrows getTypedIocContainer(){
  return iocContainer;
}
protected void registerDataObjectBinders(){
}
public com.google.gwt.user.client.ui.HTMLPanel getViewPanel(){
  return viewPanel1;
}
@Override
public <T> T getController(String controller){
  return (T)this._controller;
}
public void setController(org.cruxframework.crux.widgets.client.storyboard.StoryboardLargeController_ControllerProxy controller){
  this._controller = controller;
}
public void registerLoadedView(){
}
public void unregisterLoadedView(){
}
private org.cruxframework.crux.core.client.controller.RegisteredControllers registeredControllers;
private org.cruxframework.crux.core.client.datasource.RegisteredDataSources registeredDataSources;
private org.cruxframework.crux.core.client.formatter.RegisteredClientFormatters registeredFormatters;
protected org.cruxframework.crux.core.client.ioc.IocContainer_org_cruxframework_crux_widgets_client_storyboard_Storyboard_largeDisplayArrows iocContainer;
private final View __view = this;
private static java.util.logging.Logger logger11 = java.util.logging.Logger.getLogger(org_cruxframework_crux_widgets_client_storyboard_Storyboard_largeDisplayArrows.class.getName());
private com.google.gwt.user.client.ui.HTMLPanel viewPanel1 = null;
public org.cruxframework.crux.widgets.client.storyboard.StoryboardLargeController_ControllerProxy _controller;
}
