
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0EA530DD-5B30-4278-BD28-47C4D11619BD})</p>
 */
@ComInterface(iid="{0EA530DD-5B30-4278-BD28-47C4D11619BD}")
public interface _FormEvents2 extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x813)</p>
     */
    @ComMethod(name = "Load", dispId = 0x813)
    void Load();
            
    /**
     * <p>id(0x80a)</p>
     */
    @ComMethod(name = "Current", dispId = 0x80a)
    void Current();
            
    /**
     * <p>id(0x80b)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "BeforeInsert", dispId = 0x80b)
    void BeforeInsert(VARIANT Cancel);
            
    /**
     * <p>id(0x80c)</p>
     */
    @ComMethod(name = "AfterInsert", dispId = 0x80c)
    void AfterInsert();
            
    /**
     * <p>id(0x80d)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "BeforeUpdate", dispId = 0x80d)
    void BeforeUpdate(VARIANT Cancel);
            
    /**
     * <p>id(0x80e)</p>
     */
    @ComMethod(name = "AfterUpdate", dispId = 0x80e)
    void AfterUpdate();
            
    /**
     * <p>id(0x80f)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Delete", dispId = 0x80f)
    void Delete(VARIANT Cancel);
            
    /**
     * <p>id(0x810)</p>
     * @param Cancel [out] {@code Short}
     * @param Response [out] {@code Short}
     */
    @ComMethod(name = "BeforeDelConfirm", dispId = 0x810)
    void BeforeDelConfirm(VARIANT Cancel,
            VARIANT Response);
            
    /**
     * <p>id(0x811)</p>
     * @param Status [inout] {@code Short}
     */
    @ComMethod(name = "AfterDelConfirm", dispId = 0x811)
    void AfterDelConfirm(VARIANT Status);
            
    /**
     * <p>id(0x812)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Open", dispId = 0x812)
    void Open(VARIANT Cancel);
            
    /**
     * <p>id(0x814)</p>
     */
    @ComMethod(name = "Resize", dispId = 0x814)
    void Resize();
            
    /**
     * <p>id(0x815)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Unload", dispId = 0x815)
    void Unload(VARIANT Cancel);
            
    /**
     * <p>id(0x816)</p>
     */
    @ComMethod(name = "Close", dispId = 0x816)
    void Close();
            
    /**
     * <p>id(0x817)</p>
     */
    @ComMethod(name = "Activate", dispId = 0x817)
    void Activate();
            
    /**
     * <p>id(0x818)</p>
     */
    @ComMethod(name = "Deactivate", dispId = 0x818)
    void Deactivate();
            
    /**
     * <p>id(0x819)</p>
     */
    @ComMethod(name = "GotFocus", dispId = 0x819)
    void GotFocus();
            
    /**
     * <p>id(0x81a)</p>
     */
    @ComMethod(name = "LostFocus", dispId = 0x81a)
    void LostFocus();
            
    /**
     * <p>id(0xfffffda8)</p>
     */
    @ComMethod(name = "Click", dispId = 0xfffffda8)
    void Click();
            
    /**
     * <p>id(0xfffffda7)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "DblClick", dispId = 0xfffffda7)
    void DblClick(VARIANT Cancel);
            
    /**
     * <p>id(0xfffffda3)</p>
     * @param Button [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     * @param X [inout] {@code Float}
     * @param Y [inout] {@code Float}
     */
    @ComMethod(name = "MouseDown", dispId = 0xfffffda3)
    void MouseDown(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda2)</p>
     * @param Button [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     * @param X [inout] {@code Float}
     * @param Y [inout] {@code Float}
     */
    @ComMethod(name = "MouseMove", dispId = 0xfffffda2)
    void MouseMove(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda1)</p>
     * @param Button [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     * @param X [inout] {@code Float}
     * @param Y [inout] {@code Float}
     */
    @ComMethod(name = "MouseUp", dispId = 0xfffffda1)
    void MouseUp(VARIANT Button,
            VARIANT Shift,
            VARIANT X,
            VARIANT Y);
            
    /**
     * <p>id(0xfffffda6)</p>
     * @param KeyCode [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     */
    @ComMethod(name = "KeyDown", dispId = 0xfffffda6)
    void KeyDown(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0xfffffda5)</p>
     * @param KeyAscii [inout] {@code Short}
     */
    @ComMethod(name = "KeyPress", dispId = 0xfffffda5)
    void KeyPress(VARIANT KeyAscii);
            
    /**
     * <p>id(0xfffffda4)</p>
     * @param KeyCode [inout] {@code Short}
     * @param Shift [inout] {@code Short}
     */
    @ComMethod(name = "KeyUp", dispId = 0xfffffda4)
    void KeyUp(VARIANT KeyCode,
            VARIANT Shift);
            
    /**
     * <p>id(0x823)</p>
     * @param DataErr [inout] {@code Short}
     * @param Response [out] {@code Short}
     */
    @ComMethod(name = "Error", dispId = 0x823)
    void Error(VARIANT DataErr,
            VARIANT Response);
            
    /**
     * <p>id(0x824)</p>
     */
    @ComMethod(name = "Timer", dispId = 0x824)
    void Timer();
            
    /**
     * <p>id(0x86b)</p>
     * @param Cancel [out] {@code Short}
     * @param FilterType [inout] {@code Short}
     */
    @ComMethod(name = "Filter", dispId = 0x86b)
    void Filter(VARIANT Cancel,
            VARIANT FilterType);
            
    /**
     * <p>id(0x86c)</p>
     * @param Cancel [out] {@code Short}
     * @param ApplyType [inout] {@code Short}
     */
    @ComMethod(name = "ApplyFilter", dispId = 0x86c)
    void ApplyFilter(VARIANT Cancel,
            VARIANT ApplyType);
            
    /**
     * <p>id(0x89d)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Dirty", dispId = 0x89d)
    void Dirty(VARIANT Cancel);
            
    /**
     * <p>id(0x861)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "Undo", dispId = 0x861)
    void Undo(VARIANT Cancel);
            
    /**
     * <p>id(0x91e)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "RecordExit", dispId = 0x91e)
    void RecordExit(VARIANT Cancel);
            
    /**
     * <p>id(0x941)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "BeginBatchEdit", dispId = 0x941)
    void BeginBatchEdit(VARIANT Cancel);
            
    /**
     * <p>id(0x942)</p>
     * @param Cancel [out] {@code Short}
     */
    @ComMethod(name = "UndoBatchEdit", dispId = 0x942)
    void UndoBatchEdit(VARIANT Cancel);
            
    /**
     * <p>id(0x94f)</p>
     */
    @ComMethod(name = "OnConnect", dispId = 0x94f)
    void OnConnect();
            
    /**
     * <p>id(0x950)</p>
     */
    @ComMethod(name = "OnDisconnect", dispId = 0x950)
    void OnDisconnect();
            
    /**
     * <p>id(0x951)</p>
     * @param Reason [in] {@code Integer}
     */
    @ComMethod(name = "PivotTableChange", dispId = 0x951)
    void PivotTableChange(Integer Reason);
            
    /**
     * <p>id(0x952)</p>
     */
    @ComMethod(name = "Query", dispId = 0x952)
    void Query();
            
    /**
     * <p>id(0x953)</p>
     */
    @ComMethod(name = "BeforeQuery", dispId = 0x953)
    void BeforeQuery();
            
    /**
     * <p>id(0x954)</p>
     */
    @ComMethod(name = "SelectionChange", dispId = 0x954)
    void SelectionChange();
            
    /**
     * <p>id(0x955)</p>
     * @param Command [in] {@code Object}
     * @param Cancel [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "CommandBeforeExecute", dispId = 0x955)
    void CommandBeforeExecute(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Cancel);
            
    /**
     * <p>id(0x956)</p>
     * @param Command [in] {@code Object}
     * @param Checked [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "CommandChecked", dispId = 0x956)
    void CommandChecked(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Checked);
            
    /**
     * <p>id(0x957)</p>
     * @param Command [in] {@code Object}
     * @param Enabled [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "CommandEnabled", dispId = 0x957)
    void CommandEnabled(Object Command,
            com.sun.jna.platform.win32.COM.util.IDispatch Enabled);
            
    /**
     * <p>id(0x958)</p>
     * @param Command [in] {@code Object}
     */
    @ComMethod(name = "CommandExecute", dispId = 0x958)
    void CommandExecute(Object Command);
            
    /**
     * <p>id(0x95a)</p>
     */
    @ComMethod(name = "DataSetChange", dispId = 0x95a)
    void DataSetChange();
            
    /**
     * <p>id(0x95b)</p>
     * @param ScreenTipText [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param SourceObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "BeforeScreenTip", dispId = 0x95b)
    void BeforeScreenTip(com.sun.jna.platform.win32.COM.util.IDispatch ScreenTipText,
            com.sun.jna.platform.win32.COM.util.IDispatch SourceObject);
            
    /**
     * <p>id(0x95f)</p>
     * @param drawObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param chartObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param Cancel [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "BeforeRender", dispId = 0x95f)
    void BeforeRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject,
            com.sun.jna.platform.win32.COM.util.IDispatch chartObject,
            com.sun.jna.platform.win32.COM.util.IDispatch Cancel);
            
    /**
     * <p>id(0x95d)</p>
     * @param drawObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     * @param chartObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AfterRender", dispId = 0x95d)
    void AfterRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject,
            com.sun.jna.platform.win32.COM.util.IDispatch chartObject);
            
    /**
     * <p>id(0x95c)</p>
     * @param drawObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AfterFinalRender", dispId = 0x95c)
    void AfterFinalRender(com.sun.jna.platform.win32.COM.util.IDispatch drawObject);
            
    /**
     * <p>id(0x95e)</p>
     * @param drawObject [in] {@code com.sun.jna.platform.win32.COM.util.IDispatch}
     */
    @ComMethod(name = "AfterLayout", dispId = 0x95e)
    void AfterLayout(com.sun.jna.platform.win32.COM.util.IDispatch drawObject);
            
    /**
     * <p>id(0x961)</p>
     * @param Page [in] {@code Boolean}
     * @param Count [in] {@code Integer}
     */
    @ComMethod(name = "MouseWheel", dispId = 0x961)
    void MouseWheel(Boolean Page,
            Integer Count);
            
    /**
     * <p>id(0x962)</p>
     * @param Reason [in] {@code Integer}
     */
    @ComMethod(name = "ViewChange", dispId = 0x962)
    void ViewChange(Integer Reason);
            
    /**
     * <p>id(0x963)</p>
     * @param Reason [in] {@code Integer}
     */
    @ComMethod(name = "DataChange", dispId = 0x963)
    void DataChange(Integer Reason);
            
    
}