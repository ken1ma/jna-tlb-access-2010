
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({493D8A72-1DB1-11D1-98A2-006008197D41})</p>
 */
@ComInterface(iid="{493D8A72-1DB1-11D1-98A2-006008197D41}")
public interface _DataAccessPage extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x14)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "_Name", dispId = 0x14)
    String get_Name();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    Boolean getVisible();
            
    /**
     * <p>id(0x94)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Visible", dispId = 0x94)
    void setVisible(Boolean param0);
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    String getTag();
            
    /**
     * <p>id(0x10a)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Tag", dispId = 0x10a)
    void setTag(String param0);
            
    /**
     * <p>id(0x11f)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "WindowWidth", dispId = 0x11f)
    Integer getWindowWidth();
            
    /**
     * <p>id(0x120)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "WindowHeight", dispId = 0x120)
    Integer getWindowHeight();
            
    /**
     * <p>id(0x121)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "CurrentView", dispId = 0x121)
    Short getCurrentView();
            
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "Document", dispId = 0x0)
    com.sun.jna.platform.win32.COM.util.IDispatch getDocument();
            
    /**
     * <p>id(0x8d2)</p>
     * <p>vtableId(19)</p>
     * @param ThemeName [in] {@code String}
     */
    @ComMethod(name = "ApplyTheme", dispId = 0x8d2)
    void ApplyTheme(String ThemeName);
            
    /**
     * <p>id(0x8f5)</p>
     * <p>vtableId(20)</p>
     */
    @ComProperty(name = "WebOptions", dispId = 0x8f5)
    WebOptions getWebOptions();
            
    /**
     * <p>id(0x8dc)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "ConnectionString", dispId = 0x8dc)
    String getConnectionString();
            
    /**
     * <p>id(0x8dc)</p>
     * <p>vtableId(22)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ConnectionString", dispId = 0x8dc)
    void setConnectionString(String param0);
            
    /**
     * <p>id(0x8fa)</p>
     * <p>vtableId(23)</p>
     */
    @ComProperty(name = "FieldListConnection", dispId = 0x8fa)
    com.sun.jna.platform.win32.COM.util.IDispatch getFieldListConnection();
            
    /**
     * <p>id(0x917)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "MailEnvelope", dispId = 0x917)
    jp.kenichi.jna.tlb.office.MsoEnvelope getMailEnvelope();
            
    /**
     * <p>id(0x920)</p>
     * <p>vtableId(25)</p>
     */
    @ComProperty(name = "CurrentSelection", dispId = 0x920)
    com.sun.jna.platform.win32.COM.util.IDispatch getCurrentSelection();
            
    /**
     * <p>id(0x94b)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "MSODSC", dispId = 0x94b)
    com.sun.jna.platform.win32.COM.util.IDispatch getMSODSC();
            
    /**
     * <p>id(0x93f)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x93f)
    Boolean getRemovePersonalInformation();
            
    /**
     * <p>id(0x93f)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "RemovePersonalInformation", dispId = 0x93f)
    void setRemovePersonalInformation(Boolean param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(29)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}