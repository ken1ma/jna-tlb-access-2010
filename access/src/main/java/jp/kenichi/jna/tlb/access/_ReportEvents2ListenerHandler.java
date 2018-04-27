
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({D7281A87-4B30-41C5-AB7B-FABF9A35442A})</p>
 */
public abstract class _ReportEvents2ListenerHandler extends AbstractComEventCallbackListener implements _ReportEvents2Listener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x812)</p>
     */
    @Override
    public void Open(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x816)</p>
     */
    @Override
    public void Close(){
    }
            
    /**
     * <p>id(0x817)</p>
     */
    @Override
    public void Activate(){
    }
            
    /**
     * <p>id(0x818)</p>
     */
    @Override
    public void Deactivate(){
    }
            
    /**
     * <p>id(0x823)</p>
     */
    @Override
    public void Error(VARIANT DataErr,
            VARIANT Response){
    }
            
    /**
     * <p>id(0x871)</p>
     */
    @Override
    public void NoData(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x872)</p>
     */
    @Override
    public void Page(){
    }
            
    /**
     * <p>id(0x80a)</p>
     */
    @Override
    public void Current(){
    }
            
    /**
     * <p>id(0x813)</p>
     */
    @Override
    public void Load(){
    }
            
    /**
     * <p>id(0x814)</p>
     */
    @Override
    public void Resize(){
    }
            
    /**
     * <p>id(0x815)</p>
     */
    @Override
    public void Unload(VARIANT Cancel){
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
     * <p>id(0x824)</p>
     */
    @Override
    public void Timer(){
    }
            
    /**
     * <p>id(0x86b)</p>
     */
    @Override
    public void Filter(VARIANT Cancel,
            VARIANT FilterType){
    }
            
    /**
     * <p>id(0x86c)</p>
     */
    @Override
    public void ApplyFilter(VARIANT Cancel,
            VARIANT ApplyType){
    }
            
    /**
     * <p>id(0x961)</p>
     */
    @Override
    public void MouseWheel(Boolean Page,
            Integer Count){
    }
            
    
}