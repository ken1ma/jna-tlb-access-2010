
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.AbstractComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0EA530DD-5B30-4278-BD28-47C4D11619BD})</p>
 */
public abstract class _FormEvents2ListenerHandler extends AbstractComEventCallbackListener implements _FormEvents2Listener {
    @Override
    public void errorReceivingCallbackEvent(java.lang.String string, java.lang.Exception excptn) {
    }

    /**
     * <p>id(0x813)</p>
     */
    @Override
    public void Load(){
    }
            
    /**
     * <p>id(0x80a)</p>
     */
    @Override
    public void Current(){
    }
            
    /**
     * <p>id(0x80b)</p>
     */
    @Override
    public void BeforeInsert(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x80c)</p>
     */
    @Override
    public void AfterInsert(){
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
     * <p>id(0x80f)</p>
     */
    @Override
    public void Delete(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x810)</p>
     */
    @Override
    public void BeforeDelConfirm(VARIANT Cancel,
            VARIANT Response){
    }
            
    /**
     * <p>id(0x811)</p>
     */
    @Override
    public void AfterDelConfirm(VARIANT Status){
    }
            
    /**
     * <p>id(0x812)</p>
     */
    @Override
    public void Open(VARIANT Cancel){
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
     * <p>id(0x823)</p>
     */
    @Override
    public void Error(VARIANT DataErr,
            VARIANT Response){
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
     * <p>id(0x89d)</p>
     */
    @Override
    public void Dirty(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x861)</p>
     */
    @Override
    public void Undo(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x91e)</p>
     */
    @Override
    public void RecordExit(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x941)</p>
     */
    @Override
    public void BeginBatchEdit(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x942)</p>
     */
    @Override
    public void UndoBatchEdit(VARIANT Cancel){
    }
            
    /**
     * <p>id(0x94f)</p>
     */
    @Override
    public void OnConnect(){
    }
            
    /**
     * <p>id(0x950)</p>
     */
    @Override
    public void OnDisconnect(){
    }
            
    /**
     * <p>id(0x951)</p>
     */
    @Override
    public void PivotTableChange(Integer Reason){
    }
            
    /**
     * <p>id(0x952)</p>
     */
    @Override
    public void Query(){
    }
            
    /**
     * <p>id(0x953)</p>
     */
    @Override
    public void BeforeQuery(){
    }
            
    /**
     * <p>id(0x954)</p>
     */
    @Override
    public void SelectionChange(){
    }
            
    /**
     * <p>id(0x955)</p>
     */
    @Override
    public void CommandBeforeExecute(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Cancel){
    }
            
    /**
     * <p>id(0x956)</p>
     */
    @Override
    public void CommandChecked(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Checked){
    }
            
    /**
     * <p>id(0x957)</p>
     */
    @Override
    public void CommandEnabled(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Enabled){
    }
            
    /**
     * <p>id(0x958)</p>
     */
    @Override
    public void CommandExecute(Object Command){
    }
            
    /**
     * <p>id(0x95a)</p>
     */
    @Override
    public void DataSetChange(){
    }
            
    /**
     * <p>id(0x95b)</p>
     */
    @Override
    public void BeforeScreenTip(com.sun.jna.platform.win32.COM.util.IDispatch ScreenTipText,
            com.sun.jna.platform.win32.COM.util.IDispatch SourceObject){
    }
            
    /**
     * <p>id(0x95f)</p>
     */
    @Override
    public void BeforeRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject,
            com.sun.jna.platform.win32.COM.util.IDispatch chartObject,
            com.sun.jna.platform.win32.COM.util.IDispatch Cancel){
    }
            
    /**
     * <p>id(0x95d)</p>
     */
    @Override
    public void AfterRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject,
            com.sun.jna.platform.win32.COM.util.IDispatch chartObject){
    }
            
    /**
     * <p>id(0x95c)</p>
     */
    @Override
    public void AfterFinalRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject){
    }
            
    /**
     * <p>id(0x95e)</p>
     */
    @Override
    public void AfterLayout(com.sun.jna.platform.win32.COM.util.IDispatch drawObject){
    }
            
    /**
     * <p>id(0x961)</p>
     */
    @Override
    public void MouseWheel(Boolean Page,
            Integer Count){
    }
            
    /**
     * <p>id(0x962)</p>
     */
    @Override
    public void ViewChange(Integer Reason){
    }
            
    /**
     * <p>id(0x963)</p>
     */
    @Override
    public void DataChange(Integer Reason){
    }
            
    
}