
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0EA530DD-5B30-4278-BD28-47C4D11619BD})</p>
 */
@ComInterface(iid="{0EA530DD-5B30-4278-BD28-47C4D11619BD}")
public interface _FormEvents2Listener {
    /**
     * <p>id(0x813)</p>
     */
    @ComEventCallback(dispid = 0x813)
    void Load();
            
    /**
     * <p>id(0x80a)</p>
     */
    @ComEventCallback(dispid = 0x80a)
    void Current();
            
    /**
     * <p>id(0x80b)</p>
     */
    @ComEventCallback(dispid = 0x80b)
    void BeforeInsert(VARIANT Cancel);
            
    /**
     * <p>id(0x80c)</p>
     */
    @ComEventCallback(dispid = 0x80c)
    void AfterInsert();
            
    /**
     * <p>id(0x80d)</p>
     */
    @ComEventCallback(dispid = 0x80d)
    void BeforeUpdate(VARIANT Cancel);
            
    /**
     * <p>id(0x80e)</p>
     */
    @ComEventCallback(dispid = 0x80e)
    void AfterUpdate();
            
    /**
     * <p>id(0x80f)</p>
     */
    @ComEventCallback(dispid = 0x80f)
    void Delete(VARIANT Cancel);
            
    /**
     * <p>id(0x810)</p>
     */
    @ComEventCallback(dispid = 0x810)
    void BeforeDelConfirm(VARIANT Cancel,
            VARIANT Response);
            
    /**
     * <p>id(0x811)</p>
     */
    @ComEventCallback(dispid = 0x811)
    void AfterDelConfirm(VARIANT Status);
            
    /**
     * <p>id(0x812)</p>
     */
    @ComEventCallback(dispid = 0x812)
    void Open(VARIANT Cancel);
            
    /**
     * <p>id(0x814)</p>
     */
    @ComEventCallback(dispid = 0x814)
    void Resize();
            
    /**
     * <p>id(0x815)</p>
     */
    @ComEventCallback(dispid = 0x815)
    void Unload(VARIANT Cancel);
            
    /**
     * <p>id(0x816)</p>
     */
    @ComEventCallback(dispid = 0x816)
    void Close();
            
    /**
     * <p>id(0x817)</p>
     */
    @ComEventCallback(dispid = 0x817)
    void Activate();
            
    /**
     * <p>id(0x818)</p>
     */
    @ComEventCallback(dispid = 0x818)
    void Deactivate();
            
    /**
     * <p>id(0x819)</p>
     */
    @ComEventCallback(dispid = 0x819)
    void GotFocus();
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComEventCallback(dispid = 0x81a)
    void LostFocus();
            
    /**
     * <p>id(0xfffffda8)</p>
     */
    @ComEventCallback(dispid = 0xfffffda8)
    void Click();
            
    /**
     * <p>id(0xfffffda7)</p>
     */
    @ComEventCallback(dispid = 0xfffffda7)
    void DblClick(VARIANT Cancel);
            
    /**
     * <p>id(0xfffffda3)</p>
     */
    @ComEventCallback(dispid = 0xfffffda3)
    void MouseDown(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     */
    @ComEventCallback(dispid = 0xfffffda2)
    void MouseMove(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     */
    @ComEventCallback(dispid = 0xfffffda1)
    void MouseUp(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda6)</p>
     */
    @ComEventCallback(dispid = 0xfffffda6)
    void KeyDown(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     */
    @ComEventCallback(dispid = 0xfffffda5)
    void KeyPress(VARIANT KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     */
    @ComEventCallback(dispid = 0xfffffda4)
    void KeyUp(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0x823)</p>
     */
    @ComEventCallback(dispid = 0x823)
    void Error(VARIANT DataErr,
            VARIANT Response);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComEventCallback(dispid = 0x824)
    void Timer();
            
    /**
     * <p>id(0x86b)</p>
     */
    @ComEventCallback(dispid = 0x86b)
    void Filter(VARIANT Cancel,
            VARIANT FilterType);
            
    /**
     * <p>id(0x86c)</p>
     */
    @ComEventCallback(dispid = 0x86c)
    void ApplyFilter(VARIANT Cancel,
            VARIANT ApplyType);
            
    /**
     * <p>id(0x89d)</p>
     */
    @ComEventCallback(dispid = 0x89d)
    void Dirty(VARIANT Cancel);
            
    /**
     * <p>id(0x861)</p>
     */
    @ComEventCallback(dispid = 0x861)
    void Undo(VARIANT Cancel);
            
    /**
     * <p>id(0x91e)</p>
     */
    @ComEventCallback(dispid = 0x91e)
    void RecordExit(VARIANT Cancel);
            
    /**
     * <p>id(0x941)</p>
     */
    @ComEventCallback(dispid = 0x941)
    void BeginBatchEdit(VARIANT Cancel);
            
    /**
     * <p>id(0x942)</p>
     */
    @ComEventCallback(dispid = 0x942)
    void UndoBatchEdit(VARIANT Cancel);
            
    /**
     * <p>id(0x94f)</p>
     */
    @ComEventCallback(dispid = 0x94f)
    void OnConnect();
            
    /**
     * <p>id(0x950)</p>
     */
    @ComEventCallback(dispid = 0x950)
    void OnDisconnect();
            
    /**
     * <p>id(0x951)</p>
     */
    @ComEventCallback(dispid = 0x951)
    void PivotTableChange(Integer Reason);
            
    /**
     * <p>id(0x952)</p>
     */
    @ComEventCallback(dispid = 0x952)
    void Query();
            
    /**
     * <p>id(0x953)</p>
     */
    @ComEventCallback(dispid = 0x953)
    void BeforeQuery();
            
    /**
     * <p>id(0x954)</p>
     */
    @ComEventCallback(dispid = 0x954)
    void SelectionChange();
            
    /**
     * <p>id(0x955)</p>
     */
    @ComEventCallback(dispid = 0x955)
    void CommandBeforeExecute(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Cancel);
            
    /**
     * <p>id(0x956)</p>
     */
    @ComEventCallback(dispid = 0x956)
    void CommandChecked(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Checked);
            
    /**
     * <p>id(0x957)</p>
     */
    @ComEventCallback(dispid = 0x957)
    void CommandEnabled(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Enabled);
            
    /**
     * <p>id(0x958)</p>
     */
    @ComEventCallback(dispid = 0x958)
    void CommandExecute(Object Command);
            
    /**
     * <p>id(0x95a)</p>
     */
    @ComEventCallback(dispid = 0x95a)
    void DataSetChange();
            
    /**
     * <p>id(0x95b)</p>
     */
    @ComEventCallback(dispid = 0x95b)
    void BeforeScreenTip(com.sun.jna.platform.win32.COM.util.IDispatch ScreenTipText,
            com.sun.jna.platform.win32.COM.util.IDispatch SourceObject);
            
    /**
     * <p>id(0x95f)</p>
     */
    @ComEventCallback(dispid = 0x95f)
    void BeforeRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject,
            com.sun.jna.platform.win32.COM.util.IDispatch chartObject,
            com.sun.jna.platform.win32.COM.util.IDispatch Cancel);
            
    /**
     * <p>id(0x95d)</p>
     */
    @ComEventCallback(dispid = 0x95d)
    void AfterRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject,
            com.sun.jna.platform.win32.COM.util.IDispatch chartObject);
            
    /**
     * <p>id(0x95c)</p>
     */
    @ComEventCallback(dispid = 0x95c)
    void AfterFinalRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject);
            
    /**
     * <p>id(0x95e)</p>
     */
    @ComEventCallback(dispid = 0x95e)
    void AfterLayout(com.sun.jna.platform.win32.COM.util.IDispatch drawObject);
            
    /**
     * <p>id(0x961)</p>
     */
    @ComEventCallback(dispid = 0x961)
    void MouseWheel(Boolean Page,
            Integer Count);
            
    /**
     * <p>id(0x962)</p>
     */
    @ComEventCallback(dispid = 0x962)
    void ViewChange(Integer Reason);
            
    /**
     * <p>id(0x963)</p>
     */
    @ComEventCallback(dispid = 0x963)
    void DataChange(Integer Reason);
            
    
}