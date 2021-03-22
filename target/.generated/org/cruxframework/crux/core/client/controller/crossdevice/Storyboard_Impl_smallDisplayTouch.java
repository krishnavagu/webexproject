package org.cruxframework.crux.core.client.controller.crossdevice;

import org.cruxframework.crux.core.client.screen.ScreenFactory;
import org.cruxframework.crux.core.client.screen.Screen;
import com.google.gwt.core.client.GWT;

public class Storyboard_Impl_smallDisplayTouch extends com.google.gwt.user.client.ui.Composite implements org.cruxframework.crux.widgets.client.storyboard.Storyboard {
  public Storyboard_Impl_smallDisplayTouch(){
    org.cruxframework.crux.core.client.screen.views.org_cruxframework_crux_widgets_client_storyboard_Storyboard_smallDisplayTouch view3 = new org.cruxframework.crux.core.client.screen.views.org_cruxframework_crux_widgets_client_storyboard_Storyboard_smallDisplayTouch("Storyboard"+(_idGen++));
    this._controller = new org.cruxframework.crux.widgets.client.storyboard.StoryboardSmallController_ControllerProxy(view3);
    ((org.cruxframework.crux.core.client.controller.crossdevice.DeviceAdaptiveController)this._controller).setBoundWidget(this);
    view3.setController(this._controller);
    initWidget(viewContainer.asWidget());
    viewContainer.add(view3, true, null);
    ((org.cruxframework.crux.core.client.controller.crossdevice.DeviceAdaptiveController)this._controller).init();
  }
  public void add(com.google.gwt.user.client.ui.Widget w){
    this._controller.add(w);
  }
  public com.google.gwt.event.shared.HandlerRegistration addSelectionHandler(com.google.gwt.event.logical.shared.SelectionHandler<java.lang.Integer> handler){
    return this._controller.addSelectionHandler(handler);
  }
  public com.google.gwt.user.client.ui.Widget asWidget(){
    return this._controller.asWidget();
  }
  public void clear(){
    this._controller.clear();
  }
  public java.lang.String getLargeDeviceItemHeight(){
    return this._controller.getLargeDeviceItemHeight();
  }
  public java.lang.String getLargeDeviceItemWidth(){
    return this._controller.getLargeDeviceItemWidth();
  }
  public java.lang.String getSmallDeviceItemHeight(){
    return this._controller.getSmallDeviceItemHeight();
  }
  public com.google.gwt.user.client.ui.Widget getWidget(int index){
    return this._controller.getWidget(index);
  }
  public int getWidgetCount(){
    return this._controller.getWidgetCount();
  }
  public int getWidgetIndex(com.google.gwt.user.client.ui.Widget child){
    return this._controller.getWidgetIndex(child);
  }
  public java.util.Iterator<com.google.gwt.user.client.ui.Widget> iterator(){
    return this._controller.iterator();
  }
  public boolean remove(com.google.gwt.user.client.ui.Widget w){
    return this._controller.remove(w);
  }
  public boolean remove(int index){
    return this._controller.remove(index);
  }
  public void setFixedHeight(boolean fixedHeight){
    this._controller.setFixedHeight(fixedHeight);
  }
  public void setFixedWidth(boolean fixedWidth){
    this._controller.setFixedWidth(fixedWidth);
  }
  public void setHorizontalAlignment(com.google.gwt.user.client.ui.HasHorizontalAlignment.HorizontalAlignmentConstant value){
    this._controller.setHorizontalAlignment(value);
  }
  public void setHorizontalAlignment(com.google.gwt.user.client.ui.IsWidget child, com.google.gwt.user.client.ui.HasHorizontalAlignment.HorizontalAlignmentConstant value){
    this._controller.setHorizontalAlignment(child, value);
  }
  public void setLargeDeviceItemHeight(com.google.gwt.user.client.ui.IsWidget child, java.lang.String height){
    this._controller.setLargeDeviceItemHeight(child, height);
  }
  public void setLargeDeviceItemHeight(java.lang.String height){
    this._controller.setLargeDeviceItemHeight(height);
  }
  public void setLargeDeviceItemWidth(com.google.gwt.user.client.ui.IsWidget child, java.lang.String width){
    this._controller.setLargeDeviceItemWidth(child, width);
  }
  public void setLargeDeviceItemWidth(java.lang.String width){
    this._controller.setLargeDeviceItemWidth(width);
  }
  public void setSmallDeviceItemHeight(com.google.gwt.user.client.ui.IsWidget child, java.lang.String height){
    this._controller.setSmallDeviceItemHeight(child, height);
  }
  public void setSmallDeviceItemHeight(java.lang.String height){
    this._controller.setSmallDeviceItemHeight(height);
  }
  public void setVerticalAlignment(com.google.gwt.user.client.ui.HasVerticalAlignment.VerticalAlignmentConstant value){
    this._controller.setVerticalAlignment(value);
  }
  public void setVerticalAlignment(com.google.gwt.user.client.ui.IsWidget child, com.google.gwt.user.client.ui.HasVerticalAlignment.VerticalAlignmentConstant value){
    this._controller.setVerticalAlignment(child, value);
  }
  private org.cruxframework.crux.widgets.client.storyboard.StoryboardSmallController_ControllerProxy _controller;
  private org.cruxframework.crux.core.client.controller.crossdevice.DeviceAdaptiveViewContainer viewContainer = new org.cruxframework.crux.core.client.controller.crossdevice.DeviceAdaptiveViewContainer();
  private static java.util.logging.Logger logger31 = java.util.logging.Logger.getLogger(Storyboard_Impl_smallDisplayTouch.class.getName());
  private static int _idGen = 0;
}
