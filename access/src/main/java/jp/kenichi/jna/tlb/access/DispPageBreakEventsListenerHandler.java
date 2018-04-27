
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E70527A-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
public abstract class DispPageBreakEventsListenerHandler extends AbstractComEventCallbackListener implements DispPageBreakEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    
}