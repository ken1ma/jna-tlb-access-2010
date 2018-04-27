
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({F163F201-ADA2-11CF-89A9-00A0C9054129})</p>
 */
public abstract class _References_EventsListenerHandler extends AbstractComEventCallbackListener implements _References_EventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x0)</p>
     */
    @Override
    public void ItemAdded(Reference Reference){
    }
            
    /**
     * <p>id(0x1)</p>
     */
    @Override
    public void ItemRemoved(Reference Reference){
    }
            
    
}