
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E988-E47C-11CD-8701-00AA003F0F07})</p>
 */
public abstract class DispEmptyCellEventsListenerHandler extends AbstractComEventCallbackListener implements DispEmptyCellEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    
}