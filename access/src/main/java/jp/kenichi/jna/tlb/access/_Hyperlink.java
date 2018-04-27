
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({50D56611-60AC-11CF-82C9-00AA004B9FE6})</p>
 */
@ComInterface(iid="{50D56611-60AC-11CF-82C9-00AA004B9FE6}")
public interface _Hyperlink extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x886)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "SubAddress", dispId = 0x886)
    String getSubAddress();
            
    /**
     * <p>id(0x886)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "SubAddress", dispId = 0x886)
    void setSubAddress(Object param0);
            
    /**
     * <p>id(0x887)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Address", dispId = 0x887)
    String getAddress();
            
    /**
     * <p>id(0x887)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Address", dispId = 0x887)
    void setAddress(Object param0);
            
    /**
     * <p>id(0x888)</p>
     * <p>vtableId(11)</p>
     */
    @ComMethod(name = "AddToFavorites", dispId = 0x888)
    void AddToFavorites();
            
    /**
     * <p>id(0x889)</p>
     * <p>vtableId(12)</p>
     * @param NewWindow [in, optional] {@code Boolean}
     * @param AddHistory [in, optional] {@code Boolean}
     * @param ExtraInfo [in, optional] {@code Object}
     * @param Method [in, optional] {@code jp.kenichi.jna.tlb.office.MsoExtraInfoMethod}
     * @param HeaderInfo [in, optional] {@code String}
     */
    @ComMethod(name = "Follow", dispId = 0x889)
    void Follow(Boolean NewWindow,
            Boolean AddHistory,
            Object ExtraInfo,
            jp.kenichi.jna.tlb.office.MsoExtraInfoMethod Method,
            String HeaderInfo);
            
    /**
     * <p>id(0x8a1)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "EmailSubject", dispId = 0x8a1)
    String getEmailSubject();
            
    /**
     * <p>id(0x8a1)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "EmailSubject", dispId = 0x8a1)
    void setEmailSubject(Object param0);
            
    /**
     * <p>id(0x8a3)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "ScreenTip", dispId = 0x8a3)
    String getScreenTip();
            
    /**
     * <p>id(0x8a3)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "ScreenTip", dispId = 0x8a3)
    void setScreenTip(Object param0);
            
    /**
     * <p>id(0x8b7)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x8b7)
    String getTextToDisplay();
            
    /**
     * <p>id(0x8b7)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "TextToDisplay", dispId = 0x8b7)
    void setTextToDisplay(Object param0);
            
    /**
     * <p>id(0x8b8)</p>
     * <p>vtableId(19)</p>
     * @param FileName [in] {@code String}
     * @param EditNow [in] {@code Boolean}
     * @param Overwrite [in] {@code Boolean}
     */
    @ComMethod(name = "CreateNewDocument", dispId = 0x8b8)
    void CreateNewDocument(String FileName,
            Boolean EditNow,
            Boolean Overwrite);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(20)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}