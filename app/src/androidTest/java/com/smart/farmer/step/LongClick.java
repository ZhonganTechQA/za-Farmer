package com.smart.farmer.step;


import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;

/**
 * Created by fwwmac on 2018/2/7.
 */

public class LongClick extends BaseElementHandler {




    @Override
    protected void runSelf() throws UiObjectNotFoundException {
        UiObject2 uiObject = getElement();
        screenshot(TYPE_LOG_SUCCESS,uiObject);
        uiObject.longClick();
    }


}
