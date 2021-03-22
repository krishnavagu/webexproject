package org.cruxframework.crux.core.client.ioc;

import org.cruxframework.crux.core.client.screen.views.View;
import com.google.gwt.core.client.GWT;

public class IocContainer_main_smallDisplayArrows extends org.cruxframework.crux.core.client.ioc.IocContainer {
  public IocContainer_main_smallDisplayArrows(View view){
    super(view);
  }
  public  webex.client.MainController.MainView getwebex_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope scope, String subscope){
    webex.client.MainController.MainView result = _getScope(scope).getValue(new org.cruxframework.crux.core.client.ioc.IocProvider<webex.client.MainController.MainView>(){
      public webex.client.MainController.MainView get(){
        return GWT.create(webex.client.MainController.MainView.class);
      }
    }, "webex.client.MainController.MainView", subscope, 
    new IocScope.CreateCallback<webex.client.MainController.MainView>(){
      public void onCreate(webex.client.MainController.MainView newObject){
      }
    }
    );
    if (scope != org.cruxframework.crux.core.client.ioc.IoCResource.Scope.SINGLETON && result.getBoundCruxViewId() == null){
      result.bindCruxView(this.getBoundCruxViewId());
    }
    return result;
  }
}
