
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({2E70527C-92D1-43CC-A57B-ED48BCCC711D})</p>
 */
public abstract class DispSectionInReportEventsListenerHandler extends AbstractComEventCallbackListener implements DispSectionInReportEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x81f)</p>
     */
    @Override
    public void Format(VARIANT Cancel,
            VARIANT FormatCount){
    }
            
    /**
     * <p>id(0x820)</p>
     */
    @Override
    public void Print(VARIANT Cancel,
            VARIANT PrintCount){
    }
            
    /**
     * <p>id(0x821)</p>
     */
    @Override
    public void Retreat(){
    }
            
    /**
     * <p>id(0xfffffda8)</p>
     */
    @Override
    public void Click(){
    }
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @Override
    public void DblClick(VARIANT Cancel){
    }
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @Override
    public void MouseDown(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y){
    }
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @Override
    public void MouseMove(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y){
    }
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @Override
    public void MouseUp(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y){
    }
            
    /**
     * <p>id(0x9b6)</p>
     */
    @Override
    public void Paint(){
    }
            
    
}