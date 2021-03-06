
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E70526E-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
public abstract class DispCustomControlEventsListenerHandler extends AbstractComEventCallbackListener implements DispCustomControlEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x81c)</p>
     */
    @Override
    public void Updated(VARIANT Code){
    }
            
    /**
     * <p>id(0x7e3)</p>
     */
    @Override
    public void Enter(){
    }
            
    /**
     * <p>id(0x81b)</p>
     */
    @Override
    public void Exit(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x819)</p>
     */
    @Override
    public void GotFocus(){
    }
            
    /**
     * <p>id(0x81a)</p>
     */
    @Override
    public void LostFocus(){
    }
            
    
}