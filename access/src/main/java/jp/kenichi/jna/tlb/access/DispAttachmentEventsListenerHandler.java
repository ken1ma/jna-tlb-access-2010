
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E981-E47C-11CD-8701-00AA003F0F07})</p>
 */
public abstract class DispAttachmentEventsListenerHandler extends AbstractComEventCallbackListener implements DispAttachmentEventsListener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x80d)</p>
     */
    @Override
    public void BeforeUpdate(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x80e)</p>
     */
    @Override
    public void AfterUpdate(){
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
     * <p>id(0x89d)</p>
     */
    @Override
    public void Dirty(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x81d)</p>
     */
    @Override
    public void Change(){
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
     * <p>id(0xfffffda6)</p>
     */
    @Override
    public void KeyDown(VARIANT KeyCode,
            VARIANT Shift){
    }
            
    /**
     * <p>id(0xfffffda5)</p>
     */
    @Override
    public void KeyPress(VARIANT KeyAscii){
    }
            
    /**
     * <p>id(0xfffffda4)</p>
     */
    @Override
    public void KeyUp(VARIANT KeyCode,
            VARIANT Shift){
    }
            
    /**
     * <p>id(0x9b3)</p>
     */
    @Override
    public void AttachmentCurrent(){
    }
            
    
}