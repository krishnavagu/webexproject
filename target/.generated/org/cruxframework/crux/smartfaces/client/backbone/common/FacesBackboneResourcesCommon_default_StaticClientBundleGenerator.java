package org.cruxframework.crux.smartfaces.client.backbone.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FacesBackboneResourcesCommon_default_StaticClientBundleGenerator implements org.cruxframework.crux.smartfaces.client.backbone.common.FacesBackboneResourcesCommon {
  private static FacesBackboneResourcesCommon_default_StaticClientBundleGenerator _instance0 = new FacesBackboneResourcesCommon_default_StaticClientBundleGenerator();
  private void cssInitializer() {
    css = new org.cruxframework.crux.smartfaces.client.backbone.common.FacesBackboneCSSCommon() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GCTYMOCCOJ,.GCTYMOCCFK{display:" + ("-webkit-box")  + ";display:" + ("-moz-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";}.GCTYMOCCAK{display:" + ("-webkit-box")  + ";display:" + ("-moz-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";-webkit-box-orient:") + (("horizontal")  + ";-moz-box-orient:" + ("horizontal")  + ";-ms-flex-direction:" + ("row")  + ";-webkit-flex-direction:" + ("row")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCCK{display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";}.GCTYMOCCBK{display:" + ("-webkit-inline-box") ) + (";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";-webkit-box-orient:" + ("horizontal")  + ";-moz-box-orient:" + ("horizontal")  + ";-ms-flex-direction:" + ("row")  + ";-webkit-flex-direction:" + ("row")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCGK{display:" + ("-webkit-inline-box")  + ";display:") + (("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";}.GCTYMOCCFK,.GCTYMOCCGK{-webkit-box-orient:" + ("vertical")  + ";-moz-box-orient:" + ("vertical")  + ";-ms-flex-direction:" + ("column")  + ";-webkit-flex-direction:" + ("column")  + ";flex-direction:" + ("column")  + ";}.GCTYMOCCPJ{-webkit-box-ordinal-group:" + ("1")  + ";-moz-box-ordinal-group:" + ("1") ) + (";-ms-flex-order:" + ("1")  + ";-webkit-order:" + ("1")  + ";order:" + ("1")  + ";}.GCTYMOCCDK{-webkit-box-ordinal-group:" + ("2")  + ";-moz-box-ordinal-group:" + ("2")  + ";-ms-flex-order:" + ("2")  + ";-webkit-order:" + ("2")  + ";order:" + ("2")  + ";}.GCTYMOCCEK{-webkit-box-ordinal-group:" + ("3")  + ";-moz-box-ordinal-group:" + ("3")  + ";-ms-flex-order:") + (("3")  + ";-webkit-order:" + ("3")  + ";order:" + ("3")  + ";}.GCTYMOCCLJ{overflow:" + ("hidden")  + ";width:" + ("100%")  + ";}" + (((org.cruxframework.crux.core.client.screen.Screen.isIos())) ? (".GCTYMOCCLJ{position:" + ("fixed")  + ";width:" + ("100%")  + ";}") : "")  + ".GCTYMOCCMJ{-webkit-touch-callout:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";-ms-user-select:" + ("none") ) + (";user-select:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu--fixed{position:" + ("fixed")  + ";top:" + ("0")  + ";right:" + ("0")  + ";z-index:" + ("3")  + ";}.GCTYMOCCLI.faces-Menu--grow>.faces-Menu-ul>.faces-Menu-li{flex-grow:" + ("1")  + ";-webkit-flex-grow:" + ("1")  + ";-moz-flex-grow:" + ("1")  + ";-webkit-box-flex:" + ("1")  + ";-ms-flex-positive:" + ("1")  + ";}.GCTYMOCCLI.faces-Menu--grow>.faces-Menu-ul .faces-Menu-ul{z-index:") + (("5")  + ";}.GCTYMOCCLI .faces-Menu-ul,.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown .faces-Menu-ul{list-style:" + ("none")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-dropdown .faces-Menu-ul .faces-Menu-ul{z-index:" + ("5")  + ";z-index:" + ("5")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul{display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex") ) + (";flex-flow:" + ("row"+ " " +"wrap")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul .faces-Menu-ul{display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li{position:" + ("relative")  + ";cursor:" + ("pointer")  + ";}.GCTYMOCCLI.faces-Menu-tree .faces-Menu-ul .faces-Menu-li .faces-Menu-li{border-bottom:" + ("none")  + ";}.GCTYMOCCLI .faces-Menu-ul .faces-Menu-li .faces-SelectablePanel{padding:" + ("10px"+ " " +"20px")  + ";}.GCTYMOCCLI.faces-Menu-tree .faces-Menu-ul .faces-Menu-li .faces-SelectablePanel{padding:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown .faces-Menu-li:hover>.faces-Menu-ul{display:" + ("block")  + ";margin-top:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-ul{width:" + ("100%")  + ";min-width:") + (("150px")  + ";position:" + ("absolute")  + ";top:" + ("100%")  + ";right:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-ul .faces-Menu-li{position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li .faces-Menu-li .faces-Menu-ul{width:" + ("100%")  + ";position:" + ("absolute")  + ";right:" + ("100%")  + ";top:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-dropdown>.faces-Menu-ul .faces-Menu-ul{width:" + ("100%")  + ";position:" + ("absolute") ) + (";right:" + ("100%")  + ";top:" + ("0")  + ";display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-dropdown .faces-Menu-li{position:" + ("relative")  + ";margin-top:" + ("-1px")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-dropdown .faces-Menu-li:hover>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-ul .faces-Menu-ul{display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-li{padding-right:" + ("15px")  + ";position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-li .faces-Menu-openCloseTriggerHelper{position:") + (("absolute")  + ";top:" + ("2px")  + ";right:" + ("-3px")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion{height:" + ("200px")  + ";display:" + ("inline-block")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li{float:" + ("right")  + ";min-width:" + ("38px")  + ";height:" + ("200px")  + ";position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul .faces-Menu-li{position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-accordion.faces-Menu-horizontal>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-ul{height:" + ("198px") ) + (";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li>.faces-SelectablePanel{-webkit-transform:" + ("rotate(" + "-90deg" + ")")  + ";-moz-transform:" + ("rotate(" + "-90deg" + ")")  + ";transform:" + ("rotate(" + "-90deg" + ")")  + ";width:" + ("199px")  + ";height:" + ("38px")  + ";margin-right:" + ("-81px")  + ";margin-top:" + ("80px")  + ";position:" + ("absolute")  + ";padding:" + ("10px")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-openCloseTriggerHelper{position:" + ("absolute")  + ";top:") + (("0")  + ";right:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion .faces-Menu-ul .faces-Menu-ul{width:" + ("300px")  + ";margin-right:" + ("38px")  + ";background:" + ("#fff")  + ";font-size:" + ("12px")  + ";display:" + ("none")  + ";overflow-y:" + ("auto")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion{width:" + ("200px")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion .faces-Menu-li{position:" + ("relative") ) + (";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li>.faces-SelectablePanel,.GCTYMOCCLI.faces-Menu-slide .faces-Menu-ul .faces-Menu-li .faces-SelectablePanel{padding:" + ("10px")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li .faces-Menu-ul{display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion .faces-Menu-hasChildren>.faces-Menu-openCloseTriggerHelper{position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("5px")  + ";}.GCTYMOCCLI.faces-Menu-slide{height:" + ("100%")  + ";position:" + ("relative")  + ";overflow:" + ("hidden")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-ul .faces-Menu-ul{-webkit-transform:" + ("translateX(" + "100%" + ")")  + ";-moz-transform:") + (("translateX(" + "100%" + ")")  + ";transform:" + ("translateX(" + "100%" + ")")  + ";overflow-y:" + ("auto")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";right:" + ("0")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";z-index:" + ("2")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-ul .faces-Menu-li{height:" + ("40px")  + ";position:" + ("initial") ) + (";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{-webkit-transform:" + ("translateX(" + "0" + ")")  + ";-moz-transform:" + ("translateX(" + "0" + ")")  + ";transform:" + ("translateX(" + "0" + ")")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-li.faces-Menu-hasChildren>.faces-Menu-openCloseTriggerHelper{float:" + ("left")  + ";margin-top:" + ("-20px")  + ";margin-left:" + ("12px")  + ";z-index:" + ("1")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-closeTriggerSliderHelper{width:" + ("100%")  + ";height:" + ("22px")  + ";display:" + ("block")  + ";border:") + (("0")  + ";background:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.06" + ")")  + ";box-shadow:" + ("0"+ " " +"-1px"+ " " +"0"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")"+ " " +"inset")  + ";position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-closeTriggerSliderHelper:hover{background:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-closeTriggerSliderHelper:before{content:" + ("\"\"")  + ";position:" + ("absolute")  + ";right:" + ("5px")  + ";top:" + ("7px")  + ";z-index:" + ("1")  + ";}.GCTYMOCCMI{-webkit-box-flex:" + ("1") ) + (";-moz-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";-webkit-flex:" + ("1")  + ";flex:" + ("1")  + ";display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";-webkit-box-ordinal-group:" + ("2")  + ";-moz-box-ordinal-group:") + (("2")  + ";-ms-flex-order:" + ("2")  + ";-webkit-order:" + ("2")  + ";order:" + ("2")  + ";}.faces-RollingPanel-body{overflow-y:" + ("hidden")  + ";overflow-x:" + ("auto")  + ";}.GCTYMOCCPI{-webkit-box-flex:" + ("1")  + ";-moz-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";-webkit-flex:" + ("1")  + ";flex:" + ("1") ) + (";-webkit-box-ordinal-group:" + ("2")  + ";-moz-box-ordinal-group:" + ("2")  + ";-ms-flex-order:" + ("2")  + ";-webkit-order:" + ("2")  + ";order:" + ("2")  + ";overflow:" + ("hidden")  + ";}.GCTYMOCCPI .faces-TabBar{display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:") + (("inline-flex")  + ";}.GCTYMOCCCJ{flex-direction:" + ("column")  + ";display:" + ("table-row")  + ";}.GCTYMOCCEJ{display:" + ("flex")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCDJ{display:" + ("inline-flex")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCII{overflow:" + ("auto")  + ";}.GCTYMOCCJI{display:" + ("inline-block")  + ";width:" + ("100%")  + ";position:" + ("relative") ) + (";}.GCTYMOCCAJ{display:" + ("-webkit-box")  + ";display:" + ("-moz-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";min-height:" + ("100vh")  + ";flex-direction:" + ("column")  + ";}.faces-TopMenuDisposal .contentPanel,.GCTYMOCCHI{flex:" + ("1")  + ";}.GCTYMOCCOI{position:" + ("relative")  + ";top:" + ("0")  + ";right:") + (("0")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";visibility:" + ("visible")  + ";}.GCTYMOCCOI .faces-SwapPanel-currentPanel{width:" + ("100%")  + ";}.GCTYMOCCOI .faces-SwapPanel-nextPanel{width:" + ("100%")  + ";display:" + ("none")  + ";overflow:" + ("hidden")  + ";}.GCTYMOCCGI{position:" + ("absolute")  + " !important;}.GCTYMOCCFJ{z-index:" + ("5")  + ";}.GCTYMOCCGJ{z-index:" + ("5") ) + (";overflow:" + ("hidden")  + ";pointer-events:" + ("auto")  + ";position:" + ("fixed")  + ";}.GCTYMOCCNJ{z-index:" + ("6")  + ";}.GCTYMOCCHJ{right:" + ("50%")  + " !important;top:" + ("50%")  + " !important;-webkit-transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")"+ " " +"translateZ(" + "0" + ")"+ " " +"scale(" + "1"+ ","+ " " +"1" + ")")  + ";-moz-transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")"+ " " +"translateZ(" + "0" + ")"+ " " +"scale(" + "1"+ ","+ " " +"1" + ")")  + ";-ms-transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")")  + ";transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")"+ " " +"translateZ(" + "0" + ")"+ " " +"scale(" + "1"+ ","+ " " +"1" + ")")  + ";-webkit-backface-visibility:") + (("hidden")  + ";}.GCTYMOCCJJ{height:" + ("calc(100% - 1px)")  + ";}.GCTYMOCCKJ,.GCTYMOCCBJ,.GCTYMOCCIJ{display:" + ("inline-block")  + ";}")) : ((".GCTYMOCCOJ,.GCTYMOCCFK{display:" + ("-webkit-box")  + ";display:" + ("-moz-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";}.GCTYMOCCAK{display:" + ("-webkit-box")  + ";display:" + ("-moz-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";-webkit-box-orient:") + (("horizontal")  + ";-moz-box-orient:" + ("horizontal")  + ";-ms-flex-direction:" + ("row")  + ";-webkit-flex-direction:" + ("row")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCCK{display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";}.GCTYMOCCBK{display:" + ("-webkit-inline-box") ) + (";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";-webkit-box-orient:" + ("horizontal")  + ";-moz-box-orient:" + ("horizontal")  + ";-ms-flex-direction:" + ("row")  + ";-webkit-flex-direction:" + ("row")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCGK{display:" + ("-webkit-inline-box")  + ";display:") + (("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";}.GCTYMOCCFK,.GCTYMOCCGK{-webkit-box-orient:" + ("vertical")  + ";-moz-box-orient:" + ("vertical")  + ";-ms-flex-direction:" + ("column")  + ";-webkit-flex-direction:" + ("column")  + ";flex-direction:" + ("column")  + ";}.GCTYMOCCPJ{-webkit-box-ordinal-group:" + ("1")  + ";-moz-box-ordinal-group:" + ("1") ) + (";-ms-flex-order:" + ("1")  + ";-webkit-order:" + ("1")  + ";order:" + ("1")  + ";}.GCTYMOCCDK{-webkit-box-ordinal-group:" + ("2")  + ";-moz-box-ordinal-group:" + ("2")  + ";-ms-flex-order:" + ("2")  + ";-webkit-order:" + ("2")  + ";order:" + ("2")  + ";}.GCTYMOCCEK{-webkit-box-ordinal-group:" + ("3")  + ";-moz-box-ordinal-group:" + ("3")  + ";-ms-flex-order:") + (("3")  + ";-webkit-order:" + ("3")  + ";order:" + ("3")  + ";}.GCTYMOCCLJ{overflow:" + ("hidden")  + ";width:" + ("100%")  + ";}" + (((org.cruxframework.crux.core.client.screen.Screen.isIos())) ? (".GCTYMOCCLJ{position:" + ("fixed")  + ";width:" + ("100%")  + ";}") : "")  + ".GCTYMOCCMJ{-webkit-touch-callout:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";-khtml-user-select:" + ("none")  + ";-moz-user-select:" + ("none")  + ";-ms-user-select:" + ("none") ) + (";user-select:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu--fixed{position:" + ("fixed")  + ";top:" + ("0")  + ";left:" + ("0")  + ";z-index:" + ("3")  + ";}.GCTYMOCCLI.faces-Menu--grow>.faces-Menu-ul>.faces-Menu-li{flex-grow:" + ("1")  + ";-webkit-flex-grow:" + ("1")  + ";-moz-flex-grow:" + ("1")  + ";-webkit-box-flex:" + ("1")  + ";-ms-flex-positive:" + ("1")  + ";}.GCTYMOCCLI.faces-Menu--grow>.faces-Menu-ul .faces-Menu-ul{z-index:") + (("5")  + ";}.GCTYMOCCLI .faces-Menu-ul,.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown .faces-Menu-ul{list-style:" + ("none")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-dropdown .faces-Menu-ul .faces-Menu-ul{z-index:" + ("5")  + ";z-index:" + ("5")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul{display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex") ) + (";flex-flow:" + ("row"+ " " +"wrap")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul .faces-Menu-ul{display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li{position:" + ("relative")  + ";cursor:" + ("pointer")  + ";}.GCTYMOCCLI.faces-Menu-tree .faces-Menu-ul .faces-Menu-li .faces-Menu-li{border-bottom:" + ("none")  + ";}.GCTYMOCCLI .faces-Menu-ul .faces-Menu-li .faces-SelectablePanel{padding:" + ("10px"+ " " +"20px")  + ";}.GCTYMOCCLI.faces-Menu-tree .faces-Menu-ul .faces-Menu-li .faces-SelectablePanel{padding:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown .faces-Menu-li:hover>.faces-Menu-ul{display:" + ("block")  + ";margin-top:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-ul{width:" + ("100%")  + ";min-width:") + (("150px")  + ";position:" + ("absolute")  + ";top:" + ("100%")  + ";left:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-ul .faces-Menu-li{position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-dropdown>.faces-Menu-ul>.faces-Menu-li .faces-Menu-li .faces-Menu-ul{width:" + ("100%")  + ";position:" + ("absolute")  + ";left:" + ("100%")  + ";top:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-dropdown>.faces-Menu-ul .faces-Menu-ul{width:" + ("100%")  + ";position:" + ("absolute") ) + (";left:" + ("100%")  + ";top:" + ("0")  + ";display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-dropdown .faces-Menu-li{position:" + ("relative")  + ";margin-top:" + ("-1px")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-dropdown .faces-Menu-li:hover>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-ul .faces-Menu-ul{display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-li{padding-left:" + ("15px")  + ";position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-tree .faces-Menu-li .faces-Menu-openCloseTriggerHelper{position:") + (("absolute")  + ";top:" + ("2px")  + ";left:" + ("-3px")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion{height:" + ("200px")  + ";display:" + ("inline-block")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li{float:" + ("left")  + ";min-width:" + ("38px")  + ";height:" + ("200px")  + ";position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul .faces-Menu-li{position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-accordion.faces-Menu-horizontal>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-ul{height:" + ("198px") ) + (";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li>.faces-SelectablePanel{-webkit-transform:" + ("rotate(" + "-90deg" + ")")  + ";-moz-transform:" + ("rotate(" + "-90deg" + ")")  + ";transform:" + ("rotate(" + "-90deg" + ")")  + ";width:" + ("199px")  + ";height:" + ("38px")  + ";margin-left:" + ("-81px")  + ";margin-top:" + ("80px")  + ";position:" + ("absolute")  + ";padding:" + ("10px")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li>.faces-Menu-openCloseTriggerHelper{position:" + ("absolute")  + ";top:") + (("0")  + ";left:" + ("0")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion .faces-Menu-ul .faces-Menu-ul{width:" + ("300px")  + ";margin-left:" + ("38px")  + ";background:" + ("#fff")  + ";font-size:" + ("12px")  + ";display:" + ("none")  + ";overflow-y:" + ("auto")  + ";}.GCTYMOCCLI.faces-Menu-horizontal.faces-Menu-accordion .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion{width:" + ("200px")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion .faces-Menu-li{position:" + ("relative") ) + (";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li>.faces-SelectablePanel,.GCTYMOCCLI.faces-Menu-slide .faces-Menu-ul .faces-Menu-li .faces-SelectablePanel{padding:" + ("10px")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion>.faces-Menu-ul>.faces-Menu-li .faces-Menu-ul{display:" + ("none")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{display:" + ("block")  + ";}.GCTYMOCCLI.faces-Menu-vertical.faces-Menu-accordion .faces-Menu-hasChildren>.faces-Menu-openCloseTriggerHelper{position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("5px")  + ";}.GCTYMOCCLI.faces-Menu-slide{height:" + ("100%")  + ";position:" + ("relative")  + ";overflow:" + ("hidden")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-ul .faces-Menu-ul{-webkit-transform:" + ("translateX(" + "100%" + ")")  + ";-moz-transform:") + (("translateX(" + "100%" + ")")  + ";transform:" + ("translateX(" + "100%" + ")")  + ";overflow-y:" + ("auto")  + ";position:" + ("absolute")  + ";top:" + ("0")  + ";left:" + ("0")  + ";height:" + ("100%")  + ";width:" + ("100%")  + ";z-index:" + ("2")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-ul .faces-Menu-li{height:" + ("40px")  + ";position:" + ("initial") ) + (";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-li.faces-Menu--open>.faces-Menu-ul{-webkit-transform:" + ("translateX(" + "0" + ")")  + ";-moz-transform:" + ("translateX(" + "0" + ")")  + ";transform:" + ("translateX(" + "0" + ")")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-li.faces-Menu-hasChildren>.faces-Menu-openCloseTriggerHelper{float:" + ("right")  + ";margin-top:" + ("-20px")  + ";margin-right:" + ("12px")  + ";z-index:" + ("1")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-closeTriggerSliderHelper{width:" + ("100%")  + ";height:" + ("22px")  + ";display:" + ("block")  + ";border:") + (("0")  + ";background:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.06" + ")")  + ";box-shadow:" + ("0"+ " " +"-1px"+ " " +"0"+ " " +"rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")"+ " " +"inset")  + ";position:" + ("relative")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-closeTriggerSliderHelper:hover{background:" + ("rgba(" + "0"+ ","+ " " +"0"+ ","+ " " +"0"+ ","+ " " +"0.1" + ")")  + ";}.GCTYMOCCLI.faces-Menu-slide .faces-Menu-closeTriggerSliderHelper:before{content:" + ("\"\"")  + ";position:" + ("absolute")  + ";left:" + ("5px")  + ";top:" + ("7px")  + ";z-index:" + ("1")  + ";}.GCTYMOCCMI{-webkit-box-flex:" + ("1") ) + (";-moz-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";-webkit-flex:" + ("1")  + ";flex:" + ("1")  + ";display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:" + ("inline-flex")  + ";-webkit-box-ordinal-group:" + ("2")  + ";-moz-box-ordinal-group:") + (("2")  + ";-ms-flex-order:" + ("2")  + ";-webkit-order:" + ("2")  + ";order:" + ("2")  + ";}.faces-RollingPanel-body{overflow-y:" + ("hidden")  + ";overflow-x:" + ("auto")  + ";}.GCTYMOCCPI{-webkit-box-flex:" + ("1")  + ";-moz-box-flex:" + ("1")  + ";-ms-flex:" + ("1")  + ";-webkit-flex:" + ("1")  + ";flex:" + ("1") ) + (";-webkit-box-ordinal-group:" + ("2")  + ";-moz-box-ordinal-group:" + ("2")  + ";-ms-flex-order:" + ("2")  + ";-webkit-order:" + ("2")  + ";order:" + ("2")  + ";overflow:" + ("hidden")  + ";}.GCTYMOCCPI .faces-TabBar{display:" + ("-webkit-inline-box")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("-ms-inline-flexbox")  + ";display:" + ("-webkit-inline-flex")  + ";display:") + (("inline-flex")  + ";}.GCTYMOCCCJ{flex-direction:" + ("column")  + ";display:" + ("table-row")  + ";}.GCTYMOCCEJ{display:" + ("flex")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCDJ{display:" + ("inline-flex")  + ";flex-direction:" + ("row")  + ";}.GCTYMOCCII{overflow:" + ("auto")  + ";}.GCTYMOCCJI{display:" + ("inline-block")  + ";width:" + ("100%")  + ";position:" + ("relative") ) + (";}.GCTYMOCCAJ{display:" + ("-webkit-box")  + ";display:" + ("-moz-box")  + ";display:" + ("-ms-flexbox")  + ";display:" + ("-webkit-flex")  + ";display:" + ("flex")  + ";min-height:" + ("100vh")  + ";flex-direction:" + ("column")  + ";}.faces-TopMenuDisposal .contentPanel,.GCTYMOCCHI{flex:" + ("1")  + ";}.GCTYMOCCOI{position:" + ("relative")  + ";top:" + ("0")  + ";left:") + (("0")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";visibility:" + ("visible")  + ";}.GCTYMOCCOI .faces-SwapPanel-currentPanel{width:" + ("100%")  + ";}.GCTYMOCCOI .faces-SwapPanel-nextPanel{width:" + ("100%")  + ";display:" + ("none")  + ";overflow:" + ("hidden")  + ";}.GCTYMOCCGI{position:" + ("absolute")  + " !important;}.GCTYMOCCFJ{z-index:" + ("5")  + ";}.GCTYMOCCGJ{z-index:" + ("5") ) + (";overflow:" + ("hidden")  + ";pointer-events:" + ("auto")  + ";position:" + ("fixed")  + ";}.GCTYMOCCNJ{z-index:" + ("6")  + ";}.GCTYMOCCHJ{left:" + ("50%")  + " !important;top:" + ("50%")  + " !important;-webkit-transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")"+ " " +"translateZ(" + "0" + ")"+ " " +"scale(" + "1"+ ","+ " " +"1" + ")")  + ";-moz-transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")"+ " " +"translateZ(" + "0" + ")"+ " " +"scale(" + "1"+ ","+ " " +"1" + ")")  + ";-ms-transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")")  + ";transform:" + ("translateY(" + "-50%" + ")"+ " " +"translateX(" + "-50%" + ")"+ " " +"translateZ(" + "0" + ")"+ " " +"scale(" + "1"+ ","+ " " +"1" + ")")  + ";-webkit-backface-visibility:") + (("hidden")  + ";}.GCTYMOCCJJ{height:" + ("calc(100% - 1px)")  + ";}.GCTYMOCCKJ,.GCTYMOCCBJ,.GCTYMOCCIJ{display:" + ("inline-block")  + ";}"));
      }
      public java.lang.String facesBackboneCarousel() {
        return "GCTYMOCCEI";
      }
      public java.lang.String facesBackboneComboBox() {
        return "GCTYMOCCFI";
      }
      public java.lang.String facesBackboneComboBoxPopup() {
        return "GCTYMOCCGI";
      }
      public java.lang.String facesBackboneComboboxText() {
        return "GCTYMOCCHI";
      }
      public java.lang.String facesBackboneDataGrid() {
        return "GCTYMOCCII";
      }
      public java.lang.String facesBackboneDataGridHeaderWrapper() {
        return "GCTYMOCCJI";
      }
      public java.lang.String facesBackboneListbox() {
        return "GCTYMOCCKI";
      }
      public java.lang.String facesBackboneMenu() {
        return "GCTYMOCCLI";
      }
      public java.lang.String facesBackboneRollingPanelBody() {
        return "GCTYMOCCMI";
      }
      public java.lang.String facesBackboneSideMenuDisposal() {
        return "GCTYMOCCNI";
      }
      public java.lang.String facesBackboneSwapPanel() {
        return "GCTYMOCCOI";
      }
      public java.lang.String facesBackboneTabPanelDeck() {
        return "GCTYMOCCPI";
      }
      public java.lang.String facesBackboneTopMenuDisposal() {
        return "GCTYMOCCAJ";
      }
      public java.lang.String facesBulletsPager() {
        return "GCTYMOCCBJ";
      }
      public java.lang.String facesDivTableContainer() {
        return "GCTYMOCCCJ";
      }
      public java.lang.String facesDivTableHeaderRow() {
        return "GCTYMOCCDJ";
      }
      public java.lang.String facesDivTableRow() {
        return "GCTYMOCCEJ";
      }
      public java.lang.String facesOverlay() {
        return "GCTYMOCCFJ";
      }
      public java.lang.String facesPopup() {
        return "GCTYMOCCGJ";
      }
      public java.lang.String facesPopupCenter() {
        return "GCTYMOCCHJ";
      }
      public java.lang.String facesPredictivePager() {
        return "GCTYMOCCIJ";
      }
      public java.lang.String facesScrollablePager() {
        return "GCTYMOCCJJ";
      }
      public java.lang.String facesSequentialPager() {
        return "GCTYMOCCKJ";
      }
      public java.lang.String facesUnscrollable() {
        return "GCTYMOCCLJ";
      }
      public java.lang.String facesUnselectable() {
        return "GCTYMOCCMJ";
      }
      public java.lang.String facesWaitBox() {
        return "GCTYMOCCNJ";
      }
      public java.lang.String flexBoxContainer() {
        return "GCTYMOCCOJ";
      }
      public java.lang.String flexBoxFirstChild() {
        return "GCTYMOCCPJ";
      }
      public java.lang.String flexBoxHorizontalContainer() {
        return "GCTYMOCCAK";
      }
      public java.lang.String flexBoxHorizontalInlineContainer() {
        return "GCTYMOCCBK";
      }
      public java.lang.String flexBoxInlineContainer() {
        return "GCTYMOCCCK";
      }
      public java.lang.String flexBoxSecondChild() {
        return "GCTYMOCCDK";
      }
      public java.lang.String flexBoxThirdChild() {
        return "GCTYMOCCEK";
      }
      public java.lang.String flexBoxVerticalContainer() {
        return "GCTYMOCCFK";
      }
      public java.lang.String flexBoxVerticalInlineContainer() {
        return "GCTYMOCCGK";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static org.cruxframework.crux.smartfaces.client.backbone.common.FacesBackboneCSSCommon get() {
      return css;
    }
  }
  public org.cruxframework.crux.smartfaces.client.backbone.common.FacesBackboneCSSCommon css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static org.cruxframework.crux.smartfaces.client.backbone.common.FacesBackboneCSSCommon css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@org.cruxframework.crux.smartfaces.client.backbone.common.FacesBackboneResourcesCommon::css()();
    }
    return null;
  }-*/;
}
